package typings.mochaSugarFree.mod

import typings.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typings.mochaSugarFree.mochaSugarFreeBooleans.`true`
import typings.mochaSugarFree.mochaSugarFreeStrings.after
import typings.mochaSugarFree.mochaSugarFreeStrings.afterEach
import typings.mochaSugarFree.mochaSugarFreeStrings.before
import typings.mochaSugarFree.mochaSugarFreeStrings.beforeEach
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait HookContext extends js.Object {
  var hook: before | after | beforeEach | afterEach
  var isHook: `true`
  var isSuite: `false`
  var isTest: `false`
}

object HookContext {
  @scala.inline
  def apply(hook: before | after | beforeEach | afterEach, isHook: `true`, isSuite: `false`, isTest: `false`): HookContext = {
    val __obj = js.Dynamic.literal(hook = hook.asInstanceOf[js.Any], isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[HookContext]
  }
}

