package typings
package atOracleOraclejetLib.ojtableMod.ojTableNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait FooterRendererContext[K, D] extends js.Object {
  var columnIndex: scala.Double
  var componentElement: stdLib.Element
  var footerContext: atOracleOraclejetLib.Anon_DatasourceD[K, D]
  var parentElement: stdLib.Element
}

object FooterRendererContext {
  @scala.inline
  def apply[K, D](
    columnIndex: scala.Double,
    componentElement: stdLib.Element,
    footerContext: atOracleOraclejetLib.Anon_DatasourceD[K, D],
    parentElement: stdLib.Element
  ): FooterRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex, componentElement = componentElement, footerContext = footerContext, parentElement = parentElement)
  
    __obj.asInstanceOf[FooterRendererContext[K, D]]
  }
}

