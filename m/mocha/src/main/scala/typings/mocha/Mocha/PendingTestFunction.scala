package typings.mocha.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait PendingTestFunction extends js.Object {
  
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: AsyncFunc): Test = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given callback `fn`
    * acting as a thunk. The name of the function is used as the name of the test. Indicates
    * this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: Func): Test = js.native
  /**
    * [bdd, tdd, qunit] Describe a specification or test-case with the given `title` and
    * callback `fn` acting as a thunk. Indicates this test should not be executed.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(title: String): Test = js.native
  def apply(title: String, fn: AsyncFunc): Test = js.native
  def apply(title: String, fn: Func): Test = js.native
}
