package typings.officeUiFabricReact.choiceGroupTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IChoiceGroupStyles extends js.Object {
  
  /**
    * The actual root of the component.
    * @deprecated Styles will be merged with `root` in a future release.
    */
  var applicationRole: js.UndefOr[IStyle] = js.native
  
  var flexContainer: js.UndefOr[IStyle] = js.native
  
  var label: js.UndefOr[IStyle] = js.native
  
  /**
    * Not currently the actual root of the component (will be fixed in a future release).
    * For now, to style the actual root, use `applicationRole`.
    */
  var root: js.UndefOr[IStyle] = js.native
}
object IChoiceGroupStyles {
  
  @scala.inline
  def apply(): IChoiceGroupStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IChoiceGroupStyles]
  }
  
  @scala.inline
  implicit class IChoiceGroupStylesOps[Self <: IChoiceGroupStyles] (val x: Self) extends AnyVal {
    
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
    def setApplicationRole(value: IStyle): Self = this.set("applicationRole", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteApplicationRole: Self = this.set("applicationRole", js.undefined)
    
    @scala.inline
    def setApplicationRoleNull: Self = this.set("applicationRole", null)
    
    @scala.inline
    def setFlexContainer(value: IStyle): Self = this.set("flexContainer", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteFlexContainer: Self = this.set("flexContainer", js.undefined)
    
    @scala.inline
    def setFlexContainerNull: Self = this.set("flexContainer", null)
    
    @scala.inline
    def setLabel(value: IStyle): Self = this.set("label", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteLabel: Self = this.set("label", js.undefined)
    
    @scala.inline
    def setLabelNull: Self = this.set("label", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
