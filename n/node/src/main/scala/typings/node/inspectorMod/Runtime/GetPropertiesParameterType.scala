package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait GetPropertiesParameterType extends StObject {
  
  /**
    * If true, returns accessor properties (with getter/setter) only; internal properties are not returned either.
    * @experimental
    */
  var accessorPropertiesOnly: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Whether preview should be generated for the results.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Identifier of the object to return properties for.
    */
  var objectId: RemoteObjectId
  
  /**
    * If true, returns properties belonging only to the element itself, not to its prototype chain.
    */
  var ownProperties: js.UndefOr[Boolean] = js.undefined
}
object GetPropertiesParameterType {
  
  inline def apply(objectId: RemoteObjectId): GetPropertiesParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesParameterType]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: GetPropertiesParameterType] (val x: Self) extends AnyVal {
    
    inline def setAccessorPropertiesOnly(value: Boolean): Self = StObject.set(x, "accessorPropertiesOnly", value.asInstanceOf[js.Any])
    
    inline def setAccessorPropertiesOnlyUndefined: Self = StObject.set(x, "accessorPropertiesOnly", js.undefined)
    
    inline def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    inline def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    inline def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    inline def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
    
    inline def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
  }
}
