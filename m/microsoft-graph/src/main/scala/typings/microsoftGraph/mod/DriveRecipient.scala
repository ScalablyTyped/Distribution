package typings.microsoftGraph.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DriveRecipient extends js.Object {
  
  // The alias of the domain object, for cases where an email address is unavailable (e.g. security groups).
  var alias: js.UndefOr[NullableOption[String]] = js.native
  
  // The email address for the recipient, if the recipient has an associated email address.
  var email: js.UndefOr[NullableOption[String]] = js.native
  
  // The unique identifier for the recipient in the directory.
  var objectId: js.UndefOr[NullableOption[String]] = js.native
}
object DriveRecipient {
  
  @scala.inline
  def apply(): DriveRecipient = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DriveRecipient]
  }
  
  @scala.inline
  implicit class DriveRecipientOps[Self <: DriveRecipient] (val x: Self) extends AnyVal {
    
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
    def setAlias(value: NullableOption[String]): Self = this.set("alias", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteAlias: Self = this.set("alias", js.undefined)
    
    @scala.inline
    def setAliasNull: Self = this.set("alias", null)
    
    @scala.inline
    def setEmail(value: NullableOption[String]): Self = this.set("email", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteEmail: Self = this.set("email", js.undefined)
    
    @scala.inline
    def setEmailNull: Self = this.set("email", null)
    
    @scala.inline
    def setObjectId(value: NullableOption[String]): Self = this.set("objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteObjectId: Self = this.set("objectId", js.undefined)
    
    @scala.inline
    def setObjectIdNull: Self = this.set("objectId", null)
  }
}
