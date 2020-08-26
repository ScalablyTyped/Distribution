package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Previews extends js.Object {
  var format: String = js.native
  var previews: js.Array[String] = js.native
}

object Previews {
  @scala.inline
  def apply(format: String, previews: js.Array[String]): Previews = {
    val __obj = js.Dynamic.literal(format = format.asInstanceOf[js.Any], previews = previews.asInstanceOf[js.Any])
    __obj.asInstanceOf[Previews]
  }
  @scala.inline
  implicit class PreviewsOps[Self <: Previews] (val x: Self) extends AnyVal {
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
    def setFormat(value: String): Self = this.set("format", value.asInstanceOf[js.Any])
    @scala.inline
    def setPreviewsVarargs(value: String*): Self = this.set("previews", js.Array(value :_*))
    @scala.inline
    def setPreviews(value: js.Array[String]): Self = this.set("previews", value.asInstanceOf[js.Any])
  }
  
}

