package typings.oauthDotJs.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SignatureMethod expects an accessor object to be like this:
  *   {tokenSecret: "lakjsdflkj...", consumerSecret: "QOUEWRI..", accessorSecret: "xcmvzc..."}
  * The accessorSecret property is optional.
  */
trait Accessor extends js.Object {
  var accessorSecret: js.UndefOr[String] = js.undefined
  var consumerKey: String
  var consumerSecret: String
  var token: String
  var tokenSecret: String
}

object Accessor {
  @scala.inline
  def apply(
    consumerKey: String,
    consumerSecret: String,
    token: String,
    tokenSecret: String,
    accessorSecret: String = null
  ): Accessor = {
    val __obj = js.Dynamic.literal(consumerKey = consumerKey, consumerSecret = consumerSecret, token = token, tokenSecret = tokenSecret)
    if (accessorSecret != null) __obj.updateDynamic("accessorSecret")(accessorSecret)
    __obj.asInstanceOf[Accessor]
  }
}

