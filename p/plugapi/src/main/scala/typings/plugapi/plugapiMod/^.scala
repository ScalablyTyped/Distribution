package typings.plugapi.plugapiMod

import typings.plugapi.plugapiMod.EnumNs.Ban
import typings.plugapi.plugapiMod.EnumNs.BanReason
import typings.plugapi.plugapiMod.EnumNs.Events
import typings.plugapi.plugapiMod.EnumNs.GlobalRole
import typings.plugapi.plugapiMod.EnumNs.Mute
import typings.plugapi.plugapiMod.EnumNs.MuteReason
import typings.plugapi.plugapiMod.EnumNs.RoomRole
import typings.plugapi.plugapiMod.EnumNs.Status
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("plugapi", JSImport.Namespace)
@js.native
class ^ protected () extends PlugAPI {
  def this(login: PlugLogin) = this()
  def this(
    login: PlugLogin,
    callback: js.Function2[/* error */ Error, /* bot */ PlugAPI, Unit | (js.Function1[/* bot */ PlugAPI, Unit])]
  ) = this()
}

@JSImport("plugapi", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  val BAN: Ban = js.native
  val BAN_REASON: BanReason = js.native
  val GLOBAL_ROLES: GlobalRole = js.native
  val MUTE: Mute = js.native
  val MUTE_REASON: MuteReason = js.native
  val ROOM_ROLE: RoomRole = js.native
  val STATUS: Status = js.native
  val events: Events = js.native
}

