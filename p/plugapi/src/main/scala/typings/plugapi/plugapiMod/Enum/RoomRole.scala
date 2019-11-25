package typings.plugapi.plugapiMod.Enum

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomRole extends js.Object {
  var BOUNCER: Double
  var COHOST: Double
  var HOST: Double
  var MANAGER: Double
  var NONE: Double
  var RESIDENTDJ: Double
}

object RoomRole {
  @scala.inline
  def apply(BOUNCER: Double, COHOST: Double, HOST: Double, MANAGER: Double, NONE: Double, RESIDENTDJ: Double): RoomRole = {
    val __obj = js.Dynamic.literal(BOUNCER = BOUNCER.asInstanceOf[js.Any], COHOST = COHOST.asInstanceOf[js.Any], HOST = HOST.asInstanceOf[js.Any], MANAGER = MANAGER.asInstanceOf[js.Any], NONE = NONE.asInstanceOf[js.Any], RESIDENTDJ = RESIDENTDJ.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[RoomRole]
  }
}

