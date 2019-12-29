package typings.parse.parseMod._Global_.Parse

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
    if (installationId != null) __obj.updateDynamic("installationId")(installationId.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[SignUpOptions]
  }
}

