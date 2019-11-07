package typings.ospec.ospecMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Assertion[T] extends js.Object {
  /** Asserts that two objects are recursively equal */
  def deepEquals(expected: T): AssertionDescriber = js.native
  /** Asserts that two objects are **not** recursively equal */
  def notDeepEquals(value: T): AssertionDescriber = js.native
  /** Asserts that two values are **not** strictly equal */
  def notEquals(value: T): AssertionDescriber = js.native
  /** Asserts that the function does **not** throw an error of given type */
  def notThrows(`this`: Assertion[js.Function0[_]], error: String): AssertionDescriber = js.native
  def notThrows(`this`: Assertion[js.Function0[_]], error: ObjectConstructor): AssertionDescriber = js.native
  /** Asserts that the function throws an error of a given type */
  def throws(`this`: Assertion[js.Function0[_]], error: String): AssertionDescriber = js.native
  def throws(`this`: Assertion[js.Function0[_]], error: ObjectConstructor): AssertionDescriber = js.native
}

