package typings.officeUiFabricReact.shimmerElementsGroupTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IShimmerElementsGroupStyles extends js.Object {
  
  /**
    * Represents the wrapper root element holding all elements inside.
    */
  var root: js.UndefOr[IStyle] = js.native
}
object IShimmerElementsGroupStyles {
  
  @scala.inline
  def apply(): IShimmerElementsGroupStyles = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IShimmerElementsGroupStyles]
  }
  
  @scala.inline
  implicit class IShimmerElementsGroupStylesOps[Self <: IShimmerElementsGroupStyles] (val x: Self) extends AnyVal {
    
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
