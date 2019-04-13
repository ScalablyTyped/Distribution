package typings
package plugapiLib.plugapiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugapi", JSImport.Namespace)
@js.native
class ^ protected () extends PlugAPI {
  def this(login: PlugLogin) = this()
  def this(login: PlugLogin, callback: js.Function2[
      /* error */ stdLib.Error, 
      /* bot */ PlugAPI, 
      scala.Unit | (js.Function1[/* bot */ PlugAPI, scala.Unit])
    ]) = this()
}

@JSImport("plugapi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BAN: plugapiLib.plugapiMod.EnumNs.Ban = js.native
  val BAN_REASON: plugapiLib.plugapiMod.EnumNs.BanReason = js.native
  val GLOBAL_ROLES: plugapiLib.plugapiMod.EnumNs.GlobalRole = js.native
  val MUTE: plugapiLib.plugapiMod.EnumNs.Mute = js.native
  val MUTE_REASON: plugapiLib.plugapiMod.EnumNs.MuteReason = js.native
  val ROOM_ROLE: plugapiLib.plugapiMod.EnumNs.RoomRole = js.native
  val STATUS: plugapiLib.plugapiMod.EnumNs.Status = js.native
  val events: plugapiLib.plugapiMod.EnumNs.Events = js.native
}

