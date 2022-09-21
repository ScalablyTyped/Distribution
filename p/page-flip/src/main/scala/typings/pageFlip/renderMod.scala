package typings.pageFlip

import typings.pageFlip.basicTypesMod.PageRect
import typings.pageFlip.basicTypesMod.Point
import typings.pageFlip.basicTypesMod.RectPoints
import typings.pageFlip.flipMod.FlipDirection
import typings.pageFlip.pageFlipMod.PageFlip
import typings.pageFlip.pageMod.Page
import typings.pageFlip.settingsMod.FlipSetting
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object renderMod {
  
  @js.native
  sealed trait Orientation extends StObject
  @JSImport("page-flip/dist/Render/Render", "Orientation")
  @js.native
  object Orientation extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[Orientation & String] = js.native
    
    @js.native
    sealed trait LANDSCAPE
      extends StObject
         with Orientation
    /* "landscape" */ val LANDSCAPE: typings.pageFlip.renderMod.Orientation.LANDSCAPE & String = js.native
    
    @js.native
    sealed trait PORTRAIT
      extends StObject
         with Orientation
    /* "portrait" */ val PORTRAIT: typings.pageFlip.renderMod.Orientation.PORTRAIT & String = js.native
  }
  
  @JSImport("page-flip/dist/Render/Render", "Render")
  @js.native
  abstract class Render protected () extends StObject {
    /* protected */ def this(app: PageFlip, setting: FlipSetting) = this()
    
    /** Сurrent animation process */
    /* protected */ var animation: AnimationProcess = js.native
    
    /* protected */ val app: PageFlip = js.native
    
    /** Next page at the time of flipping */
    /* protected */ var bottomPage: Page = js.native
    
    /** Current book area */
    /* private */ var boundsRect: Any = js.native
    
    /**
      * Calculate the size and position of the book depending on the parent element and configuration parameters
      */
    /* private */ var calculateBoundsRect: Any = js.native
    
    /**
      * Clear shadow
      */
    def clearShadow(): Unit = js.native
    
    /**
      * Casting the coordinates of the corners of the rectangle in the coordinates relative to the window
      */
    def convertRectToGlobal(rect: RectPoints): RectPoints = js.native
    def convertRectToGlobal(rect: RectPoints, direction: FlipDirection): RectPoints = js.native
    
    /**
      * Coordinate conversion function. Window coordinates -> to book coordinates
      */
    def convertToBook(pos: Point): Point = js.native
    
    /**
      * Coordinate conversion function. Coordinates relative to the work page -> Window coordinates
      */
    def convertToGlobal(pos: Point): Point = js.native
    def convertToGlobal(pos: Point, direction: FlipDirection): Point = js.native
    
    /**
      * Coordinate conversion function. Window coordinates -> to current coordinates of the working page
      */
    def convertToPage(pos: Point): Point = js.native
    def convertToPage(pos: Point, direction: FlipDirection): Point = js.native
    
    /** Current flipping direction */
    /* protected */ var direction: FlipDirection = js.native
    
    /**
      * Rendering action on each requestAnimationFrame call. The entire rendering process is performed only in this method
      */
    /* protected */ def drawFrame(): Unit = js.native
    
    /**
      * End the current animation process and call the callback
      */
    def finishAnimation(): Unit = js.native
    
    /** Page currently flipping */
    /* protected */ var flippingPage: Page = js.native
    
    /**
      * Get parent block offset height
      */
    def getBlockHeight(): Double = js.native
    
    /**
      * Get parent block offset width
      */
    def getBlockWidth(): Double = js.native
    
    /**
      * Get current flipping direction
      */
    def getDirection(): FlipDirection = js.native
    
    /**
      * Get current book orientation
      */
    def getOrientation(): Orientation = js.native
    
    /**
      * Сurrent size and position of the book
      */
    def getRect(): PageRect = js.native
    
    /**
      * Get configuration object
      */
    def getSettings(): FlipSetting = js.native
    
    def isSafari(): Boolean = js.native
    
    /** Left static book page */
    /* protected */ var leftPage: Page = js.native
    
    /** Current book orientation */
    /* protected */ var orientation: Orientation = js.native
    
    /** Page borders while flipping */
    /* protected */ var pageRect: RectPoints = js.native
    
    /**
      * Executed when requestAnimationFrame is called. Performs the current animation process and call drawFrame()
      */
    /* private */ var render: Any = js.native
    
    /** Right static book page */
    /* protected */ var rightPage: Page = js.native
    
    /**
      * Safari browser definitions for resolving a bug with a css property clip-area
      *
      * https://bugs.webkit.org/show_bug.cgi?id=126207
      */
    /* private */ var safari: Any = js.native
    
    /**
      * Set next page at the time of flipping
      */
    def setBottomPage(page: Page): Unit = js.native
    
    /**
      * Set flipping direction
      */
    def setDirection(direction: FlipDirection): Unit = js.native
    
    /**
      * Set currently flipping page
      */
    def setFlippingPage(page: Page): Unit = js.native
    
    /**
      * Set left static book page
      */
    def setLeftPage(page: Page): Unit = js.native
    
    /**
      * Set page area while flipping
      */
    def setPageRect(pageRect: RectPoints): Unit = js.native
    
    /**
      * Set right static book page
      */
    def setRightPage(page: Page): Unit = js.native
    
    /**
      * Set the current parameters of the drop shadow
      */
    def setShadowData(pos: Point, angle: Double, progress: Double, direction: FlipDirection): Unit = js.native
    
    /* protected */ val setting: FlipSetting = js.native
    
    /** Сurrent state of the shadows */
    /* protected */ var shadow: Shadow = js.native
    
    /**
      * Running requestAnimationFrame, and rendering process
      */
    def start(): Unit = js.native
    
    /**
      * Start a new animation process
      */
    def startAnimation(frames: js.Array[FrameAction], duration: Double, onAnimateEnd: AnimationSuccessAction): Unit = js.native
    
    /** Timer started from start of rendering */
    /* protected */ var timer: Double = js.native
    
    /**
      * Recalculate the size of the displayed area, and update the page orientation
      */
    def update(): Unit = js.native
  }
  
  trait AnimationProcess extends StObject {
    
    /** Total animation duration */
    var duration: Double
    
    /** Animation duration of one frame */
    var durationFrame: Double
    
    /** List of frames in playback order. Each frame is a function. */
    var frames: js.Array[FrameAction]
    
    /** Сallback at the end of the animation */
    def onAnimateEnd(): Unit
    /** Сallback at the end of the animation */
    @JSName("onAnimateEnd")
    var onAnimateEnd_Original: AnimationSuccessAction
    
    /** Animation start time (Global Timer) */
    var startedAt: Double
  }
  object AnimationProcess {
    
    inline def apply(
      duration: Double,
      durationFrame: Double,
      frames: js.Array[FrameAction],
      onAnimateEnd: () => Unit,
      startedAt: Double
    ): AnimationProcess = {
      val __obj = js.Dynamic.literal(duration = duration.asInstanceOf[js.Any], durationFrame = durationFrame.asInstanceOf[js.Any], frames = frames.asInstanceOf[js.Any], onAnimateEnd = js.Any.fromFunction0(onAnimateEnd), startedAt = startedAt.asInstanceOf[js.Any])
      __obj.asInstanceOf[AnimationProcess]
    }
    
    extension [Self <: AnimationProcess](x: Self) {
      
      inline def setDuration(value: Double): Self = StObject.set(x, "duration", value.asInstanceOf[js.Any])
      
      inline def setDurationFrame(value: Double): Self = StObject.set(x, "durationFrame", value.asInstanceOf[js.Any])
      
      inline def setFrames(value: js.Array[FrameAction]): Self = StObject.set(x, "frames", value.asInstanceOf[js.Any])
      
      inline def setFramesVarargs(value: FrameAction*): Self = StObject.set(x, "frames", js.Array(value*))
      
      inline def setOnAnimateEnd(value: () => Unit): Self = StObject.set(x, "onAnimateEnd", js.Any.fromFunction0(value))
      
      inline def setStartedAt(value: Double): Self = StObject.set(x, "startedAt", value.asInstanceOf[js.Any])
    }
  }
  
  type AnimationSuccessAction = js.Function0[Unit]
  
  type FrameAction = js.Function0[Unit]
  
  trait Shadow extends StObject {
    
    /** The angle of the shadows relative to the book */
    var angle: Double
    
    /** Flipping Direction, the direction of the shadow gradients */
    var direction: FlipDirection
    
    /** Base shadow opacity */
    var opacity: Double
    
    /** Shadow Position Start Point */
    var pos: Point
    
    /** Flipping progress in percent (0 - 100) */
    var progress: Double
    
    /** Base width shadow */
    var width: Double
  }
  object Shadow {
    
    inline def apply(
      angle: Double,
      direction: FlipDirection,
      opacity: Double,
      pos: Point,
      progress: Double,
      width: Double
    ): Shadow = {
      val __obj = js.Dynamic.literal(angle = angle.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], opacity = opacity.asInstanceOf[js.Any], pos = pos.asInstanceOf[js.Any], progress = progress.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
      __obj.asInstanceOf[Shadow]
    }
    
    extension [Self <: Shadow](x: Self) {
      
      inline def setAngle(value: Double): Self = StObject.set(x, "angle", value.asInstanceOf[js.Any])
      
      inline def setDirection(value: FlipDirection): Self = StObject.set(x, "direction", value.asInstanceOf[js.Any])
      
      inline def setOpacity(value: Double): Self = StObject.set(x, "opacity", value.asInstanceOf[js.Any])
      
      inline def setPos(value: Point): Self = StObject.set(x, "pos", value.asInstanceOf[js.Any])
      
      inline def setProgress(value: Double): Self = StObject.set(x, "progress", value.asInstanceOf[js.Any])
      
      inline def setWidth(value: Double): Self = StObject.set(x, "width", value.asInstanceOf[js.Any])
    }
  }
}
