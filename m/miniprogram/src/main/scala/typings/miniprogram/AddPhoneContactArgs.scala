package typings.miniprogram

import typings.miniprogram.anon.Success
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddPhoneContactArgs extends AsyncCallback[Success] {
  
  var addressCity: String = js.native
  
  var addressCountry: String = js.native
  
  var addressPostalCode: String = js.native
  
  var addressState: String = js.native
  
  var addressStreet: String = js.native
  
  var email: String = js.native
  
  var firstName: String = js.native
  
  var homeAddressCity: String = js.native
  
  var homeAddressCountry: String = js.native
  
  var homeAddressPostalCode: String = js.native
  
  var homeAddressState: String = js.native
  
  var homeAddressStreet: String = js.native
  
  var homeFaxNumber: String = js.native
  
  var homePhoneNumber: String = js.native
  
  var hostNumber: String = js.native
  
  var lastName: String = js.native
  
  var middleName: String = js.native
  
  var mobilePhoneNumber: String = js.native
  
  var nickName: String = js.native
  
  var organization: String = js.native
  
  var photoFilePath: String = js.native
  
  var remark: String = js.native
  
  var title: String = js.native
  
  var url: String = js.native
  
  var workAddressCity: String = js.native
  
  var workAddressCountry: String = js.native
  
  var workAddressPostalCode: String = js.native
  
  var workAddressState: String = js.native
  
  var workAddressStreet: String = js.native
  
  var workFaxNumber: String = js.native
  
  var workPhoneNumber: String = js.native
}
object AddPhoneContactArgs {
  
  @scala.inline
  def apply(
    addressCity: String,
    addressCountry: String,
    addressPostalCode: String,
    addressState: String,
    addressStreet: String,
    email: String,
    firstName: String,
    homeAddressCity: String,
    homeAddressCountry: String,
    homeAddressPostalCode: String,
    homeAddressState: String,
    homeAddressStreet: String,
    homeFaxNumber: String,
    homePhoneNumber: String,
    hostNumber: String,
    lastName: String,
    middleName: String,
    mobilePhoneNumber: String,
    nickName: String,
    organization: String,
    photoFilePath: String,
    remark: String,
    title: String,
    url: String,
    workAddressCity: String,
    workAddressCountry: String,
    workAddressPostalCode: String,
    workAddressState: String,
    workAddressStreet: String,
    workFaxNumber: String,
    workPhoneNumber: String
  ): AddPhoneContactArgs = {
    val __obj = js.Dynamic.literal(addressCity = addressCity.asInstanceOf[js.Any], addressCountry = addressCountry.asInstanceOf[js.Any], addressPostalCode = addressPostalCode.asInstanceOf[js.Any], addressState = addressState.asInstanceOf[js.Any], addressStreet = addressStreet.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], firstName = firstName.asInstanceOf[js.Any], homeAddressCity = homeAddressCity.asInstanceOf[js.Any], homeAddressCountry = homeAddressCountry.asInstanceOf[js.Any], homeAddressPostalCode = homeAddressPostalCode.asInstanceOf[js.Any], homeAddressState = homeAddressState.asInstanceOf[js.Any], homeAddressStreet = homeAddressStreet.asInstanceOf[js.Any], homeFaxNumber = homeFaxNumber.asInstanceOf[js.Any], homePhoneNumber = homePhoneNumber.asInstanceOf[js.Any], hostNumber = hostNumber.asInstanceOf[js.Any], lastName = lastName.asInstanceOf[js.Any], middleName = middleName.asInstanceOf[js.Any], mobilePhoneNumber = mobilePhoneNumber.asInstanceOf[js.Any], nickName = nickName.asInstanceOf[js.Any], organization = organization.asInstanceOf[js.Any], photoFilePath = photoFilePath.asInstanceOf[js.Any], remark = remark.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], workAddressCity = workAddressCity.asInstanceOf[js.Any], workAddressCountry = workAddressCountry.asInstanceOf[js.Any], workAddressPostalCode = workAddressPostalCode.asInstanceOf[js.Any], workAddressState = workAddressState.asInstanceOf[js.Any], workAddressStreet = workAddressStreet.asInstanceOf[js.Any], workFaxNumber = workFaxNumber.asInstanceOf[js.Any], workPhoneNumber = workPhoneNumber.asInstanceOf[js.Any])
    __obj.asInstanceOf[AddPhoneContactArgs]
  }
  
  @scala.inline
  implicit class AddPhoneContactArgsOps[Self <: AddPhoneContactArgs] (val x: Self) extends AnyVal {
    
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
    def setAddressCity(value: String): Self = this.set("addressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressCountry(value: String): Self = this.set("addressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressPostalCode(value: String): Self = this.set("addressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressState(value: String): Self = this.set("addressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAddressStreet(value: String): Self = this.set("addressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEmail(value: String): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setFirstName(value: String): Self = this.set("firstName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressCity(value: String): Self = this.set("homeAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressCountry(value: String): Self = this.set("homeAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressPostalCode(value: String): Self = this.set("homeAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressState(value: String): Self = this.set("homeAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeAddressStreet(value: String): Self = this.set("homeAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomeFaxNumber(value: String): Self = this.set("homeFaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHomePhoneNumber(value: String): Self = this.set("homePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHostNumber(value: String): Self = this.set("hostNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setLastName(value: String): Self = this.set("lastName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMiddleName(value: String): Self = this.set("middleName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMobilePhoneNumber(value: String): Self = this.set("mobilePhoneNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNickName(value: String): Self = this.set("nickName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPhotoFilePath(value: String): Self = this.set("photoFilePath", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRemark(value: String): Self = this.set("remark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = this.set("title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressCity(value: String): Self = this.set("workAddressCity", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressCountry(value: String): Self = this.set("workAddressCountry", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressPostalCode(value: String): Self = this.set("workAddressPostalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressState(value: String): Self = this.set("workAddressState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkAddressStreet(value: String): Self = this.set("workAddressStreet", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkFaxNumber(value: String): Self = this.set("workFaxNumber", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWorkPhoneNumber(value: String): Self = this.set("workPhoneNumber", value.asInstanceOf[js.Any])
  }
}
