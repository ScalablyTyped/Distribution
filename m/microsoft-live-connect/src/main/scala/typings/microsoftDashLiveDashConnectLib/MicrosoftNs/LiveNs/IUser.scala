package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var addresses: microsoftDashLiveDashConnectLib.Anon_BusinessPersonal
  /**
    * The day of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_day: scala.Double
  /**
    * The month of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_month: scala.Double
  /**
    * The year of the user's birth date, or null if no birth date is
    * specified.
    */
  var birth_year: scala.Double
  /**
    * The user's email addresses.
    */
  var emails: microsoftDashLiveDashConnectLib.Anon_Account
  /**
    * The user's first name.
    */
  var first_name: java.lang.String
  /**
    * The user's gender, or null if no gender is specified.
    */
  var gender: java.lang.String
  /**
    * The user's ID.
    */
  var id: java.lang.String
  /**
    * The user's last name.
    */
  var last_name: java.lang.String
  /**
    * The URL of the user's profile page.
    */
  var link: java.lang.String
  /**
    * The user's locale code.
    */
  var locale: java.lang.String
  /**
    * The user's full name.
    */
  var name: java.lang.String
  /**
    * The user's phone numbers.
    */
  var phones: microsoftDashLiveDashConnectLib.Anon_BusinessMobile
  /**
    * The time, in ISO 8601 format, at which the user last updated the
    * object.
    */
  var updated_time: java.lang.String
  /**
    * An array that contains the user's work info.
    */
  var work: js.Array[IWorkInfo]
}

object IUser {
  @scala.inline
  def apply(
    addresses: microsoftDashLiveDashConnectLib.Anon_BusinessPersonal,
    birth_day: scala.Double,
    birth_month: scala.Double,
    birth_year: scala.Double,
    emails: microsoftDashLiveDashConnectLib.Anon_Account,
    first_name: java.lang.String,
    gender: java.lang.String,
    id: java.lang.String,
    last_name: java.lang.String,
    link: java.lang.String,
    locale: java.lang.String,
    name: java.lang.String,
    phones: microsoftDashLiveDashConnectLib.Anon_BusinessMobile,
    updated_time: java.lang.String,
    work: js.Array[IWorkInfo]
  ): IUser = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("addresses")(addresses)
    __obj.updateDynamic("birth_day")(birth_day)
    __obj.updateDynamic("birth_month")(birth_month)
    __obj.updateDynamic("birth_year")(birth_year)
    __obj.updateDynamic("emails")(emails)
    __obj.updateDynamic("first_name")(first_name)
    __obj.updateDynamic("gender")(gender)
    __obj.updateDynamic("id")(id)
    __obj.updateDynamic("last_name")(last_name)
    __obj.updateDynamic("link")(link)
    __obj.updateDynamic("locale")(locale)
    __obj.updateDynamic("name")(name)
    __obj.updateDynamic("phones")(phones)
    __obj.updateDynamic("updated_time")(updated_time)
    __obj.updateDynamic("work")(work)
    __obj.asInstanceOf[IUser]
  }
}

