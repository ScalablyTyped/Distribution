package typings.nodePgMigrate.sequencesTypesMod

import typings.nodePgMigrate.generalTypesMod.Type
import typings.nodePgMigrate.nodePgMigrateBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SequenceOptions extends js.Object {
  var cache: js.UndefOr[Double] = js.native
  var cycle: js.UndefOr[Boolean] = js.native
  var increment: js.UndefOr[Double] = js.native
  var maxvalue: js.UndefOr[Double | Null | `false`] = js.native
  var minvalue: js.UndefOr[Double | Null | `false`] = js.native
  var owner: js.UndefOr[String | Null | `false`] = js.native
  var start: js.UndefOr[Double] = js.native
  var `type`: js.UndefOr[Type] = js.native
}

object SequenceOptions {
  @scala.inline
  def apply(): SequenceOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SequenceOptions]
  }
  @scala.inline
  implicit class SequenceOptionsOps[Self <: SequenceOptions] (val x: Self) extends AnyVal {
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
    def setCache(value: Double): Self = this.set("cache", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCache: Self = this.set("cache", js.undefined)
    @scala.inline
    def setCycle(value: Boolean): Self = this.set("cycle", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCycle: Self = this.set("cycle", js.undefined)
    @scala.inline
    def setIncrement(value: Double): Self = this.set("increment", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIncrement: Self = this.set("increment", js.undefined)
    @scala.inline
    def setMaxvalue(value: Double | `false`): Self = this.set("maxvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxvalue: Self = this.set("maxvalue", js.undefined)
    @scala.inline
    def setMaxvalueNull: Self = this.set("maxvalue", null)
    @scala.inline
    def setMinvalue(value: Double | `false`): Self = this.set("minvalue", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMinvalue: Self = this.set("minvalue", js.undefined)
    @scala.inline
    def setMinvalueNull: Self = this.set("minvalue", null)
    @scala.inline
    def setOwner(value: String | `false`): Self = this.set("owner", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOwner: Self = this.set("owner", js.undefined)
    @scala.inline
    def setOwnerNull: Self = this.set("owner", null)
    @scala.inline
    def setStart(value: Double): Self = this.set("start", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteStart: Self = this.set("start", js.undefined)
    @scala.inline
    def setType(value: Type): Self = this.set("type", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteType: Self = this.set("type", js.undefined)
  }
  
}

