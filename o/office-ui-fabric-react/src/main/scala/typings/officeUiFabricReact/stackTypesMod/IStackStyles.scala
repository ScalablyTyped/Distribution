package typings.officeUiFabricReact.stackTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined office-ui-fabric-react.office-ui-fabric-react/lib/Foundation.IComponentStyles<office-ui-fabric-react.office-ui-fabric-react/lib/components/Stack/Stack.types.IStackSlots> */
@js.native
trait IStackStyles extends js.Object {
  
  var inner: js.UndefOr[IStyle] = js.native
  
  var root: js.UndefOr[IStyle] = js.native
}
object IStackStyles {
  
  @scala.inline
  def apply(): IStackStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IStackStyles]
  }
  
  @scala.inline
  implicit class IStackStylesOps[Self <: IStackStyles] (val x: Self) extends AnyVal {
    
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
    def setInner(value: IStyle): Self = this.set("inner", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteInner: Self = this.set("inner", js.undefined)
    
    @scala.inline
    def setInnerNull: Self = this.set("inner", null)
    
    @scala.inline
    def setRoot(value: IStyle): Self = this.set("root", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteRoot: Self = this.set("root", js.undefined)
    
    @scala.inline
    def setRootNull: Self = this.set("root", null)
  }
}
