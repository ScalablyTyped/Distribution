package typings.mongoose.mod

import typings.std.Date
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait SchemaTimestampsConfig extends js.Object {
  var createdAt: js.UndefOr[Boolean | String] = js.native
  var currentTime: js.UndefOr[js.Function0[Date | Double]] = js.native
  var updatedAt: js.UndefOr[Boolean | String] = js.native
}

object SchemaTimestampsConfig {
  @scala.inline
  def apply(): SchemaTimestampsConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SchemaTimestampsConfig]
  }
  @scala.inline
  implicit class SchemaTimestampsConfigOps[Self <: SchemaTimestampsConfig] (val x: Self) extends AnyVal {
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
    def setCreatedAt(value: Boolean | String): Self = this.set("createdAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCreatedAt: Self = this.set("createdAt", js.undefined)
    @scala.inline
    def setCurrentTime(value: () => Date | Double): Self = this.set("currentTime", js.Any.fromFunction0(value))
    @scala.inline
    def deleteCurrentTime: Self = this.set("currentTime", js.undefined)
    @scala.inline
    def setUpdatedAt(value: Boolean | String): Self = this.set("updatedAt", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUpdatedAt: Self = this.set("updatedAt", js.undefined)
  }
  
}

