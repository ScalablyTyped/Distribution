package typings.nodeDashForge.nodeDashForgeMod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.certificateToPem")
@js.native
object certificateToPem extends js.Object {
  def apply(cert: Certificate): PEM = js.native
  def apply(cert: Certificate, maxline: Double): PEM = js.native
}

