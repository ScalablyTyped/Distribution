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
    val __obj = js.Dynamic.literal(iv = iv.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    __obj.asInstanceOf[AesCBC]
  }
}

