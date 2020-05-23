package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefinitionSource extends js.Object {
  var definition: js.UndefOr[String | Null] = js.undefined
  var source: js.UndefOr[String | Null] = js.undefined
}

object DefinitionSource {
  @scala.inline
  def apply(
    definition: js.UndefOr[Null | String] = js.undefined,
    source: js.UndefOr[Null | String] = js.undefined
  ): DefinitionSource = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(definition)) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (!js.isUndefined(source)) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[DefinitionSource]
  }
}

