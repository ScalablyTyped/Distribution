package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterNotEqualToMod {
  
  /**
    * @classdesc
    * Represents a `<PropertyIsNotEqualTo>` comparison operator.
    * @api
    */
  @JSImport("ol/format/filter/NotEqualTo", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterComparisonBinaryMod.default {
    /**
      * @param {!string} propertyName Name of the context property to compare.
      * @param {!(string|number)} expression The value to compare.
      * @param {boolean} [matchCase] Case-sensitive?
      */
    def this(propertyName: String, expression: String) = this()
    def this(propertyName: String, expression: Double) = this()
    def this(propertyName: String, expression: String, matchCase: Boolean) = this()
    def this(propertyName: String, expression: Double, matchCase: Boolean) = this()
  }
  
  /**
    * @classdesc
    * Represents a `<PropertyIsNotEqualTo>` comparison operator.
    * @api
    */
  type NotEqualTo = typings.ol.formatFilterComparisonBinaryMod.default
}
