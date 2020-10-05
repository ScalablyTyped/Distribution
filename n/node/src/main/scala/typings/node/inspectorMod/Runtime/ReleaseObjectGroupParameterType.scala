package typings.node.inspectorMod.Runtime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ReleaseObjectGroupParameterType extends js.Object {
  /**
    * Symbolic object group name.
    */
  var objectGroup: String = js.native
}

object ReleaseObjectGroupParameterType {
  @scala.inline
  def apply(objectGroup: String): ReleaseObjectGroupParameterType = {
    val __obj = js.Dynamic.literal(objectGroup = objectGroup.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseObjectGroupParameterType]
  }
  @scala.inline
  implicit class ReleaseObjectGroupParameterTypeOps[Self <: ReleaseObjectGroupParameterType] (val x: Self) extends AnyVal {
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
    def setObjectGroup(value: String): Self = this.set("objectGroup", value.asInstanceOf[js.Any])
  }
  
}

