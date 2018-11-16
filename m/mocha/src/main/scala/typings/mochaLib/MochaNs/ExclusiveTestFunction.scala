package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ExclusiveTestFunction extends js.Object {
  /**
           * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
           * acting as a thunk. The name of the function is used as the name of the test. Indicates
           * this test should be executed exclusively.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(fn: AsyncFunc): Test = js.native
  /**
           * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
           * acting as a thunk. The name of the function is used as the name of the test. Indicates
           * this test should be executed exclusively.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(fn: Func): Test = js.native
  /**
           * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
           * callback `fn` acting as a thunk. Indicates this test should be executed exclusively.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(title: java.lang.String): Test = js.native
  /**
           * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
           * callback `fn` acting as a thunk. Indicates this test should be executed exclusively.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(title: java.lang.String, fn: AsyncFunc): Test = js.native
  /**
           * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
           * callback `fn` acting as a thunk. Indicates this test should be executed exclusively.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(title: java.lang.String, fn: Func): Test = js.native
}

