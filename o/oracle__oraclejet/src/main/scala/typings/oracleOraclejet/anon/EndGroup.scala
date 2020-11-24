package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EndGroup
  extends /* key */ StringDictionary[js.Any] {
  
  var endGroup: String = js.native
  
  var items: js.Array[String] = js.native
  
  var selectionData: js.Array[GroupData] = js.native
  
  var startGroup: String = js.native
  
  var xMax: Double = js.native
  
  var xMin: Double = js.native
  
  var yMax: Double = js.native
  
  var yMin: Double = js.native
}
object EndGroup {
  
  @scala.inline
  def apply(
    endGroup: String,
    items: js.Array[String],
    selectionData: js.Array[GroupData],
    startGroup: String,
    xMax: Double,
    xMin: Double,
    yMax: Double,
    yMin: Double
  ): EndGroup = {
    val __obj = js.Dynamic.literal(endGroup = endGroup.asInstanceOf[js.Any], items = items.asInstanceOf[js.Any], selectionData = selectionData.asInstanceOf[js.Any], startGroup = startGroup.asInstanceOf[js.Any], xMax = xMax.asInstanceOf[js.Any], xMin = xMin.asInstanceOf[js.Any], yMax = yMax.asInstanceOf[js.Any], yMin = yMin.asInstanceOf[js.Any])
    __obj.asInstanceOf[EndGroup]
  }
  
  @scala.inline
  implicit class EndGroupOps[Self <: EndGroup] (val x: Self) extends AnyVal {
    
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
    def setEndGroup(value: String): Self = this.set("endGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = this.set("items", js.Array(value :_*))
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = this.set("items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionDataVarargs(value: GroupData*): Self = this.set("selectionData", js.Array(value :_*))
    
    @scala.inline
    def setSelectionData(value: js.Array[GroupData]): Self = this.set("selectionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setStartGroup(value: String): Self = this.set("startGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMax(value: Double): Self = this.set("xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMin(value: Double): Self = this.set("xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMax(value: Double): Self = this.set("yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMin(value: Double): Self = this.set("yMin", value.asInstanceOf[js.Any])
  }
}
