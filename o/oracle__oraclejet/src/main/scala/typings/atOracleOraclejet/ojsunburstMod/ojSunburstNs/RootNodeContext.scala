package typings.atOracleOraclejet.ojsunburstMod.ojSunburstNs

import typings.atOracleOraclejet.Anon_HeightWidth
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RootNodeContext[K, D] extends js.Object {
  var componentElement: Element
  var data: js.Object
  var id: K
  var innerBounds: Anon_HeightWidth
  var itemData: D
  var outerBounds: Anon_HeightWidth
}

object RootNodeContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: js.Object,
    id: K,
    innerBounds: Anon_HeightWidth,
    itemData: D,
    outerBounds: Anon_HeightWidth
  ): RootNodeContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, data = data, id = id.asInstanceOf[js.Any], innerBounds = innerBounds, itemData = itemData.asInstanceOf[js.Any], outerBounds = outerBounds)
  
    __obj.asInstanceOf[RootNodeContext[K, D]]
  }
}

