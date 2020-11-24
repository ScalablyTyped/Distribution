package typings.nightwatch.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait NightwatchLanguageChains extends js.Object {
  
  var and: Expect = js.native
  
  var at: Expect = js.native
  
  var be: Expect = js.native
  
  var been: Expect = js.native
  
  var has: Expect = js.native
  
  var have: Expect = js.native
  
  var is: Expect = js.native
  
  var of: Expect = js.native
  
  var that: Expect = js.native
  
  var to: Expect = js.native
  
  var which: Expect = js.native
  
  var `with`: Expect = js.native
}
object NightwatchLanguageChains {
  
  @scala.inline
  def apply(
    and: Expect,
    at: Expect,
    be: Expect,
    been: Expect,
    has: Expect,
    have: Expect,
    is: Expect,
    of: Expect,
    that: Expect,
    to: Expect,
    which: Expect,
    `with`: Expect
  ): NightwatchLanguageChains = {
    val __obj = js.Dynamic.literal(and = and.asInstanceOf[js.Any], at = at.asInstanceOf[js.Any], be = be.asInstanceOf[js.Any], been = been.asInstanceOf[js.Any], has = has.asInstanceOf[js.Any], have = have.asInstanceOf[js.Any], is = is.asInstanceOf[js.Any], of = of.asInstanceOf[js.Any], that = that.asInstanceOf[js.Any], to = to.asInstanceOf[js.Any], which = which.asInstanceOf[js.Any])
    __obj.updateDynamic("with")(`with`.asInstanceOf[js.Any])
    __obj.asInstanceOf[NightwatchLanguageChains]
  }
  
  @scala.inline
  implicit class NightwatchLanguageChainsOps[Self <: NightwatchLanguageChains] (val x: Self) extends AnyVal {
    
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
    def setAnd(value: Expect): Self = this.set("and", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setAt(value: Expect): Self = this.set("at", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBe(value: Expect): Self = this.set("be", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setBeen(value: Expect): Self = this.set("been", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHas(value: Expect): Self = this.set("has", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHave(value: Expect): Self = this.set("have", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setIs(value: Expect): Self = this.set("is", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setOf(value: Expect): Self = this.set("of", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setThat(value: Expect): Self = this.set("that", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTo(value: Expect): Self = this.set("to", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWhich(value: Expect): Self = this.set("which", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setWith(value: Expect): Self = this.set("with", value.asInstanceOf[js.Any])
  }
}
