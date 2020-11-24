package typings.mkcert.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mkcert", "createCert")
@js.native
object createCert extends js.Object {
  
  def apply(certicateInfo: CertificateInfo): js.Promise[Certificate] = js.native
}
