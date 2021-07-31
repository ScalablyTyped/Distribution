package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "CertificateList")
@js.native
class CertificateList protected () extends PropertyList[Certificate] {
  def this(parent: js.Any, list: js.Array[CertificateDefinition]) = this()
  
  def resolveOne(url: String): CertificateDefinition = js.native
}
/* static members */
object CertificateList {
  
  @JSImport("postman-collection", "CertificateList")
  @js.native
  val ^ : js.Any = js.native
  
  @scala.inline
  def isCertificateList(obj: js.Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCertificateList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
