package typings
package pDashEventLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Object extends js.Object {
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
  @scala.inline
  def apply(
    constructor: Function,
    hasOwnProperty: js.Function1[PropertyKey, scala.Boolean],
    isPrototypeOf: js.Function1[Object, scala.Boolean],
    propertyIsEnumerable: js.Function1[PropertyKey, scala.Boolean],
    toLocaleString: js.Function0[java.lang.String],
    toString: js.Function0[java.lang.String],
    valueOf: js.Function0[Object]
  ): Object = {
    val __obj = js.Dynamic.literal(constructor = constructor, hasOwnProperty = hasOwnProperty, isPrototypeOf = isPrototypeOf, propertyIsEnumerable = propertyIsEnumerable, toLocaleString = toLocaleString, toString = toString, valueOf = valueOf)
  
    __obj.asInstanceOf[Object]
  }
}

