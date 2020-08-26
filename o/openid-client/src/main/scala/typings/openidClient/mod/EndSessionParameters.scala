package typings.openidClient.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EndSessionParameters
  extends /* key */ StringDictionary[js.Any] {
  var id_token_hint: js.UndefOr[TokenSet | String] = js.native
  var post_logout_redirect_uri: js.UndefOr[String] = js.native
  var state: js.UndefOr[String] = js.native
}

object EndSessionParameters {
  @scala.inline
  def apply(): EndSessionParameters = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[EndSessionParameters]
  }
  @scala.inline
  implicit class EndSessionParametersOps[Self <: EndSessionParameters] (val x: Self) extends AnyVal {
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
    def setId_token_hint(value: TokenSet | String): Self = this.set("id_token_hint", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteId_token_hint: Self = this.set("id_token_hint", js.undefined)
    @scala.inline
    def setPost_logout_redirect_uri(value: String): Self = this.set("post_logout_redirect_uri", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePost_logout_redirect_uri: Self = this.set("post_logout_redirect_uri", js.undefined)
    @scala.inline
    def setState(value: String): Self = this.set("state", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteState: Self = this.set("state", js.undefined)
  }
  
}

