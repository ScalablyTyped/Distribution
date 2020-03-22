package typings.mongooseDelete

import typings.mongoose.mod.FilterQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCall extends js.Object {
  def apply(conditions: FilterQuery[_]): QuerynumberAll = js.native
  def apply(conditions: FilterQuery[_], callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): QuerynumberAll = js.native
}

