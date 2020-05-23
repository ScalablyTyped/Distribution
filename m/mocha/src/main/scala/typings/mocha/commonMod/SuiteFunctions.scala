package typings.mocha.commonMod

import typings.mocha.Mocha.Suite
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SuiteFunctions extends js.Object {
  /**
    * Creates a suite.
    */
  def create(opts: CreateOptions): Suite
  /**
    * Create an exclusive Suite; convenience function
    */
  def only(opts: CreateOptions): Suite
  /**
    * Create a Suite, but skip it; convenience function
    */
  def skip(opts: CreateOptions): Suite
}

object SuiteFunctions {
  @scala.inline
  def apply(create: CreateOptions => Suite, only: CreateOptions => Suite, skip: CreateOptions => Suite): SuiteFunctions = {
    val __obj = js.Dynamic.literal(create = js.Any.fromFunction1(create), only = js.Any.fromFunction1(only), skip = js.Any.fromFunction1(skip))
    __obj.asInstanceOf[SuiteFunctions]
  }
}

