package typings.powerappsDashComponentDashFramework.ComponentFramework.UserSettingApi

import typings.std.Date
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
  var algorithmType: Double
  /**
  			 * @example 1
  			 */
  var calendarType: Double
  /**
  			 * @example "/Date(253402300799999)/"
  			 */
  var maxSupportedDateTime: Date
  /**
  			 * @example "/Date(-62135568000000)/"
  			 */
  var minSupportedDateTime: Date
  /**
  			 * @example  2029
  			 */
  var twoDigitYearMax: Double
}

object Calendar {
  @scala.inline
  def apply(
    algorithmType: Double,
    calendarType: Double,
    maxSupportedDateTime: Date,
    minSupportedDateTime: Date,
    twoDigitYearMax: Double
  ): Calendar = {
    val __obj = js.Dynamic.literal(algorithmType = algorithmType, calendarType = calendarType, maxSupportedDateTime = maxSupportedDateTime, minSupportedDateTime = minSupportedDateTime, twoDigitYearMax = twoDigitYearMax)
  
    __obj.asInstanceOf[Calendar]
  }
}

