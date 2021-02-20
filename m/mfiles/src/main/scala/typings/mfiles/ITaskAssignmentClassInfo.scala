package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ITaskAssignmentClassInfo extends StObject {
  
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
  implicit class ITaskAssignmentClassInfoMutableBuilder[Self <: ITaskAssignmentClassInfo] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnyAssigneeCompletes(value: Boolean): Self = StObject.set(x, "AnyAssigneeCompletes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClone(value: () => ITaskAssignmentClassInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSignatureForCompletion(value: ISignatureSettings): Self = StObject.set(x, "SignatureForCompletion", value.asInstanceOf[js.Any])
  }
}
