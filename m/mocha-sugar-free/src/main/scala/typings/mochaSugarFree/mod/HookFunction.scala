package typings.mochaSugarFree.mod

import typings.mochaSugarFree.anon.OptionsfnHookFunc
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region Test function types
/**
  * [bdd, tdd]
  *
  * Describe a "hook" to execute the given callback `fn`.
  *
  * The name of the function is used as the name of the hook.
  */
@js.native
trait HookFunction extends js.Object {
  def apply(): Unit = js.native
  def apply(fn: HookFunc): Unit = js.native
  def apply(options: OptionsfnHookFunc): Unit = js.native
  def apply(options: OptionsfnHookFunc, fn: HookFunc): Unit = js.native
}

