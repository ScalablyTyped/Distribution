package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.verifyCertificateChain")
@js.native
object verifyCertificateChain extends js.Object {
  def apply(caStore: CAStore, chain: js.Array[Certificate]): Boolean = js.native
  def apply(
    caStore: CAStore,
    chain: js.Array[Certificate],
    customVerifyCallback: js.Function3[
      /* verified */ Boolean | String, 
      /* depth */ Double, 
      /* chain */ js.Array[Certificate], 
      Boolean
    ]
  ): Boolean = js.native
}

