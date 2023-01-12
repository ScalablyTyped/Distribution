package typings.nivoWaffle

import typings.nivoWaffle.distTypesTypesMod.DataCell
import typings.nivoWaffle.distTypesTypesMod.Datum
import typings.react.mod.global.JSX.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distTypesCellTooltipMod {
  
  @JSImport("@nivo/waffle/dist/types/CellTooltip", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def CellTooltip[RawDatum /* <: Datum */](param0: TooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CellTooltip")(param0.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TooltipProps[RawDatum /* <: Datum */] extends StObject {
    
    var cell: DataCell[RawDatum]
  }
  object TooltipProps {
    
    inline def apply[RawDatum /* <: Datum */](cell: DataCell[RawDatum]): TooltipProps[RawDatum] = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps[RawDatum]]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TooltipProps[?], RawDatum /* <: Datum */] (val x: Self & TooltipProps[RawDatum]) extends AnyVal {
      
      inline def setCell(value: DataCell[RawDatum]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    }
  }
}
