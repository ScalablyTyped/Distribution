package typings.nivoTooltip

import typings.react.mod.MemoExoticComponent
import typings.react.mod.ReactNode
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesTableTooltipMod {
  
  @JSImport("@nivo/tooltip/dist/types/TableTooltip", "TableTooltip")
  @js.native
  val TableTooltip: MemoExoticComponent[js.Function1[/* param0 */ TableTooltipProps, Element | Null]] = js.native
  
  trait TableTooltipProps extends StObject {
    
    var renderContent: js.UndefOr[js.Function0[Element]] = js.undefined
    
    var rows: js.UndefOr[js.Array[js.Array[ReactNode]]] = js.undefined
    
    var title: js.UndefOr[ReactNode] = js.undefined
  }
  object TableTooltipProps {
    
    inline def apply(): TableTooltipProps = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TableTooltipProps]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TableTooltipProps] (val x: Self) extends AnyVal {
      
      inline def setRenderContent(value: () => Element): Self = StObject.set(x, "renderContent", js.Any.fromFunction0(value))
      
      inline def setRenderContentUndefined: Self = StObject.set(x, "renderContent", js.undefined)
      
      inline def setRows(value: js.Array[js.Array[ReactNode]]): Self = StObject.set(x, "rows", value.asInstanceOf[js.Any])
      
      inline def setRowsUndefined: Self = StObject.set(x, "rows", js.undefined)
      
      inline def setRowsVarargs(value: js.Array[ReactNode]*): Self = StObject.set(x, "rows", js.Array(value*))
      
      inline def setTitle(value: ReactNode): Self = StObject.set(x, "title", value.asInstanceOf[js.Any])
      
      inline def setTitleUndefined: Self = StObject.set(x, "title", js.undefined)
    }
  }
}
