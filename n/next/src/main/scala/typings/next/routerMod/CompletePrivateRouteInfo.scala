package typings.next.routerMod

import typings.next.pageLoaderMod.StyleSheetTuple
import typings.react.mod.ComponentType
import typings.std.Error
import typings.std.Record
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CompletePrivateRouteInfo extends PrivateRouteInfo {
  
  var Component: ComponentType[js.Object] = js.native
  
  var __N_SSG: js.UndefOr[Boolean] = js.native
  
  var __N_SSP: js.UndefOr[Boolean] = js.native
  
  var err: js.UndefOr[Error] = js.native
  
  var error: js.UndefOr[js.Any] = js.native
  
  var props: js.UndefOr[Record[String, _]] = js.native
  
  var styleSheets: js.Array[StyleSheetTuple] = js.native
}
object CompletePrivateRouteInfo {
  
  @scala.inline
  def apply(Component: ComponentType[js.Object], styleSheets: js.Array[StyleSheetTuple]): CompletePrivateRouteInfo = {
    val __obj = js.Dynamic.literal(Component = Component.asInstanceOf[js.Any], styleSheets = styleSheets.asInstanceOf[js.Any])
    __obj.asInstanceOf[CompletePrivateRouteInfo]
  }
  
  @scala.inline
  implicit class CompletePrivateRouteInfoOps[Self <: CompletePrivateRouteInfo] (val x: Self) extends AnyVal {
    
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
    def setComponent(value: ComponentType[js.Object]): Self = this.set("Component", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStyleSheetsVarargs(value: StyleSheetTuple*): Self = this.set("styleSheets", js.Array(value :_*))
    
    @scala.inline
    def setStyleSheets(value: js.Array[StyleSheetTuple]): Self = this.set("styleSheets", value.asInstanceOf[js.Any])
    
    @scala.inline
    def set__N_SSG(value: Boolean): Self = this.set("__N_SSG", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__N_SSG: Self = this.set("__N_SSG", js.undefined)
    
    @scala.inline
    def set__N_SSP(value: Boolean): Self = this.set("__N_SSP", value.asInstanceOf[js.Any])
    
    @scala.inline
    def delete__N_SSP: Self = this.set("__N_SSP", js.undefined)
    
    @scala.inline
    def setErr(value: Error): Self = this.set("err", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteErr: Self = this.set("err", js.undefined)
    
    @scala.inline
    def setError(value: js.Any): Self = this.set("error", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteError: Self = this.set("error", js.undefined)
    
    @scala.inline
    def setProps(value: Record[String, _]): Self = this.set("props", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteProps: Self = this.set("props", js.undefined)
  }
}
