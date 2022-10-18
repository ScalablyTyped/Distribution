package typings.pdfjsDist.typesSrcDisplayApiMod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait StructTreeContent extends StObject {
  
  /**
    * - unique id that will map to the text layer.
    */
  var id: String
  
  /**
    * - either "content" for page and stream structure
    * elements or "object" for object references.
    */
  var `type`: String
}
object StructTreeContent {
  
  inline def apply(id: String, `type`: String): StructTreeContent = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[StructTreeContent]
  }
  
  extension [Self <: StructTreeContent](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
  }
}
