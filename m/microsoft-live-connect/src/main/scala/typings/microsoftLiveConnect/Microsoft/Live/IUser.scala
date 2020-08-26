package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.anon.Account
import typings.microsoftLiveConnect.anon.Mobile
import typings.microsoftLiveConnect.anon.Personal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The User object contains info about a user. The Live Connect REST API
  * supports reading User objects.
  */
@js.native
trait IUser extends js.Object {
  /**
    * The user's postal addresses.
    */
  var addresses: Personal = js.native
  /**
    * The day of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_day: Double = js.native
  /**
    * The month of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_month: Double = js.native
  /**
    * The year of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_year: Double = js.native
  /**
    * The user's email addresses.
    */
  var emails: Account = js.native
  /**
    * The user's first name.
    */
  var first_name: String = js.native
  /**
    * The user's gender, or null if no gender is specified.
    */
  var gender: String = js.native
  /**
    * The user's ID.
    */
  var id: String = js.native
  /**
    * The user's last name.
    */
  var last_name: String = js.native
  /**
    * The URL of the user's profile page.
    */
  var link: String = js.native
  /**
    * The user's locale code.
    */
  var locale: String = js.native
  /**
    * The user's full name.
    */
  var name: String = js.native
  /**
    * The user's phone numbers.
    */
  var phones: Mobile = js.native
  /**
    * The time, in ISO 8601 format, at which the user last updated the
    * object.
    */
  var updated_time: String = js.native
  /**
    * An array that contains the user's work info.
    */
  var work: js.Array[IWorkInfo] = js.native
}

object IUser {
  @scala.inline
  def apply(
    addresses: Personal,
    birth_day: Double,
    birth_month: Double,
    birth_year: Double,
    emails: Account,
    first_name: String,
    gender: String,
    id: String,
    last_name: String,
    link: String,
    locale: String,
    name: String,
    phones: Mobile,
    updated_time: String,
    work: js.Array[IWorkInfo]
  ): IUser = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], birth_day = birth_day.asInstanceOf[js.Any], birth_month = birth_month.asInstanceOf[js.Any], birth_year = birth_year.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
    __obj.asInstanceOf[IUser]
  }
  @scala.inline
  implicit class IUserOps[Self <: IUser] (val x: Self) extends AnyVal {
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
    def setAddresses(value: Personal): Self = this.set("addresses", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirth_day(value: Double): Self = this.set("birth_day", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirth_month(value: Double): Self = this.set("birth_month", value.asInstanceOf[js.Any])
    @scala.inline
    def setBirth_year(value: Double): Self = this.set("birth_year", value.asInstanceOf[js.Any])
    @scala.inline
    def setEmails(value: Account): Self = this.set("emails", value.asInstanceOf[js.Any])
    @scala.inline
    def setFirst_name(value: String): Self = this.set("first_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setGender(value: String): Self = this.set("gender", value.asInstanceOf[js.Any])
    @scala.inline
    def setId(value: String): Self = this.set("id", value.asInstanceOf[js.Any])
    @scala.inline
    def setLast_name(value: String): Self = this.set("last_name", value.asInstanceOf[js.Any])
    @scala.inline
    def setLink(value: String): Self = this.set("link", value.asInstanceOf[js.Any])
    @scala.inline
    def setLocale(value: String): Self = this.set("locale", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def setPhones(value: Mobile): Self = this.set("phones", value.asInstanceOf[js.Any])
    @scala.inline
    def setUpdated_time(value: String): Self = this.set("updated_time", value.asInstanceOf[js.Any])
    @scala.inline
    def setWorkVarargs(value: IWorkInfo*): Self = this.set("work", js.Array(value :_*))
    @scala.inline
    def setWork(value: js.Array[IWorkInfo]): Self = this.set("work", value.asInstanceOf[js.Any])
  }
  
}

