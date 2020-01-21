package typings.parse.mod._Global_.Parse

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
    if (sessionToken != null) __obj.updateDynamic("sessionToken")(sessionToken.asInstanceOf[js.Any])
    if (!js.isUndefined(useMasterKey)) __obj.updateDynamic("useMasterKey")(useMasterKey.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScopeOptions]
  }
}

