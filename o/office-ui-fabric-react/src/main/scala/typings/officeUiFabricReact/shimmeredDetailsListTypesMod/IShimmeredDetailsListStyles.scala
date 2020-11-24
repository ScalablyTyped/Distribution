package typings.officeUiFabricReact.shimmeredDetailsListTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmeredDetailsListStyles extends js.Object {
  
  /**
    * Represents styles passed to the `List` component for creating a fade-out to the bottom overlay.
    */
  var root: IStyle = js.native
}
object IShimmeredDetailsListStyles {
  
  @scala.inline
  def apply(): IShimmeredDetailsListStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmeredDetailsListStyles]
  }
  
  @scala.inline
  implicit class IShimmeredDetailsListStylesOps[Self <: IShimmeredDetailsListStyles] (val x: Self) extends AnyVal {
    
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
  }
}
