package typings.postmanCollection.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("postman-collection", "CertificateList")
@js.native
open class CertificateList protected () extends PropertyList[Certificate] {
  def this(parent: Any, list: js.Array[CertificateDefinition]) = this()
  
  def resolveOne(url: String): CertificateDefinition = js.native
}
/* static members */
object CertificateList {
  
  @JSImport("postman-collection", "CertificateList")
  @js.native
  val ^ : js.Any = js.native
  
  inline def isCertificateList(obj: Any): Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isCertificateList")(obj.asInstanceOf[js.Any]).asInstanceOf[Boolean]
}
