package typings.multer.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FieldNameSize extends js.Object {
  /** Maximum size of each form field name in bytes. (Default: 100) */
  var fieldNameSize: js.UndefOr[Double] = js.undefined
  /** Maximum size of each form field value in bytes. (Default: 1048576) */
  var fieldSize: js.UndefOr[Double] = js.undefined
  /** Maximum number of non-file form fields. (Default: Infinity) */
  var fields: js.UndefOr[Double] = js.undefined
  /** Maximum size of each file in bytes. (Default: Infinity) */
  var fileSize: js.UndefOr[Double] = js.undefined
  /** Maximum number of file fields. (Default: Infinity) */
  var files: js.UndefOr[Double] = js.undefined
  /** Maximum number of headers. (Default: 2000) */
  var headerPairs: js.UndefOr[Double] = js.undefined
  /** Maximum number of parts (non-file fields + files). (Default: Infinity) */
  var parts: js.UndefOr[Double] = js.undefined
}

object FieldNameSize {
  @scala.inline
  def apply(
    fieldNameSize: js.UndefOr[Double] = js.undefined,
    fieldSize: js.UndefOr[Double] = js.undefined,
    fields: js.UndefOr[Double] = js.undefined,
    fileSize: js.UndefOr[Double] = js.undefined,
    files: js.UndefOr[Double] = js.undefined,
    headerPairs: js.UndefOr[Double] = js.undefined,
    parts: js.UndefOr[Double] = js.undefined
  ): FieldNameSize = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(fieldNameSize)) __obj.updateDynamic("fieldNameSize")(fieldNameSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fieldSize)) __obj.updateDynamic("fieldSize")(fieldSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fields)) __obj.updateDynamic("fields")(fields.get.asInstanceOf[js.Any])
    if (!js.isUndefined(fileSize)) __obj.updateDynamic("fileSize")(fileSize.get.asInstanceOf[js.Any])
    if (!js.isUndefined(files)) __obj.updateDynamic("files")(files.get.asInstanceOf[js.Any])
    if (!js.isUndefined(headerPairs)) __obj.updateDynamic("headerPairs")(headerPairs.get.asInstanceOf[js.Any])
    if (!js.isUndefined(parts)) __obj.updateDynamic("parts")(parts.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[FieldNameSize]
  }
}

