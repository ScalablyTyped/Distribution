package typings.osrsJsonApi.mod.hiscores

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("osrs-json-api", "hiscores.getPlayer")
@js.native
object getPlayer extends js.Object {
  
  def apply(rsn: String): js.Promise[Player] = js.native
  def apply(rsn: String, gamemode: Gamemodes): js.Promise[Player] = js.native
}
