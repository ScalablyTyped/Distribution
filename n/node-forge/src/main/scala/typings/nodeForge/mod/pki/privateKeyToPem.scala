package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.privateKeyToPem")
@js.native
object privateKeyToPem extends js.Object {
  def apply(key: PrivateKey): PEM = js.native
  def apply(key: PrivateKey, maxline: Double): PEM = js.native
}

