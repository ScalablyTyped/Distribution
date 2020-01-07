package typings.ol.layerGraticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleLabelDataType extends js.Object {
  var geom: typings.ol.geomPointMod.default
  var text: String
}

object GraticuleLabelDataType {
  @scala.inline
  def apply(geom: typings.ol.geomPointMod.default, text: String): GraticuleLabelDataType = {
    val __obj = js.Dynamic.literal(geom = geom.asInstanceOf[js.Any], text = text.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[GraticuleLabelDataType]
  }
}

