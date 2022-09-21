package typings.photoshop

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object boundsMod {
  
  @JSImport("photoshop/dom/objects/Bounds", "Bounds")
  @js.native
  /** @ignore */
  open class Bounds () extends StObject {
    
    /**
      * Coordinates of the bottom edge
      */
    var bottom: Double = js.native
    
    /**
      * Calculated height
      */
    def height: Double = js.native
    
    /**
      * Coordinates of the left edge
      */
    var left: Double = js.native
    
    /**
      * Coordinates of the right edge
      */
    var right: Double = js.native
    
    /**
      * Coordinates of the top edge
      */
    var top: Double = js.native
    
    /**
      * The class name of the referenced object
      * @default "Bounds"
      */
    val typename: String = js.native
    
    /**
      * Calculated width
      */
    def width: Double = js.native
  }
}
