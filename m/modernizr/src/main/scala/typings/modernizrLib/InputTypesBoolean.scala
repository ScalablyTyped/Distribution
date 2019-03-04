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
    val __obj = js.Dynamic.literal(color = color, date = date, datetime = datetime, email = email, month = month, number = number, range = range, search = search, tel = tel, time = time, url = url, week = week)
    __obj.updateDynamic("datetime-local")(`datetime-local`)
    __obj.asInstanceOf[InputTypesBoolean]
  }
}

