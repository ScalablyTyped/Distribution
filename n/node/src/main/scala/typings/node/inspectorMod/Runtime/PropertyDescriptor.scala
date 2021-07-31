package typings.node.inspectorMod.Runtime

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Object property descriptor.
  */
trait PropertyDescriptor extends StObject {
  
  /**
    * True if the type of this property descriptor may be changed and if the property may be deleted from the corresponding object.
    */
  var configurable: Boolean
  
  /**
    * True if this property shows up during enumeration of the properties on the corresponding object.
    */
  var enumerable: Boolean
  
  /**
    * A function which serves as a getter for the property, or <code>undefined</code> if there is no getter (accessor descriptors only).
    */
  var get: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * True if the property is owned for the object.
    */
  var isOwn: js.UndefOr[Boolean] = js.undefined
  
  /**
    * Property name or symbol description.
    */
  var name: String
  
  /**
    * A function which serves as a setter for the property, or <code>undefined</code> if there is no setter (accessor descriptors only).
    */
  var set: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * Property symbol object, if the property is of the <code>symbol</code> type.
    */
  var symbol: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * The value associated with the property.
    */
  var value: js.UndefOr[RemoteObject] = js.undefined
  
  /**
    * True if the result was thrown during the evaluation.
    */
  var wasThrown: js.UndefOr[Boolean] = js.undefined
  
  /**
    * True if the value associated with the property may be changed (data descriptors only).
    */
  var writable: js.UndefOr[Boolean] = js.undefined
}
object PropertyDescriptor {
  
  @scala.inline
  def apply(configurable: Boolean, enumerable: Boolean, name: String): PropertyDescriptor = {
    val __obj = js.Dynamic.literal(configurable = configurable.asInstanceOf[js.Any], enumerable = enumerable.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[PropertyDescriptor]
  }
  
  @scala.inline
  implicit class PropertyDescriptorMutableBuilder[Self <: PropertyDescriptor] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setConfigurable(value: Boolean): Self = StObject.set(x, "configurable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEnumerable(value: Boolean): Self = StObject.set(x, "enumerable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGet(value: RemoteObject): Self = StObject.set(x, "get", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setGetUndefined: Self = StObject.set(x, "get", js.undefined)
    
    @scala.inline
    def setIsOwn(value: Boolean): Self = StObject.set(x, "isOwn", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsOwnUndefined: Self = StObject.set(x, "isOwn", js.undefined)
    
    @scala.inline
    def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSet(value: RemoteObject): Self = StObject.set(x, "set", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSetUndefined: Self = StObject.set(x, "set", js.undefined)
    
    @scala.inline
    def setSymbol(value: RemoteObject): Self = StObject.set(x, "symbol", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSymbolUndefined: Self = StObject.set(x, "symbol", js.undefined)
    
    @scala.inline
    def setValue(value: RemoteObject): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setValueUndefined: Self = StObject.set(x, "value", js.undefined)
    
    @scala.inline
    def setWasThrown(value: Boolean): Self = StObject.set(x, "wasThrown", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWasThrownUndefined: Self = StObject.set(x, "wasThrown", js.undefined)
    
    @scala.inline
    def setWritable(value: Boolean): Self = StObject.set(x, "writable", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWritableUndefined: Self = StObject.set(x, "writable", js.undefined)
  }
}
