package typings.oracleOraclejet.ojsunburstMod.ojSunburst

import typings.oracleOraclejet.anon.WidthX
import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RootNodeContext[K, D] extends js.Object {
  var componentElement: Element
  var data: js.Object
  var id: K
  var innerBounds: WidthX
  var itemData: D
  var outerBounds: WidthX
}

object RootNodeContext {
  @scala.inline
  def apply[K, D](
    componentElement: Element,
    data: js.Object,
    id: K,
    innerBounds: WidthX,
    itemData: D,
    outerBounds: WidthX
  ): RootNodeContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement.asInstanceOf[js.Any], data = data.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], innerBounds = innerBounds.asInstanceOf[js.Any], itemData = itemData.asInstanceOf[js.Any], outerBounds = outerBounds.asInstanceOf[js.Any])
    __obj.asInstanceOf[RootNodeContext[K, D]]
  }
}

