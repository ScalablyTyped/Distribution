package typings.nodeForge.mod.pki

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("node-forge", "pki.certificationRequestToPem")
@js.native
object certificationRequestToPem extends js.Object {
  def apply(cert: Certificate): PEM = js.native
  def apply(cert: Certificate, maxline: Double): PEM = js.native
}

