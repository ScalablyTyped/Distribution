package typings.officeUiFabricReact.baseButtonMod

import typings.officeUiFabricReact.buttonTypesMod.IButtonProps
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IBaseButtonProps extends IButtonProps {
  
  var baseClassName: js.UndefOr[String] = js.native
  
  var variantClassName: js.UndefOr[String] = js.native
}
object IBaseButtonProps {
  
  @scala.inline
  def apply(): IBaseButtonProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IBaseButtonProps]
  }
  
  @scala.inline
  implicit class IBaseButtonPropsOps[Self <: IBaseButtonProps] (val x: Self) extends AnyVal {
    
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
    def setBaseClassName(value: String): Self = this.set("baseClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteBaseClassName: Self = this.set("baseClassName", js.undefined)
    
    @scala.inline
    def setVariantClassName(value: String): Self = this.set("variantClassName", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteVariantClassName: Self = this.set("variantClassName", js.undefined)
  }
}
