package typings.phonon.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononNavigatorOptions extends js.Object {
  var animatePages: js.UndefOr[Boolean] = js.undefined
  var defaultPage: js.UndefOr[String] = js.undefined
  var defaultTemplateExtension: js.UndefOr[String] = js.undefined
  var enableBrowserBackButton: js.UndefOr[Boolean] = js.undefined
  var hashPrefix: js.UndefOr[String] = js.undefined
  var templateRootDirectory: js.UndefOr[String] = js.undefined
  var useHash: js.UndefOr[Boolean] = js.undefined
}

object PhononNavigatorOptions {
  @scala.inline
  def apply(
    animatePages: js.UndefOr[Boolean] = js.undefined,
    defaultPage: String = null,
    defaultTemplateExtension: String = null,
    enableBrowserBackButton: js.UndefOr[Boolean] = js.undefined,
    hashPrefix: String = null,
    templateRootDirectory: String = null,
    useHash: js.UndefOr[Boolean] = js.undefined
  ): PhononNavigatorOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(animatePages)) __obj.updateDynamic("animatePages")(animatePages)
    if (defaultPage != null) __obj.updateDynamic("defaultPage")(defaultPage)
    if (defaultTemplateExtension != null) __obj.updateDynamic("defaultTemplateExtension")(defaultTemplateExtension)
    if (!js.isUndefined(enableBrowserBackButton)) __obj.updateDynamic("enableBrowserBackButton")(enableBrowserBackButton)
    if (hashPrefix != null) __obj.updateDynamic("hashPrefix")(hashPrefix)
    if (templateRootDirectory != null) __obj.updateDynamic("templateRootDirectory")(templateRootDirectory)
    if (!js.isUndefined(useHash)) __obj.updateDynamic("useHash")(useHash)
    __obj.asInstanceOf[PhononNavigatorOptions]
  }
}

