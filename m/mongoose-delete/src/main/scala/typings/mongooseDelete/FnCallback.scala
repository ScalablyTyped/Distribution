package typings.mongooseDelete

import typings.mongoose.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallback extends js.Object {
  def apply(conditions: js.Any): Query[Double] with js.Object = js.native
  def apply(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* count */ Double, Unit]): Query[Double] with js.Object = js.native
}

