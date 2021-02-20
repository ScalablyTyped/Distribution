package typings.nodeRedRegistry.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Node Instance Definition Object
  */
@js.native
trait NodeDef extends StObject {
  
  var id: String = js.native
  
  var name: String = js.native
  
  var `type`: String = js.native
  
  var z: String = js.native
}
object NodeDef {
  
  @scala.inline
  def apply(id: String, name: String, `type`: String, z: String): NodeDef = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], z = z.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeDef]
  }
  
  @scala.inline
  implicit class NodeDefMutableBuilder[Self <: NodeDef] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setZ(value: String): Self = StObject.set(x, "z", value.asInstanceOf[js.Any])
  }
}
