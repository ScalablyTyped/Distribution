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
    val __obj = js.Dynamic.literal(color = color, index = index, pos0 = pos0, pos1 = pos1, source = source, target = target, thickness = thickness, value = value)
  
    __obj.asInstanceOf[SankeyLinkDatum]
  }
}

