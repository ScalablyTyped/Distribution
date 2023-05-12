package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterComparisonBinaryMod {
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property binary comparison filters.
    *
    * @abstract
    */
  @JSImport("ol/format/filter/ComparisonBinary", JSImport.Default)
  @js.native
  open class default protected () extends ComparisonBinary {
    /**
      * @param {!string} tagName The XML tag name for this filter.
      * @param {!string} propertyName Name of the context property to compare.
      * @param {!(string|number)} expression The value to compare.
      * @param {boolean} [matchCase] Case-sensitive?
      */
    def this(tagName: String, propertyName: String, expression: String) = this()
    def this(tagName: String, propertyName: String, expression: Double) = this()
    def this(tagName: String, propertyName: String, expression: String, matchCase: Boolean) = this()
    def this(tagName: String, propertyName: String, expression: Double, matchCase: Boolean) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property binary comparison filters.
    *
    * @abstract
    */
  @js.native
  trait ComparisonBinary
    extends typings.ol.formatFilterComparisonMod.default {
    
    /**
      * @type {!(string|number)}
      */
    var expression: String | Double = js.native
    
    /**
      * @type {boolean|undefined}
      */
    var matchCase: js.UndefOr[Boolean] = js.native
  }
}
