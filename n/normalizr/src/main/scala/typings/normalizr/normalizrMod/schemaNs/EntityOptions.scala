package typings.normalizr.normalizrMod.schemaNs

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
    mergeStrategy: MergeFunction = null,
    processStrategy: StrategyFunction[T] = null
  ): EntityOptions[T] = {
    val __obj = js.Dynamic.literal()
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy)
    if (processStrategy != null) __obj.updateDynamic("processStrategy")(processStrategy)
    __obj.asInstanceOf[EntityOptions[T]]
  }
}

