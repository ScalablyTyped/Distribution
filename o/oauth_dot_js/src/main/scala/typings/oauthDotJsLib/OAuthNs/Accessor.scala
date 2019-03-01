package typings
package oauthDotJsLib.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SignatureMethod expects an accessor object to be like this:
  *   {tokenSecret: "lakjsdflkj...", consumerSecret: "QOUEWRI..", accessorSecret: "xcmvzc..."}
  * The accessorSecret property is optional.
  */
trait Accessor extends js.Object {
  var accessorSecret: js.UndefOr[java.lang.String] = js.undefined
  var consumerKey: java.lang.String
  var consumerSecret: java.lang.String
  var token: java.lang.String
  var tokenSecret: java.lang.String
}

object Accessor {
  @scala.inline
  def apply(
    consumerKey: java.lang.String,
    consumerSecret: java.lang.String,
    token: java.lang.String,
    tokenSecret: java.lang.String,
    accessorSecret: java.lang.String = null
  ): Accessor = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("consumerKey")(consumerKey)
    __obj.updateDynamic("consumerSecret")(consumerSecret)
    __obj.updateDynamic("token")(token)
    __obj.updateDynamic("tokenSecret")(tokenSecret)
    if (accessorSecret != null) __obj.updateDynamic("accessorSecret")(accessorSecret)
    __obj.asInstanceOf[Accessor]
  }
}

