package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OrganizationalBranding
  extends StObject
     with OrganizationalBrandingProperties {
  
  // Add different branding based on a locale.
  var localizations: js.UndefOr[NullableOption[js.Array[OrganizationalBrandingLocalization]]] = js.undefined
}
object OrganizationalBranding {
  
  inline def apply(): OrganizationalBranding = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OrganizationalBranding]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: OrganizationalBranding] (val x: Self) extends AnyVal {
    
    inline def setLocalizations(value: NullableOption[js.Array[OrganizationalBrandingLocalization]]): Self = StObject.set(x, "localizations", value.asInstanceOf[js.Any])
    
    inline def setLocalizationsNull: Self = StObject.set(x, "localizations", null)
    
    inline def setLocalizationsUndefined: Self = StObject.set(x, "localizations", js.undefined)
    
    inline def setLocalizationsVarargs(value: OrganizationalBrandingLocalization*): Self = StObject.set(x, "localizations", js.Array(value*))
  }
}
