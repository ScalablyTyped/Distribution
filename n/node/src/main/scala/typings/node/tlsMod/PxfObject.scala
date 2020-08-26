package typings.node.tlsMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PxfObject extends js.Object {
  /**
    * PFX or PKCS12 encoded private key and certificate chain.
    */
  var buf: String | Buffer = js.native
  /**
    * Optional passphrase.
    */
  var passphrase: js.UndefOr[String] = js.native
}

object PxfObject {
  @scala.inline
  def apply(buf: String | Buffer): PxfObject = {
    val __obj = js.Dynamic.literal(buf = buf.asInstanceOf[js.Any])
    __obj.asInstanceOf[PxfObject]
  }
  @scala.inline
  implicit class PxfObjectOps[Self <: PxfObject] (val x: Self) extends AnyVal {
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
    def setBuf(value: String | Buffer): Self = this.set("buf", value.asInstanceOf[js.Any])
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

