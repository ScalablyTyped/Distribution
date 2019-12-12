package typings.plotlyDotJs.plotlyDotJsMod

import typings.plotlyDotJs.plotlyDotJsStrings.`-`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.plotlyDotJs.plotlyDotJsStrings.`-`
  - typings.plotlyDotJs.plotlyDotJsStrings.linear
  - typings.plotlyDotJs.plotlyDotJsStrings.log
  - typings.plotlyDotJs.plotlyDotJsStrings.date
  - typings.plotlyDotJs.plotlyDotJsStrings.category
*/
trait AxisType extends js.Object

object AxisType {
  @JSName("-")
  @scala.inline
  def `-_`: `-` = this.cast("-")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
  @scala.inline
  def category: typings.plotlyDotJs.plotlyDotJsStrings.category = this.cast("category")
  @scala.inline
  def date: typings.plotlyDotJs.plotlyDotJsStrings.date = this.cast("date")
  @scala.inline
  def linear: typings.plotlyDotJs.plotlyDotJsStrings.linear = this.cast("linear")
  @scala.inline
  def log: typings.plotlyDotJs.plotlyDotJsStrings.log = this.cast("log")
}

