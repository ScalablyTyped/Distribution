package typings
package normalizrLib.normalizrMod.schemaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EntityOptions extends js.Object {
  var idAttribute: js.UndefOr[java.lang.String | SchemaFunction] = js.undefined
  var mergeStrategy: js.UndefOr[MergeFunction] = js.undefined
  var processStrategy: js.UndefOr[StrategyFunction] = js.undefined
}

object EntityOptions {
  @scala.inline
  def apply(
    idAttribute: java.lang.String | SchemaFunction = null,
    mergeStrategy: MergeFunction = null,
    processStrategy: StrategyFunction = null
  ): EntityOptions = {
    val __obj = js.Dynamic.literal()
    if (idAttribute != null) __obj.updateDynamic("idAttribute")(idAttribute.asInstanceOf[js.Any])
    if (mergeStrategy != null) __obj.updateDynamic("mergeStrategy")(mergeStrategy)
    if (processStrategy != null) __obj.updateDynamic("processStrategy")(processStrategy)
    __obj.asInstanceOf[EntityOptions]
  }
}

