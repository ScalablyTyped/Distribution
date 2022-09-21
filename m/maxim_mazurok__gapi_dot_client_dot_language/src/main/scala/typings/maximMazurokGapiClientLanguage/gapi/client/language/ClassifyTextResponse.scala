package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifyTextResponse extends StObject {
  
  /** Categories representing the input document. */
  var categories: js.UndefOr[js.Array[ClassificationCategory]] = js.undefined
}
object ClassifyTextResponse {
  
  inline def apply(): ClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyTextResponse]
  }
  
  extension [Self <: ClassifyTextResponse](x: Self) {
    
    inline def setCategories(value: js.Array[ClassificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    inline def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    inline def setCategoriesVarargs(value: ClassificationCategory*): Self = StObject.set(x, "categories", js.Array(value*))
  }
}
