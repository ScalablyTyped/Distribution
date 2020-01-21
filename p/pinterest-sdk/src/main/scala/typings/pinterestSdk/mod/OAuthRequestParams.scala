package typings.pinterestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthRequestParams extends js.Object {
  var accessToken: js.UndefOr[String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
}

object OAuthRequestParams {
  @scala.inline
  def apply(accessToken: String = null, data: js.Any = null): OAuthRequestParams = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[OAuthRequestParams]
  }
}

