package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellDefaults extends StObject {
  
  var animationDuration: Double = js.native
  
  var cellDefaults: LabelHalign = js.native
  
  var columnLabelStyle: js.Object = js.native
  
  var columnsTitleStyle: js.Object = js.native
  
  var hoverBehaviorDelay: Double = js.native
  
  var nodeDefaults: IconDefaults = js.native
  
  var rowLabelStyle: js.Object = js.native
  
  var rowsTitleStyle: js.Object = js.native
}
object CellDefaults {
  
  @scala.inline
  def apply(
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
  
  @scala.inline
  implicit class CellDefaultsMutableBuilder[Self <: CellDefaults] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setAnimationDuration(value: Double): Self = StObject.set(x, "animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellDefaults(value: LabelHalign): Self = StObject.set(x, "cellDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnLabelStyle(value: js.Object): Self = StObject.set(x, "columnLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsTitleStyle(value: js.Object): Self = StObject.set(x, "columnsTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = StObject.set(x, "hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDefaults(value: IconDefaults): Self = StObject.set(x, "nodeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowLabelStyle(value: js.Object): Self = StObject.set(x, "rowLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsTitleStyle(value: js.Object): Self = StObject.set(x, "rowsTitleStyle", value.asInstanceOf[js.Any])
  }
}
