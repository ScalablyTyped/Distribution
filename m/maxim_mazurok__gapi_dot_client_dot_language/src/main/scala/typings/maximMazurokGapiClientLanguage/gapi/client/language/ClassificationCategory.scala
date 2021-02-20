package typings.maximMazurokGapiClientLanguage.gapi.client.language

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ClassificationCategory extends StObject {
  
  /** The classifier's confidence of the category. Number represents how certain the classifier is that this category represents the given text. */
  var confidence: js.UndefOr[Double] = js.native
  
  /** The name of the category representing the document, from the [predefined taxonomy](https://cloud.google.com/natural-language/docs/categories). */
  var name: js.UndefOr[String] = js.native
}
object ClassificationCategory {
  
  @scala.inline
  def apply(): ClassificationCategory = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[ClassificationCategory]
  }
  
  @scala.inline
  implicit class ClassificationCategoryMutableBuilder[Self <: ClassificationCategory] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfidence(value: Double): Self = StObject.set(x, "confidence", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setConfidenceUndefined: Self = StObject.set(x, "confidence", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
  }
}
