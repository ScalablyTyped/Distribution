package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ITaskAssignmentClassInfo extends StObject {
  
  var AnyAssigneeCompletes: Boolean
  
  def Clone(): ITaskAssignmentClassInfo
  
  var SignatureForCompletion: ISignatureSettings
}
object ITaskAssignmentClassInfo {
  
  inline def apply(
    AnyAssigneeCompletes: Boolean,
    Clone: () => ITaskAssignmentClassInfo,
    SignatureForCompletion: ISignatureSettings
  ): ITaskAssignmentClassInfo = {
    val __obj = js.Dynamic.literal(AnyAssigneeCompletes = AnyAssigneeCompletes.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), SignatureForCompletion = SignatureForCompletion.asInstanceOf[js.Any])
    __obj.asInstanceOf[ITaskAssignmentClassInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ITaskAssignmentClassInfo] (val x: Self) extends AnyVal {
    
    inline def setAnyAssigneeCompletes(value: Boolean): Self = StObject.set(x, "AnyAssigneeCompletes", value.asInstanceOf[js.Any])
    
    inline def setClone(value: () => ITaskAssignmentClassInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setSignatureForCompletion(value: ISignatureSettings): Self = StObject.set(x, "SignatureForCompletion", value.asInstanceOf[js.Any])
  }
}
