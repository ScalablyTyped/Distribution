package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * The interface for context.userSettings
	 */
@js.native
trait UserSettings extends js.Object {
  /**
  		 * Date formatting information as retrieved from the server.
  		 */
  var dateFormattingInfo: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.DateFormattingInfo = js.native
  /**
  		 * Returns true if the language is right to left
  		 */
  var isRTL: scala.Boolean = js.native
  /**
  		 * Current user's language id
  		 *
  		 */
  var languageId: scala.Double = js.native
  /**
  		 * Number formatting information as retrieved from the server.
  		 */
  var numberFormattingInfo: powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs.NumberFormattingInfo = js.native
  /**
  		 * Current user roles
  		 */
  var securityRoles: js.Array[java.lang.String] = js.native
  /**
  		 * The id of the current user
  		 */
  var userId: java.lang.String = js.native
  /**
  		 * The username of the current user
  		 */
  var userName: java.lang.String = js.native
  /**
  		 * Gets the offset in minutes from UTC for the given date
  		 * @param date date to get the offset from utc for
  		 */
  def getTimeZoneOffsetMinutes(): scala.Double = js.native
  def getTimeZoneOffsetMinutes(date: stdLib.Date): scala.Double = js.native
}

