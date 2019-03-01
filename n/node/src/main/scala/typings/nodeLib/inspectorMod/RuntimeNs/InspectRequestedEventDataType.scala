package typings
package nodeLib.inspectorMod.RuntimeNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InspectRequestedEventDataType extends js.Object {
  var `object`: RemoteObject
}

object InspectRequestedEventDataType {
  @scala.inline
  def apply(`object`: RemoteObject): InspectRequestedEventDataType = {
    val __obj = js.Dynamic.literal(`object` = `object`)
  
    __obj.asInstanceOf[InspectRequestedEventDataType]
  }
}

