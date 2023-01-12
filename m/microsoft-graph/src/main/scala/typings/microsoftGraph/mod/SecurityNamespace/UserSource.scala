package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait UserSource
  extends StObject
     with DataSource {
  
  // Email address of the user's mailbox.
  var email: js.UndefOr[String] = js.undefined
  
  // Specifies which sources are included in this group. Possible values are: mailbox, site.
  var includedSources: js.UndefOr[NullableOption[SourceType]] = js.undefined
  
  // The URL of the user's OneDrive for Business site. Read-only.
  var siteWebUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object UserSource {
  
  inline def apply(): UserSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[UserSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: UserSource] (val x: Self) extends AnyVal {
    
    inline def setEmail(value: String): Self = StObject.set(x, "email", value.asInstanceOf[js.Any])
    
    inline def setEmailUndefined: Self = StObject.set(x, "email", js.undefined)
    
    inline def setIncludedSources(value: NullableOption[SourceType]): Self = StObject.set(x, "includedSources", value.asInstanceOf[js.Any])
    
    inline def setIncludedSourcesNull: Self = StObject.set(x, "includedSources", null)
    
    inline def setIncludedSourcesUndefined: Self = StObject.set(x, "includedSources", js.undefined)
    
    inline def setSiteWebUrl(value: NullableOption[String]): Self = StObject.set(x, "siteWebUrl", value.asInstanceOf[js.Any])
    
    inline def setSiteWebUrlNull: Self = StObject.set(x, "siteWebUrl", null)
    
    inline def setSiteWebUrlUndefined: Self = StObject.set(x, "siteWebUrl", js.undefined)
  }
}
