package typings.officeUiFabricReact.anon

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined std.Pick<office-ui-fabric-react.office-ui-fabric-react/lib/components/SearchBox/SearchBox.types.ISearchBoxProps, 'disableAnimation' | 'clearButtonProps'> */
@js.native
trait PickISearchBoxPropsdisabl extends js.Object {
  
  var clearButtonProps: js.UndefOr[IButtonProps] = js.native
  
  var disableAnimation: js.UndefOr[Boolean] = js.native
}
object PickISearchBoxPropsdisabl {
  
  @scala.inline
  def apply(): PickISearchBoxPropsdisabl = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[PickISearchBoxPropsdisabl]
  }
  
  @scala.inline
  implicit class PickISearchBoxPropsdisablOps[Self <: PickISearchBoxPropsdisabl] (val x: Self) extends AnyVal {
    
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
    def setClearButtonProps(value: IButtonProps): Self = this.set("clearButtonProps", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteClearButtonProps: Self = this.set("clearButtonProps", js.undefined)
    
    @scala.inline
    def setDisableAnimation(value: Boolean): Self = this.set("disableAnimation", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteDisableAnimation: Self = this.set("disableAnimation", js.undefined)
  }
}
