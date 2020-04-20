package typings.openpgp

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonS extends js.Object {
  var S: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any
  var V: Uint8Array
}

object AnonS {
  @scala.inline
  def apply(
    S: /* import warning: transforms.QualifyReferences#resolveTypeRef many Couldn't qualify BN */ js.Any,
    V: Uint8Array
  ): AnonS = {
    val __obj = js.Dynamic.literal(S = S.asInstanceOf[js.Any], V = V.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonS]
  }
}

