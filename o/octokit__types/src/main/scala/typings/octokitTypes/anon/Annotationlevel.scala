package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Annotationlevel extends StObject {
  
  var annotation_level: String = js.native
  
  var end_column: Double = js.native
  
  var end_line: Double = js.native
  
  var message: String = js.native
  
  var path: String = js.native
  
  var raw_details: String = js.native
  
  var start_column: Double = js.native
  
  var start_line: Double = js.native
  
  var title: String = js.native
}
object Annotationlevel {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class AnnotationlevelMutableBuilder[Self <: Annotationlevel] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnnotation_level(value: String): Self = StObject.set(x, "annotation_level", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_column(value: Double): Self = StObject.set(x, "end_column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnd_line(value: Double): Self = StObject.set(x, "end_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRaw_details(value: String): Self = StObject.set(x, "raw_details", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_column(value: Double): Self = StObject.set(x, "start_column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
  }
}
