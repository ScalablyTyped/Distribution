package typings.oracleOraclejet.ojtableMod.ojTable

import org.scalablytyped.runtime.StringDictionary
import typings.oracleOraclejet.AnonDatasource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowRendererContext[K, D] extends js.Object {
  var componentElement: Element
  var data: StringDictionary[js.Any]
  var parentElement: Element
  var rowContext: AnonDatasource[K, D]
}

object RowRendererContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: StringDictionary[js.Any],
    parentElement: Element,
    rowContext: AnonDatasource[K, D]
  ): RowRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any], rowContext = rowContext.asInstanceOf[js.Any])
    __obj.asInstanceOf[RowRendererContext[K, D]]
  }
}

