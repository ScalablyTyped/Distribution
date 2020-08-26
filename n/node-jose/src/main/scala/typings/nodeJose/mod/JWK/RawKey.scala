package typings.nodeJose.mod.JWK

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait RawKey extends js.Object {
  var alg: String = js.native
  // e and n make up the public key
  var e: String = js.native
  var kid: String = js.native
  var kty: String = js.native
  var n: String = js.native
  var use: KeyUse = js.native
}

object RawKey {
  @scala.inline
  def apply(alg: String, e: String, kid: String, kty: String, n: String, use: KeyUse): RawKey = {
    val __obj = js.Dynamic.literal(alg = alg.asInstanceOf[js.Any], e = e.asInstanceOf[js.Any], kid = kid.asInstanceOf[js.Any], kty = kty.asInstanceOf[js.Any], n = n.asInstanceOf[js.Any], use = use.asInstanceOf[js.Any])
    __obj.asInstanceOf[RawKey]
  }
  @scala.inline
  implicit class RawKeyOps[Self <: RawKey] (val x: Self) extends AnyVal {
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
    def setAlg(value: String): Self = this.set("alg", value.asInstanceOf[js.Any])
    @scala.inline
    def setE(value: String): Self = this.set("e", value.asInstanceOf[js.Any])
    @scala.inline
    def setKid(value: String): Self = this.set("kid", value.asInstanceOf[js.Any])
    @scala.inline
    def setKty(value: String): Self = this.set("kty", value.asInstanceOf[js.Any])
    @scala.inline
    def setN(value: String): Self = this.set("n", value.asInstanceOf[js.Any])
    @scala.inline
    def setUse(value: KeyUse): Self = this.set("use", value.asInstanceOf[js.Any])
  }
  
}

