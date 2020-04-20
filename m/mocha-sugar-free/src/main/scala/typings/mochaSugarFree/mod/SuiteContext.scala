package typings.mochaSugarFree.mod

import typings.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typings.mochaSugarFree.mochaSugarFreeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// #endregion
// #region Test context
trait SuiteContext extends js.Object {
  var isHook: `false`
  var isSuite: `true`
  var isTest: `false`
}

object SuiteContext {
  @scala.inline
  def apply(isHook: `false`, isSuite: `true`, isTest: `false`): SuiteContext = {
    val __obj = js.Dynamic.literal(isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteContext]
  }
}

