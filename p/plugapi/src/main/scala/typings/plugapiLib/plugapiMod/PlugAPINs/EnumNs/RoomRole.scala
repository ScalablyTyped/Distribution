package typings
package plugapiLib.plugapiMod.PlugAPINs.EnumNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RoomRole extends js.Object {
  var BOUNCER: scala.Double
  var COHOST: scala.Double
  var HOST: scala.Double
  var MANAGER: scala.Double
  var NONE: scala.Double
  var RESIDENTDJ: scala.Double
}

object RoomRole {
  @scala.inline
  def apply(
    BOUNCER: scala.Double,
    COHOST: scala.Double,
    HOST: scala.Double,
    MANAGER: scala.Double,
    NONE: scala.Double,
    RESIDENTDJ: scala.Double
  ): RoomRole = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("BOUNCER")(BOUNCER)
    __obj.updateDynamic("COHOST")(COHOST)
    __obj.updateDynamic("HOST")(HOST)
    __obj.updateDynamic("MANAGER")(MANAGER)
    __obj.updateDynamic("NONE")(NONE)
    __obj.updateDynamic("RESIDENTDJ")(RESIDENTDJ)
    __obj.asInstanceOf[RoomRole]
  }
}

