package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CellDefaults extends StObject {
  
  var animationDuration: Double
  
  var cellDefaults: LabelHalign
  
  var columnLabelStyle: js.Object
  
  var columnsTitleStyle: js.Object
  
  var hoverBehaviorDelay: Double
  
  var nodeDefaults: IconDefaults
  
  var rowLabelStyle: js.Object
  
  var rowsTitleStyle: js.Object
}
object CellDefaults {
  
  inline def apply(
    animationDuration: Double,
    cellDefaults: LabelHalign,
    columnLabelStyle: js.Object,
    columnsTitleStyle: js.Object,
    hoverBehaviorDelay: Double,
    nodeDefaults: IconDefaults,
    rowLabelStyle: js.Object,
    rowsTitleStyle: js.Object
  ): CellDefaults = {
    val __obj = js.Dynamic.literal(animationDuration = animationDuration.asInstanceOf[js.Any], cellDefaults = cellDefaults.asInstanceOf[js.Any], columnLabelStyle = columnLabelStyle.asInstanceOf[js.Any], columnsTitleStyle = columnsTitleStyle.asInstanceOf[js.Any], hoverBehaviorDelay = hoverBehaviorDelay.asInstanceOf[js.Any], nodeDefaults = nodeDefaults.asInstanceOf[js.Any], rowLabelStyle = rowLabelStyle.asInstanceOf[js.Any], rowsTitleStyle = rowsTitleStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[CellDefaults]
  }
  
  extension [Self <: CellDefaults](x: Self) {
    
    inline def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    inline def setCellDefaults(value: LabelHalign): Self = StObject.set(x, "cellDefaults", value.asInstanceOf[js.Any])
    
    inline def setColumnLabelStyle(value: js.Object): Self = StObject.set(x, "columnLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setColumnsTitleStyle(value: js.Object): Self = StObject.set(x, "columnsTitleStyle", value.asInstanceOf[js.Any])
    
    inline def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    inline def setNodeDefaults(value: IconDefaults): Self = StObject.set(x, "nodeDefaults", value.asInstanceOf[js.Any])
    
    inline def setRowLabelStyle(value: js.Object): Self = StObject.set(x, "rowLabelStyle", value.asInstanceOf[js.Any])
    
    inline def setRowsTitleStyle(value: js.Object): Self = StObject.set(x, "rowsTitleStyle", value.asInstanceOf[js.Any])
  }
}
