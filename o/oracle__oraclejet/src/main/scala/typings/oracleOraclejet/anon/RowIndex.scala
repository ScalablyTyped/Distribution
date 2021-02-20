package typings.oracleOraclejet.anon

import typings.oracleOraclejet.oracleOraclejetStrings.`oj-gantt-taskbar`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait RowIndex extends StObject {
  
  var index: Double = js.native
  
  var rowIndex: Double = js.native
  
  var subId: `oj-gantt-taskbar` = js.native
}
object RowIndex {
  
  @scala.inline
  def apply(index: Double, rowIndex: Double, subId: `oj-gantt-taskbar`): RowIndex = {
    val __obj = js.Dynamic.literal(index = index.asInstanceOf[js.Any], rowIndex = rowIndex.asInstanceOf[js.Any], subId = subId.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowIndex]
  }
  
  @scala.inline
  implicit class RowIndexMutableBuilder[Self <: RowIndex] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setIndex(value: Double): Self = StObject.set(x, "index", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRowIndex(value: Double): Self = StObject.set(x, "rowIndex", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSubId(value: `oj-gantt-taskbar`): Self = StObject.set(x, "subId", value.asInstanceOf[js.Any])
  }
}
