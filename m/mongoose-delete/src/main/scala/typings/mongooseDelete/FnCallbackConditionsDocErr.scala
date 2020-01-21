package typings.mongooseDelete

import typings.mongoose.mod.ModelUpdateOptions
import typings.mongoose.mod.Query
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallbackConditionsDocErr extends js.Object {
  def apply(conditions: js.Any, doc: js.Any): Query[_] with js.Object = js.native
  def apply(conditions: js.Any, doc: js.Any, callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]): Query[_] with js.Object = js.native
  def apply(conditions: js.Any, doc: js.Any, options: ModelUpdateOptions): Query[_] with js.Object = js.native
  def apply(
    conditions: js.Any,
    doc: js.Any,
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Query[_] with js.Object = js.native
}

