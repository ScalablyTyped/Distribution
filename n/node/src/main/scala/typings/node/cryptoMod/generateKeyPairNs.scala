package typings.node.cryptoMod

import typings.node.Anon_PrivateKey
import typings.node.nodeStrings.der
import typings.node.nodeStrings.dsa
import typings.node.nodeStrings.ec
import typings.node.nodeStrings.pem
import typings.node.nodeStrings.rsa
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("crypto", "generateKeyPair")
@js.native
object generateKeyPairNs extends js.Object {
  def __promisify__(`type`: dsa, options: DSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: ec, options: ECKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  def __promisify__(`type`: rsa, options: RSAKeyPairOptions[der | pem, der | pem]): js.Promise[Anon_PrivateKey] = js.native
  @JSName("__promisify__")
  def __promisify___dsa(`type`: dsa, options: DSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___ec(`type`: ec, options: ECKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
  @JSName("__promisify__")
  def __promisify___rsa(`type`: rsa, options: RSAKeyPairKeyObjectOptions): js.Promise[KeyPairKeyObjectResult] = js.native
}

