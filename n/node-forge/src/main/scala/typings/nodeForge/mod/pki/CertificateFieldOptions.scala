package typings.nodeForge.mod.pki

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CertificateFieldOptions extends StObject {
  
  var name: js.UndefOr[String] = js.undefined
  
  var shortName: js.UndefOr[String] = js.undefined
  
  var `type`: js.UndefOr[String] = js.undefined
}
object CertificateFieldOptions {
  
  @scala.inline
  def apply(): CertificateFieldOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificateFieldOptions]
  }
  
  @scala.inline
  implicit class CertificateFieldOptionsMutableBuilder[Self <: CertificateFieldOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setShortName(value: String): Self = StObject.set(x, "shortName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setShortNameUndefined: Self = StObject.set(x, "shortName", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
  }
}
