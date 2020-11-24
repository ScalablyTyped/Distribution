package typings.postcssFlexbugsFixes.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * @default true
    */
  var bug4: js.UndefOr[Boolean] = js.native
  
  /**
    * @default true
    */
  var bug6: js.UndefOr[Boolean] = js.native
  
  /**
    * @default true
    */
  var bug81a: js.UndefOr[Boolean] = js.native
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
    def setBug4(value: Boolean): Self = this.set("bug4", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBug4: Self = this.set("bug4", js.undefined)
    
    @scala.inline
    def setBug6(value: Boolean): Self = this.set("bug6", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBug6: Self = this.set("bug6", js.undefined)
    
    @scala.inline
    def setBug81a(value: Boolean): Self = this.set("bug81a", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBug81a: Self = this.set("bug81a", js.undefined)
  }
}
