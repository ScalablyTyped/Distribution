package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskAssignmentClassInfo extends js.Object {
  
  var AnyAssigneeCompletes: Boolean = js.native
  
  def Clone(): ITaskAssignmentClassInfo = js.native
  
  var SignatureForCompletion: ISignatureSettings = js.native
}
object ITaskAssignmentClassInfo {
  
  @scala.inline
  def apply(
    AnyAssigneeCompletes: Boolean,
    Clone: () => ITaskAssignmentClassInfo,
    SignatureForCompletion: ISignatureSettings
  ): ITaskAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeCompletes = AnyAssigneeCompletes.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), SignatureForCompletion = SignatureForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskAssignmentClassInfo]
  }
  
  @scala.inline
  implicit class ITaskAssignmentClassInfoOps[Self <: ITaskAssignmentClassInfo] (val x: Self) extends AnyVal {
    
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
    def setAnyAssigneeCompletes(value: Boolean): Self = this.set("AnyAssigneeCompletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ITaskAssignmentClassInfo): Self = this.set("Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignatureForCompletion(value: ISignatureSettings): Self = this.set("SignatureForCompletion", value.asInstanceOf[js.Any])
  }
}
