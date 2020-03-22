package typings.minappEnv

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Object extends js.Object {
  /** The initial value of Object.prototype.constructor is the standard built-in Object constructor. */
  var constructor: Function = js.native
  /**
    * Determines whether an object has a property with the specified name.
    * @param v A property name.
    */
  def hasOwnProperty(v: PropertyKey): scala.Boolean = js.native
  /**
    * Determines whether an object exists in another object's prototype chain.
    * @param v Another object whose prototype chain is to be checked.
    */
  def isPrototypeOf(v: Object): scala.Boolean = js.native
  /**
    * Determines whether a specified property is enumerable.
    * @param v A property name.
    */
  def propertyIsEnumerable(v: PropertyKey): scala.Boolean = js.native
}

/**
  * Provides functionality common to all JavaScript objects.
  */
@JSGlobal("Object")
@js.native
object Object extends TopLevel[ObjectConstructor]

