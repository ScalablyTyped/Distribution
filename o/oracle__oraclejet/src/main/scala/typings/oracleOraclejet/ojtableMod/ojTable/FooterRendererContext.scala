package typings.oracleOraclejet.ojtableMod.ojTable

import typings.oracleOraclejet.anon.`22`
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait FooterRendererContext[K, D] extends js.Object {
  var columnIndex: Double
  var componentElement: Element
  var footerContext: `22`[K, D]
  var parentElement: Element
}

object FooterRendererContext {
  @scala.inline
  def apply[K, D](columnIndex: Double, componentElement: Element, footerContext: `22`[K, D], parentElement: Element): FooterRendererContext[K, D] = {
    val __obj = js.Dynamic.literal(columnIndex = columnIndex.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], footerContext = footerContext.asInstanceOf[js.Any], parentElement = parentElement.asInstanceOf[js.Any])
    __obj.asInstanceOf[FooterRendererContext[K, D]]
  }
}

