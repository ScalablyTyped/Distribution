package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait GetPropertiesParameterType extends StObject {
  
  /**
    * If true, returns accessor properties (with getter/setter) only; internal properties are not returned either.
    * @experimental
    */
  var accessorPropertiesOnly: js.UndefOr[Boolean] = js.native
  
  /**
    * Whether preview should be generated for the results.
    * @experimental
    */
  var generatePreview: js.UndefOr[Boolean] = js.native
  
  /**
    * Identifier of the object to return properties for.
    */
  var objectId: RemoteObjectId = js.native
  
  /**
    * If true, returns properties belonging only to the element itself, not to its prototype chain.
    */
  var ownProperties: js.UndefOr[Boolean] = js.native
}
object GetPropertiesParameterType {
  
  @scala.inline
  def apply(objectId: RemoteObjectId): GetPropertiesParameterType = {
    val __obj = js.Dynamic.literal(objectId = objectId.asInstanceOf[js.Any])
    __obj.asInstanceOf[GetPropertiesParameterType]
  }
  
  @scala.inline
  implicit class GetPropertiesParameterTypeMutableBuilder[Self <: GetPropertiesParameterType] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAccessorPropertiesOnly(value: Boolean): Self = StObject.set(x, "accessorPropertiesOnly", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAccessorPropertiesOnlyUndefined: Self = StObject.set(x, "accessorPropertiesOnly", js.undefined)
    
    @scala.inline
    def setGeneratePreview(value: Boolean): Self = StObject.set(x, "generatePreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGeneratePreviewUndefined: Self = StObject.set(x, "generatePreview", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnProperties(value: Boolean): Self = StObject.set(x, "ownProperties", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOwnPropertiesUndefined: Self = StObject.set(x, "ownProperties", js.undefined)
  }
}
