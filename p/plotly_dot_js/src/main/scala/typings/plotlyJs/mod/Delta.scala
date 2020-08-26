package typings.plotlyJs.mod

import typings.plotlyJs.anon.Symbol
import typings.plotlyJs.plotlyJsStrings.bottom
import typings.plotlyJs.plotlyJsStrings.left
import typings.plotlyJs.plotlyJsStrings.right
import typings.plotlyJs.plotlyJsStrings.top
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Delta extends js.Object {
  var decreasing: Symbol = js.native
  var increasing: Symbol = js.native
  var position: top | bottom | left | right = js.native
  var reference: Double = js.native
  var relative: Boolean = js.native
  var valueformat: String = js.native
}

object Delta {
  @scala.inline
  def apply(
    decreasing: Symbol,
    increasing: Symbol,
    position: top | bottom | left | right,
    reference: Double,
    relative: Boolean,
    valueformat: String
  ): Delta = {
    val __obj = js.Dynamic.literal(decreasing = decreasing.asInstanceOf[js.Any], increasing = increasing.asInstanceOf[js.Any], position = position.asInstanceOf[js.Any], reference = reference.asInstanceOf[js.Any], relative = relative.asInstanceOf[js.Any], valueformat = valueformat.asInstanceOf[js.Any])
    __obj.asInstanceOf[Delta]
  }
  @scala.inline
  implicit class DeltaOps[Self <: Delta] (val x: Self) extends AnyVal {
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
    def setDecreasing(value: Symbol): Self = this.set("decreasing", value.asInstanceOf[js.Any])
    @scala.inline
    def setIncreasing(value: Symbol): Self = this.set("increasing", value.asInstanceOf[js.Any])
    @scala.inline
    def setPosition(value: top | bottom | left | right): Self = this.set("position", value.asInstanceOf[js.Any])
    @scala.inline
    def setReference(value: Double): Self = this.set("reference", value.asInstanceOf[js.Any])
    @scala.inline
    def setRelative(value: Boolean): Self = this.set("relative", value.asInstanceOf[js.Any])
    @scala.inline
    def setValueformat(value: String): Self = this.set("valueformat", value.asInstanceOf[js.Any])
  }
  
}

