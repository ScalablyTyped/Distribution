package typings
package poiLib.poiMod.ConfigNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Output extends js.Object {
  var clean: js.UndefOr[scala.Boolean] = js.undefined
  var dir: js.UndefOr[java.lang.String] = js.undefined
  var fileNames: js.UndefOr[poiLib.poiMod.ConfigNs.OutputNs.FileNames] = js.undefined
  var format: js.UndefOr[poiLib.poiLibStrings.iife | poiLib.poiLibStrings.cjs | poiLib.poiLibStrings.umd] = js.undefined
  var html: js.UndefOr[poiLib.poiMod.ConfigNs.OutputNs.Html] = js.undefined
  var minimize: js.UndefOr[scala.Boolean] = js.undefined
  var moduleName: js.UndefOr[java.lang.String] = js.undefined
  var publicUrl: js.UndefOr[java.lang.String] = js.undefined
  var sourceMap: js.UndefOr[scala.Boolean] = js.undefined
  var target: js.UndefOr[
    poiLib.poiLibStrings.web | poiLib.poiLibStrings.electron | poiLib.poiLibStrings.`electron-renderer` | poiLib.poiLibStrings.`electron-main` | poiLib.poiLibStrings.node | poiLib.poiLibStrings.`node-webkit` | poiLib.poiLibStrings.`async-node` | poiLib.poiLibStrings.webworker
  ] = js.undefined
}

object Output {
  @scala.inline
  def apply(
    clean: js.UndefOr[scala.Boolean] = js.undefined,
    dir: java.lang.String = null,
    fileNames: poiLib.poiMod.ConfigNs.OutputNs.FileNames = null,
    format: poiLib.poiLibStrings.iife | poiLib.poiLibStrings.cjs | poiLib.poiLibStrings.umd = null,
    html: poiLib.poiMod.ConfigNs.OutputNs.Html = null,
    minimize: js.UndefOr[scala.Boolean] = js.undefined,
    moduleName: java.lang.String = null,
    publicUrl: java.lang.String = null,
    sourceMap: js.UndefOr[scala.Boolean] = js.undefined,
    target: poiLib.poiLibStrings.web | poiLib.poiLibStrings.electron | poiLib.poiLibStrings.`electron-renderer` | poiLib.poiLibStrings.`electron-main` | poiLib.poiLibStrings.node | poiLib.poiLibStrings.`node-webkit` | poiLib.poiLibStrings.`async-node` | poiLib.poiLibStrings.webworker = null
  ): Output = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(clean)) __obj.updateDynamic("clean")(clean)
    if (dir != null) __obj.updateDynamic("dir")(dir)
    if (fileNames != null) __obj.updateDynamic("fileNames")(fileNames)
    if (format != null) __obj.updateDynamic("format")(format.asInstanceOf[js.Any])
    if (html != null) __obj.updateDynamic("html")(html.asInstanceOf[js.Any])
    if (!js.isUndefined(minimize)) __obj.updateDynamic("minimize")(minimize)
    if (moduleName != null) __obj.updateDynamic("moduleName")(moduleName)
    if (publicUrl != null) __obj.updateDynamic("publicUrl")(publicUrl)
    if (!js.isUndefined(sourceMap)) __obj.updateDynamic("sourceMap")(sourceMap)
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    __obj.asInstanceOf[Output]
  }
}

