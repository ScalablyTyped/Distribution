package typings.oracleOraclejet.ojtableMod.ojTable

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonDatasource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ColumnsRendererContext[K, D] extends js.Object {
  var cellContext: AnonDatasource[K, D]
  var columnIndex: Double
  var componentElement: Element
  var data: D
  var parentElement: Element
  var row: StringDictionary[js.Any]
}

object ColumnsRendererContext {
  @scala.inline
  def apply[K, D](
    cellContext: AnonDatasource[K, D],
    columnIndex: Double,
    componentElement: Element,
    data: D,
    parentElement: Element,
    row: StringDictionary[js.Any]
  ): ColumnsRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(cellContext = cellContext.asInstanceOf[js.Any], columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], row = row.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ColumnsRendererContext[K, D]]
  }
}

