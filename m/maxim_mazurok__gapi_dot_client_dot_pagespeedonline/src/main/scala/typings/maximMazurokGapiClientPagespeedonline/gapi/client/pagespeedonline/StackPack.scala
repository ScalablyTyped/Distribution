package typings.maximMazurokGapiClientPagespeedonline.gapi.client.pagespeedonline

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StackPack extends StObject {
  
  /** The stack pack advice strings. */
  var descriptions: js.UndefOr[
    /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
  ] = js.undefined
  
  /** The stack pack icon data uri. */
  var iconDataURL: js.UndefOr[String] = js.undefined
  
  /** The stack pack id. */
  var id: js.UndefOr[String] = js.undefined
  
  /** The stack pack title. */
  var title: js.UndefOr[String] = js.undefined
}
object StackPack {
  
  inline def apply(): StackPack = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[StackPack]
  }
  
  extension [Self <: StackPack](x: Self) {
    
    inline def setDescriptions(
      value: /* import warning: importer.ImportType#apply Failed type conversion: {[ P in string ]: string} */ js.Any
    ): Self = StObject.set(x, "descriptions", value.asInstanceOf[js.Any])
    
    inline def setDescriptionsUndefined: Self = StObject.set(x, "descriptions", js.undefined)
    
    inline def setIconDataURL(value: String): Self = StObject.set(x, "iconDataURL", value.asInstanceOf[js.Any])
    
    inline def setIconDataURLUndefined: Self = StObject.set(x, "iconDataURL", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
