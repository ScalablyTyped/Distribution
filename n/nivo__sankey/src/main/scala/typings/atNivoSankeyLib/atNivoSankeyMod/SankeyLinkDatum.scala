package typings
package atNivoSankeyLib.atNivoSankeyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SankeyLinkDatum extends js.Object {
  var color: java.lang.String
  var index: scala.Double
  var pos0: scala.Double
  var pos1: scala.Double
  var source: SankeyNodeDatum
  var target: SankeyNodeDatum
  var thickness: scala.Double
  var value: scala.Double
}

object SankeyLinkDatum {
  @scala.inline
  def apply(
    color: java.lang.String,
    index: scala.Double,
    pos0: scala.Double,
    pos1: scala.Double,
    source: SankeyNodeDatum,
    target: SankeyNodeDatum,
    thickness: scala.Double,
    value: scala.Double
  ): SankeyLinkDatum = {
    val __obj = js.Dynamic.literal(color = color, index = index, pos0 = pos0, pos1 = pos1, source = source, target = target, thickness = thickness, value = value)
  
    __obj.asInstanceOf[SankeyLinkDatum]
  }
}

