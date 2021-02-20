package typings.officeUiFabricReact.detailsListTypesMod

import typings.officeUiFabricReact.groupedListTypesMod.IGroupRenderProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.irenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait IDetailsGroupRenderProps extends IGroupRenderProps {
  
  @JSName("onRenderFooter")
  var onRenderFooter_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.native
  
  @JSName("onRenderHeader")
  var onRenderHeader_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.native
}
object IDetailsGroupRenderProps {
  
  @scala.inline
  def apply(): IDetailsGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupRenderProps]
  }
  
  @scala.inline
  implicit class IDetailsGroupRenderPropsMutableBuilder[Self <: IDetailsGroupRenderProps] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setOnRenderFooter(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderFooter", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderFooterUndefined: Self = StObject.set(x, "onRenderFooter", js.undefined)
    
    @scala.inline
    def setOnRenderHeader(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderHeader", js.Any.fromFunction2(value))
    
    @scala.inline
    def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
  }
}
