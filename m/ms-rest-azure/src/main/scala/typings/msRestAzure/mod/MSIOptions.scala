package typings.msRestAzure.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MSIOptions extends js.Object {
  /**
    * @prop {string} [resource] -  The resource uri or token audience for which the token is needed.
    * For e.g. it can be:
    * - resourcemanagement endpoint "https://management.azure.com"(default) 
    * - management endpoint "https://management.core.windows.net/"
    */
  var resource: js.UndefOr[String] = js.undefined
}

object MSIOptions {
  @scala.inline
  def apply(resource: String = null): MSIOptions = {
    val __obj = js.Dynamic.literal()
    if (resource != null) __obj.updateDynamic("resource")(resource.asInstanceOf[js.Any])
    __obj.asInstanceOf[MSIOptions]
  }
}

