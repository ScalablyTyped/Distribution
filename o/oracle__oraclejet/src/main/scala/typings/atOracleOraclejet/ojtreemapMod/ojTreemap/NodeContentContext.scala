package typings.atOracleOraclejet.ojtreemapMod.ojTreemap

import typings.atOracleOraclejet.Anon_HeightWidth
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait NodeContentContext[K, D] extends js.Object {
  var bounds: Anon_HeightWidth
  var componentElement: Element
  var data: js.Object
  var id: K
  var itemData: D
}

object NodeContentContext {
  @scala.inline
  def apply[K, D](bounds: Anon_HeightWidth, componentElement: Element, data: js.Object, id: K, itemData: D): NodeContentContext[K, D] = {
    val __obj = js.Dynamic.literal(bounds = bounds.asInstanceOf[js.Any], componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[NodeContentContext[K, D]]
  }
}

