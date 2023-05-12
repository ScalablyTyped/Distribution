package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterGreaterThanMod {
  
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThan>` comparison operator.
    * @api
    */
  @JSImport("ol/format/filter/GreaterThan", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterComparisonBinaryMod.default {
    /**
      * @param {!string} propertyName Name of the context property to compare.
      * @param {!number} expression The value to compare.
      */
    def this(propertyName: String, expression: Double) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsGreaterThan>` comparison operator.
    * @api
    */
  type GreaterThan = typings.ol.formatFilterComparisonBinaryMod.default
}
