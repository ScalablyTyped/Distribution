package typings.openapiDashTypes.openapiDashTypesMod.OpenAPIV3Ns

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ContactObject extends js.Object {
  var email: js.UndefOr[String] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var url: js.UndefOr[String] = js.undefined
}

object ContactObject {
  @scala.inline
  def apply(email: String = null, name: String = null, url: String = null): ContactObject = {
    val __obj = js.Dynamic.literal()
    if (email != null) __obj.updateDynamic("email")(email)
    if (name != null) __obj.updateDynamic("name")(name)
    if (url != null) __obj.updateDynamic("url")(url)
    __obj.asInstanceOf[ContactObject]
  }
}

