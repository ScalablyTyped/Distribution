package typings.nodeDashJose.nodeDashJoseMod.JWA

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncryptReturn extends js.Object {
  var data: Buffer
   // The cipher text
  var tag: js.UndefOr[Buffer] = js.undefined
}

object EncryptReturn {
  @scala.inline
  def apply(data: Buffer, tag: Buffer = null): EncryptReturn = {
    val __obj = js.Dynamic.literal(data = data)
    if (tag != null) __obj.updateDynamic("tag")(tag)
    __obj.asInstanceOf[EncryptReturn]
  }
}

