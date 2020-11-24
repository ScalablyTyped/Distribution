package typings.officeUiFabricReact.plainCardTypesMod

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IPlainCardProps extends IBaseCardProps[IPlainCard, IPlainCardStyles, IPlainCardStyleProps] {
  
  /**
    *  Render function to populate compact content area
    */
  var onRenderPlainCard: js.UndefOr[IRenderFunction[_]] = js.native
}
object IPlainCardProps {
  
  @scala.inline
  def apply(): IPlainCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IPlainCardProps]
  }
  
  @scala.inline
  implicit class IPlainCardPropsOps[Self <: IPlainCardProps] (val x: Self) extends AnyVal {
    
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
    def setOnRenderPlainCard(
      value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderPlainCard", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderPlainCard: Self = this.set("onRenderPlainCard", js.undefined)
  }
}
