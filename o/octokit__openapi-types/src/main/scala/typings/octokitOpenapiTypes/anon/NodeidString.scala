package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait NodeidString extends StObject {
  
  /**
    * @description The ID of the installation.
    * @example 1
    */
  var id: Double
  
  /**
    * @description The global node ID of the installation.
    * @example MDQ6VXNlcjU4MzIzMQ==
    */
  var node_id: String
}
object NodeidString {
  
  inline def apply(id: Double, node_id: String): NodeidString = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], node_id = node_id.asInstanceOf[js.Any])
    __obj.asInstanceOf[NodeidString]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: NodeidString] (val x: Self) extends AnyVal {
    
    inline def setId(value: Double): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setNode_id(value: String): Self = StObject.set(x, "node_id", value.asInstanceOf[js.Any])
  }
}
