package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-forge", "pki.publicKeyToPem")
@js.native
object publicKeyToPem extends js.Object {
  
  def apply(key: PublicKey): PEM = js.native
  def apply(key: PublicKey, maxline: Double): PEM = js.native
}
