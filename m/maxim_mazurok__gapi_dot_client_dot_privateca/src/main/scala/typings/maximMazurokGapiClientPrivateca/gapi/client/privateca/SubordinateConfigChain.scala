package typings.maximMazurokGapiClientPrivateca.gapi.client.privateca

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SubordinateConfigChain extends StObject {
  
  /** Required. Expected to be in leaf-to-root order according to RFC 5246. */
  var pemCertificates: js.UndefOr[js.Array[String]] = js.undefined
}
object SubordinateConfigChain {
  
  @scala.inline
  def apply(): SubordinateConfigChain = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SubordinateConfigChain]
  }
  
  @scala.inline
  implicit class SubordinateConfigChainMutableBuilder[Self <: SubordinateConfigChain] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPemCertificates(value: js.Array[String]): Self = StObject.set(x, "pemCertificates", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPemCertificatesUndefined: Self = StObject.set(x, "pemCertificates", js.undefined)
    
    @scala.inline
    def setPemCertificatesVarargs(value: String*): Self = StObject.set(x, "pemCertificates", js.Array(value :_*))
  }
}
