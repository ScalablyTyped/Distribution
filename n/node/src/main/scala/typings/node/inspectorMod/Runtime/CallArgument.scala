package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents function call argument. Either remote object id <code>objectId</code>, primitive <code>value</code>, unserializable primitive value or neither of (for undefined) them should be specified.
  */
trait CallArgument extends StObject {
  
  /**
    * Remote object handle.
    */
  var objectId: js.UndefOr[RemoteObjectId] = js.undefined
  
  /**
    * Primitive value which can not be JSON-stringified.
    */
  var unserializableValue: js.UndefOr[UnserializableValue] = js.undefined
  
  /**
    * Primitive value or serializable javascript object.
    */
  var value: js.UndefOr[js.Any] = js.undefined
}
object CallArgument {
  
  @scala.inline
  def apply(): CallArgument = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CallArgument]
  }
  
  @scala.inline
  implicit class CallArgumentMutableBuilder[Self <: CallArgument] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setObjectId(value: RemoteObjectId): Self = StObject.set(x, "objectId", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setObjectIdUndefined: Self = StObject.set(x, "objectId", js.undefined)
    
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
