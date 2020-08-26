package typings.phaser.global.Phaser

import typings.phaser.Phaser.Textures.Frame
import typings.phaser.integer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Animations")
@js.native
object Animations extends js.Object {
  /**
    * A Frame based Animation.
    * 
    * This consists of a key, some default values (like the frame rate) and a bunch of Frame objects.
    * 
    * The Animation Manager creates these. Game Objects don't own an instance of these directly.
    * Game Objects have the Animation Component, which are like playheads to global Animations (these objects)
    * So multiple Game Objects can have playheads all pointing to this one Animation instance.
    */
  @js.native
  class Animation protected ()
    extends typings.phaser.Phaser.Animations.Animation {
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
  @js.native
  class AnimationFrame protected ()
    extends typings.phaser.Phaser.Animations.AnimationFrame {
    /**
      * 
      * @param textureKey The key of the Texture this AnimationFrame uses.
      * @param textureFrame The key of the Frame within the Texture that this AnimationFrame uses.
      * @param index The index of this AnimationFrame within the Animation sequence.
      * @param frame A reference to the Texture Frame this AnimationFrame uses for rendering.
      */
    def this(textureKey: String, textureFrame: String, index: integer, frame: Frame) = this()
    def this(textureKey: String, textureFrame: integer, index: integer, frame: Frame) = this()
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
  @js.native
  class AnimationManager protected ()
    extends typings.phaser.Phaser.Animations.AnimationManager {
    /**
      * 
      * @param game A reference to the Phaser.Game instance.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  @js.native
  object Events extends js.Object {
    /**
      * The Add Animation Event.
      * 
      * This event is dispatched when a new animation is added to the global Animation Manager.
      * 
      * This can happen either as a result of an animation instance being added to the Animation Manager,
      * or the Animation Manager creating a new animation directly.
      */
    val ADD_ANIMATION: js.Any = js.native
    /**
      * The Animation Complete Event.
      * 
      * This event is dispatched by an Animation instance when it completes, i.e. finishes playing or is manually stopped.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all complete the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    val ANIMATION_COMPLETE: js.Any = js.native
    /**
      * The Animation Repeat Event.
      * 
      * This event is dispatched when a currently playing animation repeats.
      * 
      * The event is dispatched directly from the Animation object itself. Which means that listeners
      * bound to this event will be invoked every time the Animation repeats, for every Game Object that may have it.
      */
    val ANIMATION_REPEAT: js.Any = js.native
    /**
      * The Animation Restart Event.
      * 
      * This event is dispatched by an Animation instance when it restarts.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all restart the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    val ANIMATION_RESTART: js.Any = js.native
    /**
      * The Animation Start Event.
      * 
      * This event is dispatched by an Animation instance when it starts playing.
      * 
      * Be careful with the volume of events this could generate. If a group of Sprites all play the same
      * animation at the same time, this event will invoke its handler for each one of them.
      */
    val ANIMATION_START: js.Any = js.native
    /**
      * The Pause All Animations Event.
      * 
      * This event is dispatched when the global Animation Manager is told to pause.
      * 
      * When this happens all current animations will stop updating, although it doesn't necessarily mean
      * that the game has paused as well.
      */
    val PAUSE_ALL: js.Any = js.native
    /**
      * The Remove Animation Event.
      * 
      * This event is dispatched when an animation is removed from the global Animation Manager.
      */
    val REMOVE_ANIMATION: js.Any = js.native
    /**
      * The Resume All Animations Event.
      * 
      * This event is dispatched when the global Animation Manager resumes, having been previously paused.
      * 
      * When this happens all current animations will continue updating again.
      */
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
    val SPRITE_ANIMATION_COMPLETE: js.Any = js.native
    /**
      * The Sprite Animation Key Complete Event.
      * 
      * This event is dispatched by a Sprite when a specific animation finishes playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationcomplete-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationcomplete-explode`.
      */
    val SPRITE_ANIMATION_KEY_COMPLETE: js.Any = js.native
    /**
      * The Sprite Animation Key Repeat Event.
      * 
      * This event is dispatched by a Sprite when a specific animation repeats playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrepeat-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationrepeat-explode`.
      */
    val SPRITE_ANIMATION_KEY_REPEAT: js.Any = js.native
    /**
      * The Sprite Animation Key Restart Event.
      * 
      * This event is dispatched by a Sprite when a specific animation restarts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrestart-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationrestart-explode`.
      */
    val SPRITE_ANIMATION_KEY_RESTART: js.Any = js.native
    /**
      * The Sprite Animation Key Start Event.
      * 
      * This event is dispatched by a Sprite when a specific animation starts playing on it.
      * 
      * Listen for it on the Sprite using `sprite.on('animationstart-key', listener)` where `key` is the key of
      * the animation. For example, if you had an animation with the key 'explode' you should listen for `animationstart-explode`.
      */
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
    val SPRITE_ANIMATION_UPDATE: js.Any = js.native
  }
  
}

