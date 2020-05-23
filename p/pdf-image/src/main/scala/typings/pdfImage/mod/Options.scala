package typings.pdfImage.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var convertExtension: js.UndefOr[String] = js.undefined
  var convertOptions: js.UndefOr[ConvertOptions] = js.undefined
  var graphicsMagick: js.UndefOr[Boolean] = js.undefined
  var outputDirectory: js.UndefOr[String] = js.undefined
  var pdfFileBaseName: js.UndefOr[String] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    convertExtension: String = null,
    convertOptions: ConvertOptions = null,
    graphicsMagick: js.UndefOr[Boolean] = js.undefined,
    outputDirectory: String = null,
    pdfFileBaseName: String = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (convertExtension != null) __obj.updateDynamic("convertExtension")(convertExtension.asInstanceOf[js.Any])
    if (convertOptions != null) __obj.updateDynamic("convertOptions")(convertOptions.asInstanceOf[js.Any])
    if (!js.isUndefined(graphicsMagick)) __obj.updateDynamic("graphicsMagick")(graphicsMagick.get.asInstanceOf[js.Any])
    if (outputDirectory != null) __obj.updateDynamic("outputDirectory")(outputDirectory.asInstanceOf[js.Any])
    if (pdfFileBaseName != null) __obj.updateDynamic("pdfFileBaseName")(pdfFileBaseName.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

