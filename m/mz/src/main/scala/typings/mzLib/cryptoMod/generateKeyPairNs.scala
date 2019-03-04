package typings
package mzLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mz/crypto", "generateKeyPair")
@js.native
object generateKeyPairNs extends js.Object {
  def __promisify__(
    `type`: mzLib.mzLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem, 
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  def __promisify__(
    `type`: mzLib.mzLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem, 
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  def __promisify__(
    `type`: mzLib.mzLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem, 
      mzLib.mzLibStrings.der | mzLib.mzLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  @JSName("__promisify__")
  def __promisify___dsa(`type`: mzLib.mzLibStrings.dsa, options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___ec(`type`: mzLib.mzLibStrings.ec, options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___rsa(`type`: mzLib.mzLibStrings.rsa, options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
}

