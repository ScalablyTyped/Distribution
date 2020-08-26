package typings.ol.canvasMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Label extends js.Object {
  var contextInstructions: js.Array[String | Double] = js.native
  var height: Double = js.native
  var width: Double = js.native
}

object Label {
  @scala.inline
  def apply(contextInstructions: js.Array[String | Double], height: Double, width: Double): Label = {
    val __obj = js.Dynamic.literal(contextInstructions = contextInstructions.asInstanceOf[js.Any], height = height.asInstanceOf[js.Any], width = width.asInstanceOf[js.Any])
    __obj.asInstanceOf[Label]
  }
  @scala.inline
  implicit class LabelOps[Self <: Label] (val x: Self) extends AnyVal {
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
    def setContextInstructionsVarargs(value: (String | Double)*): Self = this.set("contextInstructions", js.Array(value :_*))
    @scala.inline
    def setContextInstructions(value: js.Array[String | Double]): Self = this.set("contextInstructions", value.asInstanceOf[js.Any])
    @scala.inline
    def setHeight(value: Double): Self = this.set("height", value.asInstanceOf[js.Any])
    @scala.inline
    def setWidth(value: Double): Self = this.set("width", value.asInstanceOf[js.Any])
  }
  
}

