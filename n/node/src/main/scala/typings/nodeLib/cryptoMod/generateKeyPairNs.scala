package typings
package nodeLib.cryptoMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPair")
@js.native
object generateKeyPairNs extends js.Object {
  def `__promisify__`(
    `type`: nodeLib.nodeLibStrings.dsa,
    options: nodeLib.cryptoMod.DSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  def `__promisify__`(
    `type`: nodeLib.nodeLibStrings.ec,
    options: nodeLib.cryptoMod.ECKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  def `__promisify__`(
    `type`: nodeLib.nodeLibStrings.rsa,
    options: nodeLib.cryptoMod.RSAKeyPairOptions[
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem, 
      nodeLib.nodeLibStrings.der | nodeLib.nodeLibStrings.pem
    ]
  ): js.Promise[nodeLib.Anon_PrivateKey] = js.native
  @JSName("__promisify__")
  def __promisify___dsa(`type`: nodeLib.nodeLibStrings.dsa, options: nodeLib.cryptoMod.DSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___ec(`type`: nodeLib.nodeLibStrings.ec, options: nodeLib.cryptoMod.ECKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___rsa(`type`: nodeLib.nodeLibStrings.rsa, options: nodeLib.cryptoMod.RSAKeyPairKeyObjectOptions): js.Promise[nodeLib.cryptoMod.KeyPairKeyObjectResult] = js.native
}

