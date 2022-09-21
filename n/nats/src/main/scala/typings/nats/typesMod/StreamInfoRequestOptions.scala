package typings.nats.typesMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StreamInfoRequestOptions extends StObject {
  
  var deleted_details: Boolean
  
  var subjects_filter: String
}
object StreamInfoRequestOptions {
  
  inline def apply(deleted_details: Boolean, subjects_filter: String): StreamInfoRequestOptions = {
    val __obj = js.Dynamic.literal(deleted_details = deleted_details.asInstanceOf[js.Any], subjects_filter = subjects_filter.asInstanceOf[js.Any])
    __obj.asInstanceOf[StreamInfoRequestOptions]
  }
  
  extension [Self <: StreamInfoRequestOptions](x: Self) {
    
    inline def setDeleted_details(value: Boolean): Self = StObject.set(x, "deleted_details", value.asInstanceOf[js.Any])
    
    inline def setSubjects_filter(value: String): Self = StObject.set(x, "subjects_filter", value.asInstanceOf[js.Any])
  }
}
