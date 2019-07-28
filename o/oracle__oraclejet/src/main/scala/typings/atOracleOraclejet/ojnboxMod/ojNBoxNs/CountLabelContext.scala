package typings.atOracleOraclejet.ojnboxMod.ojNBoxNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait CountLabelContext extends js.Object {
  var column: String
  var highlightedNodeCount: Double
  var nodeCount: Double
  var row: String
  var totalNodeCount: Double
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
    val __obj = js.Dynamic.literal(column = column, highlightedNodeCount = highlightedNodeCount, nodeCount = nodeCount, row = row, totalNodeCount = totalNodeCount)
  
    __obj.asInstanceOf[CountLabelContext]
  }
}

