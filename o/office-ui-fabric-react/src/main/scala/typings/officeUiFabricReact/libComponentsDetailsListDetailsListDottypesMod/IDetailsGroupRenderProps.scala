package typings.officeUiFabricReact.libComponentsDetailsListDetailsListDottypesMod

import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupRenderProps
import typings.officeUiFabricReact.libComponentsGroupedListGroupedListDottypesMod.IGroupedListProps
import typings.react.mod.global.JSX.Element
import typings.uifabricUtilities.libIcomponentasMod.IComponentAs
import typings.uifabricUtilities.libIrenderfunctionMod.IRenderFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait IDetailsGroupRenderProps
  extends StObject
     with IGroupRenderProps {
  
  var groupedListAs: js.UndefOr[IComponentAs[IGroupedListProps]] = js.undefined
  
  @JSName("onRenderFooter")
  var onRenderFooter_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.undefined
  
  @JSName("onRenderHeader")
  var onRenderHeader_IDetailsGroupRenderProps: js.UndefOr[IRenderFunction[IDetailsGroupDividerProps]] = js.undefined
}
object IDetailsGroupRenderProps {
  
  inline def apply(): IDetailsGroupRenderProps = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[IDetailsGroupRenderProps]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: IDetailsGroupRenderProps] (val x: Self) extends AnyVal {
    
    inline def setGroupedListAs(value: IComponentAs[IGroupedListProps]): Self = StObject.set(x, "groupedListAs", value.asInstanceOf[js.Any])
    
    inline def setGroupedListAsUndefined: Self = StObject.set(x, "groupedListAs", js.undefined)
    
    inline def setOnRenderFooter(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderFooter", js.Any.fromFunction2(value))
    
    inline def setOnRenderFooterUndefined: Self = StObject.set(x, "onRenderFooter", js.undefined)
    
    inline def setOnRenderHeader(
      value: (/* props */ js.UndefOr[IDetailsGroupDividerProps], /* defaultRender */ js.UndefOr[js.Function1[/* props */ js.UndefOr[IDetailsGroupDividerProps], Element | Null]]) => Element | Null
    ): Self = StObject.set(x, "onRenderHeader", js.Any.fromFunction2(value))
    
    inline def setOnRenderHeaderUndefined: Self = StObject.set(x, "onRenderHeader", js.undefined)
  }
}
