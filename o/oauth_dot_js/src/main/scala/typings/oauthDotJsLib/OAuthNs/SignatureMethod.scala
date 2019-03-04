package typings
package oauthDotJsLib.OAuthNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SignatureMethod extends js.Object {
  var key: java.lang.String
  def getSignature(baseString: java.lang.String): java.lang.String
  /** Set the key string for signing. */
  def initialize(name: java.lang.String, accessor: Accessor): scala.Unit
  /** Add a signature to the message. */
  def sign(message: Message): java.lang.String
}

object SignatureMethod {
  @scala.inline
  def apply(
    getSignature: js.Function1[java.lang.String, java.lang.String],
    initialize: js.Function2[java.lang.String, Accessor, scala.Unit],
    key: java.lang.String,
    sign: js.Function1[Message, java.lang.String]
  ): SignatureMethod = {
    val __obj = js.Dynamic.literal(getSignature = getSignature, initialize = initialize, key = key, sign = sign)
  
    __obj.asInstanceOf[SignatureMethod]
  }
}

