package typings.postmanCollection.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait WithRoot extends js.Object {
  var withRoot: Boolean = js.native
}

object WithRoot {
  @scala.inline
  def apply(withRoot: Boolean): WithRoot = {
    val __obj = js.Dynamic.literal(withRoot = withRoot.asInstanceOf[js.Any])
    __obj.asInstanceOf[WithRoot]
  }
  @scala.inline
  implicit class WithRootOps[Self <: WithRoot] (val x: Self) extends AnyVal {
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
    def setWithRoot(value: Boolean): Self = this.set("withRoot", value.asInstanceOf[js.Any])
  }
  
}

