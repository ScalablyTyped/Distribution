package typings.nodeForge.anon

import typings.nodeForge.mod.pki.CertificateField
import typings.nodeForge.mod.pki.CertificateFieldOptions
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait AddField extends StObject {
  
  def addField(attr: CertificateField): Unit = js.native
  
  var attributes: js.Array[CertificateField] = js.native
  
  def getField(sn: String): Any = js.native
  def getField(sn: CertificateFieldOptions): Any = js.native
  
  var hash: Any = js.native
}
