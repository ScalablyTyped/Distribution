package typings
package modernizrLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTypesBoolean extends js.Object {
  var color: scala.Boolean
  var date: scala.Boolean
  var datetime: scala.Boolean
  var `datetime-local`: scala.Boolean
  var email: scala.Boolean
  var month: scala.Boolean
  var number: scala.Boolean
  var range: scala.Boolean
  var search: scala.Boolean
  var tel: scala.Boolean
  var time: scala.Boolean
  var url: scala.Boolean
  var week: scala.Boolean
}

object InputTypesBoolean {
  @scala.inline
  def apply(
    color: scala.Boolean,
    date: scala.Boolean,
    datetime: scala.Boolean,
    `datetime-local`: scala.Boolean,
    email: scala.Boolean,
    month: scala.Boolean,
    number: scala.Boolean,
    range: scala.Boolean,
    search: scala.Boolean,
    tel: scala.Boolean,
    time: scala.Boolean,
    url: scala.Boolean,
    week: scala.Boolean
  ): InputTypesBoolean = {
    val __obj = js.Dynamic.literal(`datetime-local` = `datetime-local`)
    __obj.updateDynamic("color")(color)
    __obj.updateDynamic("date")(date)
    __obj.updateDynamic("datetime")(datetime)
    __obj.updateDynamic("email")(email)
    __obj.updateDynamic("month")(month)
    __obj.updateDynamic("number")(number)
    __obj.updateDynamic("range")(range)
    __obj.updateDynamic("search")(search)
    __obj.updateDynamic("tel")(tel)
    __obj.updateDynamic("time")(time)
    __obj.updateDynamic("url")(url)
    __obj.updateDynamic("week")(week)
    __obj.asInstanceOf[InputTypesBoolean]
  }
}

