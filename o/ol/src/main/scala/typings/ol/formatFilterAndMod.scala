package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterAndMod {
  
  /**
    * @classdesc
    * Represents a logical `<And>` operator between two or more filter conditions.
    *
    * @abstract
    */
  @JSImport("ol/format/filter/And", JSImport.Default)
  @js.native
  open class default protected ()
    extends typings.ol.formatFilterLogicalNaryMod.default {
    /**
      * @param {...import("./Filter.js").default} conditions Conditions.
      */
    def this(args: typings.ol.formatFilterFilterMod.default*) = this()
  }
  
  /**
    * @classdesc
    * Represents a logical `<And>` operator between two or more filter conditions.
    *
    * @abstract
    */
  type And = typings.ol.formatFilterLogicalNaryMod.default
}
