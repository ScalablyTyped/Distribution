package typings.pixiSpriteAnimated

import typings.pixiCore.libTexturesResourcesResourceMod.Resource
import typings.pixiCore.mod.Texture
import typings.pixiSprite.mod.Sprite
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object libAnimatedSpriteMod {
  
  @JSImport("@pixi/sprite-animated/lib/AnimatedSprite", "AnimatedSprite")
  @js.native
  open class AnimatedSprite protected () extends Sprite {
    /**
      * @param textures - An array of {@link PIXI.Texture} or frame
      *  objects that make up the animation.
      * @param {boolean} [autoUpdate=true] - Whether to use PIXI.Ticker.shared to auto update animation time.
      */
    def this(textures: js.Array[FrameObject | Texture[Resource]]) = this()
    def this(textures: js.Array[FrameObject | Texture[Resource]], autoUpdate: Boolean) = this()
    
    /**
      * `true` uses PIXI.Ticker.shared to auto update animation time.
      * @default true
      */
    /* private */ var _autoUpdate: Any = js.native
    
    /** Elapsed time since animation has been started, used internally to display current texture. */
    /* private */ var _currentTime: Any = js.native
    
    /* private */ var _durations: Any = js.native
    
    /**
      * `true` if the instance is currently connected to PIXI.Ticker.shared to auto update animation time.
      * @default false
      */
    /* private */ var _isConnectedToTicker: Any = js.native
    
    /* private */ var _playing: Any = js.native
    
    /** The texture index that was displayed last time. */
    /* private */ var _previousFrame: Any = js.native
    
    /* private */ var _textures: Any = js.native
    
    /**
      * The speed that the AnimatedSprite will play at. Higher is faster, lower is slower.
      * @default 1
      */
    var animationSpeed: Double = js.native
    
    /** Whether to use PIXI.Ticker.shared to auto update animation time. */
    def autoUpdate: Boolean = js.native
    def autoUpdate_=(value: Boolean): Unit = js.native
    
    /** The AnimatedSprites current frame index. */
    def currentFrame: Double = js.native
    def currentFrame_=(value: Double): Unit = js.native
    
    /**
      * Goes to a specific frame and begins playing the AnimatedSprite.
      * @param frameNumber - Frame index to start at.
      */
    def gotoAndPlay(frameNumber: Double): Unit = js.native
    
    /**
      * Stops the AnimatedSprite and goes to a specific frame.
      * @param frameNumber - Frame index to stop at.
      */
    def gotoAndStop(frameNumber: Double): Unit = js.native
    
    /**
      * Whether or not the animate sprite repeats after playing.
      * @default true
      */
    var loop: Boolean = js.native
    
    /**
      * User-assigned function to call when an AnimatedSprite finishes playing.
      * @example
      * animation.onComplete = () => {
      *     // Finished!
      * };
      */
    var onComplete: js.UndefOr[js.Function0[Unit]] = js.native
    
    /**
      * User-assigned function to call when an AnimatedSprite changes which texture is being rendered.
      * @example
      * animation.onFrameChange = () => {
      *     // Updated!
      * };
      */
    var onFrameChange: js.UndefOr[js.Function1[/* currentFrame */ Double, Unit]] = js.native
    
    /**
      * User-assigned function to call when `loop` is true, and an AnimatedSprite is played and
      * loops around to start again.
      * @example
      * animation.onLoop = () => {
      *     // Looped!
      * };
      */
    var onLoop: js.UndefOr[js.Function0[Unit]] = js.native
    
    /** Plays the AnimatedSprite. */
    def play(): Unit = js.native
    
    /**
      * Indicates if the AnimatedSprite is currently playing.
      * @readonly
      */
    def playing: Boolean = js.native
    
    /** Stops the AnimatedSprite. */
    def stop(): Unit = js.native
    
    /** The array of textures used for this AnimatedSprite. */
    def textures: js.Array[FrameObject | Texture[Resource]] = js.native
    def textures_=(value: js.Array[FrameObject | Texture[Resource]]): Unit = js.native
    
    /**
      * The total number of frames in the AnimatedSprite. This is the same as number of textures
      * assigned to the AnimatedSprite.
      * @readonly
      * @default 0
      */
    def totalFrames: Double = js.native
    
    /**
      * Updates the object transform for rendering.
      * @param deltaTime - Time since last tick.
      */
    def update(deltaTime: Double): Unit = js.native
    
    /**
      * Update anchor to [Texture's defaultAnchor]{@link PIXI.Texture#defaultAnchor} when frame changes.
      *
      * Useful with [sprite sheet animations]{@link PIXI.Spritesheet#animations} created with tools.
      * Changing anchor for each frame allows to pin sprite origin to certain moving feature
      * of the frame (e.g. left foot).
      *
      * Note: Enabling this will override any previously set `anchor` on each frame change.
      * @default false
      */
    var updateAnchor: Boolean = js.native
    
    /** Updates the displayed texture to match the current frame index. */
    /* private */ var updateTexture: Any = js.native
  }
  /* static members */
  object AnimatedSprite {
    
    @JSImport("@pixi/sprite-animated/lib/AnimatedSprite", "AnimatedSprite")
    @js.native
    val ^ : js.Any = js.native
    
    /**
      * A short hand way of creating an AnimatedSprite from an array of frame ids.
      * @param frames - The array of frames ids the AnimatedSprite will use as its texture frames.
      * @returns - The new animated sprite with the specified frames.
      */
    inline def fromFrames(frames: js.Array[String]): AnimatedSprite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromFrames")(frames.asInstanceOf[js.Any]).asInstanceOf[AnimatedSprite]
    
    /**
      * A short hand way of creating an AnimatedSprite from an array of image ids.
      * @param images - The array of image urls the AnimatedSprite will use as its texture frames.
      * @returns The new animate sprite with the specified images as frames.
      */
    inline def fromImages(images: js.Array[String]): AnimatedSprite = ^.asInstanceOf[js.Dynamic].applyDynamic("fromImages")(images.asInstanceOf[js.Any]).asInstanceOf[AnimatedSprite]
  }
  
  trait FrameObject extends StObject {
    
    /** The {@link PIXI.Texture} of the frame. */
    var texture: Texture[Resource]
    
    /** The duration of the frame, in milliseconds. */
    var time: Double
  }
  object FrameObject {
    
    inline def apply(texture: Texture[Resource], time: Double): FrameObject = {
      val __obj = js.Dynamic.literal(texture = texture.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any])
      __obj.asInstanceOf[FrameObject]
    }
    
    extension [Self <: FrameObject](x: Self) {
      
      inline def setTexture(value: Texture[Resource]): Self = StObject.set(x, "texture", value.asInstanceOf[js.Any])
      
      inline def setTime(value: Double): Self = StObject.set(x, "time", value.asInstanceOf[js.Any])
    }
  }
}
