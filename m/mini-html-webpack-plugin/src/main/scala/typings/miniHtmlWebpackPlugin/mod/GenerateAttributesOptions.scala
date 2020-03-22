package typings.miniHtmlWebpackPlugin.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GenerateAttributesOptions extends js.Object {
  var attributes: js.UndefOr[AttributesType] = js.undefined
}

object GenerateAttributesOptions {
  @scala.inline
  def apply(attributes: AttributesType = null): GenerateAttributesOptions = {
    val __obj = js.Dynamic.literal()
    if (attributes != null) __obj.updateDynamic("attributes")(attributes.asInstanceOf[js.Any])
    __obj.asInstanceOf[GenerateAttributesOptions]
  }
}

