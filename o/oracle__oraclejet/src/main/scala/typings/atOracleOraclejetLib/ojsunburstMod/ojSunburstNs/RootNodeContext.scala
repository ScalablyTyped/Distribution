package typings
package atOracleOraclejetLib.ojsunburstMod.ojSunburstNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait RootNodeContext[K, D] extends js.Object {
  var componentElement: stdLib.Element
  var data: js.Object
  var id: K
  var innerBounds: atOracleOraclejetLib.Anon_HeightWidth
  var itemData: D
  var outerBounds: atOracleOraclejetLib.Anon_HeightWidth
}

object RootNodeContext {
  @scala.inline
  def apply[K, D](
    componentElement: stdLib.Element,
    data: js.Object,
    id: K,
    innerBounds: atOracleOraclejetLib.Anon_HeightWidth,
    itemData: D,
    outerBounds: atOracleOraclejetLib.Anon_HeightWidth
  ): RootNodeContext[K, D] = {
    val __obj = js.Dynamic.literal(componentElement = componentElement, data = data, id = id.asInstanceOf[js.Any], innerBounds = innerBounds, itemData = itemData.asInstanceOf[js.Any], outerBounds = outerBounds)
  
    __obj.asInstanceOf[RootNodeContext[K, D]]
  }
}

