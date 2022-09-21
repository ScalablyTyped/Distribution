package typings.nivoBar.typesMod

import typings.nivoBar.nivoBarStrings.indexes
import typings.nivoBar.nivoBarStrings.keys
import typings.nivoLegends.typesTypesMod.LegendAnchor
import typings.nivoLegends.typesTypesMod.LegendDirection
import typings.nivoLegends.typesTypesMod.LegendProps
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait BarLegendProps
  extends StObject
     with LegendProps {
  
  var dataFrom: indexes | keys
}
object BarLegendProps {
  
  inline def apply(
    anchor: LegendAnchor,
    dataFrom: indexes | keys,
    direction: LegendDirection,
    itemHeight: Double,
    itemWidth: Double
  ): BarLegendProps = {
    val __obj = js.Dynamic.literal(anchor = anchor.asInstanceOf[js.Any], dataFrom = dataFrom.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any], itemHeight = itemHeight.asInstanceOf[js.Any], itemWidth = itemWidth.asInstanceOf[js.Any])
    __obj.asInstanceOf[BarLegendProps]
  }
  
  extension [Self <: BarLegendProps](x: Self) {
    
    inline def setDataFrom(value: indexes | keys): Self = StObject.set(x, "dataFrom", value.asInstanceOf[js.Any])
  }
}
