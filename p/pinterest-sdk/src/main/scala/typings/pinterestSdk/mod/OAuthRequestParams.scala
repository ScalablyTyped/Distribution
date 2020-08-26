package typings.pinterestSdk.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait OAuthRequestParams extends js.Object {
  var accessToken: js.UndefOr[String] = js.native
  var data: js.UndefOr[js.Any] = js.native
}

object OAuthRequestParams {
  @scala.inline
  def apply(): OAuthRequestParams = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OAuthRequestParams]
  }
  @scala.inline
  implicit class OAuthRequestParamsOps[Self <: OAuthRequestParams] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setAccessToken(value: String): Self = this.set("accessToken", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessToken: Self = this.set("accessToken", js.undefined)
    @scala.inline
    def setData(value: js.Any): Self = this.set("data", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteData: Self = this.set("data", js.undefined)
  }
  
}

