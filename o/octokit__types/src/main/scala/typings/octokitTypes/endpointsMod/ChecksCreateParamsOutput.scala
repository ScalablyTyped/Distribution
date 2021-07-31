package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksCreateParamsOutput extends StObject {
  
  var annotations: js.UndefOr[js.Array[ChecksCreateParamsOutputAnnotations]] = js.undefined
  
  var images: js.UndefOr[js.Array[ChecksCreateParamsOutputImages]] = js.undefined
  
  var summary: String
  
  var text: js.UndefOr[String] = js.undefined
  
  var title: String
}
object ChecksCreateParamsOutput {
  
  @scala.inline
  def apply(summary: String, title: String): ChecksCreateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksCreateParamsOutput]
  }
  
  @scala.inline
  implicit class ChecksCreateParamsOutputMutableBuilder[Self <: ChecksCreateParamsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Array[ChecksCreateParamsOutputAnnotations]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: ChecksCreateParamsOutputAnnotations*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[ChecksCreateParamsOutputImages]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: ChecksCreateParamsOutputImages*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
