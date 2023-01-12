package typings.mfiles

import typings.mfiles.MFiles.MFAdditionalClassInfoType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IAdditionalClassInfo extends StObject {
  
  var AssignmentClassInfo: IAssignmentClassInfo
  
  def Clear(): Unit
  
  def Clone(): IAdditionalClassInfo
  
  val InfoType: MFAdditionalClassInfoType
}
object IAdditionalClassInfo {
  
  inline def apply(
    AssignmentClassInfo: IAssignmentClassInfo,
    Clear: () => Unit,
    Clone: () => IAdditionalClassInfo,
    InfoType: MFAdditionalClassInfoType
  ): IAdditionalClassInfo = {
    val __obj = js.Dynamic.literal(AssignmentClassInfo = AssignmentClassInfo.asInstanceOf[js.Any], Clear = js.Any.fromFunction0(Clear), Clone = js.Any.fromFunction0(Clone), InfoType = InfoType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IAdditionalClassInfo]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IAdditionalClassInfo] (val x: Self) extends AnyVal {
    
    inline def setAssignmentClassInfo(value: IAssignmentClassInfo): Self = StObject.set(x, "AssignmentClassInfo", value.asInstanceOf[js.Any])
    
    inline def setClear(value: () => Unit): Self = StObject.set(x, "Clear", js.Any.fromFunction0(value))
    
    inline def setClone(value: () => IAdditionalClassInfo): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setInfoType(value: MFAdditionalClassInfoType): Self = StObject.set(x, "InfoType", value.asInstanceOf[js.Any])
  }
}
