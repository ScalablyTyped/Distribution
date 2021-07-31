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
  
  @scala.inline
  def apply(Clone: () => IUserOrUserGroupID, UserOrGroupID: Double, UserOrGroupType: MFUserOrUserGroupType): IUserOrUserGroupID = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), UserOrGroupID = UserOrGroupID.asInstanceOf[js.Any], UserOrGroupType = UserOrGroupType.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUserOrUserGroupID]
  }
  
  @scala.inline
  implicit class IUserOrUserGroupIDMutableBuilder[Self <: IUserOrUserGroupID] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClone(value: () => IUserOrUserGroupID): Self = StObject.set(x, "Clone", js.Any.fromFunction0(value))
    
    @scala.inline
    def setUserOrGroupID(value: Double): Self = StObject.set(x, "UserOrGroupID", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUserOrGroupType(value: MFUserOrUserGroupType): Self = StObject.set(x, "UserOrGroupType", value.asInstanceOf[js.Any])
  }
}
