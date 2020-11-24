package typings.nodeRedRegistry.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NodeSetting[T] extends js.Object {
  
  var exportable: js.UndefOr[Boolean] = js.native
  
  var value: T = js.native
}
object NodeSetting {
  
  @scala.inline
  def apply[T](value: T): NodeSetting[T] = {
    val __obj = js.Dynamic.literal(value = value.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeSetting[T]]
  }
  
  @scala.inline
  implicit class NodeSettingOps[Self <: NodeSetting[_], T] (val x: Self with NodeSetting[T]) extends AnyVal {
    
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
    def setValue(value: T): Self = this.set("value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setExportable(value: Boolean): Self = this.set("exportable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExportable: Self = this.set("exportable", js.undefined)
  }
}
