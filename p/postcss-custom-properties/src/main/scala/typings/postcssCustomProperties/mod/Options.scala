package typings.postcssCustomProperties.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
    * The exportTo option specifies destinations where Custom Properties can be exported to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects.
    * Multiple destinations can be passed into this option, and they will be parsed in the order they are received.
    * JavaScript files, JSON files, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
    * @see {@link https://github.com/postcss/postcss-custom-properties#exportto}
    */
  var exportTo: js.UndefOr[ExportSources | js.Array[ExportSources]] = js.undefined
  /**
    * The importFrom option specifies sources where Custom Properties can be imported from,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects.
    * Multiple sources can be passed into this option, and they will be parsed in the order they are received.
    * JavaScript files, JSON files, functions, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
    * @see {@link https://github.com/postcss/postcss-custom-properties#importfrom}
    */
  var importFrom: js.UndefOr[ImportSources | js.Array[ImportSources]] = js.undefined
  /**
    * The preserve option determines whether Custom Properties
    * and properties using custom properties should be preserved in their original form.
    * By default, both of these are preserved
    * @see {@link https://github.com/postcss/postcss-custom-properties#preserve}
    */
  var preserve: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    exportTo: ExportSources | js.Array[ExportSources] = null,
    importFrom: ImportSources | js.Array[ImportSources] = null,
    preserve: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (exportTo != null) __obj.updateDynamic("exportTo")(exportTo.asInstanceOf[js.Any])
    if (importFrom != null) __obj.updateDynamic("importFrom")(importFrom.asInstanceOf[js.Any])
    if (!js.isUndefined(preserve)) __obj.updateDynamic("preserve")(preserve.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

