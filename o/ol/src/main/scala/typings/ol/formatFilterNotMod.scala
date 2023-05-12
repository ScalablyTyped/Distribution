package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterNotMod {
  
  /**
    * @classdesc
    * Represents a logical `<Not>` operator for a filter condition.
    * @api
    */
  @JSImport("ol/format/filter/Not", JSImport.Default)
  @js.native
  open class default protected () extends Not {
    /**
      * @param {!import("./Filter.js").default} condition Filter condition.
      */
    def this(condition: typings.ol.formatFilterFilterMod.default) = this()
  }
  
  /**
    * @classdesc
    * Represents a logical `<Not>` operator for a filter condition.
    * @api
    */
  @js.native
  trait Not
    extends typings.ol.formatFilterFilterMod.default {
    
    /**
      * @type {!import("./Filter.js").default}
      */
    var condition: typings.ol.formatFilterFilterMod.default = js.native
  }
}
