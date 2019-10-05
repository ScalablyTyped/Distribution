package typings.pem.pemMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pem", "readCertificateInfo")
@js.native
object readCertificateInfo extends js.Object {
  def apply(callback: Callback[CertificateSubjectReadResult]): Unit = js.native
  def apply(certificate: String, callback: Callback[CertificateSubjectReadResult]): Unit = js.native
}

