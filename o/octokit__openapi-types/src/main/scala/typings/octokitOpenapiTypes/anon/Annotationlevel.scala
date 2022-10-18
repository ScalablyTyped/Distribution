package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Annotationlevel extends StObject {
  
  /** @example warning */
  var annotation_level: String | Null
  
  var blob_href: String
  
  /** @example 10 */
  var end_column: Double | Null
  
  /** @example 2 */
  var end_line: Double
  
  /** @example Check your spelling for 'banaas'. */
  var message: String | Null
  
  /** @example README.md */
  var path: String
  
  /** @example Do you mean 'bananas' or 'banana'? */
  var raw_details: String | Null
  
  /** @example 5 */
  var start_column: Double | Null
  
  /** @example 2 */
  var start_line: Double
  
  /** @example Spell Checker */
  var title: String | Null
}
object Annotationlevel {
  
  inline def apply(blob_href: String, end_line: Double, path: String, start_line: Double): Annotationlevel = {
    val __obj = js.Dynamic.literal(blob_href = blob_href.asInstanceOf[js.Any], end_line = end_line.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any], start_line = start_line.asInstanceOf[js.Any], annotation_level = null, end_column = null, message = null, raw_details = null, start_column = null, title = null)
    __obj.asInstanceOf[Annotationlevel]
  }
  
  extension [Self <: Annotationlevel](x: Self) {
    
    inline def setAnnotation_level(value: String): Self = StObject.set(x, "annotation_level", value.asInstanceOf[js.Any])
    
    inline def setAnnotation_levelNull: Self = StObject.set(x, "annotation_level", null)
    
    inline def setBlob_href(value: String): Self = StObject.set(x, "blob_href", value.asInstanceOf[js.Any])
    
    inline def setEnd_column(value: Double): Self = StObject.set(x, "end_column", value.asInstanceOf[js.Any])
    
    inline def setEnd_columnNull: Self = StObject.set(x, "end_column", null)
    
    inline def setEnd_line(value: Double): Self = StObject.set(x, "end_line", value.asInstanceOf[js.Any])
    
    inline def setMessage(value: String): Self = StObject.set(x, "message", value.asInstanceOf[js.Any])
    
    inline def setMessageNull: Self = StObject.set(x, "message", null)
    
    inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    
    inline def setRaw_details(value: String): Self = StObject.set(x, "raw_details", value.asInstanceOf[js.Any])
    
    inline def setRaw_detailsNull: Self = StObject.set(x, "raw_details", null)
    
    inline def setStart_column(value: Double): Self = StObject.set(x, "start_column", value.asInstanceOf[js.Any])
    
    inline def setStart_columnNull: Self = StObject.set(x, "start_column", null)
    
    inline def setStart_line(value: Double): Self = StObject.set(x, "start_line", value.asInstanceOf[js.Any])
    
    inline def setTitle(value: String): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
    
    inline def setTitleNull: Self = StObject.set(x, "title", null)
  }
}
