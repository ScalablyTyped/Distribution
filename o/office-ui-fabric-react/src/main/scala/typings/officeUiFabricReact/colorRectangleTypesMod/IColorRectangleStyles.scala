package typings.officeUiFabricReact.colorRectangleTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IColorRectangleStyles extends js.Object {
  
  /**
    * Style set for the dark-colored rectangle.
    */
  var dark: js.UndefOr[IStyle] = js.native
  
  /**
    * Style for a hidden detailed description for screen reader users.
    */
  var description: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the light-colored rectangle.
    */
  var light: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the root element.
    */
  var root: js.UndefOr[IStyle] = js.native
  
  /**
    * Style set for the draggable thumb element.
    */
  var thumb: js.UndefOr[IStyle] = js.native
}
object IColorRectangleStyles {
  
  @scala.inline
  def apply(): IColorRectangleStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IColorRectangleStyles]
  }
  
  @scala.inline
  implicit class IColorRectangleStylesOps[Self <: IColorRectangleStyles] (val x: Self) extends AnyVal {
    
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
    def setDark(value: IStyle): Self = this.set("dark", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDark: Self = this.set("dark", js.undefined)
    
    @scala.inline
    def setDarkNull: Self = this.set("dark", null)
    
    @scala.inline
    def setDescription(value: IStyle): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setDescriptionNull: Self = this.set("description", null)
    
    @scala.inline
    def setLight(value: IStyle): Self = this.set("light", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLight: Self = this.set("light", js.undefined)
    
    @scala.inline
    def setLightNull: Self = this.set("light", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setThumb(value: IStyle): Self = this.set("thumb", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteThumb: Self = this.set("thumb", js.undefined)
    
    @scala.inline
    def setThumbNull: Self = this.set("thumb", null)
  }
}
