package typings.nodeDashForge.nodeDashForgeMod.pki.ed25519

import typings.nodeDashForge.Anon_PrivateKey
import typings.nodeDashForge.Anon_Seed
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.ed25519.generateKeyPair")
@js.native
object generateKeyPair extends js.Object {
  // generateKeyPair does not currently accept `util.ByteBuffer` as the seed.
  def apply(): Anon_PrivateKey = js.native
  def apply(options: Anon_Seed): Anon_PrivateKey = js.native
}

