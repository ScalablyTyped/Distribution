package typings.objDashFileDashParser.objDashFileDashParserMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VertexTexture extends js.Object {
  var u: Double
  var v: Double
  var w: Double
}

object VertexTexture {
  @scala.inline
  def apply(u: Double, v: Double, w: Double): VertexTexture = {
    val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VertexTexture]
  }
}

