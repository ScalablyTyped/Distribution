package typings.atNivoSankey.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyLinkDatum extends js.Object {
  var color: String
  var index: Double
  var pos0: Double
  var pos1: Double
  var source: SankeyNodeDatum
  var target: SankeyNodeDatum
  var thickness: Double
  var value: Double
}

object SankeyLinkDatum {
  @scala.inline
  def apply(
    color: String,
    index: Double,
    pos0: Double,
    pos1: Double,
    source: SankeyNodeDatum,
    target: SankeyNodeDatum,
    thickness: Double,
    value: Double
  ): SankeyLinkDatum = {
    val __obj = js.Dynamic.literal(color = color.asInstanceOf[js.Any], index = index.asInstanceOf[js.Any], pos0 = pos0.asInstanceOf[js.Any], pos1 = pos1.asInstanceOf[js.Any], source = source.asInstanceOf[js.Any], target = target.asInstanceOf[js.Any], thickness = thickness.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[SankeyLinkDatum]
  }
}

