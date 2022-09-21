package typings.pdfjsDist.apiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait TextMarkedContent extends StObject {
  
  /**
    * - The marked content identifier. Only used for type
    * 'beginMarkedContentProps'.
    */
  var id: String
  
  /**
    * - Either 'beginMarkedContent',
    * 'beginMarkedContentProps', or 'endMarkedContent'.
    */
  var `type`: String
}
object TextMarkedContent {
  
  inline def apply(id: String, `type`: String): TextMarkedContent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[TextMarkedContent]
  }
  
  extension [Self <: TextMarkedContent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
