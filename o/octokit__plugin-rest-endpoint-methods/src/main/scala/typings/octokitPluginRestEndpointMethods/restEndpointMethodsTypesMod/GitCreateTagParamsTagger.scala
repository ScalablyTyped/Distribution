package typings.octokitPluginRestEndpointMethods.restEndpointMethodsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GitCreateTagParamsTagger extends js.Object {
  /**
    * When this object was tagged. This is a timestamp in [ISO 8601](https://en.wikipedia.org/wiki/ISO_8601) format: `YYYY-MM-DDTHH:MM:SSZ`.
    */
  var date: js.UndefOr[String] = js.undefined
  /**
    * The email of the author of the tag
    */
  var email: js.UndefOr[String] = js.undefined
  /**
    * The name of the author of the tag
    */
  var name: js.UndefOr[String] = js.undefined
}

object GitCreateTagParamsTagger {
  @scala.inline
  def apply(date: String = null, email: String = null, name: String = null): GitCreateTagParamsTagger = {
    val __obj = js.Dynamic.literal()
    if (date != null) __obj.updateDynamic("date")(date.asInstanceOf[js.Any])
    if (email != null) __obj.updateDynamic("email")(email.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GitCreateTagParamsTagger]
  }
}

