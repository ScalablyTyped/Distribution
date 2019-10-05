package typings.mkcert.mkcertMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mkcert", "createCert")
@js.native
object createCert extends js.Object {
  def apply(certicateInfo: CertificateInfo): js.Promise[Certificate] = js.native
}

