package typings.oracleOraclejet.ojdataproviderMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SortCriterion[D] extends js.Object {
  var attribute: /* keyof D */ String = js.native
  var direction: String = js.native
}

object SortCriterion {
  @scala.inline
  def apply[D](attribute: /* keyof D */ String, direction: String): SortCriterion[D] = {
    val __obj = js.Dynamic.literal(attribute = attribute.asInstanceOf[js.Any], direction = direction.asInstanceOf[js.Any])
    __obj.asInstanceOf[SortCriterion[D]]
  }
  @scala.inline
  implicit class SortCriterionOps[Self <: SortCriterion[_], D] (val x: Self with SortCriterion[D]) extends AnyVal {
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
    def setAttribute(value: /* keyof D */ String): Self = this.set("attribute", value.asInstanceOf[js.Any])
    @scala.inline
    def setDirection(value: String): Self = this.set("direction", value.asInstanceOf[js.Any])
  }
  
}

