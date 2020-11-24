package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait CellDefaults extends js.Object {
  
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
  implicit class CellDefaultsOps[Self <: CellDefaults] (val x: Self) extends AnyVal {
    
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
    def setAnimationDuration(value: Double): Self = this.set("animationDuration", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setCellDefaults(value: LabelHalign): Self = this.set("cellDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnLabelStyle(value: js.Object): Self = this.set("columnLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setColumnsTitleStyle(value: js.Object): Self = this.set("columnsTitleStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHoverBehaviorDelay(value: Double): Self = this.set("hoverBehaviorDelay", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeDefaults(value: IconDefaults): Self = this.set("nodeDefaults", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowLabelStyle(value: js.Object): Self = this.set("rowLabelStyle", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowsTitleStyle(value: js.Object): Self = this.set("rowsTitleStyle", value.asInstanceOf[js.Any])
  }
}
