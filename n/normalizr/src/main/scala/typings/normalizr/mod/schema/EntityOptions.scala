package typings.normalizr.mod.schema

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityOptions[T] extends js.Object {
  var idAttribute: js.UndefOr[String | SchemaFunction] = js.undefined
  var mergeStrategy: js.UndefOr[MergeFunction] = js.undefined
  var processStrategy: js.UndefOr[StrategyFunction[T]] = js.undefined
}

object EntityOptions {
  @scala.inline
  def apply[T](
    idAttribute: String | SchemaFunction = null,
    mergeStrategy: (/* entityA */ js.Any, /* entityB */ js.Any) => js.Any = null,
    processStrategy: (/* value */ js.Any, /* parent */ js.Any, /* key */ String) => T = null
  ): EntityOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(js.Any.fromFunction2(mergeStrategy))
    if (processStrategy != null) __obj.updateDynamic("processStrategy")(js.Any.fromFunction3(processStrategy))
    __obj.asInstanceOf[EntityOptions[T]]
  }
}

