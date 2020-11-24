package typings.page.PageJS

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait Options extends js.Object {
  
  /**
    * bind to click events (default = true)
    */
  var click: Boolean = js.native
  
  /**
    * remove URL encoding frfrom path components
    */
  var decodeURLComponents: Boolean = js.native
  
  /**
    * perform initial dispatch (default = true)
    */
  var dispatch: Boolean = js.native
  
  /**
    * add #!before urls (default = false)
    */
  var hashbang: Boolean = js.native
  
  /**
    * bind to popstate (default = true)
    */
  var popstate: Boolean = js.native
}
object Options {
  
  @scala.inline
  def apply(
    click: Boolean,
    decodeURLComponents: Boolean,
    dispatch: Boolean,
    hashbang: Boolean,
    popstate: Boolean
  ): Options = {
    val __obj = js.Dynamic.literal(click = click.asInstanceOf[js.Any], decodeURLComponents = decodeURLComponents.asInstanceOf[js.Any], dispatch = dispatch.asInstanceOf[js.Any], hashbang = hashbang.asInstanceOf[js.Any], popstate = popstate.asInstanceOf[js.Any])
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
    def setClick(value: Boolean): Self = this.set("click", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDecodeURLComponents(value: Boolean): Self = this.set("decodeURLComponents", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDispatch(value: Boolean): Self = this.set("dispatch", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHashbang(value: Boolean): Self = this.set("hashbang", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPopstate(value: Boolean): Self = this.set("popstate", value.asInstanceOf[js.Any])
  }
}
