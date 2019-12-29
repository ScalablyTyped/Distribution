package typings.node.tlsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PxfObject extends js.Object {
  /**
    * PFX or PKCS12 encoded private key and certificate chain.
    */
  var buf: String | Buffer
  /**
    * Optional passphrase.
    */
  var passphrase: js.UndefOr[String] = js.undefined
}

object PxfObject {
  @scala.inline
  def apply(buf: String | Buffer, passphrase: String = null): PxfObject = {
    val __obj = js.Dynamic.literal(buf = buf.asInstanceOf[js.Any])
    if (passphrase != null) __obj.updateDynamic("passphrase")(passphrase.asInstanceOf[js.Any])
    __obj.asInstanceOf[PxfObject]
  }
}

