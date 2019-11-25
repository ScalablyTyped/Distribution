package typings.mockjs.mockjsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// Mockjs.Random - Date
// see https://github.com/nuysoft/Mock/wiki/Date
/* Rewritten from type alias, can be one of: 
  - typings.mockjs.mockjsStrings.year
  - typings.mockjs.mockjsStrings.month
  - typings.mockjs.mockjsStrings.week
  - typings.mockjs.mockjsStrings.day
  - typings.mockjs.mockjsStrings.hour
  - typings.mockjs.mockjsStrings.minute
  - typings.mockjs.mockjsStrings.second
*/
trait RandomDateUtilString extends js.Object

object RandomDateUtilString {
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def day: typings.mockjs.mockjsStrings.day = this.cast("day")
  @scala.inline
  def hour: typings.mockjs.mockjsStrings.hour = this.cast("hour")
  @scala.inline
  def minute: typings.mockjs.mockjsStrings.minute = this.cast("minute")
  @scala.inline
  def month: typings.mockjs.mockjsStrings.month = this.cast("month")
  @scala.inline
  def second: typings.mockjs.mockjsStrings.second = this.cast("second")
  @scala.inline
  def week: typings.mockjs.mockjsStrings.week = this.cast("week")
  @scala.inline
  def year: typings.mockjs.mockjsStrings.year = this.cast("year")
}

