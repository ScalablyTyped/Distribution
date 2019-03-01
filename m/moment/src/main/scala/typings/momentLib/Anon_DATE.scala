package typings
package momentLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_DATE extends js.Object {
  var DATE: java.lang.String
  var DATETIME_LOCAL: java.lang.String
  var DATETIME_LOCAL_MS: java.lang.String
  var DATETIME_LOCAL_SECONDS: java.lang.String
  var MONTH: java.lang.String
  var TIME: java.lang.String
  var TIME_MS: java.lang.String
  var TIME_SECONDS: java.lang.String
  var WEEK: java.lang.String
}

object Anon_DATE {
  @scala.inline
  def apply(
    DATE: java.lang.String,
    DATETIME_LOCAL: java.lang.String,
    DATETIME_LOCAL_MS: java.lang.String,
    DATETIME_LOCAL_SECONDS: java.lang.String,
    MONTH: java.lang.String,
    TIME: java.lang.String,
    TIME_MS: java.lang.String,
    TIME_SECONDS: java.lang.String,
    WEEK: java.lang.String
  ): Anon_DATE = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("DATE")(DATE)
    __obj.updateDynamic("DATETIME_LOCAL")(DATETIME_LOCAL)
    __obj.updateDynamic("DATETIME_LOCAL_MS")(DATETIME_LOCAL_MS)
    __obj.updateDynamic("DATETIME_LOCAL_SECONDS")(DATETIME_LOCAL_SECONDS)
    __obj.updateDynamic("MONTH")(MONTH)
    __obj.updateDynamic("TIME")(TIME)
    __obj.updateDynamic("TIME_MS")(TIME_MS)
    __obj.updateDynamic("TIME_SECONDS")(TIME_SECONDS)
    __obj.updateDynamic("WEEK")(WEEK)
    __obj.asInstanceOf[Anon_DATE]
  }
}

