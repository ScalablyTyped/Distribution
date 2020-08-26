package typings.nodePgMigrate.indexesTypesMod

import typings.nodePgMigrate.generalTypesMod.CascadeOption
import typings.nodePgMigrate.generalTypesMod.IfExistsOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait DropIndexOptions
  extends IfExistsOption
     with CascadeOption {
  var concurrently: js.UndefOr[Boolean] = js.native
  var name: js.UndefOr[String] = js.native
}

object DropIndexOptions {
  @scala.inline
  def apply(): DropIndexOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropIndexOptions]
  }
  @scala.inline
  implicit class DropIndexOptionsOps[Self <: DropIndexOptions] (val x: Self) extends AnyVal {
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
    def setConcurrently(value: Boolean): Self = this.set("concurrently", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteConcurrently: Self = this.set("concurrently", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
  }
  
}

