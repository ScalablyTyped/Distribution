package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Description of an isolated world.
  */
trait ExecutionContextDescription extends StObject {
  
  /**
    * Embedder-specific auxiliary data.
    */
  var auxData: js.UndefOr[js.Object] = js.undefined
  
  /**
    * Unique id of the execution context. It can be used to specify in which execution context script evaluation should be performed.
    */
  var id: ExecutionContextId
  
  /**
    * Human readable name describing given context.
    */
  var name: String
  
  /**
    * Execution context origin.
    */
  var origin: String
}
object ExecutionContextDescription {
  
  inline def apply(id: ExecutionContextId, name: String, origin: String): ExecutionContextDescription = {
    val __obj = js.Dynamic.literal(id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExecutionContextDescription]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ExecutionContextDescription] (val x: Self) extends AnyVal {
    
    inline def setAuxData(value: js.Object): Self = StObject.set(x, "auxData", value.asInstanceOf[js.Any])
    
    inline def setAuxDataUndefined: Self = StObject.set(x, "auxData", js.undefined)
    
    inline def setId(value: ExecutionContextId): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
  }
}
