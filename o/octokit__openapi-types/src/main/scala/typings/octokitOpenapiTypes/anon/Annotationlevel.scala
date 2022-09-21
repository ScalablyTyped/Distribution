package typings.octokitOpenapiTypes.anon

import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.failure
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.notice
import typings.octokitOpenapiTypes.octokitOpenapiTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotationlevel extends StObject {
  
  /**
    * @description The level of the annotation.
    * @enum {string}
    */
  var annotation_level: notice | warning | failure
  
  /** @description The end column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values. */
  var end_column: js.UndefOr[Double] = js.undefined
  
  /** @description The end line of the annotation. */
  var end_line: Double
  
  /** @description A short description of the feedback for these lines of code. The maximum size is 64 KB. */
  var message: String
  
  /** @description The path of the file to add an annotation to. For example, `assets/css/main.css`. */
  var path: String
  
  /** @description Details about this annotation. The maximum size is 64 KB. */
  var raw_details: js.UndefOr[String] = js.undefined
  
  /** @description The start column of the annotation. Annotations only support `start_column` and `end_column` on the same line. Omit this parameter if `start_line` and `end_line` have different values. */
  var start_column: js.UndefOr[Double] = js.undefined
  
  /** @description The start line of the annotation. */
  var start_line: Double
  
  /** @description The title that represents the annotation. The maximum size is 255 characters. */
  var title: js.UndefOr[String] = js.undefined
}
object Annotationlevel {
  
  inline def apply(
    annotation_level: notice | warning | failure,
    end_line: Double,
    message: String,
    path: String,
    start_line: Double
  ): Annotationlevel = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[Annotationlevel]
  }
  
  extension [Self <: Annotationlevel](x: Self) {
    
    inline def setAnnotation_level(value: notice | warning | failure): Self = StObject.set(x, "annotation_level", value.asInstanceOf[js.Any])
    
    inline def setEnd_column(value: Double): Self = StObject.set(x, "end_column", value.asInstanceOf[js.Any])
    
    inline def setEnd_columnUndefined: Self = StObject.set(x, "end_column", js.undefined)
    
    inline def setEnd_line(value: Double): Self = StObject.set(x, "end_line", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRaw_details(value: String): Self = StObject.set(x, "raw_details", value.asInstanceOf[js.Any])
    
    inline def setRaw_detailsUndefined: Self = StObject.set(x, "raw_details", js.undefined)
    
    inline def setStart_column(value: Double): Self = StObject.set(x, "start_column", value.asInstanceOf[js.Any])
    
    inline def setStart_columnUndefined: Self = StObject.set(x, "start_column", js.undefined)
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
  }
}
