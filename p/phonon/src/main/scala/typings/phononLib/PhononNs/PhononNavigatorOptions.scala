package typings
package phononLib.PhononNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PhononNavigatorOptions extends js.Object {
  var animatePages: js.UndefOr[scala.Boolean] = js.undefined
  var defaultPage: js.UndefOr[java.lang.String] = js.undefined
  var defaultTemplateExtension: js.UndefOr[java.lang.String] = js.undefined
  var enableBrowserBackButton: js.UndefOr[scala.Boolean] = js.undefined
  var hashPrefix: js.UndefOr[java.lang.String] = js.undefined
  var templateRootDirectory: js.UndefOr[java.lang.String] = js.undefined
  var useHash: js.UndefOr[scala.Boolean] = js.undefined
}

object PhononNavigatorOptions {
  @scala.inline
  def apply(
    animatePages: js.UndefOr[scala.Boolean] = js.undefined,
    defaultPage: java.lang.String = null,
    defaultTemplateExtension: java.lang.String = null,
    enableBrowserBackButton: js.UndefOr[scala.Boolean] = js.undefined,
    hashPrefix: java.lang.String = null,
    templateRootDirectory: java.lang.String = null,
    useHash: js.UndefOr[scala.Boolean] = js.undefined
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

