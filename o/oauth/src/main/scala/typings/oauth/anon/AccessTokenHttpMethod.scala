package typings.oauth.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AccessTokenHttpMethod extends js.Object {
  var accessTokenHttpMethod: String
  var followRedirects: Boolean
  var requestTokenHttpMethod: String
}

object AccessTokenHttpMethod {
  @scala.inline
  def apply(accessTokenHttpMethod: String, followRedirects: Boolean, requestTokenHttpMethod: String): AccessTokenHttpMethod = {
    val __obj = js.Dynamic.literal(accessTokenHttpMethod = accessTokenHttpMethod.asInstanceOf[js.Any], followRedirects = followRedirects.asInstanceOf[js.Any], requestTokenHttpMethod = requestTokenHttpMethod.asInstanceOf[js.Any])
    __obj.asInstanceOf[AccessTokenHttpMethod]
  }
}

