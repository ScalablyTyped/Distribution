package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotationscount extends StObject {
  
  var annotations_count: Double
  
  /** Format: uri */
  var annotations_url: String
  
  var summary: String | Null
  
  var text: String | Null
  
  var title: String | Null
}
object Annotationscount {
  
  inline def apply(annotations_count: Double, annotations_url: String): Annotationscount = {
    val __obj = js.Dynamic.literal(annotations_count = annotations_count.asInstanceOf[js.Any], annotations_url = annotations_url.asInstanceOf[js.Any], summary = null, text = null, title = null)
    __obj.asInstanceOf[Annotationscount]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Annotationscount] (val x: Self) extends AnyVal {
    
    inline def setAnnotations_count(value: Double): Self = StObject.set(x, "annotations_count", value.asInstanceOf[js.Any])
    
    inline def setAnnotations_url(value: String): Self = StObject.set(x, "annotations_url", value.asInstanceOf[js.Any])
    
    inline def setSummary(value: String): Self = StObject.set(x, "summary", value.asInstanceOf[js.Any])
    
    inline def setSummaryNull: Self = StObject.set(x, "summary", null)
    
    inline def setText(value: String): Self = StObject.set(x, "text", value.asInstanceOf[js.Any])
    
    inline def setTextNull: Self = StObject.set(x, "text", null)
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
  }
}
