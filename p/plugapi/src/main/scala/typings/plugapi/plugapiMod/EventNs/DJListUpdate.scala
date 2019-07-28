package typings.plugapi.plugapiMod.EventNs

import typings.plugapi.plugapiMod.UserNs.DJ
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DJListUpdate extends js.Object {
  var djs: js.Array[DJ]
  var remove: String
}

object DJListUpdate {
  @scala.inline
  def apply(djs: js.Array[DJ], remove: String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs, remove = remove)
  
    __obj.asInstanceOf[DJListUpdate]
  }
}

