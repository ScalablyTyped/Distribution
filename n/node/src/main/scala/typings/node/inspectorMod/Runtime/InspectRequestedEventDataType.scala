package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait InspectRequestedEventDataType extends js.Object {
  var `object`: RemoteObject = js.native
}

object InspectRequestedEventDataType {
  @scala.inline
  def apply(`object`: RemoteObject): InspectRequestedEventDataType = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("object")(`object`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InspectRequestedEventDataType]
  }
  @scala.inline
  implicit class InspectRequestedEventDataTypeOps[Self <: InspectRequestedEventDataType] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setObject(value: RemoteObject): Self = this.set("object", value.asInstanceOf[js.Any])
  }
  
}

