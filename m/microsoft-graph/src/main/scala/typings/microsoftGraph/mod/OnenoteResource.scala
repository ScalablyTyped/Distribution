package typings.microsoftGraph.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait OnenoteResource
  extends StObject
     with OnenoteEntityBaseModel {
  
  // The content stream
  var content: js.UndefOr[NullableOption[js.Any]] = js.undefined
  
  // The URL for downloading the content
  var contentUrl: js.UndefOr[NullableOption[String]] = js.undefined
}
object OnenoteResource {
  
  inline def apply(): OnenoteResource = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[OnenoteResource]
  }
  
  extension [Self <: OnenoteResource](x: Self) {
    
    inline def setContent(value: NullableOption[js.Any]): Self = StObject.set(x, "content", value.asInstanceOf[js.Any])
    
    inline def setContentNull: Self = StObject.set(x, "content", null)
    
    inline def setContentUndefined: Self = StObject.set(x, "content", js.undefined)
    
    inline def setContentUrl(value: NullableOption[String]): Self = StObject.set(x, "contentUrl", value.asInstanceOf[js.Any])
    
    inline def setContentUrlNull: Self = StObject.set(x, "contentUrl", null)
    
    inline def setContentUrlUndefined: Self = StObject.set(x, "contentUrl", js.undefined)
  }
}
