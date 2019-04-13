package typings
package plugapiLib.plugapiMod.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DJListUpdate extends js.Object {
  var djs: js.Array[plugapiLib.plugapiMod.UserNs.DJ]
  var remove: java.lang.String
}

object DJListUpdate {
  @scala.inline
  def apply(djs: js.Array[plugapiLib.plugapiMod.UserNs.DJ], remove: java.lang.String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs, remove = remove)
  
    __obj.asInstanceOf[DJListUpdate]
  }
}

