package typings
package objDashFileDashParserLib.objDashFileDashParserMod.ObjFileParserNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexTexture extends js.Object {
  var u: scala.Double
  var v: scala.Double
  var w: scala.Double
}

object VertexTexture {
  @scala.inline
  def apply(u: scala.Double, v: scala.Double, w: scala.Double): VertexTexture = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("u")(u)
    __obj.updateDynamic("v")(v)
    __obj.updateDynamic("w")(w)
    __obj.asInstanceOf[VertexTexture]
  }
}

