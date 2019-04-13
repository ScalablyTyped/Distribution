package typings
package pinterestDashSdkLib.pinterestDashSdkMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait OAuthRequestParams extends js.Object {
  var accessToken: js.UndefOr[java.lang.String] = js.undefined
  var data: js.UndefOr[js.Any] = js.undefined
}

object OAuthRequestParams {
  @scala.inline
  def apply(accessToken: java.lang.String = null, data: js.Any = null): OAuthRequestParams = {
    val __obj = js.Dynamic.literal()
    if (accessToken != null) __obj.updateDynamic("accessToken")(accessToken)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[OAuthRequestParams]
  }
}

