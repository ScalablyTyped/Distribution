package typings.openfin.applicationOptionMod

import typings.openfin.shapesMod.ShortcutOverride
import typings.openfin.viewViewMod.ViewCreationOptions
import typings.openfin.windowOptionMod.WindowOption
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ApplicationOption extends LegacyWinOptionsInAppOptions {
  var commands: js.UndefOr[js.Array[ShortcutOverride]] = js.native
  var defaultViewOptions: js.UndefOr[ViewCreationOptions] = js.native
  var defaultWindowOptions: js.UndefOr[WindowOption] = js.native
  var disableIabSecureLogging: js.UndefOr[Boolean] = js.native
  var fdc3Api: js.UndefOr[Boolean] = js.native
  var isPlatformController: js.UndefOr[Boolean] = js.native
  var loadErrorMessage: js.UndefOr[String] = js.native
  var mainWindowOptions: js.UndefOr[WindowOption] = js.native
  var name: js.UndefOr[String] = js.native
  var nonPersistent: js.UndefOr[Boolean] = js.native
  var plugins: js.UndefOr[Boolean] = js.native
  var spellCheck: js.UndefOr[Boolean] = js.native
  var url: js.UndefOr[String] = js.native
  var uuid: String = js.native
  var webSecurity: js.UndefOr[Boolean] = js.native
}

object ApplicationOption {
  @scala.inline
  def apply(uuid: String): ApplicationOption = {
    val __obj = js.Dynamic.literal(uuid = uuid.asInstanceOf[js.Any])
    __obj.asInstanceOf[ApplicationOption]
  }
  @scala.inline
  implicit class ApplicationOptionOps[Self <: ApplicationOption] (val x: Self) extends AnyVal {
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
    def setUuid(value: String): Self = this.set("uuid", value.asInstanceOf[js.Any])
    @scala.inline
    def setCommandsVarargs(value: ShortcutOverride*): Self = this.set("commands", js.Array(value :_*))
    @scala.inline
    def setCommands(value: js.Array[ShortcutOverride]): Self = this.set("commands", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteCommands: Self = this.set("commands", js.undefined)
    @scala.inline
    def setDefaultViewOptions(value: ViewCreationOptions): Self = this.set("defaultViewOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultViewOptions: Self = this.set("defaultViewOptions", js.undefined)
    @scala.inline
    def setDefaultWindowOptions(value: WindowOption): Self = this.set("defaultWindowOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDefaultWindowOptions: Self = this.set("defaultWindowOptions", js.undefined)
    @scala.inline
    def setDisableIabSecureLogging(value: Boolean): Self = this.set("disableIabSecureLogging", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteDisableIabSecureLogging: Self = this.set("disableIabSecureLogging", js.undefined)
    @scala.inline
    def setFdc3Api(value: Boolean): Self = this.set("fdc3Api", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteFdc3Api: Self = this.set("fdc3Api", js.undefined)
    @scala.inline
    def setIsPlatformController(value: Boolean): Self = this.set("isPlatformController", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteIsPlatformController: Self = this.set("isPlatformController", js.undefined)
    @scala.inline
    def setLoadErrorMessage(value: String): Self = this.set("loadErrorMessage", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteLoadErrorMessage: Self = this.set("loadErrorMessage", js.undefined)
    @scala.inline
    def setMainWindowOptions(value: WindowOption): Self = this.set("mainWindowOptions", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMainWindowOptions: Self = this.set("mainWindowOptions", js.undefined)
    @scala.inline
    def setName(value: String): Self = this.set("name", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteName: Self = this.set("name", js.undefined)
    @scala.inline
    def setNonPersistent(value: Boolean): Self = this.set("nonPersistent", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteNonPersistent: Self = this.set("nonPersistent", js.undefined)
    @scala.inline
    def setPlugins(value: Boolean): Self = this.set("plugins", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePlugins: Self = this.set("plugins", js.undefined)
    @scala.inline
    def setSpellCheck(value: Boolean): Self = this.set("spellCheck", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteSpellCheck: Self = this.set("spellCheck", js.undefined)
    @scala.inline
    def setUrl(value: String): Self = this.set("url", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteUrl: Self = this.set("url", js.undefined)
    @scala.inline
    def setWebSecurity(value: Boolean): Self = this.set("webSecurity", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteWebSecurity: Self = this.set("webSecurity", js.undefined)
  }
  
}

