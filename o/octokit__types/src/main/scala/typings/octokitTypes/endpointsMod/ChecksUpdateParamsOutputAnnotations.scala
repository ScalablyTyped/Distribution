package typings.octokitTypes.endpointsMod

import typings.octokitTypes.octokitTypesStrings.failure
import typings.octokitTypes.octokitTypesStrings.notice
import typings.octokitTypes.octokitTypesStrings.warning
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ChecksUpdateParamsOutputAnnotations extends StObject {
  
  var annotation_level: notice | warning | failure
  
  var end_column: js.UndefOr[Double] = js.undefined
  
  var end_line: Double
  
  var message: String
  
  var path: String
  
  var raw_details: js.UndefOr[String] = js.undefined
  
  var start_column: js.UndefOr[Double] = js.undefined
  
  var start_line: Double
  
  var title: js.UndefOr[String] = js.undefined
}
object ChecksUpdateParamsOutputAnnotations {
  
  inline def apply(
    annotation_level: notice | warning | failure,
    end_line: Double,
    message: String,
    path: String,
    start_line: Double
  ): ChecksUpdateParamsOutputAnnotations = {
    val __obj = js.Dynamic.literal(annotation_level = annotation_level.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], message = message.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any])
    __obj.asInstanceOf[ChecksUpdateParamsOutputAnnotations]
  }
  
  extension [Self <: ChecksUpdateParamsOutputAnnotations](x: Self) {
    
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
