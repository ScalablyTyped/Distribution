package typings.playcanvas.global.pc

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Handles localization. Responsible for loading localization assets
  * and returning translations for a certain key. Can also handle plural forms. To override
  * its default behaviour define a different implementation for {@link pc.I18n#getText} and {@link pc.I18n#getPluralText}.
  * @property locale - The current locale for example "en-US". Changing the locale will raise an event which will cause localized Text Elements to
  * change language to the new locale.
  * @property assets - An array of asset ids or assets that contain localization data in the expected format. I18n will automatically load
  * translations from these assets as the assets are loaded and it will also automatically unload translations if the assets get removed or unloaded at runtime.
  * @param app - The application.
  */
@JSGlobal("pc.I18n")
@js.native
class I18n protected ()
  extends typings.playcanvas.pc.I18n {
  def this(app: typings.playcanvas.pc.Application) = this()
}

