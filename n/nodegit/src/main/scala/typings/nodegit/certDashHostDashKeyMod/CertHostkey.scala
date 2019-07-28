package typings.nodegit.certDashHostDashKeyMod

import typings.nodegit.certMod.Cert
import typings.nodegit.certMod.CertNs.TYPE
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("nodegit/cert-host-key", "CertHostkey")
@js.native
class CertHostkey () extends js.Object {
  var hashMd5: String = js.native
  var hashSha1: String = js.native
  var parent: Cert = js.native
  var `type`: TYPE = js.native
}

