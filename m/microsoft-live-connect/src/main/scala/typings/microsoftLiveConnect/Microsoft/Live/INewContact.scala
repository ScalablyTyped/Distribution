package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Business
import typings.microsoftLiveConnect.anon.Employer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new contact.
  */
trait INewContact extends js.Object {
  /**
    * The contact's email addresses.
    */
  var emails: js.UndefOr[Business] = js.undefined
  /**
    * The contact's first name.
    */
  var first_name: js.UndefOr[String] = js.undefined
  /**
    * The contact's last name.
    */
  var last_name: js.UndefOr[String] = js.undefined
  /**
    * An array that contains the contact's work info.
    */
  var work: js.UndefOr[js.Array[Employer]] = js.undefined
}

object INewContact {
  @scala.inline
  def apply(
    emails: Business = null,
    first_name: String = null,
    last_name: String = null,
    work: js.Array[Employer] = null
  ): INewContact = {
    val __obj = js.Dynamic.literal()
    if (emails != null) __obj.updateDynamic("emails")(emails.asInstanceOf[js.Any])
    if (first_name != null) __obj.updateDynamic("first_name")(first_name.asInstanceOf[js.Any])
    if (last_name != null) __obj.updateDynamic("last_name")(last_name.asInstanceOf[js.Any])
    if (work != null) __obj.updateDynamic("work")(work.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewContact]
  }
}

