package typings
package mochaLib.MochaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #region Test interface augmentations
@js.native
trait HookFunction extends js.Object {
  /**
           * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
           * function is used as the name of the hook.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(fn: AsyncFunc): scala.Unit = js.native
  /**
           * [bdd, qunit, tdd] Describe a "hook" to execute the given callback `fn`. The name of the
           * function is used as the name of the hook.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(fn: Func): scala.Unit = js.native
  /**
           * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(name: java.lang.String): scala.Unit = js.native
  /**
           * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(name: java.lang.String, fn: AsyncFunc): scala.Unit = js.native
  /**
           * [bdd, qunit, tdd] Describe a "hook" to execute the given `title` and callback `fn`.
           *
           * - _Only available when invoked via the mocha CLI._
           */
  def apply(name: java.lang.String, fn: Func): scala.Unit = js.native
}

