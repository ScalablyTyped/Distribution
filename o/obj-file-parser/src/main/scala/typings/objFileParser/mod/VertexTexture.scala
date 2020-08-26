package typings.objFileParser.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait VertexTexture extends js.Object {
  var u: Double = js.native
  var v: Double = js.native
  var w: Double = js.native
}

object VertexTexture {
  @scala.inline
  def apply(u: Double, v: Double, w: Double): VertexTexture = {
    val __obj = js.Dynamic.literal(u = u.asInstanceOf[js.Any], v = v.asInstanceOf[js.Any], w = w.asInstanceOf[js.Any])
    __obj.asInstanceOf[VertexTexture]
  }
  @scala.inline
  implicit class VertexTextureOps[Self <: VertexTexture] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setU(value: Double): Self = this.set("u", value.asInstanceOf[js.Any])
    @scala.inline
    def setV(value: Double): Self = this.set("v", value.asInstanceOf[js.Any])
    @scala.inline
    def setW(value: Double): Self = this.set("w", value.asInstanceOf[js.Any])
  }
  
}

