package typings.pageFlip

import typings.pageFlip.basicTypesMod.Point
import typings.pageFlip.flipCalculationMod.FlipCalculation
import typings.pageFlip.pageFlipMod.PageFlip
import typings.pageFlip.renderMod.Render
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object flipMod {
  
  @JSImport("page-flip/dist/Flip/Flip", "Flip")
  @js.native
  open class Flip protected () extends StObject {
    def this(render: Render, app: PageFlip) = this()
    
    /**
      * Starting the flipping animation process
      */
    /* private */ var animateFlippingTo: Any = js.native
    
    /* private */ val app: Any = js.native
    
    /* private */ var bottomPage: Any = js.native
    
    /* private */ var calc: Any = js.native
    
    /* private */ var checkDirection: Any = js.native
    
    /* private */ var checkState: Any = js.native
    
    /**
      * Perform calculations for the current page position. Pass data to render object
      */
    /* private */ var `do`: Any = js.native
    
    /**
      * Page turning with animation
      */
    def flip(globalPos: Point): Unit = js.native
    
    /**
      * Turn to the next page (with animation)
      */
    def flipNext(corner: FlipCorner): Unit = js.native
    
    /**
      * Turn to the prev page (with animation)
      */
    def flipPrev(corner: FlipCorner): Unit = js.native
    
    /**
      * Turn to the specified page number (with animation)
      */
    def flipToPage(page: Double, corner: FlipCorner): Unit = js.native
    
    /* private */ var flippingPage: Any = js.native
    
    /**
      * Called when the page folding (User drags page corner)
      */
    def fold(globalPos: Point): Unit = js.native
    
    /* private */ var getAnimationDuration: Any = js.native
    
    /* private */ var getBoundsRect: Any = js.native
    
    /**
      * Get the current calculations object
      */
    def getCalculation(): FlipCalculation = js.native
    
    /* private */ var getDirectionByPoint: Any = js.native
    
    /**
      * Get current flipping state
      */
    def getState(): FlippingState = js.native
    
    /* private */ var isPointOnCorners: Any = js.native
    
    /* private */ val render: Any = js.native
    
    /* private */ var reset: Any = js.native
    
    /* private */ var setState: Any = js.native
    
    /**
      * Fold the corners of the book when the mouse pointer is over them.
      * Called when the mouse pointer is over the book without clicking
      */
    def showCorner(globalPos: Point): Unit = js.native
    
    /**
      * Start the flipping process. Find direction and corner of flipping. Creating an object for calculation.
      */
    def start(globalPos: Point): Boolean = js.native
    
    /* private */ var state: Any = js.native
    
    /**
      * Called when the user has stopped flipping
      */
    def stopMove(): Unit = js.native
  }
  
  @js.native
  sealed trait FlipCorner extends StObject
  @JSImport("page-flip/dist/Flip/Flip", "FlipCorner")
  @js.native
  object FlipCorner extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FlipCorner & String] = js.native
    
    @js.native
    sealed trait BOTTOM
      extends StObject
         with FlipCorner
    /* "bottom" */ val BOTTOM: typings.pageFlip.flipMod.FlipCorner.BOTTOM & String = js.native
    
    @js.native
    sealed trait TOP
      extends StObject
         with FlipCorner
    /* "top" */ val TOP: typings.pageFlip.flipMod.FlipCorner.TOP & String = js.native
  }
  
  @js.native
  sealed trait FlipDirection extends StObject
  @JSImport("page-flip/dist/Flip/Flip", "FlipDirection")
  @js.native
  object FlipDirection extends StObject {
    
    @JSBracketAccess
    def apply(value: Double): js.UndefOr[FlipDirection & Double] = js.native
    
    @js.native
    sealed trait BACK
      extends StObject
         with FlipDirection
    /* 1 */ val BACK: typings.pageFlip.flipMod.FlipDirection.BACK & Double = js.native
    
    @js.native
    sealed trait FORWARD
      extends StObject
         with FlipDirection
    /* 0 */ val FORWARD: typings.pageFlip.flipMod.FlipDirection.FORWARD & Double = js.native
  }
  
  @js.native
  sealed trait FlippingState extends StObject
  @JSImport("page-flip/dist/Flip/Flip", "FlippingState")
  @js.native
  object FlippingState extends StObject {
    
    @JSBracketAccess
    def apply(value: String): js.UndefOr[FlippingState & String] = js.native
    
    /** During flipping animation */
    @js.native
    sealed trait FLIPPING
      extends StObject
         with FlippingState
    /* "flipping" */ val FLIPPING: typings.pageFlip.flipMod.FlippingState.FLIPPING & String = js.native
    
    /** Mouse over active corners */
    @js.native
    sealed trait FOLD_CORNER
      extends StObject
         with FlippingState
    /* "fold_corner" */ val FOLD_CORNER: typings.pageFlip.flipMod.FlippingState.FOLD_CORNER & String = js.native
    
    /** Base state */
    @js.native
    sealed trait READ
      extends StObject
         with FlippingState
    /* "read" */ val READ: typings.pageFlip.flipMod.FlippingState.READ & String = js.native
    
    /** The user folding the page */
    @js.native
    sealed trait USER_FOLD
      extends StObject
         with FlippingState
    /* "user_fold" */ val USER_FOLD: typings.pageFlip.flipMod.FlippingState.USER_FOLD & String = js.native
  }
}
