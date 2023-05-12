package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterIsBetweenMod {
  
  /**
    * @classdesc
    * Represents a `<PropertyIsBetween>` comparison operator.
    * @api
    */
  @JSImport("ol/format/filter/IsBetween", JSImport.Default)
  @js.native
  open class default protected () extends IsBetween {
    /**
      * @param {!string} propertyName Name of the context property to compare.
      * @param {!number} lowerBoundary The lower bound of the range.
      * @param {!number} upperBoundary The upper bound of the range.
      */
    def this(propertyName: String, lowerBoundary: Double, upperBoundary: Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsBetween>` comparison operator.
    * @api
    */
  @js.native
  trait IsBetween
    extends typings.ol.formatFilterComparisonMod.default {
    
    /**
      * @type {!number}
      */
    var lowerBoundary: Double = js.native
    
    /**
      * @type {!number}
      */
    var upperBoundary: Double = js.native
  }
}
