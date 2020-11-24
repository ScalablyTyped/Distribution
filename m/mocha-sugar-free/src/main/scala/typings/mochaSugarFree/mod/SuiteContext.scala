package typings.mochaSugarFree.mod

import typings.mochaSugarFree.mochaSugarFreeBooleans.`false`
import typings.mochaSugarFree.mochaSugarFreeBooleans.`true`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// #endregion
// #region Test context
@js.native
trait SuiteContext extends js.Object {
  
  var isHook: `false` = js.native
  
  var isSuite: `true` = js.native
  
  var isTest: `false` = js.native
}
object SuiteContext {
  
  @scala.inline
  def apply(isHook: `false`, isSuite: `true`, isTest: `false`): SuiteContext = {
    val __obj = js.Dynamic.literal(isHook = isHook.asInstanceOf[js.Any], isSuite = isSuite.asInstanceOf[js.Any], isTest = isTest.asInstanceOf[js.Any])
    __obj.asInstanceOf[SuiteContext]
  }
  
  @scala.inline
  implicit class SuiteContextOps[Self <: SuiteContext] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setIsHook(value: `false`): Self = this.set("isHook", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsSuite(value: `true`): Self = this.set("isSuite", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIsTest(value: `false`): Self = this.set("isTest", value.asInstanceOf[js.Any])
  }
}
