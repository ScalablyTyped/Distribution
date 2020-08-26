package typings.oracleOraclejet.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Description extends js.Object {
  var description: ToString | js.Function0[String] | String = js.native
}

object Description {
  @scala.inline
  def apply(description: ToString | js.Function0[String] | String): Description = {
    val __obj = js.Dynamic.literal(description = description.asInstanceOf[js.Any])
    __obj.asInstanceOf[Description]
  }
  @scala.inline
  implicit class DescriptionOps[Self <: Description] (val x: Self) extends AnyVal {
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
    def setDescriptionFunction0(value: () => String): Self = this.set("description", js.Any.fromFunction0(value))
    @scala.inline
    def setDescription(value: ToString | js.Function0[String] | String): Self = this.set("description", value.asInstanceOf[js.Any])
  }
  
}

