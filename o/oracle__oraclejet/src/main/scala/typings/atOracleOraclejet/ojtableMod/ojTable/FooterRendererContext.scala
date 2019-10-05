package typings.atOracleOraclejet.ojtableMod.ojTable

import typings.atOracleOraclejet.Anon_DatasourceD
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait FooterRendererContext[K, D] extends js.Object {
  var columnIndex: Double
  var componentElement: Element
  var footerContext: Anon_DatasourceD[K, D]
  var parentElement: Element
}

object FooterRendererContext {
  @scala.inline
  def apply[K, D](
    columnIndex: Double,
    componentElement: Element,
    footerContext: Anon_DatasourceD[K, D],
    parentElement: Element
  ): FooterRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, componentElement = componentElement, footerContext = footerContext, parentElement = parentElement)
  
    __obj.asInstanceOf[FooterRendererContext[K, D]]
  }
}

