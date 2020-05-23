package typings.nodeJose.mod.JWA

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
    length: js.UndefOr[Double] = js.undefined,
    otherInfo: Buffer = null,
    public: Buffer = null,
    salt: Buffer = null
  ): DeriveOptions = {
    val __obj = js.Dynamic.literal()
    if (hash != null) __obj.updateDynamic("hash")(hash.asInstanceOf[js.Any])
    if (info != null) __obj.updateDynamic("info")(info.asInstanceOf[js.Any])
    if (!js.isUndefined(length)) __obj.updateDynamic("length")(length.get.asInstanceOf[js.Any])
    if (otherInfo != null) __obj.updateDynamic("otherInfo")(otherInfo.asInstanceOf[js.Any])
    if (public != null) __obj.updateDynamic("public")(public.asInstanceOf[js.Any])
    if (salt != null) __obj.updateDynamic("salt")(salt.asInstanceOf[js.Any])
    __obj.asInstanceOf[DeriveOptions]
  }
}

