package typings.picturefill.mod.Picturefill

import typings.std.NodeList
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait EvaluateArg extends js.Object {
  var elements: NodeList | js.Array[ElementNullable] = js.native
  var reevaluate: js.UndefOr[Boolean] = js.native
}

object EvaluateArg {
  @scala.inline
  def apply(elements: NodeList | js.Array[ElementNullable]): EvaluateArg = {
    val __obj = js.Dynamic.literal(elements = elements.asInstanceOf[js.Any])
    __obj.asInstanceOf[EvaluateArg]
  }
  @scala.inline
  implicit class EvaluateArgOps[Self <: EvaluateArg] (val x: Self) extends AnyVal {
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
    def setElementsVarargs(value: ElementNullable*): Self = this.set("elements", js.Array(value :_*))
    @scala.inline
    def setElements(value: NodeList | js.Array[ElementNullable]): Self = this.set("elements", value.asInstanceOf[js.Any])
    @scala.inline
    def setReevaluate(value: Boolean): Self = this.set("reevaluate", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReevaluate: Self = this.set("reevaluate", js.undefined)
  }
  
}

