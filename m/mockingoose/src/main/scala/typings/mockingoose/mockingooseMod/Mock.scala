package typings.mockingoose.mockingooseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Mock extends js.Object {
  /**
    * Reset all mocks
    * @param op Optional parameter to reset, if not specified, resets everything
    */
  def reset(): this.type = js.native
  def reset(op: Ops): this.type = js.native
  /**
    * Returns an object of mocks for this model. Only serializable if all mock results are primitives, not functions.
    */
  def toJSON(): js.Any = js.native
  /**
    * Specify an expected result for a specific mongoose function. This can be a primitive value or a function.
    * If used with a function, you will have access to the Query or Aggregate mongoose class.
    * @param expected Primitive value or function that returns the mocked value
    * @param op The operation to mock
    */
  def toReturn(expected: ExpectedReturnType): this.type = js.native
  def toReturn(expected: ExpectedReturnType, op: Ops): this.type = js.native
  def toReturn(expected: ReturnFunction): this.type = js.native
  def toReturn(expected: ReturnFunction, op: Ops): this.type = js.native
}

