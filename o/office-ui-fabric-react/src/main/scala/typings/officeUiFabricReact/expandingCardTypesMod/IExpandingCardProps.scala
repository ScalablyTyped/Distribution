package typings.officeUiFabricReact.expandingCardTypesMod

import typings.officeUiFabricReact.baseCardTypesMod.IBaseCardProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IExpandingCardProps extends IBaseCardProps[IExpandingCard, IExpandingCardStyles, IExpandingCardStyleProps] {
  
  /**
    * Height of compact card
    * @defaultvalue 156
    */
  var compactCardHeight: js.UndefOr[Double] = js.native
  
  /**
    * Height of expanded card
    * @defaultvalue 384
    */
  var expandedCardHeight: js.UndefOr[Double] = js.native
  
  /**
    * Use to open the card in expanded format and not wait for the delay
    * @defaultvalue ExpandingCardMode.compact
    */
  var mode: js.UndefOr[ExpandingCardMode] = js.native
  
  /**
    *  Render function to populate compact content area
    */
  var onRenderCompactCard: js.UndefOr[IRenderFunction[_]] = js.native
  
  /**
    *  Render function to populate expanded content area
    */
  var onRenderExpandedCard: js.UndefOr[IRenderFunction[_]] = js.native
}
object IExpandingCardProps {
  
  @scala.inline
  def apply(): IExpandingCardProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IExpandingCardProps]
  }
  
  @scala.inline
  implicit class IExpandingCardPropsOps[Self <: IExpandingCardProps] (val x: Self) extends AnyVal {
    
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
    def setCompactCardHeight(value: Double): Self = this.set("compactCardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteCompactCardHeight: Self = this.set("compactCardHeight", js.undefined)
    
    @scala.inline
    def setExpandedCardHeight(value: Double): Self = this.set("expandedCardHeight", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteExpandedCardHeight: Self = this.set("expandedCardHeight", js.undefined)
    
    @scala.inline
    def setMode(value: ExpandingCardMode): Self = this.set("mode", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteMode: Self = this.set("mode", js.undefined)
    
    @scala.inline
    def setOnRenderCompactCard(
      value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderCompactCard", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderCompactCard: Self = this.set("onRenderCompactCard", js.undefined)
    
    @scala.inline
    def setOnRenderExpandedCard(
      value: (/* props */ js.UndefOr[_], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[_], Element | Null]]) => Element | Null
    ): Self = this.set("onRenderExpandedCard", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteOnRenderExpandedCard: Self = this.set("onRenderExpandedCard", js.undefined)
  }
}
