package typings.openpgp

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_S extends js.Object {
  var S: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any
  var V: Uint8Array
}

object Anon_S {
  @scala.inline
  def apply(
    S: /* import warning: QualifyReferences.resolveTypeRef many Couldn't qualify BN */ js.Any,
    V: Uint8Array
  ): Anon_S = {
    val __obj = js.Dynamic.literal(S = S, V = V)
  
    __obj.asInstanceOf[Anon_S]
  }
}

