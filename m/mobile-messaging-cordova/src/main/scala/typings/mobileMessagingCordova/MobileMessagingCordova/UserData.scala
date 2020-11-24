package typings.mobileMessagingCordova.MobileMessagingCordova

import typings.std.Date
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait UserData extends js.Object {
  
  var birthday: js.UndefOr[Date] = js.native
  
  var customAttributes: js.UndefOr[Record[String, String]] = js.native
  
  var emails: js.UndefOr[js.Array[String]] = js.native
  
  var externalUserId: String = js.native
  
  var firstName: js.UndefOr[String] = js.native
  
  var gender: js.UndefOr[Gender] = js.native
  
  var lastName: js.UndefOr[String] = js.native
  
  var middleName: js.UndefOr[String] = js.native
  
  var phones: js.UndefOr[js.Array[String]] = js.native
  
  var tags: js.UndefOr[js.Array[String]] = js.native
}
object UserData {
  
  @scala.inline
  def apply(externalUserId: String): UserData = {
    val __obj = js.Dynamic.literal(externalUserId = externalUserId.asInstanceOf[js.Any])
    __obj.asInstanceOf[UserData]
  }
  
  @scala.inline
  implicit class UserDataOps[Self <: UserData] (val x: Self) extends AnyVal {
    
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
    def setExternalUserId(value: String): Self = this.set("externalUserId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBirthday(value: Date): Self = this.set("birthday", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBirthday: Self = this.set("birthday", js.undefined)
    
    @scala.inline
    def setCustomAttributes(value: Record[String, String]): Self = this.set("customAttributes", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCustomAttributes: Self = this.set("customAttributes", js.undefined)
    
    @scala.inline
    def setEmailsVarargs(value: String*): Self = this.set("emails", js.Array(value :_*))
    
    @scala.inline
    def setEmails(value: js.Array[String]): Self = this.set("emails", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFirstName: Self = this.set("firstName", js.undefined)
    
    @scala.inline
    def setGender(value: Gender): Self = this.set("gender", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteGender: Self = this.set("gender", js.undefined)
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLastName: Self = this.set("lastName", js.undefined)
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMiddleName: Self = this.set("middleName", js.undefined)
    
    @scala.inline
    def setPhonesVarargs(value: String*): Self = this.set("phones", js.Array(value :_*))
    
    @scala.inline
    def setPhones(value: js.Array[String]): Self = this.set("phones", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePhones: Self = this.set("phones", js.undefined)
    
    @scala.inline
    def setTagsVarargs(value: String*): Self = this.set("tags", js.Array(value :_*))
    
    @scala.inline
    def setTags(value: js.Array[String]): Self = this.set("tags", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTags: Self = this.set("tags", js.undefined)
  }
}
