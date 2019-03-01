package typings
package oauthLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AccessTokenHttpMethod extends js.Object {
  var accessTokenHttpMethod: java.lang.String
  var followRedirects: scala.Boolean
  var requestTokenHttpMethod: java.lang.String
}

object Anon_AccessTokenHttpMethod {
  @scala.inline
  def apply(
    accessTokenHttpMethod: java.lang.String,
    followRedirects: scala.Boolean,
    requestTokenHttpMethod: java.lang.String
  ): Anon_AccessTokenHttpMethod = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("accessTokenHttpMethod")(accessTokenHttpMethod)
    __obj.updateDynamic("followRedirects")(followRedirects)
    __obj.updateDynamic("requestTokenHttpMethod")(requestTokenHttpMethod)
    __obj.asInstanceOf[Anon_AccessTokenHttpMethod]
  }
}

