package typings.modernizr

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait InputTypesBoolean extends js.Object {
  var color: Boolean
  var date: Boolean
  var datetime: Boolean
  var `datetime-local`: Boolean
  var email: Boolean
  var month: Boolean
  var number: Boolean
  var range: Boolean
  var search: Boolean
  var tel: Boolean
  var time: Boolean
  var url: Boolean
  var week: Boolean
}

object InputTypesBoolean {
  @scala.inline
  def apply(
    color: Boolean,
    date: Boolean,
    datetime: Boolean,
    `datetime-local`: Boolean,
    email: Boolean,
    month: Boolean,
    number: Boolean,
    range: Boolean,
    search: Boolean,
    tel: Boolean,
    time: Boolean,
    url: Boolean,
    week: Boolean
  ): InputTypesBoolean = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], date = date.asInstanceOf[js.Any], datetime = datetime.asInstanceOf[js.Any], email = email.asInstanceOf[js.Any], month = month.asInstanceOf[js.Any], number = number.asInstanceOf[js.Any], range = range.asInstanceOf[js.Any], search = search.asInstanceOf[js.Any], tel = tel.asInstanceOf[js.Any], time = time.asInstanceOf[js.Any], url = url.asInstanceOf[js.Any], week = week.asInstanceOf[js.Any])
    __obj.updateDynamic("datetime-local")(`datetime-local`.asInstanceOf[js.Any])
    __obj.asInstanceOf[InputTypesBoolean]
  }
}

