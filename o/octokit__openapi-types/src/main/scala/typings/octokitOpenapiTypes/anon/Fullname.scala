package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Fullname extends StObject {
  
  var full_name: String
  
  /** @description Unique identifier of the repository */
  var id: Double
  
  /** @description The name of the repository. */
  var name: String
  
  var node_id: String
  
  /** @description Whether the repository is private or public. */
  var `private`: Boolean
}
object Fullname {
  
  inline def apply(full_name: String, id: Double, name: String, node_id: String, `private`: Boolean): Fullname = {
    val __obj = js.Dynamic.literal(full_name = full_name.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.updateDynamic("private")(`private`.asInstanceOf[js.Any])
    __obj.asInstanceOf[Fullname]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Fullname] (val x: Self) extends AnyVal {
    
    inline def setFull_name(value: String): Self = StObject.set(x, "full_name", value.asInstanceOf[js.Any])
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
    
    inline def setPrivate(value: Boolean): Self = StObject.set(x, "private", value.asInstanceOf[js.Any])
  }
}
