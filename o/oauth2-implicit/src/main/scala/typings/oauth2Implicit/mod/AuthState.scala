package typings.oauth2Implicit.mod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait AuthState
  extends /* key */ StringDictionary[js.Any] {
  var originalUrl: String = js.native
}

object AuthState {
  @scala.inline
  def apply(originalUrl: String): AuthState = {
    val __obj = js.Dynamic.literal(originalUrl = originalUrl.asInstanceOf[js.Any])
    __obj.asInstanceOf[AuthState]
  }
  @scala.inline
  implicit class AuthStateOps[Self <: AuthState] (val x: Self) extends AnyVal {
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
    def setOriginalUrl(value: String): Self = this.set("originalUrl", value.asInstanceOf[js.Any])
  }
  
}

