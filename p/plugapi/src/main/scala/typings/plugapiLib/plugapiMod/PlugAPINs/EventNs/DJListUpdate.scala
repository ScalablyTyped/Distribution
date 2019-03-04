package typings
package plugapiLib.plugapiMod.PlugAPINs.EventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DJListUpdate extends js.Object {
  var djs: js.Array[plugapiLib.plugapiMod.PlugAPINs.UserNs.DJ]
  var remove: java.lang.String
}

object DJListUpdate {
  @scala.inline
  def apply(djs: js.Array[plugapiLib.plugapiMod.PlugAPINs.UserNs.DJ], remove: java.lang.String): DJListUpdate = {
    val __obj = js.Dynamic.literal(djs = djs, remove = remove)
  
    __obj.asInstanceOf[DJListUpdate]
  }
}

