package typings.parse.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ScopeOptions
  extends SessionTokenOption
     with UseMasterKeyOption

object ScopeOptions {
  @scala.inline
  def apply(sessionToken: String = null, useMasterKey: js.UndefOr[Boolean] = js.undefined): ScopeOptions = {
    val __obj = js.Dynamic.literal()
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken)
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey)
    __obj.asInstanceOf[ScopeOptions]
  }
}

