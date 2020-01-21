package typings.microsoftLiveConnect.Microsoft.Live

import typings.microsoftLiveConnect.AnonAccount
import typings.microsoftLiveConnect.AnonBusinessMobile
import typings.microsoftLiveConnect.AnonBusinessPersonal
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The User object contains info about a user. The Live Connect REST API
  * supports reading User objects.
  */
trait IUser extends js.Object {
  /**
    * The user's postal addresses.
    */
  var addresses: AnonBusinessPersonal
  /**
    * The day of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_day: Double
  /**
    * The month of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_month: Double
  /**
    * The year of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_year: Double
  /**
    * The user's email addresses.
    */
  var emails: AnonAccount
  /**
    * The user's first name.
    */
  var first_name: String
  /**
    * The user's gender, or null if no gender is specified.
    */
  var gender: String
  /**
    * The user's ID.
    */
  var id: String
  /**
    * The user's last name.
    */
  var last_name: String
  /**
    * The URL of the user's profile page.
    */
  var link: String
  /**
    * The user's locale code.
    */
  var locale: String
  /**
    * The user's full name.
    */
  var name: String
  /**
    * The user's phone numbers.
    */
  var phones: AnonBusinessMobile
  /**
    * The time, in ISO 8601 format, at which the user last updated the
    * object.
    */
  var updated_time: String
  /**
    * An array that contains the user's work info.
    */
  var work: js.Array[IWorkInfo]
}

object IUser {
  @scala.inline
  def apply(
    addresses: AnonBusinessPersonal,
    birth_day: Double,
    birth_month: Double,
    birth_year: Double,
    emails: AnonAccount,
    first_name: String,
    gender: String,
    id: String,
    last_name: String,
    link: String,
    locale: String,
    name: String,
    phones: AnonBusinessMobile,
    updated_time: String,
    work: js.Array[IWorkInfo]
  ): IUser = {
    val __obj = js.Dynamic.literal(addresses = addresses.asInstanceOf[js.Any], birth_day = birth_day.asInstanceOf[js.Any], birth_month = birth_month.asInstanceOf[js.Any], birth_year = birth_year.asInstanceOf[js.Any], emails = emails.asInstanceOf[js.Any], first_name = first_name.asInstanceOf[js.Any], gender = gender.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], last_name = last_name.asInstanceOf[js.Any], link = link.asInstanceOf[js.Any], locale = locale.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], phones = phones.asInstanceOf[js.Any], updated_time = updated_time.asInstanceOf[js.Any], work = work.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IUser]
  }
}

