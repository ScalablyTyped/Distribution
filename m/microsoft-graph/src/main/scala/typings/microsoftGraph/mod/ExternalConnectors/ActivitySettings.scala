package typings.microsoftGraph.mod.ExternalConnectors

import typings.microsoftGraph.mod.NullableOption
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ActivitySettings extends StObject {
  
  // Specifies configurations to identify an externalItem based on a shared URL.
  var urlToItemResolvers: js.UndefOr[NullableOption[js.Array[UrlToItemResolverBase]]] = js.undefined
}
object ActivitySettings {
  
  inline def apply(): ActivitySettings = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ActivitySettings]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ActivitySettings] (val x: Self) extends AnyVal {
    
    inline def setUrlToItemResolvers(value: NullableOption[js.Array[UrlToItemResolverBase]]): Self = StObject.set(x, "urlToItemResolvers", value.asInstanceOf[js.Any])
    
    inline def setUrlToItemResolversNull: Self = StObject.set(x, "urlToItemResolvers", null)
    
    inline def setUrlToItemResolversUndefined: Self = StObject.set(x, "urlToItemResolvers", js.undefined)
    
    inline def setUrlToItemResolversVarargs(value: UrlToItemResolverBase*): Self = StObject.set(x, "urlToItemResolvers", js.Array(value*))
  }
}
