package typings.natsHemera.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait LoadProcessConfig extends js.Object {
  var sampleInterval: js.UndefOr[Double] = js.native
}

object LoadProcessConfig {
  @scala.inline
  def apply(): LoadProcessConfig = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[LoadProcessConfig]
  }
  @scala.inline
  implicit class LoadProcessConfigOps[Self <: LoadProcessConfig] (val x: Self) extends AnyVal {
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
    def setSampleInterval(value: Double): Self = this.set("sampleInterval", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSampleInterval: Self = this.set("sampleInterval", js.undefined)
  }
  
}

