package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ObjectIdentity extends js.Object {
  /**
    * Specifies the issuer of the identity, for example facebook.com.For local accounts (where signInType is not federated),
    * this property is the local B2C tenant default domain name, for example contoso.onmicrosoft.com.For external users from
    * other Azure AD organization, this will be the domain of the federated organization, for example contoso.com.Supports
    * $filter. 512 character limit.
    */
  var issuer: js.UndefOr[String] = js.native
  /**
    * Specifies the unique identifier assigned to the user by the issuer. The combination of issuer and issuerAssignedId must
    * be unique within the organization. Represents the sign-in name for the user, when signInType is set to emailAddress or
    * userName (also known as local accounts).When signInType is set to: emailAddress, (or starts with emailAddress like
    * emailAddress1) issuerAssignedId must be a valid email addressuserName, issuerAssignedId must be a valid local part of
    * an email addressSupports $filter. 512 character limit.
    */
  var issuerAssignedId: js.UndefOr[String] = js.native
  /**
    * Specifies the user sign-in types in your directory, such as emailAddress, userName or federated. Here, federated
    * represents a unique identifier for a user from an issuer, that can be in any format chosen by the issuer. Additional
    * validation is enforced on issuerAssignedId when the sign-in type is set to emailAddress or userName. This property can
    * also be set to any custom string.
    */
  var signInType: js.UndefOr[String] = js.native
}

object ObjectIdentity {
  @scala.inline
  def apply(): ObjectIdentity = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ObjectIdentity]
  }
  @scala.inline
  implicit class ObjectIdentityOps[Self <: ObjectIdentity] (val x: Self) extends AnyVal {
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
    def setIssuer(value: String): Self = this.set("issuer", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuer: Self = this.set("issuer", js.undefined)
    @scala.inline
    def setIssuerAssignedId(value: String): Self = this.set("issuerAssignedId", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIssuerAssignedId: Self = this.set("issuerAssignedId", js.undefined)
    @scala.inline
    def setSignInType(value: String): Self = this.set("signInType", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSignInType: Self = this.set("signInType", js.undefined)
  }
  
}

