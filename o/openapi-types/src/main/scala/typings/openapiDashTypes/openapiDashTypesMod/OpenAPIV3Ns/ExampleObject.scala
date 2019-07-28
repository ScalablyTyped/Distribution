package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ExampleObject extends js.Object {
  var description: js.UndefOr[String] = js.undefined
  var externalValue: js.UndefOr[String] = js.undefined
  var summary: js.UndefOr[String] = js.undefined
  var value: js.UndefOr[js.Any] = js.undefined
}

object ExampleObject {
  @scala.inline
  def apply(
    description: String = null,
    externalValue: String = null,
    summary: String = null,
    value: js.Any = null
  ): ExampleObject = {
    val __obj = js.Dynamic.literal()
    if (description != null) __obj.updateDynamic("description")(description)
    if (externalValue != null) __obj.updateDynamic("externalValue")(externalValue)
    if (summary != null) __obj.updateDynamic("summary")(summary)
    if (value != null) __obj.updateDynamic("value")(value)
    __obj.asInstanceOf[ExampleObject]
  }
}

