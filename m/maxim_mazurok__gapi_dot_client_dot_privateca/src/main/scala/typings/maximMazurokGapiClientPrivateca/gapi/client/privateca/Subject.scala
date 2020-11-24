package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Subject extends js.Object {
  
  /** The country code of the subject. */
  var countryCode: js.UndefOr[String] = js.native
  
  /** The locality or city of the subject. */
  var locality: js.UndefOr[String] = js.native
  
  /** The organization of the subject. */
  var organization: js.UndefOr[String] = js.native
  
  /** The organizational_unit of the subject. */
  var organizationalUnit: js.UndefOr[String] = js.native
  
  /** The postal code of the subject. */
  var postalCode: js.UndefOr[String] = js.native
  
  /** The province, territory, or regional state of the subject. */
  var province: js.UndefOr[String] = js.native
  
  /** The street address of the subject. */
  var streetAddress: js.UndefOr[String] = js.native
}
object Subject {
  
  @scala.inline
  def apply(): Subject = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Subject]
  }
  
  @scala.inline
  implicit class SubjectOps[Self <: Subject] (val x: Self) extends AnyVal {
    
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
    def setCountryCode(value: String): Self = this.set("countryCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCountryCode: Self = this.set("countryCode", js.undefined)
    
    @scala.inline
    def setLocality(value: String): Self = this.set("locality", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLocality: Self = this.set("locality", js.undefined)
    
    @scala.inline
    def setOrganization(value: String): Self = this.set("organization", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganization: Self = this.set("organization", js.undefined)
    
    @scala.inline
    def setOrganizationalUnit(value: String): Self = this.set("organizationalUnit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOrganizationalUnit: Self = this.set("organizationalUnit", js.undefined)
    
    @scala.inline
    def setPostalCode(value: String): Self = this.set("postalCode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePostalCode: Self = this.set("postalCode", js.undefined)
    
    @scala.inline
    def setProvince(value: String): Self = this.set("province", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProvince: Self = this.set("province", js.undefined)
    
    @scala.inline
    def setStreetAddress(value: String): Self = this.set("streetAddress", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteStreetAddress: Self = this.set("streetAddress", js.undefined)
  }
}
