package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait QueryObjectsReturnType extends StObject {
  
  /**
    * Array with objects.
    */
  var objects: RemoteObject
}
object QueryObjectsReturnType {
  
  inline def apply(objects: RemoteObject): QueryObjectsReturnType = {
    val __obj = js.Dynamic.literal(objects = objects.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsReturnType]
  }
  
  extension [Self <: QueryObjectsReturnType](x: Self) {
    
    inline def setObjects(value: RemoteObject): Self = StObject.set(x, "objects", value.asInstanceOf[js.Any])
  }
}
