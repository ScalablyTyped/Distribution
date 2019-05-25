package typings
package olLib.graticuleMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GraticuleLabelDataType extends js.Object {
  var geom: olLib.geomPointMod.default
  var text: java.lang.String
}

object GraticuleLabelDataType {
  @scala.inline
  def apply(geom: olLib.geomPointMod.default, text: java.lang.String): GraticuleLabelDataType = {
    val __obj = js.Dynamic.literal(geom = geom, text = text)
  
    __obj.asInstanceOf[GraticuleLabelDataType]
  }
}

