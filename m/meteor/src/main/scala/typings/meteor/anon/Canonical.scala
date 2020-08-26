package typings.meteor.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Canonical extends js.Object {
  var canonical: js.UndefOr[Boolean] = js.native
  var indent: js.UndefOr[Boolean | Double | String] = js.native
}

object Canonical {
  @scala.inline
  def apply(): Canonical = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Canonical]
  }
  @scala.inline
  implicit class CanonicalOps[Self <: Canonical] (val x: Self) extends AnyVal {
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
    def setCanonical(value: Boolean): Self = this.set("canonical", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCanonical: Self = this.set("canonical", js.undefined)
    @scala.inline
    def setIndent(value: Boolean | Double | String): Self = this.set("indent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIndent: Self = this.set("indent", js.undefined)
  }
  
}

