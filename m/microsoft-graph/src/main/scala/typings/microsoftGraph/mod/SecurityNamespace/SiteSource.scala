package typings.microsoftGraph.mod.SecurityNamespace

import typings.microsoftGraph.mod.Site
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SiteSource
  extends StObject
     with DataSource {
  
  // The SharePoint site associated with the siteSource.
  var site: js.UndefOr[Site] = js.undefined
}
object SiteSource {
  
  inline def apply(): SiteSource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SiteSource]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SiteSource] (val x: Self) extends AnyVal {
    
    inline def setSite(value: Site): Self = StObject.set(x, "site", value.asInstanceOf[js.Any])
    
    inline def setSiteUndefined: Self = StObject.set(x, "site", js.undefined)
  }
}
