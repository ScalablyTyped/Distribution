package typings.oracleOraclejet.ojpictochartMod.ojPictoChart

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

// tslint:disable-next-line interface-over-type-literal
trait ItemContext[K] extends js.Object {
  var color: String
  var count: Double
  var id: K
  var name: String
  var selected: Boolean
  var tooltip: String
}

object ItemContext {
  @scala.inline
  def apply[K](color: String, count: Double, id: K, name: String, selected: Boolean, tooltip: String): ItemContext[K] = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], count = count.asInstanceOf[js.Any], id = id.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], selected = selected.asInstanceOf[js.Any], tooltip = tooltip.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ItemContext[K]]
  }
}

