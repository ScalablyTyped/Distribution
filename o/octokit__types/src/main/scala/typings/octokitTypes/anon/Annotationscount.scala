package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotationscount extends StObject {
  
  var annotations_count: Double
  
  var annotations_url: String
  
  var summary: String
  
  var text: String
  
  var title: String
}
object Annotationscount {
  
  inline def apply(annotations_count: Double, annotations_url: String, summary: String, text: String, title: String): Annotationscount = {
    val __obj = js.Dynamic.literal(annotations_count = annotations_count.asInstanceOf[js.Any], annotations_url = annotations_url.asInstanceOf[js.Any], summary = summary.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotationscount]
  }
  
  extension [Self <: Annotationscount](x: Self) {
    
    inline def setAnnotations_count(value: Double): Self = StObject.set(x, "annotations_count", value.asInstanceOf[js.Any])
    
    inline def setAnnotations_url(value: String): Self = StObject.set(x, "annotations_url", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
