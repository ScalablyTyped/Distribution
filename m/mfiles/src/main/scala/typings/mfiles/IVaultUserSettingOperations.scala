package typings.mfiles

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IVaultUserSettingOperations extends StObject {
  
  def ChangeVaultLanguage(Language: Double): Unit
  
  def GetSubstituteUsers(): IUserOrUserGroupIDs
  
  def GetVaultLanguage(): Double
  
  def GetVaultLanguageCode(): String
  
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): Unit
}
object IVaultUserSettingOperations {
  
  @scala.inline
  def apply(
    ChangeVaultLanguage: Double => Unit,
    GetSubstituteUsers: () => IUserOrUserGroupIDs,
    GetVaultLanguage: () => Double,
    GetVaultLanguageCode: () => String,
    SetSubstituteUsers: IUserOrUserGroupIDs => Unit
  ): IVaultUserSettingOperations = {
    val __obj = js.Dynamic.literal(ChangeVaultLanguage = js.Any.fromFunction1(ChangeVaultLanguage), GetSubstituteUsers = js.Any.fromFunction0(GetSubstituteUsers), GetVaultLanguage = js.Any.fromFunction0(GetVaultLanguage), GetVaultLanguageCode = js.Any.fromFunction0(GetVaultLanguageCode), SetSubstituteUsers = js.Any.fromFunction1(SetSubstituteUsers))
    __obj.asInstanceOf[IVaultUserSettingOperations]
  }
  
  @scala.inline
  implicit class IVaultUserSettingOperationsMutableBuilder[Self <: IVaultUserSettingOperations] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setChangeVaultLanguage(value: Double => Unit): Self = StObject.set(x, "ChangeVaultLanguage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSubstituteUsers(value: () => IUserOrUserGroupIDs): Self = StObject.set(x, "GetSubstituteUsers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVaultLanguage(value: () => Double): Self = StObject.set(x, "GetVaultLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVaultLanguageCode(value: () => String): Self = StObject.set(x, "GetVaultLanguageCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSubstituteUsers(value: IUserOrUserGroupIDs => Unit): Self = StObject.set(x, "SetSubstituteUsers", js.Any.fromFunction1(value))
  }
}
