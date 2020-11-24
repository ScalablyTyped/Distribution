package typings.officeUiFabricReact.verticalDividerTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/Divider/VerticalDivider.types.IVerticalDividerProps, 'theme' | 'getClassNames' | 'className'> */
@js.native
trait IVerticalDividerPropsStyles extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  var getClassNames: js.UndefOr[js.Function1[/* theme */ ITheme, IVerticalDividerClassNames]] = js.native
  
  var theme: js.UndefOr[ITheme] = js.native
}
object IVerticalDividerPropsStyles {
  
  @scala.inline
  def apply(): IVerticalDividerPropsStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IVerticalDividerPropsStyles]
  }
  
  @scala.inline
  implicit class IVerticalDividerPropsStylesOps[Self <: IVerticalDividerPropsStyles] (val x: Self) extends AnyVal {
    
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
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setGetClassNames(value: /* theme */ ITheme => IVerticalDividerClassNames): Self = this.set("getClassNames", js.Any.fromFunction1(value))
    
    @scala.inline
    def deleteGetClassNames: Self = this.set("getClassNames", js.undefined)
    
    @scala.inline
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTheme: Self = this.set("theme", js.undefined)
  }
}
