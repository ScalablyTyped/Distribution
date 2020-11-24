package typings.navigationReact.mod

import typings.navigation.mod.FluentNavigator
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait FluentLinkProps extends LinkProps {
  
  /**
    * The function that fluently navigates to a State
    */
  def navigate(fluentNavigator: FluentNavigator): FluentNavigator = js.native
  
  /**
    * Indicates whether to inherit the current context
    */
  var withContext: js.UndefOr[Boolean] = js.native
}
object FluentLinkProps {
  
  @scala.inline
  def apply(navigate: FluentNavigator => FluentNavigator): FluentLinkProps = {
    val __obj = js.Dynamic.literal(navigate = js.Any.fromFunction1(navigate))
    __obj.asInstanceOf[FluentLinkProps]
  }
  
  @scala.inline
  implicit class FluentLinkPropsOps[Self <: FluentLinkProps] (val x: Self) extends AnyVal {
    
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
    def setNavigate(value: FluentNavigator => FluentNavigator): Self = this.set("navigate", js.Any.fromFunction1(value))
    
    @scala.inline
    def setWithContext(value: Boolean): Self = this.set("withContext", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteWithContext: Self = this.set("withContext", js.undefined)
  }
}
