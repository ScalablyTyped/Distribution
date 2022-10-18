package typings.phaser.mod

import typings.phaser.Phaser.GameObjects.GameObject
import typings.phaser.Phaser.Textures.Frame
import typings.phaser.Phaser.Types.Animations.JSONAnimationFrame
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animations {
  
  /**
    * A Frame based Animation.
    * 
    * Animations in Phaser consist of a sequence of `AnimationFrame` objects, which are managed by
    * this class, along with properties that impact playback, such as the animations frame rate
    * or delay.
    * 
    * This class contains all of the properties and methods needed to handle playback of the animation
    * directly to an `AnimationState` instance, which is owned by a Sprite, or similar Game Object.
    * 
    * You don't typically create an instance of this class directly, but instead go via
    * either the `AnimationManager` or the `AnimationState` and use their `create` methods,
    * depending on if you need a global animation, or local to a specific Sprite.
    */
  @JSImport("phaser", "Animations.Animation")
  @js.native
  open class Animation protected ()
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
  open class AnimationFrame protected ()
    extends StObject
       with typings.phaser.Phaser.Animations.AnimationFrame {
    /**
      * 
      * @param textureKey The key of the Texture this AnimationFrame uses.
      * @param textureFrame The key of the Frame within the Texture that this AnimationFrame uses.
      * @param index The index of this AnimationFrame within the Animation sequence.
      * @param frame A reference to the Texture Frame this AnimationFrame uses for rendering.
      * @param isKeyFrame Is this Frame a Keyframe within the Animation? Default false.
      */
    def this(textureKey: String, textureFrame: String, index: Double, frame: Frame) = this()
    def this(textureKey: String, textureFrame: Double, index: Double, frame: Frame) = this()
    def this(textureKey: String, textureFrame: String, index: Double, frame: Frame, isKeyFrame: Boolean) = this()
    def this(textureKey: String, textureFrame: Double, index: Double, frame: Frame, isKeyFrame: Boolean) = this()
    
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
    var index: Double = js.native
    
    /**
      * Is this the first frame in an animation sequence?
      */
    /* CompleteClass */
    override val isFirst: Boolean = js.native
    
    /**
      * Is this Frame a KeyFrame within the Animation?
      */
    /* CompleteClass */
    var isKeyFrame: Boolean = js.native
    
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
    var textureFrame: String | Double = js.native
    
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
  open class AnimationManager protected ()
    extends StObject
       with typings.phaser.Phaser.Animations.AnimationManager {
    /**
      * 
      * @param game A reference to the Phaser.Game instance.
      */
    def this(game: typings.phaser.Phaser.Game) = this()
  }
  
  /**
    * The Animation State Component.
    * 
    * This component provides features to apply animations to Game Objects. It is responsible for
    * loading, queuing animations for later playback, mixing between animations and setting
    * the current animation frame to the Game Object that owns this component.
    * 
    * This component lives as an instance within any Game Object that has it defined, such as Sprites.
    * 
    * You can access its properties and methods via the `anims` property, i.e. `Sprite.anims`.
    * 
    * As well as playing animations stored in the global Animation Manager, this component
    * can also create animations that are stored locally within it. See the `create` method
    * for more details.
    * 
    * Prior to Phaser 3.50 this component was called just `Animation` and lived in the
    * `Phaser.GameObjects.Components` namespace. It was renamed to `AnimationState`
    * in 3.50 to help better identify its true purpose when browsing the documentation.
    */
  @JSImport("phaser", "Animations.AnimationState")
  @js.native
  open class AnimationState protected ()
    extends StObject
       with typings.phaser.Phaser.Animations.AnimationState {
    /**
      * 
      * @param parent The Game Object to which this animation component belongs.
      */
    def this(parent: GameObject) = this()
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
    val ADD_ANIMATION: Any = js.native
    
    /**
      * The Animation Complete Event.
      * 
      * This event is dispatched by a Sprite when an animation playing on it completes playback.
      * This happens when the animation gets to the end of its sequence, factoring in any delays
      * or repeats it may have to process.
      * 
      * An animation that is set to loop, or repeat forever, will never fire this event, because
      * it never actually completes. If you need to handle this, listen for the `ANIMATION_STOP`
      * event instead, as this is emitted when the animation is stopped directly.
      * 
      * Listen for it on the Sprite using `sprite.on('animationcomplete', listener)`
      * 
      * The animation event flow is as follows:
      * 
      * 1. `ANIMATION_START`
      * 2. `ANIMATION_UPDATE` (repeated for however many frames the animation has)
      * 3. `ANIMATION_REPEAT` (only if the animation is set to repeat, it then emits more update events after this)
      * 4. `ANIMATION_COMPLETE` (only if there is a finite, or zero, repeat count)
      * 5. `ANIMATION_COMPLETE_KEY` (only if there is a finite, or zero, repeat count)
      * 
      * If the animation is stopped directly, the `ANIMATION_STOP` event is dispatched instead of `ANIMATION_COMPLETE`.
      * 
      * If the animation is restarted while it is already playing, `ANIMATION_RESTART` is emitted.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_COMPLETE")
    @js.native
    val ANIMATION_COMPLETE: Any = js.native
    
    /**
      * The Animation Complete Dynamic Key Event.
      * 
      * This event is dispatched by a Sprite when an animation playing on it completes playback.
      * This happens when the animation gets to the end of its sequence, factoring in any delays
      * or repeats it may have to process.
      * 
      * An animation that is set to loop, or repeat forever, will never fire this event, because
      * it never actually completes. If you need to handle this, listen for the `ANIMATION_STOP`
      * event instead, as this is emitted when the animation is stopped directly.
      * 
      * The difference between this and the `ANIMATION_COMPLETE` event is that this one has a
      * dynamic event name that contains the name of the animation within it. For example,
      * if you had an animation called `explode` you could listen for the completion of that
      * specific animation by using: `sprite.on('animationcomplete-explode', listener)`. Or, if you
      * wish to use types: `sprite.on(Phaser.Animations.Events.ANIMATION_COMPLETE_KEY + 'explode', listener)`.
      * 
      * The animation event flow is as follows:
      * 
      * 1. `ANIMATION_START`
      * 2. `ANIMATION_UPDATE` (repeated for however many frames the animation has)
      * 3. `ANIMATION_REPEAT` (only if the animation is set to repeat, it then emits more update events after this)
      * 4. `ANIMATION_COMPLETE` (only if there is a finite, or zero, repeat count)
      * 5. `ANIMATION_COMPLETE_KEY` (only if there is a finite, or zero, repeat count)
      * 
      * If the animation is stopped directly, the `ANIMATION_STOP` event is dispatched instead of `ANIMATION_COMPLETE`.
      * 
      * If the animation is restarted while it is already playing, `ANIMATION_RESTART` is emitted.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_COMPLETE_KEY")
    @js.native
    val ANIMATION_COMPLETE_KEY: Any = js.native
    
    /**
      * The Animation Repeat Event.
      * 
      * This event is dispatched by a Sprite when an animation repeats playing on it.
      * This happens if the animation was created, or played, with a `repeat` value specified.
      * 
      * An animation will repeat when it reaches the end of its sequence.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrepeat', listener)`
      * 
      * The animation event flow is as follows:
      * 
      * 1. `ANIMATION_START`
      * 2. `ANIMATION_UPDATE` (repeated for however many frames the animation has)
      * 3. `ANIMATION_REPEAT` (only if the animation is set to repeat, it then emits more update events after this)
      * 4. `ANIMATION_COMPLETE` (only if there is a finite, or zero, repeat count)
      * 5. `ANIMATION_COMPLETE_KEY` (only if there is a finite, or zero, repeat count)
      * 
      * If the animation is stopped directly, the `ANIMATION_STOP` event is dispatched instead of `ANIMATION_COMPLETE`.
      * 
      * If the animation is restarted while it is already playing, `ANIMATION_RESTART` is emitted.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_REPEAT")
    @js.native
    val ANIMATION_REPEAT: Any = js.native
    
    /**
      * The Animation Restart Event.
      * 
      * This event is dispatched by a Sprite when an animation restarts playing on it.
      * This only happens when the `Sprite.anims.restart` method is called.
      * 
      * Listen for it on the Sprite using `sprite.on('animationrestart', listener)`
      * 
      * The animation event flow is as follows:
      * 
      * 1. `ANIMATION_START`
      * 2. `ANIMATION_UPDATE` (repeated for however many frames the animation has)
      * 3. `ANIMATION_REPEAT` (only if the animation is set to repeat, it then emits more update events after this)
      * 4. `ANIMATION_COMPLETE` (only if there is a finite, or zero, repeat count)
      * 5. `ANIMATION_COMPLETE_KEY` (only if there is a finite, or zero, repeat count)
      * 
      * If the animation is stopped directly, the `ANIMATION_STOP` event is dispatched instead of `ANIMATION_COMPLETE`.
      * 
      * If the animation is restarted while it is already playing, `ANIMATION_RESTART` is emitted.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_RESTART")
    @js.native
    val ANIMATION_RESTART: Any = js.native
    
    /**
      * The Animation Start Event.
      * 
      * This event is dispatched by a Sprite when an animation starts playing on it.
      * This happens when the animation is played, factoring in any delay that may have been specified.
      * This event happens after the delay has expired and prior to the first update event.
      * 
      * Listen for it on the Sprite using `sprite.on('animationstart', listener)`
      * 
      * The animation event flow is as follows:
      * 
      * 1. `ANIMATION_START`
      * 2. `ANIMATION_UPDATE` (repeated for however many frames the animation has)
      * 3. `ANIMATION_REPEAT` (only if the animation is set to repeat, it then emits more update events after this)
      * 4. `ANIMATION_COMPLETE` (only if there is a finite, or zero, repeat count)
      * 5. `ANIMATION_COMPLETE_KEY` (only if there is a finite, or zero, repeat count)
      * 
      * If the animation is stopped directly, the `ANIMATION_STOP` event is dispatched instead of `ANIMATION_COMPLETE`.
      * 
      * If the animation is restarted while it is already playing, `ANIMATION_RESTART` is emitted.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_START")
    @js.native
    val ANIMATION_START: Any = js.native
    
    /**
      * The Animation Stop Event.
      * 
      * This event is dispatched by a Sprite when an animation is stopped on it. An animation
      * will only be stopeed if a method such as `Sprite.stop` or `Sprite.anims.stopAfterDelay`
      * is called. It can also be emitted if a new animation is started before the current one completes.
      * 
      * Listen for it on the Sprite using `sprite.on('animationstop', listener)`
      * 
      * The animation event flow is as follows:
      * 
      * 1. `ANIMATION_START`
      * 2. `ANIMATION_UPDATE` (repeated for however many frames the animation has)
      * 3. `ANIMATION_REPEAT` (only if the animation is set to repeat, it then emits more update events after this)
      * 4. `ANIMATION_COMPLETE` (only if there is a finite, or zero, repeat count)
      * 5. `ANIMATION_COMPLETE_KEY` (only if there is a finite, or zero, repeat count)
      * 
      * If the animation is stopped directly, the `ANIMATION_STOP` event is dispatched instead of `ANIMATION_COMPLETE`.
      * 
      * If the animation is restarted while it is already playing, `ANIMATION_RESTART` is emitted.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_STOP")
    @js.native
    val ANIMATION_STOP: Any = js.native
    
    /**
      * The Animation Update Event.
      * 
      * This event is dispatched by a Sprite when an animation playing on it updates. This happens when the animation changes frame.
      * An animation will change frame based on the frme rate and other factors like `timeScale` and `delay`. It can also change
      * frame when stopped or restarted.
      * 
      * Listen for it on the Sprite using `sprite.on('animationupdate', listener)`
      * 
      * If an animation is playing faster than the game frame-rate can handle, it's entirely possible for it to emit several
      * update events in a single game frame, so please be aware of this in your code. The **final** event received that frame
      * is the one that is rendered to the game.
      * 
      * The animation event flow is as follows:
      * 
      * 1. `ANIMATION_START`
      * 2. `ANIMATION_UPDATE` (repeated for however many frames the animation has)
      * 3. `ANIMATION_REPEAT` (only if the animation is set to repeat, it then emits more update events after this)
      * 4. `ANIMATION_COMPLETE` (only if there is a finite, or zero, repeat count)
      * 5. `ANIMATION_COMPLETE_KEY` (only if there is a finite, or zero, repeat count)
      * 
      * If the animation is stopped directly, the `ANIMATION_STOP` event is dispatched instead of `ANIMATION_COMPLETE`.
      * 
      * If the animation is restarted while it is already playing, `ANIMATION_RESTART` is emitted.
      */
    @JSImport("phaser", "Animations.Events.ANIMATION_UPDATE")
    @js.native
    val ANIMATION_UPDATE: Any = js.native
    
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
    val PAUSE_ALL: Any = js.native
    
    /**
      * The Remove Animation Event.
      * 
      * This event is dispatched when an animation is removed from the global Animation Manager.
      */
    @JSImport("phaser", "Animations.Events.REMOVE_ANIMATION")
    @js.native
    val REMOVE_ANIMATION: Any = js.native
    
    /**
      * The Resume All Animations Event.
      * 
      * This event is dispatched when the global Animation Manager resumes, having been previously paused.
      * 
      * When this happens all current animations will continue updating again.
      */
    @JSImport("phaser", "Animations.Events.RESUME_ALL")
    @js.native
    val RESUME_ALL: Any = js.native
  }
}
