package typings.officeJs.Office

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Provides options for saving settings.
  */
@js.native
trait SaveSettingsOptions extends js.Object {
  /**
    * A user-defined item of any type that is returned, unchanged, in the asyncContext property of the AsyncResult object that is passed to a callback.
    */
  var asyncContext: js.UndefOr[js.Any] = js.native
  /**
    * Indicates whether the setting will be replaced if stale.
    */
  var overwriteIfStale: js.UndefOr[Boolean] = js.native
}

object SaveSettingsOptions {
  @scala.inline
  def apply(): SaveSettingsOptions = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SaveSettingsOptions]
  }
  @scala.inline
  implicit class SaveSettingsOptionsOps[Self <: SaveSettingsOptions] (val x: Self) extends AnyVal {
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
    def setAsyncContext(value: js.Any): Self = this.set("asyncContext", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteAsyncContext: Self = this.set("asyncContext", js.undefined)
    @scala.inline
    def setOverwriteIfStale(value: Boolean): Self = this.set("overwriteIfStale", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteOverwriteIfStale: Self = this.set("overwriteIfStale", js.undefined)
  }
  
}

