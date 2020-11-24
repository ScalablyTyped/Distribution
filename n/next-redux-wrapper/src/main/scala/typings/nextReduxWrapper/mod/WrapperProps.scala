package typings.nextReduxWrapper.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait WrapperProps extends js.Object {
  
  var initialProps: js.Any = js.native
  
  var initialState: js.Any = js.native
  
  var pageProps: js.UndefOr[js.Any] = js.native
}
object WrapperProps {
  
  @scala.inline
  def apply(initialProps: js.Any, initialState: js.Any): WrapperProps = {
    val __obj = js.Dynamic.literal(initialProps = initialProps.asInstanceOf[js.Any], initialState = initialState.asInstanceOf[js.Any])
    __obj.asInstanceOf[WrapperProps]
  }
  
  @scala.inline
  implicit class WrapperPropsOps[Self <: WrapperProps] (val x: Self) extends AnyVal {
    
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
    def setInitialProps(value: js.Any): Self = this.set("initialProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setInitialState(value: js.Any): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setPageProps(value: js.Any): Self = this.set("pageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageProps: Self = this.set("pageProps", js.undefined)
  }
}
