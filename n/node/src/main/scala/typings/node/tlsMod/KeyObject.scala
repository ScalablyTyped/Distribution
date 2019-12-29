package typings.node.tlsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait KeyObject extends js.Object {
  /**
    * Optional passphrase.
    */
  var passphrase: js.UndefOr[String] = js.undefined
  /**
    * Private keys in PEM format.
    */
  var pem: String | Buffer
}

object KeyObject {
  @scala.inline
  def apply(pem: String | Buffer, passphrase: String = null): KeyObject = {
    val __obj = js.Dynamic.literal(pem = pem.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[KeyObject]
  }
}

