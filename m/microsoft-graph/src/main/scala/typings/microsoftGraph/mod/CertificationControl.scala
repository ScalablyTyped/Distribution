package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CertificationControl extends StObject {
  
  // Certification control name
  var name: js.UndefOr[NullableOption[String]] = js.native
  
  // URL for the Microsoft Service Trust Portal
  var url: js.UndefOr[NullableOption[String]] = js.native
}
object CertificationControl {
  
  @scala.inline
  def apply(): CertificationControl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CertificationControl]
  }
  
  @scala.inline
  implicit class CertificationControlMutableBuilder[Self <: CertificationControl] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setName(value: NullableOption[String]): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameNull: Self = StObject.set(x, "name", null)
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
    
    @scala.inline
    def setUrl(value: NullableOption[String]): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUrlNull: Self = StObject.set(x, "url", null)
    
    @scala.inline
    def setUrlUndefined: Self = StObject.set(x, "url", js.undefined)
  }
}
