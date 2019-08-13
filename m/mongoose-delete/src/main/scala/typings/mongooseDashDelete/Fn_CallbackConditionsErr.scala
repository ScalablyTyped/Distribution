package typings.mongooseDashDelete

import typings.mongoose.mongooseMod.DocumentQuery
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Fn_CallbackConditionsErr extends js.Object {
  def apply(): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, projection: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    projection: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, projection: js.Any, options: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    projection: js.Any,
    options: js.Any,
    callback: js.Function2[/* err */ js.Any, /* res */ js.Any | Null, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
}

