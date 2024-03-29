package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterLessThanMod {
  
  /**
    * @classdesc
    * Represents a `<PropertyIsLessThan>` comparison operator.
    * @api
    */
  @JSImport("ol/format/filter/LessThan", JSImport.Default)
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
    * Represents a `<PropertyIsLessThan>` comparison operator.
    * @api
    */
  type LessThan = typings.ol.formatFilterComparisonBinaryMod.default
}
