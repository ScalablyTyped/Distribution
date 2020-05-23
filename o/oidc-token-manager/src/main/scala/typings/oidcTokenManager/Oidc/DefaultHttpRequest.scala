package typings.oidcTokenManager.Oidc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DefaultHttpRequest extends js.Object {
  def getJSON(url: String, config: js.Any): DefaultPromise
}

object DefaultHttpRequest {
  @scala.inline
  def apply(getJSON: (String, js.Any) => DefaultPromise): DefaultHttpRequest = {
    val __obj = js.Dynamic.literal(getJSON = js.Any.fromFunction2(getJSON))
    __obj.asInstanceOf[DefaultHttpRequest]
  }
}

