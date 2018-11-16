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
  var addresses: microsoftDashLiveDashConnectLib.Anon_PersonalBusiness
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
  var emails: microsoftDashLiveDashConnectLib.Anon_Business
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
  var phones: microsoftDashLiveDashConnectLib.Anon_Personal
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

