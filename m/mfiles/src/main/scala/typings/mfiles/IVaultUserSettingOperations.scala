package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IVaultUserSettingOperations extends js.Object {
  
  def ChangeVaultLanguage(Language: Double): Unit = js.native
  
  def GetSubstituteUsers(): IUserOrUserGroupIDs = js.native
  
  def GetVaultLanguage(): Double = js.native
  
  def GetVaultLanguageCode(): String = js.native
  
  def SetSubstituteUsers(UserOrUserGroupIDs: IUserOrUserGroupIDs): Unit = js.native
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
  implicit class IVaultUserSettingOperationsOps[Self <: IVaultUserSettingOperations] (val x: Self) extends AnyVal {
    
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
    def setChangeVaultLanguage(value: Double => Unit): Self = this.set("ChangeVaultLanguage", js.Any.fromFunction1(value))
    
    @scala.inline
    def setGetSubstituteUsers(value: () => IUserOrUserGroupIDs): Self = this.set("GetSubstituteUsers", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVaultLanguage(value: () => Double): Self = this.set("GetVaultLanguage", js.Any.fromFunction0(value))
    
    @scala.inline
    def setGetVaultLanguageCode(value: () => String): Self = this.set("GetVaultLanguageCode", js.Any.fromFunction0(value))
    
    @scala.inline
    def setSetSubstituteUsers(value: IUserOrUserGroupIDs => Unit): Self = this.set("SetSubstituteUsers", js.Any.fromFunction1(value))
  }
}
