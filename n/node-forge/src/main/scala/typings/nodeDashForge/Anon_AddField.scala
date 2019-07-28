package typings.nodeDashForge

import typings.nodeDashForge.nodeDashForgeMod.pkiNs.CertificateField
import typings.nodeDashForge.nodeDashForgeMod.pkiNs.CertificateFieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_AddField extends js.Object {
  var attributes: js.Array[_] = js.native
  var hash: js.Any = js.native
  def addField(attr: CertificateField): Unit = js.native
  def getField(sn: String): js.Any = js.native
  def getField(sn: CertificateFieldOptions): js.Any = js.native
}

