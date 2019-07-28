package typings.oauthDotJs.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureMethod extends js.Object {
  var key: String
  def getSignature(baseString: String): String
  /** Set the key string for signing. */
  def initialize(name: String, accessor: Accessor): Unit
  /** Add a signature to the message. */
  def sign(message: Message): String
}

object SignatureMethod {
  @scala.inline
  def apply(
    getSignature: String => String,
    initialize: (String, Accessor) => Unit,
    key: String,
    sign: Message => String
  ): SignatureMethod = {
    val __obj = js.Dynamic.literal(getSignature = js.Any.fromFunction1(getSignature), initialize = js.Any.fromFunction2(initialize), key = key, sign = js.Any.fromFunction1(sign))
  
    __obj.asInstanceOf[SignatureMethod]
  }
}

