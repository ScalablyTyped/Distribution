package typings.octokitTypes.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Deletions extends js.Object {
  var additions: Double = js.native
  var deletions: Double = js.native
  var total: Double = js.native
}

object Deletions {
  @scala.inline
  def apply(additions: Double, deletions: Double, total: Double): Deletions = {
    val __obj = js.Dynamic.literal(additions = additions.asInstanceOf[js.Any], deletions = deletions.asInstanceOf[js.Any], total = total.asInstanceOf[js.Any])
    __obj.asInstanceOf[Deletions]
  }
  @scala.inline
  implicit class DeletionsOps[Self <: Deletions] (val x: Self) extends AnyVal {
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
    def setAdditions(value: Double): Self = this.set("additions", value.asInstanceOf[js.Any])
    @scala.inline
    def setDeletions(value: Double): Self = this.set("deletions", value.asInstanceOf[js.Any])
    @scala.inline
    def setTotal(value: Double): Self = this.set("total", value.asInstanceOf[js.Any])
  }
  
}

