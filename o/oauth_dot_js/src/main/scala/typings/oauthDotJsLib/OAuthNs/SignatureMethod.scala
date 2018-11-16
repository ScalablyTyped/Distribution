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

