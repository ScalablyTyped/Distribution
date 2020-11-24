package typings.openpgp.mod.crypto

import typings.std.Uint8Array
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("openpgp", "crypto.cmac")
@js.native
object cmac extends js.Object {
  
  /**
    * This implementation of CMAC is based on the description of OMAC in
    * http://web.cs.ucdavis.edu/~rogaway/papers/eax.pdf. As per that
    * document:
    * We have made a small modification to the OMAC algorithm as it was
    * originally presented, changing one of its two constants.
    * Specifically, the constant 4 at line 85 was the constant 1/2 (the
    * multiplicative inverse of 2) in the original definition of OMAC [14].
    * The OMAC authors indicate that they will promulgate this modification
    * [15], which slightly simplifies implementations.
    */
  val blockLength: js.Any = js.native
  
  /**
    * xor `padding` into the end of `data`. This function implements "the
    * operation xor→ [which] xors the shorter string into the end of longer
    * one". Since data is always as least as long as padding, we can
    * simplify the implementation.
    * @param data
    * @param padding
    */
  def rightXorMut(data: Uint8Array, padding: Uint8Array): Unit = js.native
}
