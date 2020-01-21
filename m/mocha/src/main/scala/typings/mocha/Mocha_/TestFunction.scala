package typings.mocha.Mocha_

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait TestFunction extends js.Object {
  /**
    * Indicates this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("only")
  var only_Original: ExclusiveTestFunction = js.native
  /**
    * Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  @JSName("skip")
  var skip_Original: PendingTestFunction = js.native
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: AsyncFunc): Test_ = js.native
  /**
    * Describe a specification or test-case with the given callback `fn` acting as a thunk.
    * The name of the function is used as the name of the test.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: Func): Test_ = js.native
  /**
    * Describe a specification or test-case with the given `title` and callback `fn` acting
    * as a thunk.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(title: String): Test_ = js.native
  def apply(title: String, fn: AsyncFunc): Test_ = js.native
  def apply(title: String, fn: Func): Test_ = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Indicates this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def only(fn: AsyncFunc): Test_ = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Indicates this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def only(fn: Func): Test_ = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
    * callback `fn` acting as a thunk. Indicates this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Indicates this test should be executed exclusively.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def only(title: String): Test_ = js.native
  def only(title: String, fn: AsyncFunc): Test_ = js.native
  def only(title: String, fn: Func): Test_ = js.native
  /**
    * Number of attempts to retry.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def retries(n: Double): Unit = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def skip(fn: AsyncFunc): Test_ = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def skip(fn: Func): Test_ = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
    * callback `fn` acting as a thunk. Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  /**
    * Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def skip(title: String): Test_ = js.native
  def skip(title: String, fn: AsyncFunc): Test_ = js.native
  def skip(title: String, fn: Func): Test_ = js.native
}

