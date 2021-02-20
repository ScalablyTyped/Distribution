package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotationscount extends StObject {
  
  var annotations_count: Double = js.native
  
  var annotations_url: String = js.native
  
  var summary: String = js.native
  
  var text: String = js.native
  
  var title: String = js.native
}
object Annotationscount {
  
  @scala.inline
  def apply(annotations_count: Double, annotations_url: String, summary: String, text: String, title: String): Annotationscount = {
    val __obj = js.Dynamic.literal(annotations_count = annotations_count.asInstanceOf[js.Any], annotations_url = annotations_url.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotationscount]
  }
  
  @scala.inline
  implicit class AnnotationscountMutableBuilder[Self <: Annotationscount] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotations_count(value: Double): Self = StObject.set(x, "annotations_count", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAnnotations_url(value: String): Self = StObject.set(x, "annotations_url", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
