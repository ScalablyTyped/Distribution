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
  
  inline def CellTooltip[RawDatum /* <: Datum */](hasCell: TooltipProps[RawDatum]): Element = ^.asInstanceOf[js.Dynamic].applyDynamic("CellTooltip")(hasCell.asInstanceOf[js.Any]).asInstanceOf[Element]
  
  trait TooltipProps[RawDatum /* <: Datum */] extends StObject {
    
    var cell: DataCell[RawDatum]
  }
  object TooltipProps {
    
    inline def apply[RawDatum /* <: Datum */](cell: DataCell[RawDatum]): TooltipProps[RawDatum] = {
      val __obj = js.Dynamic.literal(cell = cell.asInstanceOf[js.Any])
      __obj.asInstanceOf[TooltipProps[RawDatum]]
    }
    
    extension [Self <: TooltipProps[?], RawDatum /* <: Datum */](x: Self & TooltipProps[RawDatum]) {
      
      inline def setCell(value: DataCell[RawDatum]): Self = StObject.set(x, "cell", value.asInstanceOf[js.Any])
    }
  }
}
