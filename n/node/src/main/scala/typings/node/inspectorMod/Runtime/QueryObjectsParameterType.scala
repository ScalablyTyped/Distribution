package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait QueryObjectsParameterType extends StObject {
  
  /**
    * Identifier of the prototype to return objects for.
    */
  var prototypeObjectId: RemoteObjectId = js.native
}
object QueryObjectsParameterType {
  
  @scala.inline
  def apply(prototypeObjectId: RemoteObjectId): QueryObjectsParameterType = {
    val __obj = js.Dynamic.literal(prototypeObjectId = prototypeObjectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[QueryObjectsParameterType]
  }
  
  @scala.inline
  implicit class QueryObjectsParameterTypeMutableBuilder[Self <: QueryObjectsParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setPrototypeObjectId(value: RemoteObjectId): Self = StObject.set(x, "prototypeObjectId", value.asInstanceOf[js.Any])
  }
}
