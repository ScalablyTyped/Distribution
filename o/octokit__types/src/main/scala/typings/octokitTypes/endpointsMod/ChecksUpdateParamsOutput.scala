package typings.octokitTypes.endpointsMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait ChecksUpdateParamsOutput extends StObject {
  
  var annotations: js.UndefOr[js.Array[ChecksUpdateParamsOutputAnnotations]] = js.native
  
  var images: js.UndefOr[js.Array[ChecksUpdateParamsOutputImages]] = js.native
  
  var summary: String = js.native
  
  var text: js.UndefOr[String] = js.native
  
  var title: js.UndefOr[String] = js.native
}
object ChecksUpdateParamsOutput {
  
  @scala.inline
  def apply(summary: String): ChecksUpdateParamsOutput = {
    val __obj = js.Dynamic.literal(summary = summary.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutput]
  }
  
  @scala.inline
  implicit class ChecksUpdateParamsOutputMutableBuilder[Self <: ChecksUpdateParamsOutput] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations(value: js.Array[ChecksUpdateParamsOutputAnnotations]): Self = StObject.set(x, "annotations", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotationsUndefined: Self = StObject.set(x, "annotations", js.undefined)
    
    @scala.inline
    def setAnnotationsVarargs(value: ChecksUpdateParamsOutputAnnotations*): Self = StObject.set(x, "annotations", js.Array(value :_*))
    
    @scala.inline
    def setImages(value: js.Array[ChecksUpdateParamsOutputImages]): Self = StObject.set(x, "images", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setImagesUndefined: Self = StObject.set(x, "images", js.undefined)
    
    @scala.inline
    def setImagesVarargs(value: ChecksUpdateParamsOutputImages*): Self = StObject.set(x, "images", js.Array(value :_*))
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTextUndefined: Self = StObject.set(x, "text", js.undefined)
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
