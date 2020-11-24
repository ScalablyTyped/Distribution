package typings.pem.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pem", "createCertificate")
@js.native
object createCertificate extends js.Object {
  
  def apply(callback: Callback[CertificateCreationResult]): Unit = js.native
  def apply(options: CertificateCreationOptions, callback: Callback[CertificateCreationResult]): Unit = js.native
}
