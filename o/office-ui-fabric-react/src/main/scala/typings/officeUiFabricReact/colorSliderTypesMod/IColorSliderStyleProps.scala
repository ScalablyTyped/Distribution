package typings.officeUiFabricReact.colorSliderTypesMod

import typings.fluentuiTheme.ithemeMod.ITheme
import typings.officeUiFabricReact.officeUiFabricReactStrings.alpha
import typings.officeUiFabricReact.officeUiFabricReactStrings.hue
import typings.officeUiFabricReact.officeUiFabricReactStrings.transparency
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Required<std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'theme'>> & std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/ColorPicker/ColorSlider/ColorSlider.types.IColorSliderProps, 'className' | 'type'> & {  isAlpha :boolean | undefined} */
@js.native
trait IColorSliderStyleProps extends js.Object {
  
  var className: js.UndefOr[String] = js.native
  
  /**
    * @deprecated Use `type`
    */
  var isAlpha: js.UndefOr[Boolean] = js.native
  
  var theme: ITheme = js.native
  
  var `type`: js.UndefOr[hue | alpha | transparency] = js.native
}
object IColorSliderStyleProps {
  
  @scala.inline
  def apply(theme: ITheme): IColorSliderStyleProps = {
    val __obj = js.Dynamic.literal(theme = theme.asInstanceOf[js.Any])
    __obj.asInstanceOf[IColorSliderStyleProps]
  }
  
  @scala.inline
  implicit class IColorSliderStylePropsOps[Self <: IColorSliderStyleProps] (val x: Self) extends AnyVal {
    
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
    def setTheme(value: ITheme): Self = this.set("theme", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setClassName(value: String): Self = this.set("className", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClassName: Self = this.set("className", js.undefined)
    
    @scala.inline
    def setIsAlpha(value: Boolean): Self = this.set("isAlpha", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsAlpha: Self = this.set("isAlpha", js.undefined)
    
    @scala.inline
    def setType(value: hue | alpha | transparency): Self = this.set("type", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
}
