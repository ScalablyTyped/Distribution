package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ReleaseObjectParameterType extends StObject {
  
  /**
    * Identifier of the object to release.
    */
  var objectId: RemoteObjectId
}
object ReleaseObjectParameterType {
  
  inline def apply(objectId: RemoteObjectId): ReleaseObjectParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[ReleaseObjectParameterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ReleaseObjectParameterType] (val x: Self) extends AnyVal {
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
  }
}
