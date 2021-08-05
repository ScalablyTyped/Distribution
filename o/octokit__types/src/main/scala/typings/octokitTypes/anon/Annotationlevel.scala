package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotationlevel extends StObject {
  
  var annotation_level: String
  
  var end_column: Double
  
  var end_line: Double
  
  var message: String
  
  var path: String
  
  var raw_details: String
  
  var start_column: Double
  
  var start_line: Double
  
  var title: String
}
object Annotationlevel {
  
  inline def apply(
    annotation_level: String,
    end_column: Double,
    end_line: Double,
    message: String,
    path: String,
    raw_details: String,
    start_column: Double,
    start_line: Double,
    title: String
  ): Annotationlevel = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_column = end_column.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], raw_details = raw_details.asInstanceOf[js.Any], start_column = start_column.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], title = title.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotationlevel]
  }
  
  extension [Self <: Annotationlevel](x: Self) {
    
    inline def setAnnotation_level(value: String): Self = StObject.set(x, "annotation_level", value.asInstanceOf[js.Any])
    
    inline def setEnd_column(value: Double): Self = StObject.set(x, "end_column", value.asInstanceOf[js.Any])
    
    inline def setEnd_line(value: Double): Self = StObject.set(x, "end_line", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRaw_details(value: String): Self = StObject.set(x, "raw_details", value.asInstanceOf[js.Any])
    
    inline def setStart_column(value: Double): Self = StObject.set(x, "start_column", value.asInstanceOf[js.Any])
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
