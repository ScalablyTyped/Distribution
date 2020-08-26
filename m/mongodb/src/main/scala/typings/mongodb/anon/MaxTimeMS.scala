package typings.mongodb.anon

import typings.mongodb.mod.ReadPreferenceOrMode
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MaxTimeMS extends js.Object {
  var maxTimeMS: js.UndefOr[Double] = js.native
  var readPreference: js.UndefOr[ReadPreferenceOrMode] = js.native
}

object MaxTimeMS {
  @scala.inline
  def apply(): MaxTimeMS = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMS]
  }
  @scala.inline
  implicit class MaxTimeMSOps[Self <: MaxTimeMS] (val x: Self) extends AnyVal {
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
    def setMaxTimeMS(value: Double): Self = this.set("maxTimeMS", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMaxTimeMS: Self = this.set("maxTimeMS", js.undefined)
    @scala.inline
    def setReadPreference(value: ReadPreferenceOrMode): Self = this.set("readPreference", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteReadPreference: Self = this.set("readPreference", js.undefined)
  }
  
}

