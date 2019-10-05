package typings.polymer.polymerMod.Global.polymer

import typings.std.EventTarget
import typings.std.Node
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EventApi extends js.Object {
  var localTarget: EventTarget
  var path: js.Array[Node]
  var rootTarget: EventTarget
}

object EventApi {
  @scala.inline
  def apply(localTarget: EventTarget, path: js.Array[Node], rootTarget: EventTarget): EventApi = {
    val __obj = js.Dynamic.literal(localTarget = localTarget, path = path, rootTarget = rootTarget)
  
    __obj.asInstanceOf[EventApi]
  }
}

