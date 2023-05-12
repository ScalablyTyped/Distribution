package typings.ol

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object formatFilterOrMod {
  
  /**
    * @classdesc
    * Represents a logical `<Or>` operator between two ore more filter conditions.
    * @api
    */
  @JSImport("ol/format/filter/Or", JSImport.Default)
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
    * Represents a logical `<Or>` operator between two ore more filter conditions.
    * @api
    */
  type Or = typings.ol.formatFilterLogicalNaryMod.default
}
