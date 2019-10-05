package typings.nodeDashForge.nodeDashForgeMod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.publicKeyToPem")
@js.native
object publicKeyToPem extends js.Object {
  def apply(key: PublicKey): PEM = js.native
  def apply(key: PublicKey, maxline: Double): PEM = js.native
}

