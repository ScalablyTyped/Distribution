package typings.mongooseDelete

import typings.mongodb.mod.FindAndModifyWriteOpResultObject
import typings.mongoose.AnonNew
import typings.mongoose.AnonNewTrue
import typings.mongoose.AnonRawResult
import typings.mongoose.mod.DocumentQuery
import typings.mongoose.mod.Query
import typings.mongoose.mod.QueryFindOneAndUpdateOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait FnCallbackConditionsDoc extends js.Object {
  def apply(): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: AnonNewTrue with QueryFindOneAndUpdateOptions): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: AnonNew with QueryFindOneAndUpdateOptions): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: AnonRawResult with QueryFindOneAndUpdateOptions): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: AnonNew with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_], 
      /* res */ js.Any, 
      Unit
    ]
  ): Query[FindAndModifyWriteOpResultObject[_]] with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: AnonNewTrue with QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any, /* res */ js.Any, Unit]
  ): (DocumentQuery[_, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: AnonRawResult with QueryFindOneAndUpdateOptions,
    callback: js.Function3[
      /* err */ js.Any, 
      /* doc */ FindAndModifyWriteOpResultObject[_ | Null], 
      /* res */ js.Any, 
      Unit
    ]
  ): (Query[FindAndModifyWriteOpResultObject[_ | Null]]) with js.Object = js.native
  def apply(conditions: js.Any, update: js.Any, options: QueryFindOneAndUpdateOptions): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
  def apply(
    conditions: js.Any,
    update: js.Any,
    options: QueryFindOneAndUpdateOptions,
    callback: js.Function3[/* err */ js.Any, /* doc */ js.Any | Null, /* res */ js.Any, Unit]
  ): (DocumentQuery[_ | Null, _, js.Object]) with js.Object = js.native
}

