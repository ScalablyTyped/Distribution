package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Business
import typings.microsoftLiveConnect.anon.Employer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new contact.
  */
@js.native
trait INewContact extends js.Object {
  /**
    * The contact's email addresses.
    */
  var emails: js.UndefOr[Business] = js.native
  /**
    * The contact's first name.
    */
  var first_name: js.UndefOr[String] = js.native
  /**
    * The contact's last name.
    */
  var last_name: js.UndefOr[String] = js.native
  /**
    * An array that contains the contact's work info.
    */
  var work: js.UndefOr[js.Array[Employer]] = js.native
}

object INewContact {
  @scala.inline
  def apply(): INewContact = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[INewContact]
  }
  @scala.inline
  implicit class INewContactOps[Self <: INewContact] (val x: Self) extends AnyVal {
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
    def setEmails(value: Business): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteEmails: Self = this.set("emails", js.undefined)
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFirst_name: Self = this.set("first_name", js.undefined)
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLast_name: Self = this.set("last_name", js.undefined)
    @scala.inline
    def setWorkVarargs(value: Employer*): Self = this.set("work", js.Array(value :_*))
    @scala.inline
    def setWork(value: js.Array[Employer]): Self = this.set("work", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWork: Self = this.set("work", js.undefined)
  }
  
}

