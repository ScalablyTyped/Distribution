package typings.ospec.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Assertion[T] extends js.Object {
  
  /** Asserts that two objects are recursively equal */
  def deepEquals(expected: T): AssertionDescriber = js.native
  
  /** Asserts that two objects are **not** recursively equal */
  def notDeepEquals(value: T): AssertionDescriber = js.native
  
  /** Asserts that two values are **not** strictly equal */
  def notEquals(value: T): AssertionDescriber = js.native
  
  /** Asserts that the function does **not** throw an error of given type */
  def notThrows(error: String): AssertionDescriber = js.native
  def notThrows(error: ObjectConstructor): AssertionDescriber = js.native
  
  /** Asserts that the function throws an error of a given type */
  def throws(error: String): AssertionDescriber = js.native
  def throws(error: ObjectConstructor): AssertionDescriber = js.native
}
