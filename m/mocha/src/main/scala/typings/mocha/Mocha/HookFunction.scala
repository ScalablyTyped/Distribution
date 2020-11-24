package typings.mocha.Mocha

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #region Test interface augmentations
@js.native
trait HookFunction extends js.Object {
  
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: AsyncFunc): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
    * function is used as the name of the hook.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(fn: Func): Unit = js.native
  /**
    * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
    *
    * - _Only available when invoked via the mocha CLI._
    */
  def apply(name: String): Unit = js.native
  def apply(name: String, fn: AsyncFunc): Unit = js.native
  def apply(name: String, fn: Func): Unit = js.native
}
