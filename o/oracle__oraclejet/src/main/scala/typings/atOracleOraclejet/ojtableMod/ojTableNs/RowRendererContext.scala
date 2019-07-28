package typings.atOracleOraclejet.ojtableMod.ojTableNs

import org.scalablytyped.runtime.StringDictionary
import typings.atOracleOraclejet.Anon_Datasource
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RowRendererContext[K, D] extends js.Object {
  var componentElement: Element
  var data: StringDictionary[js.Any]
  var parentElement: Element
  var rowContext: Anon_Datasource[K, D]
}

object RowRendererContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: StringDictionary[js.Any],
    parentElement: Element,
    rowContext: Anon_Datasource[K, D]
  ): RowRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, data = data, parentElement = parentElement, rowContext = rowContext)
  
    __obj.asInstanceOf[RowRendererContext[K, D]]
  }
}

