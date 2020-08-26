package typings.node.cryptoMod

import typings.node.NodeJS.TypedArray
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RsaPrivateKey extends js.Object {
  var key: KeyLike = js.native
  /**
    * @default 'sha1'
    */
  var oaepHash: js.UndefOr[String] = js.native
  var oaepLabel: js.UndefOr[TypedArray] = js.native
  var padding: js.UndefOr[Double] = js.native
  var passphrase: js.UndefOr[String] = js.native
}

object RsaPrivateKey {
  @scala.inline
  def apply(key: KeyLike): RsaPrivateKey = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    __obj.asInstanceOf[RsaPrivateKey]
  }
  @scala.inline
  implicit class RsaPrivateKeyOps[Self <: RsaPrivateKey] (val x: Self) extends AnyVal {
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
    def setKey(value: KeyLike): Self = this.set("key", value.asInstanceOf[js.Any])
    @scala.inline
    def setOaepHash(value: String): Self = this.set("oaepHash", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOaepHash: Self = this.set("oaepHash", js.undefined)
    @scala.inline
    def setOaepLabel(value: TypedArray): Self = this.set("oaepLabel", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOaepLabel: Self = this.set("oaepLabel", js.undefined)
    @scala.inline
    def setPadding(value: Double): Self = this.set("padding", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePadding: Self = this.set("padding", js.undefined)
    @scala.inline
    def setPassphrase(value: String): Self = this.set("passphrase", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePassphrase: Self = this.set("passphrase", js.undefined)
  }
  
}

