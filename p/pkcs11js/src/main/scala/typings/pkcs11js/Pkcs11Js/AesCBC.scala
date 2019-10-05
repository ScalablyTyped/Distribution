package typings.pkcs11js.Pkcs11Js

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AesCBC extends IParams {
  var data: js.UndefOr[Buffer] = js.undefined
  var iv: Buffer
}

object AesCBC {
  @scala.inline
  def apply(iv: Buffer, `type`: Double, data: Buffer = null): AesCBC = {
    val __obj = js.Dynamic.literal(iv = iv)
    __obj.updateDynamic("type")(`type`)
    if (data != null) __obj.updateDynamic("data")(data)
    __obj.asInstanceOf[AesCBC]
  }
}

