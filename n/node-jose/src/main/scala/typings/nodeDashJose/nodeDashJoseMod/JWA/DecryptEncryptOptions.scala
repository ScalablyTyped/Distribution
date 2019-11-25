package typings.nodeDashJose.nodeDashJoseMod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DecryptEncryptOptions extends js.Object {
  var aad: js.UndefOr[Buffer] = js.undefined
  var adata: js.UndefOr[Buffer] = js.undefined
   // algorithm to use in ec
  var alg: js.UndefOr[String] = js.undefined
   // variation of enc, probably oversight in lib code
  var apu: js.UndefOr[Buffer] = js.undefined
   // agreement party info used in ec
  var apv: js.UndefOr[Buffer] = js.undefined
   // ephemeral pub key used in ec
  var enc: js.UndefOr[String] = js.undefined
  var epk: js.UndefOr[Buffer] = js.undefined
   // Not used in encrypt
  var epu: js.UndefOr[Buffer] = js.undefined
   // encryption party info
  var epv: js.UndefOr[Buffer] = js.undefined
  var iv: js.UndefOr[Buffer] = js.undefined
   // encryption party info
  var kdata: js.UndefOr[Buffer] = js.undefined
   // Not used in encrypt
  var mac: js.UndefOr[Buffer] = js.undefined
   // used in pbes
  var p2c: js.UndefOr[Double] = js.undefined
   // agreement party info used in ec
  var p2s: js.UndefOr[Buffer] = js.undefined
  var tag: js.UndefOr[Buffer] = js.undefined
}

object DecryptEncryptOptions {
  @scala.inline
  def apply(
    aad: Buffer = null,
    adata: Buffer = null,
    alg: String = null,
    apu: Buffer = null,
    apv: Buffer = null,
    enc: String = null,
    epk: Buffer = null,
    epu: Buffer = null,
    epv: Buffer = null,
    iv: Buffer = null,
    kdata: Buffer = null,
    mac: Buffer = null,
    p2c: Int | Double = null,
    p2s: Buffer = null,
    tag: Buffer = null
  ): DecryptEncryptOptions = {
    val __obj = js.Dynamic.literal()
    if (aad != null) __obj.updateDynamic("aad")(aad.asInstanceOf[js.Any])
    if (adata != null) __obj.updateDynamic("adata")(adata.asInstanceOf[js.Any])
    if (alg != null) __obj.updateDynamic("alg")(alg.asInstanceOf[js.Any])
    if (apu != null) __obj.updateDynamic("apu")(apu.asInstanceOf[js.Any])
    if (apv != null) __obj.updateDynamic("apv")(apv.asInstanceOf[js.Any])
    if (enc != null) __obj.updateDynamic("enc")(enc.asInstanceOf[js.Any])
    if (epk != null) __obj.updateDynamic("epk")(epk.asInstanceOf[js.Any])
    if (epu != null) __obj.updateDynamic("epu")(epu.asInstanceOf[js.Any])
    if (epv != null) __obj.updateDynamic("epv")(epv.asInstanceOf[js.Any])
    if (iv != null) __obj.updateDynamic("iv")(iv.asInstanceOf[js.Any])
    if (kdata != null) __obj.updateDynamic("kdata")(kdata.asInstanceOf[js.Any])
    if (mac != null) __obj.updateDynamic("mac")(mac.asInstanceOf[js.Any])
    if (p2c != null) __obj.updateDynamic("p2c")(p2c.asInstanceOf[js.Any])
    if (p2s != null) __obj.updateDynamic("p2s")(p2s.asInstanceOf[js.Any])
    if (tag != null) __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    __obj.asInstanceOf[DecryptEncryptOptions]
  }
}

