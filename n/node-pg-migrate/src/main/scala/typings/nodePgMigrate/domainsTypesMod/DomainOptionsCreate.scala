package typings.nodePgMigrate.domainsTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DomainOptionsCreate extends DomainOptions {
  var collation: js.UndefOr[String] = js.native
}

object DomainOptionsCreate {
  @scala.inline
  def apply(): DomainOptionsCreate = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DomainOptionsCreate]
  }
  @scala.inline
  implicit class DomainOptionsCreateOps[Self <: DomainOptionsCreate] (val x: Self) extends AnyVal {
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
    def setCollation(value: String): Self = this.set("collation", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCollation: Self = this.set("collation", js.undefined)
  }
  
}

