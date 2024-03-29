package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotations extends StObject {
  
  /** @description Adds information from your analysis to specific lines of code. Annotations are visible in GitHub's pull request UI. Annotations are visible in GitHub's pull request UI. The Checks API limits the number of annotations to a maximum of 50 per API request. To create more than 50 annotations, you have to make multiple requests to the [Update a check run](https://docs.github.com/rest/reference/checks#update-a-check-run) endpoint. Each time you update the check run, annotations are appended to the list of annotations that already exist for the check run. GitHub Actions are limited to 10 warning annotations and 10 error annotations per step. For details about annotations in the UI, see "[About status checks](https://docs.github.com/articles/about-status-checks#checks)". */
  var annotations: js.UndefOr[js.Array[Annotationlevel]] = js.undefined
  
  /** @description Adds images to the output displayed in the GitHub pull request UI. */
  var images: js.UndefOr[js.Array[Alt]] = js.undefined
  
  /** @description Can contain Markdown. */
  var summary: String
  
  /** @description Can contain Markdown. */
  var text: js.UndefOr[String] = js.undefined
  
  /** @description **Required**. */
  var title: js.UndefOr[String] = js.undefined
}
object Annotations {
  
  inline def apply(summary: String): Annotations = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotations]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotations] (val x: Self) extends AnyVal {
    
    inline def setAnnotations(value: js.Array[Annotationlevel]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    inline def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    inline def setAnnotationsVarargs(value: Annotationlevel*): Self = StObject.set(x, "annotations", js.Array(value*))
    
    inline def setImages(value: js.Array[Alt]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    inline def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    inline def setImagesVarargs(value: Alt*): Self = StObject.set(x, "images", js.Array(value*))
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
