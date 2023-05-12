package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterLogicalNaryMod {
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature n-ary logical filters.
    *
    * @abstract
    */
  @JSImport("ol/format/filter/LogicalNary", JSImport.Default)
  @js.native
  open class default protected () extends LogicalNary {
    /**
      * @param {!string} tagName The XML tag name for this filter.
      * @param {Array<import("./Filter.js").default>} conditions Conditions.
      */
    def this(tagName: String, conditions: js.Array[typings.ol.formatFilterFilterMod.default]) = this()
  }
  
  /**
    * @classdesc
    * Abstract class; normally only used for creating subclasses and not instantiated in apps.
    * Base class for WFS GetFeature n-ary logical filters.
    *
    * @abstract
    */
  @js.native
  trait LogicalNary
    extends typings.ol.formatFilterFilterMod.default {
    
    /**
      * @type {Array<import("./Filter.js").default>}
      */
    var conditions: js.Array[typings.ol.formatFilterFilterMod.default] = js.native
  }
}
