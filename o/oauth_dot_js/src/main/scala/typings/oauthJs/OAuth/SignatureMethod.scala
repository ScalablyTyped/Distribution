package typings.oauthJs.OAuth

import org.scalablytyped.runtime.TopLevel
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

@JSGlobal("OAuth.SignatureMethod")
@js.native
object SignatureMethod extends TopLevel[SignatureMethodStatic]

