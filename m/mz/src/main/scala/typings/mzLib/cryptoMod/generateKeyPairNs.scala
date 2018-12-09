package typings
package mzLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "generateKeyPair")
@js.native
object generateKeyPairNs extends js.Object {
  def `__promisify__`(
    `type`: mzLib.mzLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem, 
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PublicKey] = js.native
  def `__promisify__`(
    `type`: mzLib.mzLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem, 
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PublicKey] = js.native
  def `__promisify__`(
    `type`: mzLib.mzLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem, 
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PublicKey] = js.native
}

