package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgreementFileLocalization
  extends StObject
     with AgreementFileProperties {
  
  // Read-only. Customized versions of the terms of use agreement in the Azure AD tenant.
  var versions: js.UndefOr[NullableOption[js.Array[AgreementFileVersion]]] = js.undefined
}
object AgreementFileLocalization {
  
  inline def apply(): AgreementFileLocalization = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgreementFileLocalization]
  }
  
  extension [Self <: AgreementFileLocalization](x: Self) {
    
    inline def setVersions(value: NullableOption[js.Array[AgreementFileVersion]]): Self = StObject.set(x, "versions", value.asInstanceOf[js.Any])
    
    inline def setVersionsNull: Self = StObject.set(x, "versions", null)
    
    inline def setVersionsUndefined: Self = StObject.set(x, "versions", js.undefined)
    
    inline def setVersionsVarargs(value: AgreementFileVersion*): Self = StObject.set(x, "versions", js.Array(value*))
  }
}
