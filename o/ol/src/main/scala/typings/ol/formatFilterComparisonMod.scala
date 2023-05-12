package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterComparisonMod {
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property comparison filters.
    *
    * @abstract
    */
  @JSImport("ol/format/filter/Comparison", JSImport.Default)
  @js.native
  open class default protected () extends Comparison {
    /**
      * @param {!string} tagName The XML tag name for this filter.
      * @param {!string} propertyName Name of the context property to compare.
      */
    def this(tagName: String, propertyName: String) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature property comparison filters.
    *
    * @abstract
    */
  @js.native
  trait Comparison
    extends typings.ol.formatFilterFilterMod.default {
    
    /**
      * @type {!string}
      */
    var propertyName: String = js.native
  }
}
