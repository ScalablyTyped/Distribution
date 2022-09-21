package typings.mojangMinecraft.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
sealed trait DisplaySlotId extends StObject
@JSImport("mojang-minecraft", "DisplaySlotId")
@js.native
object DisplaySlotId extends StObject {
  
  @JSBracketAccess
  def apply(value: String): js.UndefOr[DisplaySlotId & String] = js.native
  
  /**
    * Score for an objective is displayed below a player's
    * nametag.
    */
  @js.native
  sealed trait belowname
    extends StObject
       with DisplaySlotId
  /* "belowname" */ val belowname: typings.mojangMinecraft.mod.DisplaySlotId.belowname & String = js.native
  
  /**
    * This objective and respective list of players is shown on
    * the Pause menu.
    */
  @js.native
  sealed trait list
    extends StObject
       with DisplaySlotId
  /* "list" */ val list: typings.mojangMinecraft.mod.DisplaySlotId.list & String = js.native
  
  /**
    * The objective is shown on the right-hand side of the screen.
    */
  @js.native
  sealed trait sidebar
    extends StObject
       with DisplaySlotId
  /* "sidebar" */ val sidebar: typings.mojangMinecraft.mod.DisplaySlotId.sidebar & String = js.native
}
