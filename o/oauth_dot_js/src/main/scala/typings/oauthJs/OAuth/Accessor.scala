package typings.oauthJs.OAuth

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * SignatureMethod expects an accessor object to be like this:
  *   {tokenSecret: "lakjsdflkj...", consumerSecret: "QOUEWRI..", accessorSecret: "xcmvzc..."}
  * The accessorSecret property is optional.
  */
@js.native
trait Accessor extends js.Object {
  var accessorSecret: js.UndefOr[String] = js.native
  var consumerKey: String = js.native
  var consumerSecret: String = js.native
  var token: String = js.native
  var tokenSecret: String = js.native
}

object Accessor {
  @scala.inline
  def apply(consumerKey: String, consumerSecret: String, token: String, tokenSecret: String): Accessor = {
    val __obj = js.Dynamic.literal(consumerKey = consumerKey.asInstanceOf[js.Any], consumerSecret = consumerSecret.asInstanceOf[js.Any], token = token.asInstanceOf[js.Any], tokenSecret = tokenSecret.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accessor]
  }
  @scala.inline
  implicit class AccessorOps[Self <: Accessor] (val x: Self) extends AnyVal {
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
    def setConsumerKey(value: String): Self = this.set("consumerKey", value.asInstanceOf[js.Any])
    @scala.inline
    def setConsumerSecret(value: String): Self = this.set("consumerSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setToken(value: String): Self = this.set("token", value.asInstanceOf[js.Any])
    @scala.inline
    def setTokenSecret(value: String): Self = this.set("tokenSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def setAccessorSecret(value: String): Self = this.set("accessorSecret", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAccessorSecret: Self = this.set("accessorSecret", js.undefined)
  }
  
}

