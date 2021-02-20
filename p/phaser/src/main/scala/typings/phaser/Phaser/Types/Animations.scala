package typings.phaser.Phaser.Types

import typings.phaser.integer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object Animations {
  
  @js.native
  trait Animation extends StObject {
    
    /**
      * The key of the texture all frames of the animation will use. Can be overridden on a per frame basis.
      */
    var defaultTextureKey: js.UndefOr[String] = js.native
    
    /**
      * Delay before starting playback. Value given in milliseconds.
      */
    var delay: js.UndefOr[integer] = js.native
    
    /**
      * How long the animation should play for in milliseconds. If not given its derived from frameRate.
      */
    var duration: js.UndefOr[integer] = js.native
    
    /**
      * The frame rate of playback in frames per second (default 24 if duration is null)
      */
    var frameRate: js.UndefOr[integer] = js.native
    
    /**
      * An object containing data used to generate the frames for the animation
      */
    var frames: js.UndefOr[js.Array[AnimationFrame]] = js.native
    
    /**
      * Should sprite.visible = false when the animation finishes?
      */
    var hideOnComplete: js.UndefOr[Boolean] = js.native
    
    /**
      * The key that the animation will be associated with. i.e. sprite.animations.play(key)
      */
    var key: js.UndefOr[String] = js.native
    
    /**
      * Number of times to repeat the animation (-1 for infinity)
      */
    var repeat: js.UndefOr[integer] = js.native
    
    /**
      * Delay before the animation repeats. Value given in milliseconds.
      */
    var repeatDelay: js.UndefOr[integer] = js.native
    
    /**
      * Should sprite.visible = true when the animation starts to play?
      */
    var showOnStart: js.UndefOr[Boolean] = js.native
    
    /**
      * Skip frames if the time lags, or always advanced anyway?
      */
    var skipMissedFrames: js.UndefOr[Boolean] = js.native
    
    /**
      * Should the animation yoyo? (reverse back down to the start) before repeating?
      */
    var yoyo: js.UndefOr[Boolean] = js.native
  }
  object Animation {
    
    @scala.inline
    def apply(): Animation = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Animation]
    }
    
    @scala.inline
    implicit class AnimationMutableBuilder[Self <: Animation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDefaultTextureKey(value: String): Self = StObject.set(x, "defaultTextureKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDefaultTextureKeyUndefined: Self = StObject.set(x, "defaultTextureKey", js.undefined)
      
      @scala.inline
      def setDelay(value: integer): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelayUndefined: Self = StObject.set(x, "delay", js.undefined)
      
      @scala.inline
      def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFrameRate(value: integer): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameRateUndefined: Self = StObject.set(x, "frameRate", js.undefined)
      
      @scala.inline
      def setFrames(value: js.Array[AnimationFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      @scala.inline
      def setFramesVarargs(value: AnimationFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setHideOnComplete(value: Boolean): Self = StObject.set(x, "hideOnComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setHideOnCompleteUndefined: Self = StObject.set(x, "hideOnComplete", js.undefined)
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      @scala.inline
      def setRepeat(value: integer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: integer): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelayUndefined: Self = StObject.set(x, "repeatDelay", js.undefined)
      
      @scala.inline
      def setRepeatUndefined: Self = StObject.set(x, "repeat", js.undefined)
      
      @scala.inline
      def setShowOnStart(value: Boolean): Self = StObject.set(x, "showOnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnStartUndefined: Self = StObject.set(x, "showOnStart", js.undefined)
      
      @scala.inline
      def setSkipMissedFrames(value: Boolean): Self = StObject.set(x, "skipMissedFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipMissedFramesUndefined: Self = StObject.set(x, "skipMissedFrames", js.undefined)
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyoUndefined: Self = StObject.set(x, "yoyo", js.undefined)
    }
  }
  
  @js.native
  trait AnimationFrame extends StObject {
    
    /**
      * The duration, in ms, of this frame of the animation.
      */
    var duration: js.UndefOr[Double] = js.native
    
    /**
      * The key, or index number, of the frame within the animation.
      */
    var frame: String | Double = js.native
    
    /**
      * The key that the animation will be associated with. i.e. sprite.animations.play(key)
      */
    var key: String = js.native
    
    /**
      * Should the parent Game Object be visible during this frame of the animation?
      */
    var visible: js.UndefOr[Boolean] = js.native
  }
  object AnimationFrame {
    
    @scala.inline
    def apply(frame: String | Double, key: String): AnimationFrame = {
      val __obj = js.Dynamic.literal(frame = frame.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationFrame]
    }
    
    @scala.inline
    implicit class AnimationFrameMutableBuilder[Self <: AnimationFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDurationUndefined: Self = StObject.set(x, "duration", js.undefined)
      
      @scala.inline
      def setFrame(value: String | Double): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisible(value: Boolean): Self = StObject.set(x, "visible", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setVisibleUndefined: Self = StObject.set(x, "visible", js.undefined)
    }
  }
  
  @js.native
  trait GenerateFrameNames extends StObject {
    
    /**
      * If `frames` is not provided, the number of the last frame to return.
      */
    var end: js.UndefOr[integer] = js.native
    
    /**
      * If provided as an array, the range defined by `start` and `end` will be ignored and these frame numbers will be used.
      */
    var frames: js.UndefOr[Boolean | js.Array[integer]] = js.native
    
    /**
      * The array to append the created configuration objects to.
      */
    var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.native
    
    /**
      * The string to append to every resulting frame name if using a range or an array of `frames`.
      */
    var prefix: js.UndefOr[String] = js.native
    
    /**
      * If `frames` is not provided, the number of the first frame to return.
      */
    var start: js.UndefOr[integer] = js.native
    
    /**
      * The string to append to every resulting frame name if using a range or an array of `frames`.
      */
    var suffix: js.UndefOr[String] = js.native
    
    /**
      * The minimum expected lengths of each resulting frame's number. Numbers will be left-padded with zeroes until they are this long, then prepended and appended to create the resulting frame name.
      */
    var zeroPad: js.UndefOr[integer] = js.native
  }
  object GenerateFrameNames {
    
    @scala.inline
    def apply(): GenerateFrameNames = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateFrameNames]
    }
    
    @scala.inline
    implicit class GenerateFrameNamesMutableBuilder[Self <: GenerateFrameNames] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: integer): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFrames(value: Boolean | js.Array[integer]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      @scala.inline
      def setFramesVarargs(value: integer*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setOutputArray(value: js.Array[AnimationFrame]): Self = StObject.set(x, "outputArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputArrayUndefined: Self = StObject.set(x, "outputArray", js.undefined)
      
      @scala.inline
      def setOutputArrayVarargs(value: AnimationFrame*): Self = StObject.set(x, "outputArray", js.Array(value :_*))
      
      @scala.inline
      def setPrefix(value: String): Self = StObject.set(x, "prefix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrefixUndefined: Self = StObject.set(x, "prefix", js.undefined)
      
      @scala.inline
      def setStart(value: integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
      
      @scala.inline
      def setSuffix(value: String): Self = StObject.set(x, "suffix", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSuffixUndefined: Self = StObject.set(x, "suffix", js.undefined)
      
      @scala.inline
      def setZeroPad(value: integer): Self = StObject.set(x, "zeroPad", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setZeroPadUndefined: Self = StObject.set(x, "zeroPad", js.undefined)
    }
  }
  
  @js.native
  trait GenerateFrameNumbers extends StObject {
    
    /**
      * The ending frame of the animation.
      */
    var end: js.UndefOr[integer] = js.native
    
    /**
      * A frame to put at the beginning of the animation, before `start` or `outputArray` or `frames`.
      */
    var first: js.UndefOr[Boolean | integer] = js.native
    
    /**
      * A custom sequence of frames.
      */
    var frames: js.UndefOr[Boolean | js.Array[integer]] = js.native
    
    /**
      * An array to concatenate the output onto.
      */
    var outputArray: js.UndefOr[js.Array[AnimationFrame]] = js.native
    
    /**
      * The starting frame of the animation.
      */
    var start: js.UndefOr[integer] = js.native
  }
  object GenerateFrameNumbers {
    
    @scala.inline
    def apply(): GenerateFrameNumbers = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenerateFrameNumbers]
    }
    
    @scala.inline
    implicit class GenerateFrameNumbersMutableBuilder[Self <: GenerateFrameNumbers] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEnd(value: integer): Self = StObject.set(x, "end", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setEndUndefined: Self = StObject.set(x, "end", js.undefined)
      
      @scala.inline
      def setFirst(value: Boolean | integer): Self = StObject.set(x, "first", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFirstUndefined: Self = StObject.set(x, "first", js.undefined)
      
      @scala.inline
      def setFrames(value: Boolean | js.Array[integer]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesUndefined: Self = StObject.set(x, "frames", js.undefined)
      
      @scala.inline
      def setFramesVarargs(value: integer*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setOutputArray(value: js.Array[AnimationFrame]): Self = StObject.set(x, "outputArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOutputArrayUndefined: Self = StObject.set(x, "outputArray", js.undefined)
      
      @scala.inline
      def setOutputArrayVarargs(value: AnimationFrame*): Self = StObject.set(x, "outputArray", js.Array(value :_*))
      
      @scala.inline
      def setStart(value: integer): Self = StObject.set(x, "start", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setStartUndefined: Self = StObject.set(x, "start", js.undefined)
    }
  }
  
  @js.native
  trait JSONAnimation extends StObject {
    
    /**
      * Delay before starting playback. Value given in milliseconds.
      */
    var delay: integer = js.native
    
    /**
      * How long the animation should play for in milliseconds. If not given its derived from frameRate.
      */
    var duration: integer = js.native
    
    /**
      * The frame rate of playback in frames per second (default 24 if duration is null)
      */
    var frameRate: integer = js.native
    
    /**
      * An array of the AnimationFrame objects inside this Animation.
      */
    var frames: js.Array[JSONAnimationFrame] = js.native
    
    /**
      * Should sprite.visible = false when the animation finishes?
      */
    var hideOnComplete: Boolean = js.native
    
    /**
      * The key that the animation will be associated with. i.e. sprite.animations.play(key)
      */
    var key: String = js.native
    
    /**
      * Number of times to repeat the animation (-1 for infinity)
      */
    var repeat: integer = js.native
    
    /**
      * Delay before the animation repeats. Value given in milliseconds.
      */
    var repeatDelay: integer = js.native
    
    /**
      * Should sprite.visible = true when the animation starts to play?
      */
    var showOnStart: Boolean = js.native
    
    /**
      * Skip frames if the time lags, or always advanced anyway?
      */
    var skipMissedFrames: Boolean = js.native
    
    /**
      * A frame based animation (as opposed to a bone based animation)
      */
    var `type`: String = js.native
    
    /**
      * Should the animation yoyo? (reverse back down to the start) before repeating?
      */
    var yoyo: Boolean = js.native
  }
  object JSONAnimation {
    
    @scala.inline
    def apply(
      delay: integer,
      duration: integer,
      frameRate: integer,
      frames: js.Array[JSONAnimationFrame],
      hideOnComplete: Boolean,
      key: String,
      repeat: integer,
      repeatDelay: integer,
      showOnStart: Boolean,
      skipMissedFrames: Boolean,
      `type`: String,
      yoyo: Boolean
    ): JSONAnimation = {
      val __obj = js.Dynamic.literal(delay = delay.asInstanceOf[js.Any], duration = duration.asInstanceOf[js.Any], frameRate = frameRate.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], hideOnComplete = hideOnComplete.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any], repeat = repeat.asInstanceOf[js.Any], repeatDelay = repeatDelay.asInstanceOf[js.Any], showOnStart = showOnStart.asInstanceOf[js.Any], skipMissedFrames = skipMissedFrames.asInstanceOf[js.Any], yoyo = yoyo.asInstanceOf[js.Any])
      __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONAnimation]
    }
    
    @scala.inline
    implicit class JSONAnimationMutableBuilder[Self <: JSONAnimation] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDelay(value: integer): Self = StObject.set(x, "delay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDuration(value: integer): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrameRate(value: integer): Self = StObject.set(x, "frameRate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrames(value: js.Array[JSONAnimationFrame]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFramesVarargs(value: JSONAnimationFrame*): Self = StObject.set(x, "frames", js.Array(value :_*))
      
      @scala.inline
      def setHideOnComplete(value: Boolean): Self = StObject.set(x, "hideOnComplete", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeat(value: integer): Self = StObject.set(x, "repeat", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setRepeatDelay(value: integer): Self = StObject.set(x, "repeatDelay", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setShowOnStart(value: Boolean): Self = StObject.set(x, "showOnStart", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setSkipMissedFrames(value: Boolean): Self = StObject.set(x, "skipMissedFrames", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setYoyo(value: Boolean): Self = StObject.set(x, "yoyo", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSONAnimationFrame extends StObject {
    
    /**
      * Additional time (in ms) that this frame should appear for during playback.
      */
    var duration: Double = js.native
    
    /**
      * The key of the Frame within the Texture that this AnimationFrame uses.
      */
    var frame: String | integer = js.native
    
    /**
      * The key of the Texture this AnimationFrame uses.
      */
    var key: String = js.native
  }
  object JSONAnimationFrame {
    
    @scala.inline
    def apply(duration: Double, frame: String | integer, key: String): JSONAnimationFrame = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], frame = frame.asInstanceOf[js.Any], key = key.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONAnimationFrame]
    }
    
    @scala.inline
    implicit class JSONAnimationFrameMutableBuilder[Self <: JSONAnimationFrame] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setFrame(value: String | integer): Self = StObject.set(x, "frame", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKey(value: String): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait JSONAnimations extends StObject {
    
    /**
      * An array of all Animations added to the Animation Manager.
      */
    var anims: js.Array[JSONAnimation] = js.native
    
    /**
      * The global time scale of the Animation Manager.
      */
    var globalTimeScale: Double = js.native
  }
  object JSONAnimations {
    
    @scala.inline
    def apply(anims: js.Array[JSONAnimation], globalTimeScale: Double): JSONAnimations = {
      val __obj = js.Dynamic.literal(anims = anims.asInstanceOf[js.Any], globalTimeScale = globalTimeScale.asInstanceOf[js.Any])
      __obj.asInstanceOf[JSONAnimations]
    }
    
    @scala.inline
    implicit class JSONAnimationsMutableBuilder[Self <: JSONAnimations] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAnims(value: js.Array[JSONAnimation]): Self = StObject.set(x, "anims", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAnimsVarargs(value: JSONAnimation*): Self = StObject.set(x, "anims", js.Array(value :_*))
      
      @scala.inline
      def setGlobalTimeScale(value: Double): Self = StObject.set(x, "globalTimeScale", value.asInstanceOf[js.Any])
    }
  }
}
