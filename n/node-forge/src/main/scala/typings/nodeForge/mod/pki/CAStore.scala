package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CAStore extends StObject {
  
  def addCertificate(cert: String): Unit = js.native
  def addCertificate(cert: Certificate): Unit = js.native
  
  def getBySubject(subject: String): Certificate | Null = js.native
  
  def getIssuer(subject: Certificate): Certificate | Null = js.native
  
  def hasCertificate(cert: String): Boolean = js.native
  def hasCertificate(cert: Certificate): Boolean = js.native
  
  def listAllCertificates(): js.Array[Certificate] = js.native
  
  def removeCertificate(cert: String): Certificate | Null = js.native
  def removeCertificate(cert: Certificate): Certificate | Null = js.native
}
