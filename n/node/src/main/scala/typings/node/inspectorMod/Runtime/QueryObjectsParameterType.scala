package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObjectsParameterType extends StObject {
  
  /**
    * Identifier of the prototype to return objects for.
    */
  var prototypeObjectId: RemoteObjectId
}
object QueryObjectsParameterType {
  
  inline def apply(prototypeObjectId: RemoteObjectId): QueryObjectsParameterType = {
    val __obj = js.Dynamic.literal(prototypeObjectId = prototypeObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsParameterType]
  }
  
  extension [Self <: QueryObjectsParameterType](x: Self) {
    
    inline def setPrototypeObjectId(value: RemoteObjectId): Self = StObject.set(x, "prototypeObjectId", value.asInstanceOf[js.Any])
  }
}
