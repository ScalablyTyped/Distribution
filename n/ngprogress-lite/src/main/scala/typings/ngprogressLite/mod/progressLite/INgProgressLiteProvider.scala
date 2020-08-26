package typings.ngprogressLite.mod.progressLite

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait INgProgressLiteProvider extends js.Object {
  var settings: IConfigurationOptions = js.native
}

object INgProgressLiteProvider {
  @scala.inline
  def apply(settings: IConfigurationOptions): INgProgressLiteProvider = {
    val __obj = js.Dynamic.literal(settings = settings.asInstanceOf[js.Any])
    __obj.asInstanceOf[INgProgressLiteProvider]
  }
  @scala.inline
  implicit class INgProgressLiteProviderOps[Self <: INgProgressLiteProvider] (val x: Self) extends AnyVal {
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
    def setSettings(value: IConfigurationOptions): Self = this.set("settings", value.asInstanceOf[js.Any])
  }
  
}

