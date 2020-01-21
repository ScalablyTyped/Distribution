package typings.oracleOraclejet

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonDefinitionSource extends js.Object {
  var definition: js.UndefOr[String | Null] = js.undefined
  var source: js.UndefOr[String | Null] = js.undefined
}

object AnonDefinitionSource {
  @scala.inline
  def apply(definition: String = null, source: String = null): AnonDefinitionSource = {
    val __obj = js.Dynamic.literal()
    if (definition != null) __obj.updateDynamic("definition")(definition.asInstanceOf[js.Any])
    if (source != null) __obj.updateDynamic("source")(source.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonDefinitionSource]
  }
}

