package typings.nextReduxWrapper.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Partial<next-redux-wrapper.next-redux-wrapper.WrapperProps> */
@js.native
trait PartialWrapperProps extends js.Object {
  
  var initialProps: js.UndefOr[js.Any] = js.native
  
  var initialState: js.UndefOr[js.Any] = js.native
  
  var pageProps: js.UndefOr[js.Any] = js.native
}
object PartialWrapperProps {
  
  @scala.inline
  def apply(): PartialWrapperProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PartialWrapperProps]
  }
  
  @scala.inline
  implicit class PartialWrapperPropsOps[Self <: PartialWrapperProps] (val x: Self) extends AnyVal {
    
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
    def deleteInitialProps: Self = this.set("initialProps", js.undefined)
    
    @scala.inline
    def setInitialState(value: js.Any): Self = this.set("initialState", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInitialState: Self = this.set("initialState", js.undefined)
    
    @scala.inline
    def setPageProps(value: js.Any): Self = this.set("pageProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deletePageProps: Self = this.set("pageProps", js.undefined)
  }
}
