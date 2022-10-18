package typings.pageFlip

import typings.pageFlip.distBasicTypesMod.Point
import typings.pageFlip.distBasicTypesMod.RectPoints
import typings.pageFlip.distFlipFlipMod.FlipCorner
import typings.pageFlip.distFlipFlipMod.FlipDirection
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distFlipFlipCalculationMod {
  
  @JSImport("page-flip/dist/Flip/FlipCalculation", "FlipCalculation")
  @js.native
  open class FlipCalculation protected () extends StObject {
    def this(direction: FlipDirection, corner: FlipCorner, pageWidth: String, pageHeight: String) = this()
    
    /** Calculated rotation angle to flipping page */
    /* private */ var angle: Any = js.native
    
    /* private */ var bottomIntersectPoint: Any = js.native
    
    /**
      * The main calculation method
      */
    def calc(localPos: Point): Boolean = js.native
    
    /* private */ var calcAngleAndPosition: Any = js.native
    
    /* private */ var calculateAngle: Any = js.native
    
    /* private */ var calculateIntersectPoint: Any = js.native
    
    /* private */ var checkPositionAtCenterLine: Any = js.native
    
    /* private */ var corner: Any = js.native
    
    /* private */ var direction: Any = js.native
    
    /**
      * Get the active corner of the page (which pull)
      */
    def getActiveCorner(): Point = js.native
    
    /**
      * Get page rotation angle
      */
    def getAngle(): Double = js.native
    
    /**
      * Get the crop area for the page that is below the page to be flipped
      */
    def getBottomClipArea(): js.Array[Point] = js.native
    
    /**
      * Get start position for the page that is below the page to be flipped
      */
    def getBottomPagePosition(): Point = js.native
    
    /**
      * Get flipping corner position (top, bottom)
      */
    def getCorner(): FlipCorner = js.native
    
    /**
      * Get flipping direction
      */
    def getDirection(): FlipDirection = js.native
    
    /**
      * Get the crop area for the flipping page
      */
    def getFlippingClipArea(): js.Array[Point] = js.native
    
    /**
      * Get flipping progress (0-100)
      */
    def getFlippingProgress(): Double = js.native
    
    /* private */ var getPageRect: Any = js.native
    
    /**
      * Get the position of the active angle when turning
      */
    def getPosition(): Point = js.native
    
    /**
      * Get page area while flipping
      */
    def getRect(): RectPoints = js.native
    
    /* private */ var getRectFromBasePoint: Any = js.native
    
    /* private */ var getRotatedPoint: Any = js.native
    
    /* private */ var getSegmentToShadowLine: Any = js.native
    
    /**
      * Get the rotate angle of the shadow
      */
    def getShadowAngle(): Double = js.native
    
    /**
      * Get the starting position of the shadow
      */
    def getShadowStartPoint(): Point = js.native
    
    /* private */ val pageHeight: Any = js.native
    
    /* private */ val pageWidth: Any = js.native
    
    /** Calculated position to flipping page */
    /* private */ var position: Any = js.native
    
    /* private */ var rect: Any = js.native
    
    /* private */ var sideIntersectPoint: Any = js.native
    
    /** The point of intersection of the page with the borders of the book */
    /* private */ var topIntersectPoint: Any = js.native
    
    /* private */ var updateAngleAndGeometry: Any = js.native
  }
}
