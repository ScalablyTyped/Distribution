package typings.miniprogramWxs

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Object extends StObject {
  
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: Function
  
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): scala.Boolean
  
  /**
    * Determines whether an object exists in another object's prototype chain.
    * @param v Another object whose prototype chain is to be checked.
    */
  def isPrototypeOf(v: Object): scala.Boolean
  
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): scala.Boolean
}
object Object {
  
  inline def apply(
    constructor: Function,
    hasOwnProperty: PropertyKey => scala.Boolean,
    isPrototypeOf: Object => scala.Boolean,
    propertyIsEnumerable: PropertyKey => scala.Boolean
  ): Object = {
    val __obj = js.Dynamic.literal(constructor = constructor.asInstanceOf[js.Any], hasOwnProperty = js.Any.fromFunction1(hasOwnProperty), isPrototypeOf = js.Any.fromFunction1(isPrototypeOf), propertyIsEnumerable = js.Any.fromFunction1(propertyIsEnumerable))
    __obj.asInstanceOf[Object]
  }
  
  extension [Self <: Object](x: Self) {
    
    inline def setConstructor(value: Function): Self = StObject.set(x, "constructor", value.asInstanceOf[js.Any])
    
    inline def setHasOwnProperty(value: PropertyKey => scala.Boolean): Self = StObject.set(x, "hasOwnProperty", js.Any.fromFunction1(value))
    
    inline def setIsPrototypeOf(value: Object => scala.Boolean): Self = StObject.set(x, "isPrototypeOf", js.Any.fromFunction1(value))
    
    inline def setPropertyIsEnumerable(value: PropertyKey => scala.Boolean): Self = StObject.set(x, "propertyIsEnumerable", js.Any.fromFunction1(value))
  }
}
