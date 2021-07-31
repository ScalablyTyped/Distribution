package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassifyTextResponse extends StObject {
  
  /** Categories representing the input document. */
  var categories: js.UndefOr[js.Array[ClassificationCategory]] = js.undefined
}
object ClassifyTextResponse {
  
  @scala.inline
  def apply(): ClassifyTextResponse = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassifyTextResponse]
  }
  
  @scala.inline
  implicit class ClassifyTextResponseMutableBuilder[Self <: ClassifyTextResponse] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setCategories(value: js.Array[ClassificationCategory]): Self = StObject.set(x, "categories", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCategoriesUndefined: Self = StObject.set(x, "categories", js.undefined)
    
    @scala.inline
    def setCategoriesVarargs(value: ClassificationCategory*): Self = StObject.set(x, "categories", js.Array(value :_*))
  }
}
