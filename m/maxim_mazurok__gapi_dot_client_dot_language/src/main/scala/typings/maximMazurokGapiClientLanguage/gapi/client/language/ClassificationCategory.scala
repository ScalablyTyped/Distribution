package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ClassificationCategory extends StObject {
  
  /** The classifier's confidence of the category. Number represents how certain the classifier is that this category represents the given text. */
  var confidence: js.UndefOr[Double] = js.undefined
  
  /** The name of the category representing the document, from the [predefined taxonomy](https://cloud.google.com/natural-language/docs/categories). */
  var name: js.UndefOr[String] = js.undefined
}
object ClassificationCategory {
  
  inline def apply(): ClassificationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationCategory]
  }
  
  extension [Self <: ClassificationCategory](x: Self) {
    
    inline def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    inline def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
