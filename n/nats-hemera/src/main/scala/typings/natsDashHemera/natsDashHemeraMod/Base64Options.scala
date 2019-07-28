package typings.natsDashHemera.natsDashHemeraMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Base64Options extends js.Object {
  /**
    * optional parameter defaulting to true which will require = padding if true or make padding optional if false
    */
  var paddingRequired: js.UndefOr[Boolean] = js.undefined
}

object Base64Options {
  @scala.inline
  def apply(paddingRequired: js.UndefOr[Boolean] = js.undefined): Base64Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(paddingRequired)) __obj.updateDynamic("paddingRequired")(paddingRequired)
    __obj.asInstanceOf[Base64Options]
  }
}

