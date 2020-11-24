package typings.monacoEditor.mod.editor

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDecorationOptions extends js.Object {
  
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var color: js.UndefOr[String | ThemeColor] = js.native
  
  /**
    * CSS color to render.
    * e.g.: rgba(100, 100, 100, 0.5) or a color from the color registry
    */
  var darkColor: js.UndefOr[String | ThemeColor] = js.native
}
object IDecorationOptions {
  
  @scala.inline
  def apply(): IDecorationOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDecorationOptions]
  }
  
  @scala.inline
  implicit class IDecorationOptionsOps[Self <: IDecorationOptions] (val x: Self) extends AnyVal {
    
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
    def setColor(value: String | ThemeColor): Self = this.set("color", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteColor: Self = this.set("color", js.undefined)
    
    @scala.inline
    def setDarkColor(value: String | ThemeColor): Self = this.set("darkColor", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDarkColor: Self = this.set("darkColor", js.undefined)
  }
}
