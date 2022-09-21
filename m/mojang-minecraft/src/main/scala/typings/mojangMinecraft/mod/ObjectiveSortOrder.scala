package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait ObjectiveSortOrder extends StObject
@JSImport("mojang-minecraft", "ObjectiveSortOrder")
@js.native
object ObjectiveSortOrder extends StObject {
  
  @JSBracketAccess
  def apply(value: Double): js.UndefOr[ObjectiveSortOrder & Double] = js.native
  
  /**
    * Objective participant list is displayed in ascending (e.g.,
    * A-Z) order.
    */
  @js.native
  sealed trait ascending
    extends StObject
       with ObjectiveSortOrder
  /* 0 */ val ascending: typings.mojangMinecraft.mod.ObjectiveSortOrder.ascending & Double = js.native
  
  /**
    * Objective participant list is displayed in descending (e.g.,
    * Z-A) order.
    */
  @js.native
  sealed trait descending
    extends StObject
       with ObjectiveSortOrder
  /* 1 */ val descending: typings.mojangMinecraft.mod.ObjectiveSortOrder.descending & Double = js.native
}
