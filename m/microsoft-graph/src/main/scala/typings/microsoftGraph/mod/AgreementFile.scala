package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AgreementFile
  extends StObject
     with AgreementFileProperties {
  
  // The localized version of the terms of use agreement files attached to the agreement.
  var localizations: js.UndefOr[NullableOption[js.Array[AgreementFileLocalization]]] = js.undefined
}
object AgreementFile {
  
  inline def apply(): AgreementFile = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AgreementFile]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: AgreementFile] (val x: Self) extends AnyVal {
    
    inline def setLocalizations(value: NullableOption[js.Array[AgreementFileLocalization]]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsNull: Self = StObject.set(x, "localizations", null)
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setLocalizationsVarargs(value: AgreementFileLocalization*): Self = StObject.set(x, "localizations", js.Array(value*))
  }
}
