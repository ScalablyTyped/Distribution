package typings.mfiles

import typings.mfiles.MFiles.MFUserOrUserGroupType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IUserOrUserGroupID extends StObject {
  
  def Clone(): IUserOrUserGroupID
  
  var UserOrGroupID: Double
  
  var UserOrGroupType: MFUserOrUserGroupType
}
object IUserOrUserGroupID {
  
  inline def apply(Clone: () => IUserOrUserGroupID, UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
  
  extension [Self <: IUserOrUserGroupID](x: Self) {
    
    inline def setClone(value: () => IUserOrUserGroupID): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    inline def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
    
    inline def setUserOrGroupType(value: MFUserOrUserGroupType): Self = StObject.set(x, "UserOrGroupType", value.asInstanceOf[js.Any])
  }
}
