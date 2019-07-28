package typings.pkcs11js.Pkcs11JsNs

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ECDH1 extends IParams {
  var kdf: Double
  var publicData: Buffer
  var sharedData: js.UndefOr[Buffer] = js.undefined
}

object ECDH1 {
  @scala.inline
  def apply(kdf: Double, publicData: Buffer, `type`: Double, sharedData: Buffer = null): ECDH1 = {
    val __obj = js.Dynamic.literal(kdf = kdf, publicData = publicData)
    __obj.updateDynamic("type")(`type`)
    if (sharedData != null) __obj.updateDynamic("sharedData")(sharedData)
    __obj.asInstanceOf[ECDH1]
  }
}

