package typings.nodeDashJose.nodeDashJoseMod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DeriveOptions extends js.Object {
   // public key used in ecdh
  var hash: js.UndefOr[Buffer] = js.undefined
   // salt value used in hkdf
  var info: js.UndefOr[Buffer] = js.undefined
  var length: js.UndefOr[Double] = js.undefined
   // key length
  var otherInfo: js.UndefOr[Buffer] = js.undefined
   // info used in concatkdf
  var public: js.UndefOr[Buffer] = js.undefined
   // hash used in ecdh
  var salt: js.UndefOr[Buffer] = js.undefined
}

object DeriveOptions {
  @scala.inline
  def apply(
    hash: Buffer = null,
    info: Buffer = null,
    length: Int | Double = null,
    otherInfo: Buffer = null,
    public: Buffer = null,
    salt: Buffer = null
  ): DeriveOptions = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash)
    if (info != null) __obj.updateDynamic("info")(info)
    if (length != null) __obj.updateDynamic("length")(length.asInstanceOf[js.Any])
    if (otherInfo != null) __obj.updateDynamic("otherInfo")(otherInfo)
    if (public != null) __obj.updateDynamic("public")(public)
    if (salt != null) __obj.updateDynamic("salt")(salt)
    __obj.asInstanceOf[DeriveOptions]
  }
}

