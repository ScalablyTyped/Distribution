package typings.oauthDotJs.OAuth

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
    val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenSecret = tokenSecret.asInstanceOf[js.Any])
    if (accessorSecret != null) __obj.updateDynamic("accessorSecret")(accessorSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessor]
  }
}

