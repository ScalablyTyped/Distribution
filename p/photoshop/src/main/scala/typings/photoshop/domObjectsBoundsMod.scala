package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object domObjectsBoundsMod {
  
  @JSImport("photoshop/dom/objects/Bounds", "Bounds")
  @js.native
  /** @ignore */
  open class Bounds () extends StObject {
    
    /* private */ var _bottom: Any = js.native
    
    /* private */ var _left: Any = js.native
    
    /* private */ var _right: Any = js.native
    
    /* private */ var _top: Any = js.native
    
    /**
      * Coordinate of the bottom edge.
      * @minVersion 22.5
      */
    def bottom: Double = js.native
    def bottom_=(coordinate: Double): Unit = js.native
    
    /**
      * Calculated height.
      * @minVersion 22.5
      */
    def height: Double = js.native
    
    /**
      * Coordinate of the left edge.
      * @minVersion 22.5
      */
    def left: Double = js.native
    def left_=(coordinate: Double): Unit = js.native
    
    /**
      * Coordinate of the right edge.
      * @minVersion 22.5
      */
    def right: Double = js.native
    def right_=(coordinate: Double): Unit = js.native
    
    /**
      * Coordinate of the top edge.
      * @minVersion 22.5
      */
    def top: Double = js.native
    def top_=(coordinate: Double): Unit = js.native
    
    /**
      * The class name of the referenced object: *"Bounds"*.
      * @minVersion 22.5
      */
    def typename: typings.photoshop.photoshopStrings.Bounds = js.native
    
    /**
      * Calculated width.
      * @minVersion 22.5
      */
    def width: Double = js.native
  }
}
