package typings.nodePgMigrate.domainsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainOptionsAlter extends DomainOptions {
  var allowNull: js.UndefOr[Boolean] = js.native
}

object DomainOptionsAlter {
  @scala.inline
  def apply(): DomainOptionsAlter = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptionsAlter]
  }
  @scala.inline
  implicit class DomainOptionsAlterOps[Self <: DomainOptionsAlter] (val x: Self) extends AnyVal {
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
    def setAllowNull(value: Boolean): Self = this.set("allowNull", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAllowNull: Self = this.set("allowNull", js.undefined)
  }
  
}

