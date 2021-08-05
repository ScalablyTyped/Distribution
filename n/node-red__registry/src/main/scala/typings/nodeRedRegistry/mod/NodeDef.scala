package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Instance Definition Object
  */
trait NodeDef extends StObject {
  
  var id: String
  
  var name: String
  
  var `type`: String
  
  var z: String
}
object NodeDef {
  
  inline def apply(id: String, name: String, `type`: String, z: String): NodeDef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDef]
  }
  
  extension [Self <: NodeDef](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    inline def setZ(value: String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
