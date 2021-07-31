package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Mirror object referencing original JavaScript object.
  */
trait RemoteObject extends StObject {
  
  /**
    * Object class (constructor) name. Specified for <code>object</code> type values only.
    */
  var className: js.UndefOr[String] = js.undefined
  
  /**
    * @experimental
    */
  var customPreview: js.UndefOr[CustomPreview] = js.undefined
  
  /**
    * String representation of the object.
    */
  var description: js.UndefOr[String] = js.undefined
  
  /**
    * Unique object identifier (for non-primitive values).
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * Preview containing abbreviated property values. Specified for <code>object</code> type values only.
    * @experimental
    */
  var preview: js.UndefOr[ObjectPreview] = js.undefined
  
  /**
    * Object subtype hint. Specified for <code>object</code> type values only.
    */
  var subtype: js.UndefOr[String] = js.undefined
  
  /**
    * Object type.
    */
  var `type`: String
  
  /**
    * Primitive value which can not be JSON-stringified does not have <code>value</code>, but gets this property.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  
  /**
    * Remote object value in case of primitive values or JSON values (if it was requested).
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object RemoteObject {
  
  @scala.inline
  def apply(`type`: String): RemoteObject = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[RemoteObject]
  }
  
  @scala.inline
  implicit class RemoteObjectMutableBuilder[Self <: RemoteObject] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setClassName(value: String): Self = StObject.set(x, "className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassNameUndefined: Self = StObject.set(x, "className", js.undefined)
    
    @scala.inline
    def setCustomPreview(value: CustomPreview): Self = StObject.set(x, "customPreview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCustomPreviewUndefined: Self = StObject.set(x, "customPreview", js.undefined)
    
    @scala.inline
    def setDescription(value: String): Self = StObject.set(x, "description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDescriptionUndefined: Self = StObject.set(x, "description", js.undefined)
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
    @scala.inline
    def setPreview(value: ObjectPreview): Self = StObject.set(x, "preview", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPreviewUndefined: Self = StObject.set(x, "preview", js.undefined)
    
    @scala.inline
    def setSubtype(value: String): Self = StObject.set(x, "subtype", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubtypeUndefined: Self = StObject.set(x, "subtype", js.undefined)
    
    @scala.inline
    def setType(value: String): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnserializableValue(value: UnserializableValue): Self = StObject.set(x, "unserializableValue", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setUnserializableValueUndefined: Self = StObject.set(x, "unserializableValue", js.undefined)
    
    @scala.inline
    def setValue(value: js.Any): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
  }
}
