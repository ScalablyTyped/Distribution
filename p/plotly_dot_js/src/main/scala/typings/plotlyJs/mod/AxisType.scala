package typings.plotlyJs.mod

import typings.plotlyJs.plotlyJsStrings.`-_`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plotlyJs.plotlyJsStrings.`-_`
  - typings.plotlyJs.plotlyJsStrings.linear
  - typings.plotlyJs.plotlyJsStrings.log
  - typings.plotlyJs.plotlyJsStrings.date
  - typings.plotlyJs.plotlyJsStrings.category
*/
trait AxisType extends js.Object

object AxisType {
  @scala.inline
  def _dash: `-_` = this.cast("-")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.plotlyJs.plotlyJsStrings.category = this.cast("category")
  @scala.inline
  def date: typings.plotlyJs.plotlyJsStrings.date = this.cast("date")
  @scala.inline
  def linear: typings.plotlyJs.plotlyJsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typings.plotlyJs.plotlyJsStrings.log = this.cast("log")
}

