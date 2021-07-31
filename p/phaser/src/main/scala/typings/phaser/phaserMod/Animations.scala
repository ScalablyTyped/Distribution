package typings.phaser.phaserMod

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Types.Animations.JSONAnimationFrame
import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animations {
  
  /**
    * A Frame based Animation.
    * 
    * This consists of a key, some default values (like the frame rate) and a bunch of Frame objects.
    * 
    * The Animation Manager creates these. Game Objects don't own an instance of these directly.
    * Game Objects have the Animation Component, which are like playheads to global Animations (these objects)
    * So multiple Game Objects can have playheads all pointing to this one Animation instance.
    */
  @JSImport("phaser", "Animations.Animation")
  @js.native
  class Animation protected ()
    extends StObject
       with typings.phaser.Phaser.Animations.Animation {
    /**
      * 
      * @param manager A reference to the global Animation Manager
      * @param key The unique identifying string for this animation.
      * @param config The Animation configuration.
      */
    def this(
      manager: typings.phaser.Phaser.Animations.AnimationManager,
      key: String,
      config: typings.phaser.Phaser.Types.Animations.Animation
    ) = this()
  }
  
  /**
    * A single frame in an Animation sequence.
    * 
    * An AnimationFrame consists of a reference to the Texture it uses for rendering, references to other
    * frames in the animation, and index data. It also has the ability to modify the animation timing.
    * 
    * AnimationFrames are generated automatically by the Animation class.
    */
  @JSImport("phaser", "Animations.AnimationFrame")
  @js.native
  class AnimationFrame protected ()
    extends StObject
       with typings.phaser.Phaser.Animations.AnimationFrame {
    /**
      * 
      * @param textureKey The key of the Texture this AnimationFrame uses.
      * @param textureFrame The key of the Frame within the Texture that this AnimationFrame uses.
      * @param index The index of this AnimationFrame within the Animation sequence.
      * @param frame A reference to the Texture Frame this AnimationFrame uses for rendering.
      */
    def this(textureKey: String, textureFrame: String, index: integer, frame: Frame) = this()
    def this(textureKey: String, textureFrame: integer, index: integer, frame: Frame) = this()
    
    /**
      * Destroys this object by removing references to external resources and callbacks.
      */
    /* CompleteClass */
    override def destroy(): Unit = js.native
    
    /**
      * Additional time (in ms) that this frame should appear for during playback.
      * The value is added onto the msPerFrame set by the animation.
      */
    /* CompleteClass */
    var duration: Double = js.native
    
    /**
      * A reference to the Texture Frame this AnimationFrame uses for rendering.
      */
    /* CompleteClass */
    var frame: Frame = js.native
    
    /**
      * The index of this AnimationFrame within the Animation sequence.
      */
    /* CompleteClass */
    var index: integer = js.native
    
    /**
      * Is this the first frame in an animation sequence?
      */
    /* CompleteClass */
    override val isFirst: Boolean = js.native
    
    /**
      * Is this the last frame in an animation sequence?
      */
    /* CompleteClass */
    override val isLast: Boolean = js.native
    
    /**
      * A reference to the AnimationFrame that comes after this one in the animation, if any.
      */
    /* CompleteClass */
    override val nextFrame: typings.phaser.Phaser.Animations.AnimationFrame = js.native
    
    /**
      * A reference to the AnimationFrame that comes before this one in the animation, if any.
      */
    /* CompleteClass */
    override val prevFrame: typings.phaser.Phaser.Animations.AnimationFrame = js.native
    
    /**
      * What % through the animation does this frame come?
      * This value is generated when the animation is created and cached here.
      */
    /* CompleteClass */
    override val progress: Double = js.native
    
    /**
      * The key of the Frame within the Texture that this AnimationFrame uses.
      */
    /* CompleteClass */
    var textureFrame: String | integer = js.native
    
    /**
      * The key of the Texture this AnimationFrame uses.
      */
    /* CompleteClass */
    var textureKey: String = js.native
    
    /**
      * Generates a JavaScript object suitable for converting to JSON.
      */
    /* CompleteClass */
    override def toJSON(): JSONAnimationFrame = js.native
  }
  
  /**
    * The Animation Manager.
    * 
    * Animations are managed by the global Animation Manager. This is a singleton class that is
    * responsible for creating and delivering animations and their corresponding data to all Game Objects.
    * Unlike plugins it is owned by the Game instance, not the Scene.
    * 
    * Sprites and other Game Objects get the data they need from the AnimationManager.
    */
  @JSImport("phaser", "Animations.AnimationManager")
  @js.native
  class AnimationManager protected ()
    extends StObject
       with typings.phaser.Phaser.Animations.AnimationManager {
    /**
      * 
      * @param game A reference to the Phaser.Game instance.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  object Events {
    
    /**
      * The Add Animation Event.
      * 
      * This event is dispatched when a new animation is added to the global Animation Manager.
      * 
      * This can happen either as a result of an animation instance being added to the Animation Manager,
      * or the Animation Manager creating a new animation directly.
      */
    @JSImport("phaser", "Animations.Events.ADD_ANIMATION")
    @js.native
    val ADD_ANIMATION: js.Any = js.native
    
    /**
      * The Animation Complete Event.
      * 
      * This event is dispatched by an Animation instance when it completes, i.e. finishes playing or is manually stopped.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all complete the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_COMPLETE")
    @js.native
    val ANIMATION_COMPLETE: js.Any = js.native
    
    /**
      * The Animation Repeat Event.
      * 
      * This event is dispatched when a currently playing animation repeats.
      * 
      * The event is dispatched directly from the Animation object itself. Which means that listeners
      * bound to this event will be invoked every time the Animation repeats, for every Game Object that may have it.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_REPEAT")
    @js.native
    val ANIMATION_REPEAT: js.Any = js.native
    
    /**
      * The Animation Restart Event.
      * 
      * This event is dispatched by an Animation instance when it restarts.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all restart the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_RESTART")
    @js.native
    val ANIMATION_RESTART: js.Any = js.native
    
    /**
      * The Animation Start Event.
      * 
      * This event is dispatched by an Animation instance when it starts playing.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all play the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_START")
    @js.native
    val ANIMATION_START: js.Any = js.native
    
    /**
      * The Pause All Animations Event.
      * 
      * This event is dispatched when the global Animation Manager is told to pause.
      * 
      * When this happens all current animations will stop updating, although it doesn't necessarily mean
      * that the game has paused as well.
      */
    @JSImport("phaser", "Animations.Events.PAUSE_ALL")
    @js.native
    val PAUSE_ALL: js.Any = js.native
    
    /**
      * The Remove Animation Event.
      * 
      * This event is dispatched when an animation is removed from the global Animation Manager.
      */
    @JSImport("phaser", "Animations.Events.REMOVE_ANIMATION")
    @js.native
    val REMOVE_ANIMATION: js.Any = js.native
    
    /**
      * The Resume All Animations Event.
      * 
      * This event is dispatched when the global Animation Manager resumes, having been previously paused.
      * 
      * When this happens all current animations will continue updating again.
      */
    @JSImport("phaser", "Animations.Events.RESUME_ALL")
    @js.native
    val RESUME_ALL: js.Any = js.native
    
    /**
      * The Sprite Animation Complete Event.
      * 
      * This event is dispatched by a Sprite when an animation finishes playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationcomplete', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_COMPLETE` event.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_COMPLETE")
    @js.native
    val SPRITE_ANIMATION_COMPLETE: js.Any = js.native
    
    /**
      * The Sprite Animation Key Complete Event.
      * 
      * This event is dispatched by a Sprite when a specific animation finishes playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationcomplete-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationcomplete-explode`.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_KEY_COMPLETE")
    @js.native
    val SPRITE_ANIMATION_KEY_COMPLETE: js.Any = js.native
    
    /**
      * The Sprite Animation Key Repeat Event.
      * 
      * This event is dispatched by a Sprite when a specific animation repeats playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrepeat-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationrepeat-explode`.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_KEY_REPEAT")
    @js.native
    val SPRITE_ANIMATION_KEY_REPEAT: js.Any = js.native
    
    /**
      * The Sprite Animation Key Restart Event.
      * 
      * This event is dispatched by a Sprite when a specific animation restarts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrestart-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationrestart-explode`.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_KEY_RESTART")
    @js.native
    val SPRITE_ANIMATION_KEY_RESTART: js.Any = js.native
    
    /**
      * The Sprite Animation Key Start Event.
      * 
      * This event is dispatched by a Sprite when a specific animation starts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationstart-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationstart-explode`.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_KEY_START")
    @js.native
    val SPRITE_ANIMATION_KEY_START: js.Any = js.native
    
    /**
      * The Sprite Animation Key Update Event.
      * 
      * This event is dispatched by a Sprite when a specific animation playing on it updates. This happens when the animation changes frame,
      * based on the animation frame rate and other factors like `timeScale` and `delay`.
      * 
      * Listen for it on the Sprite using `sprite.on('animationupdate-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationupdate-explode`.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_KEY_UPDATE")
    @js.native
    val SPRITE_ANIMATION_KEY_UPDATE: js.Any = js.native
    
    /**
      * The Sprite Animation Repeat Event.
      * 
      * This event is dispatched by a Sprite when an animation repeats playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrepeat', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_REPEAT` event.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_REPEAT")
    @js.native
    val SPRITE_ANIMATION_REPEAT: js.Any = js.native
    
    /**
      * The Sprite Animation Restart Event.
      * 
      * This event is dispatched by a Sprite when an animation restarts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrestart', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_RESTART` event.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_RESTART")
    @js.native
    val SPRITE_ANIMATION_RESTART: js.Any = js.native
    
    /**
      * The Sprite Animation Start Event.
      * 
      * This event is dispatched by a Sprite when an animation starts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationstart', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_START` event.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_START")
    @js.native
    val SPRITE_ANIMATION_START: js.Any = js.native
    
    /**
      * The Sprite Animation Update Event.
      * 
      * This event is dispatched by a Sprite when an animation playing on it updates. This happens when the animation changes frame,
      * based on the animation frame rate and other factors like `timeScale` and `delay`.
      * 
      * Listen for it on the Sprite using `sprite.on('animationupdate', listener)`
      * 
      * This same event is dispatched for all animations. To listen for a specific animation, use the `SPRITE_ANIMATION_KEY_UPDATE` event.
      */
    @JSImport("phaser", "Animations.Events.SPRITE_ANIMATION_UPDATE")
    @js.native
    val SPRITE_ANIMATION_UPDATE: js.Any = js.native
  }
}
