package typings.officeUiFabricReact.baseButtonClassNamesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IButtonClassNames extends js.Object {
  
  var description: js.UndefOr[String] = js.native
  
  var flexContainer: js.UndefOr[String] = js.native
  
  var icon: js.UndefOr[String] = js.native
  
  var label: js.UndefOr[String] = js.native
  
  var menuIcon: js.UndefOr[String] = js.native
  
  var root: js.UndefOr[String] = js.native
  
  var screenReaderText: js.UndefOr[String] = js.native
  
  var textContainer: js.UndefOr[String] = js.native
}
object IButtonClassNames {
  
  @scala.inline
  def apply(): IButtonClassNames = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IButtonClassNames]
  }
  
  @scala.inline
  implicit class IButtonClassNamesOps[Self <: IButtonClassNames] (val x: Self) extends AnyVal {
    
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
    def setDescription(value: String): Self = this.set("description", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDescription: Self = this.set("description", js.undefined)
    
    @scala.inline
    def setFlexContainer(value: String): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    
    @scala.inline
    def setIcon(value: String): Self = this.set("icon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIcon: Self = this.set("icon", js.undefined)
    
    @scala.inline
    def setLabel(value: String): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setMenuIcon(value: String): Self = this.set("menuIcon", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMenuIcon: Self = this.set("menuIcon", js.undefined)
    
    @scala.inline
    def setRoot(value: String): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setScreenReaderText(value: String): Self = this.set("screenReaderText", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteScreenReaderText: Self = this.set("screenReaderText", js.undefined)
    
    @scala.inline
    def setTextContainer(value: String): Self = this.set("textContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteTextContainer: Self = this.set("textContainer", js.undefined)
  }
}
