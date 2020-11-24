package typings.nodeForge.anon

import typings.nodeForge.mod.pki.CertificateField
import typings.nodeForge.mod.pki.CertificateFieldOptions
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddField extends js.Object {
  
  def addField(attr: CertificateField): Unit = js.native
  
  var attributes: js.Array[_] = js.native
  
  def getField(sn: String): js.Any = js.native
  def getField(sn: CertificateFieldOptions): js.Any = js.native
  
  var hash: js.Any = js.native
}
