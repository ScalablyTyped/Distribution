package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "readCertificateInfo")
@js.native
object readCertificateInfo extends js.Object {
  
  def apply(callback: Callback[CertificateSubjectReadResult]): Unit = js.native
  def apply(certificate: String, callback: Callback[CertificateSubjectReadResult]): Unit = js.native
}
