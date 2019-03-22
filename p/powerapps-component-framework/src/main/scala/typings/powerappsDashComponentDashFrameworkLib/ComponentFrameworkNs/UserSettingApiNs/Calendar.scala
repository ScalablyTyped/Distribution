package typings
package powerappsDashComponentDashFrameworkLib.ComponentFrameworkNs.UserSettingApiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
		 * The interface for the Calendar exposed in DateFormattingInfo
		 */
trait Calendar extends js.Object {
  /**
  			 * @example 1
  			 */
  var algorithmType: scala.Double
  /**
  			 * @example 1
  			 */
  var calendarType: scala.Double
  /**
  			 * @example "/Date(253402300799999)/"
  			 */
  var maxSupportedDateTime: stdLib.Date
  /**
  			 * @example "/Date(-62135568000000)/"
  			 */
  var minSupportedDateTime: stdLib.Date
  /**
  			 * @example  2029
  			 */
  var twoDigitYearMax: scala.Double
}

object Calendar {
  @scala.inline
  def apply(
    algorithmType: scala.Double,
    calendarType: scala.Double,
    maxSupportedDateTime: stdLib.Date,
    minSupportedDateTime: stdLib.Date,
    twoDigitYearMax: scala.Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(algorithmType = algorithmType, calendarType = calendarType, maxSupportedDateTime = maxSupportedDateTime, minSupportedDateTime = minSupportedDateTime, twoDigitYearMax = twoDigitYearMax)
  
    __obj.asInstanceOf[Calendar]
  }
}

