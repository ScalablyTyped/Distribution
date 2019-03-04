package typings
package polymerLib.polymerMod.Global.polymerNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventApi extends js.Object {
  var localTarget: stdLib.EventTarget
  var path: js.Array[stdLib.Node]
  var rootTarget: stdLib.EventTarget
}

object EventApi {
  @scala.inline
  def apply(localTarget: stdLib.EventTarget, path: js.Array[stdLib.Node], rootTarget: stdLib.EventTarget): EventApi = {
    val __obj = js.Dynamic.literal(localTarget = localTarget, path = path, rootTarget = rootTarget)
  
    __obj.asInstanceOf[EventApi]
  }
}

