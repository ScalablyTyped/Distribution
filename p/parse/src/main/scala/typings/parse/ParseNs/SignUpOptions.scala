package typings.parse.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignUpOptions extends js.Object {
  var installationId: js.UndefOr[String] = js.undefined
  var useMasterKey: js.UndefOr[Boolean] = js.undefined
}

object SignUpOptions {
  @scala.inline
  def apply(installationId: String = null, useMasterKey: js.UndefOr[Boolean] = js.undefined): SignUpOptions = {
    val __obj = js.Dynamic.literal()
    if (installationId != null) __obj.updateDynamic("installationId")(installationId)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[SignUpOptions]
  }
}

