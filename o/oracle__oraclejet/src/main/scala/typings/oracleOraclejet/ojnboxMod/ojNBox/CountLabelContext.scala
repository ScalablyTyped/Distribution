package typings.oracleOraclejet.ojnboxMod.ojNBox

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// tslint:disable-next-line interface-over-type-literal
@js.native
trait CountLabelContext extends js.Object {
  
  var column: String = js.native
  
  var highlightedNodeCount: Double = js.native
  
  var nodeCount: Double = js.native
  
  var row: String = js.native
  
  var totalNodeCount: Double = js.native
}
object CountLabelContext {
  
  @scala.inline
  def apply(
    column: String,
    highlightedNodeCount: Double,
    nodeCount: Double,
    row: String,
    totalNodeCount: Double
  ): CountLabelContext = {
    val __obj = js.Dynamic.literal(column = column.asInstanceOf[js.Any], highlightedNodeCount = highlightedNodeCount.asInstanceOf[js.Any], nodeCount = nodeCount.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any], totalNodeCount = totalNodeCount.asInstanceOf[js.Any])
    __obj.asInstanceOf[CountLabelContext]
  }
  
  @scala.inline
  implicit class CountLabelContextOps[Self <: CountLabelContext] (val x: Self) extends AnyVal {
    
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
    def setColumn(value: String): Self = this.set("column", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setHighlightedNodeCount(value: Double): Self = this.set("highlightedNodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setNodeCount(value: Double): Self = this.set("nodeCount", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRow(value: String): Self = this.set("row", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setTotalNodeCount(value: Double): Self = this.set("totalNodeCount", value.asInstanceOf[js.Any])
  }
}
