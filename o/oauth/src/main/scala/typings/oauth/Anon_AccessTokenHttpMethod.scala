package typings.oauth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessTokenHttpMethod extends js.Object {
  var accessTokenHttpMethod: String
  var followRedirects: Boolean
  var requestTokenHttpMethod: String
}

object Anon_AccessTokenHttpMethod {
  @scala.inline
  def apply(accessTokenHttpMethod: String, followRedirects: Boolean, requestTokenHttpMethod: String): Anon_AccessTokenHttpMethod = {
    val __obj = js.Dynamic.literal(accessTokenHttpMethod = accessTokenHttpMethod, followRedirects = followRedirects, requestTokenHttpMethod = requestTokenHttpMethod)
  
    __obj.asInstanceOf[Anon_AccessTokenHttpMethod]
  }
}

