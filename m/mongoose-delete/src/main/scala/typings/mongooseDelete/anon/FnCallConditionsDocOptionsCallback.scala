package typings.mongooseDelete.anon

import typings.mongoose.mod.FilterQuery
import typings.mongoose.mod.ModelUpdateOptions
import typings.mongoose.mod.UpdateQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallConditionsDocOptionsCallback extends js.Object {
  def apply(conditions: FilterQuery[_], doc: UpdateQuery[_]): Queryany = js.native
  def apply(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
  def apply(conditions: FilterQuery[_], doc: UpdateQuery[_], options: ModelUpdateOptions): Queryany = js.native
  def apply(
    conditions: FilterQuery[_],
    doc: UpdateQuery[_],
    options: ModelUpdateOptions,
    callback: js.Function2[/* err */ js.Any, /* raw */ js.Any, Unit]
  ): Queryany = js.native
}

