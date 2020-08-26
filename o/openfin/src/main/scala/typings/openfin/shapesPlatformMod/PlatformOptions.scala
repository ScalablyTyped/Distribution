package typings.openfin.shapesPlatformMod

import typings.openfin.applicationOptionMod.ApplicationOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait PlatformOptions extends ApplicationOption {
  @JSName("defaultWindowOptions")
  var defaultWindowOptions_PlatformOptions: js.UndefOr[DefaultWindowOptions] = js.native
  var disableDefaultCommands: js.UndefOr[Boolean] = js.native
}

object PlatformOptions {
  @scala.inline
  def apply(uuid: String): PlatformOptions = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[PlatformOptions]
  }
  @scala.inline
  implicit class PlatformOptionsOps[Self <: PlatformOptions] (val x: Self) extends AnyVal {
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
    def setDefaultWindowOptions(value: DefaultWindowOptions): Self = this.set("defaultWindowOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWindowOptions: Self = this.set("defaultWindowOptions", js.undefined)
    @scala.inline
    def setDisableDefaultCommands(value: Boolean): Self = this.set("disableDefaultCommands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableDefaultCommands: Self = this.set("disableDefaultCommands", js.undefined)
  }
  
}

