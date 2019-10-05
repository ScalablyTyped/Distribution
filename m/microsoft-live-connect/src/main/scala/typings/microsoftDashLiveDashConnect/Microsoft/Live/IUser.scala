package typings.microsoftDashLiveDashConnect.Microsoft.Live

import typings.microsoftDashLiveDashConnect.Anon_Account
import typings.microsoftDashLiveDashConnect.Anon_BusinessMobile
import typings.microsoftDashLiveDashConnect.Anon_BusinessPersonal
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
  var addresses: Anon_BusinessPersonal
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
  var emails: Anon_Account
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
  var phones: Anon_BusinessMobile
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
    addresses: Anon_BusinessPersonal,
    birth_day: Double,
    birth_month: Double,
    birth_year: Double,
    emails: Anon_Account,
    first_name: String,
    gender: String,
    id: String,
    last_name: String,
    link: String,
    locale: String,
    name: String,
    phones: Anon_BusinessMobile,
    updated_time: String,
    work: js.Array[IWorkInfo]
  ): IUser = {
    val __obj = js.Dynamic.literal(addresses = addresses, birth_day = birth_day, birth_month = birth_month, birth_year = birth_year, emails = emails, first_name = first_name, gender = gender, id = id, last_name = last_name, link = link, locale = locale, name = name, phones = phones, updated_time = updated_time, work = work)
  
    __obj.asInstanceOf[IUser]
  }
}

