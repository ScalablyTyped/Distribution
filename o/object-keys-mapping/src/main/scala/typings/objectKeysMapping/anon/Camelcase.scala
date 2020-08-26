package typings.objectKeysMapping.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Camelcase extends js.Object {
  var camelcase: js.UndefOr[Boolean] = js.native
}

object Camelcase {
  @scala.inline
  def apply(): Camelcase = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Camelcase]
  }
  @scala.inline
  implicit class CamelcaseOps[Self <: Camelcase] (val x: Self) extends AnyVal {
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
    def setCamelcase(value: Boolean): Self = this.set("camelcase", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCamelcase: Self = this.set("camelcase", js.undefined)
  }
  
}

