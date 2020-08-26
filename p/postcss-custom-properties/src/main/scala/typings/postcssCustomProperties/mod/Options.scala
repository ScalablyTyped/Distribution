package typings.postcssCustomProperties.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options extends js.Object {
  /**
    * The exportTo option specifies destinations where Custom Properties can be exported to,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects.
    * Multiple destinations can be passed into this option, and they will be parsed in the order they are received.
    * JavaScript files, JSON files, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
    * @see {@link https://github.com/postcss/postcss-custom-properties#exportto}
    */
  var exportTo: js.UndefOr[ExportSources | js.Array[ExportSources]] = js.native
  /**
    * The importFrom option specifies sources where Custom Properties can be imported from,
    * which might be CSS, JS, and JSON files, functions, and directly passed objects.
    * Multiple sources can be passed into this option, and they will be parsed in the order they are received.
    * JavaScript files, JSON files, functions, and objects will need to namespace Custom Properties using the customProperties or custom-properties key.
    * @see {@link https://github.com/postcss/postcss-custom-properties#importfrom}
    */
  var importFrom: js.UndefOr[ImportSources | js.Array[ImportSources]] = js.native
  /**
    * The preserve option determines whether Custom Properties
    * and properties using custom properties should be preserved in their original form.
    * By default, both of these are preserved
    * @see {@link https://github.com/postcss/postcss-custom-properties#preserve}
    */
  var preserve: js.UndefOr[Boolean] = js.native
}

object Options {
  @scala.inline
  def apply(): Options = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options] (val x: Self) extends AnyVal {
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
    def setExportToVarargs(value: ExportSources*): Self = this.set("exportTo", js.Array(value :_*))
    @scala.inline
    def setExportToFunction1(value: /* customProperties */ CustomPropertiesObject => js.Any): Self = this.set("exportTo", js.Any.fromFunction1(value))
    @scala.inline
    def setExportTo(value: ExportSources | js.Array[ExportSources]): Self = this.set("exportTo", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteExportTo: Self = this.set("exportTo", js.undefined)
    @scala.inline
    def setImportFromVarargs(value: ImportSources*): Self = this.set("importFrom", js.Array(value :_*))
    @scala.inline
    def setImportFromFunction0(value: () => CustomPropertiesObject): Self = this.set("importFrom", js.Any.fromFunction0(value))
    @scala.inline
    def setImportFrom(value: ImportSources | js.Array[ImportSources]): Self = this.set("importFrom", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteImportFrom: Self = this.set("importFrom", js.undefined)
    @scala.inline
    def setPreserve(value: Boolean): Self = this.set("preserve", value.asInstanceOf[js.Any])
    @scala.inline
    def deletePreserve: Self = this.set("preserve", js.undefined)
  }
  
}

