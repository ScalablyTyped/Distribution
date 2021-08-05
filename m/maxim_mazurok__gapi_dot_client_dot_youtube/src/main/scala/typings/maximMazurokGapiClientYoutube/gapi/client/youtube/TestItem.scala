package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TestItem extends StObject {
  
  var gaia: js.UndefOr[String] = js.undefined
  
  var id: js.UndefOr[String] = js.undefined
  
  var snippet: js.UndefOr[js.Any] = js.undefined
}
object TestItem {
  
  inline def apply(): TestItem = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[TestItem]
  }
  
  extension [Self <: TestItem](x: Self) {
    
    inline def setGaia(value: String): Self = StObject.set(x, "gaia", value.asInstanceOf[js.Any])
    
    inline def setGaiaUndefined: Self = StObject.set(x, "gaia", js.undefined)
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
    
    inline def setSnippet(value: js.Any): Self = StObject.set(x, "snippet", value.asInstanceOf[js.Any])
    
    inline def setSnippetUndefined: Self = StObject.set(x, "snippet", js.undefined)
  }
}
