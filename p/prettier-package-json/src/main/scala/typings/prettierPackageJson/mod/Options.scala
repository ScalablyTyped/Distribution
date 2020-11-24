package typings.prettierPackageJson.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  var expandUsers: js.UndefOr[Boolean] = js.native
  
  var keyOrder: js.UndefOr[js.Array[String] | CompareFn] = js.native
  
  var tabWidth: js.UndefOr[Double] = js.native
  
  var useTabs: js.UndefOr[Boolean] = js.native
}
object Options {
  
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
    
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
    def setExpandUsers(value: Boolean): Self = this.set("expandUsers", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandUsers: Self = this.set("expandUsers", js.undefined)
    
    @scala.inline
    def setKeyOrderFunction2(value: (/* a */ String, /* b */ String) => Double): Self = this.set("keyOrder", js.Any.fromFunction2(value))
    
    @scala.inline
    def setKeyOrderVarargs(value: String*): Self = this.set("keyOrder", js.Array(value :_*))
    
    @scala.inline
    def setKeyOrder(value: js.Array[String] | CompareFn): Self = this.set("keyOrder", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteKeyOrder: Self = this.set("keyOrder", js.undefined)
    
    @scala.inline
    def setTabWidth(value: Double): Self = this.set("tabWidth", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTabWidth: Self = this.set("tabWidth", js.undefined)
    
    @scala.inline
    def setUseTabs(value: Boolean): Self = this.set("useTabs", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteUseTabs: Self = this.set("useTabs", js.undefined)
  }
}
