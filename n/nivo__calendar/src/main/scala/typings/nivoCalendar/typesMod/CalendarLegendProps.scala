package typings.nivoCalendar.typesMod

import typings.nivoLegends.typesTypesMod.LegendAnchor
import typings.nivoLegends.typesTypesMod.LegendDirection
import typings.nivoLegends.typesTypesMod.LegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CalendarLegendProps
  extends StObject
     with LegendProps {
  
  var itemCount: Double
}
object CalendarLegendProps {
  
  inline def apply(
    anchor: LegendAnchor,
    direction: LegendDirection,
    itemCount: Double,
    itemHeight: Double,
    itemWidth: Double
  ): CalendarLegendProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemCount = itemCount.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[CalendarLegendProps]
  }
  
  extension [Self <: CalendarLegendProps](x: Self) {
    
    inline def setItemCount(value: Double): Self = StObject.set(x, "itemCount", value.asInstanceOf[js.Any])
  }
}
