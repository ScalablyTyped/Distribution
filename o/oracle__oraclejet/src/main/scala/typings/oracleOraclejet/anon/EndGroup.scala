package typings.oracleOraclejet.anon

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.StObject
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
  implicit class EndGroupMutableBuilder[Self <: EndGroup] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEndGroup(value: String): Self = StObject.set(x, "endGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItems(value: js.Array[String]): Self = StObject.set(x, "items", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setItemsVarargs(value: String*): Self = StObject.set(x, "items", js.Array(value :_*))
    
    @scala.inline
    def setSelectionData(value: js.Array[GroupData]): Self = StObject.set(x, "selectionData", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSelectionDataVarargs(value: GroupData*): Self = StObject.set(x, "selectionData", js.Array(value :_*))
    
    @scala.inline
    def setStartGroup(value: String): Self = StObject.set(x, "startGroup", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMax(value: Double): Self = StObject.set(x, "xMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setXMin(value: Double): Self = StObject.set(x, "xMin", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMax(value: Double): Self = StObject.set(x, "yMax", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setYMin(value: Double): Self = StObject.set(x, "yMin", value.asInstanceOf[js.Any])
  }
}
