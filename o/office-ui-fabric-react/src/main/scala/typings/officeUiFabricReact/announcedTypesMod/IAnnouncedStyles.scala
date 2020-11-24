package typings.officeUiFabricReact.announcedTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IAnnouncedStyles extends js.Object {
  
  /**
    * Style override for the root element.
    */
  var root: IStyle = js.native
  
  /**
    * Style override for the screen reader text.
    */
  var screenReaderText: IStyle = js.native
}
object IAnnouncedStyles {
  
  @scala.inline
  def apply(): IAnnouncedStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IAnnouncedStyles]
  }
  
  @scala.inline
  implicit class IAnnouncedStylesOps[Self <: IAnnouncedStyles] (val x: Self) extends AnyVal {
    
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
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
    
    @scala.inline
    def setScreenReaderText(value: IStyle): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenReaderText: Self = this.set("screenReaderText", js.undefined)
    
    @scala.inline
    def setScreenReaderTextNull: Self = this.set("screenReaderText", null)
  }
}
