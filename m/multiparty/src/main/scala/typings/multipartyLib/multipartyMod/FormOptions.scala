package typings
package multipartyLib.multipartyMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormOptions extends js.Object {
  /**
    * Enables field events and disables part events for fields.
    * This is automatically set to true if you add a field listener.
    */
  var autoFields: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * Enables file events and disables part events for files.
    * This is automatically set to true if you add a file listener.
    */
  var autoFiles: js.UndefOr[scala.Boolean] = js.undefined
  /**
    * sets encoding for the incoming form fields. Defaults to utf8.
    */
  var encoding: js.UndefOr[java.lang.String] = js.undefined
  /**
    * Limits the number of fields that will be parsed before emitting an error event.
    * A file counts as a field in this case. Defaults to 1000.
    */
  var maxFields: js.UndefOr[scala.Double] = js.undefined
  /**
    * Limits the amount of memory all fields (not files) can allocate in bytes.
    * If this value is exceeded, an error event is emitted. The default size is 2MB.
    */
  var maxFieldsSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only relevant when autoFiles is true.
    * Limits the total bytes accepted for all files combined.
    * If this value is exceeded, an error event is emitted.
    * The default is Infinity.
    */
  var maxFilesSize: js.UndefOr[scala.Double] = js.undefined
  /**
    * Only relevant when autoFiles is true.
    * The directory for placing file uploads in.
    * You can move them later using fs.rename(). Defaults to os.tmpDir().
    */
  var uploadDir: js.UndefOr[java.lang.String] = js.undefined
}

object FormOptions {
  @scala.inline
  def apply(
    autoFields: js.UndefOr[scala.Boolean] = js.undefined,
    autoFiles: js.UndefOr[scala.Boolean] = js.undefined,
    encoding: java.lang.String = null,
    maxFields: scala.Int | scala.Double = null,
    maxFieldsSize: scala.Int | scala.Double = null,
    maxFilesSize: scala.Int | scala.Double = null,
    uploadDir: java.lang.String = null
  ): FormOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFields)) __obj.updateDynamic("autoFields")(autoFields)
    if (!js.isUndefined(autoFiles)) __obj.updateDynamic("autoFiles")(autoFiles)
    if (encoding != null) __obj.updateDynamic("encoding")(encoding)
    if (maxFields != null) __obj.updateDynamic("maxFields")(maxFields.asInstanceOf[js.Any])
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (maxFilesSize != null) __obj.updateDynamic("maxFilesSize")(maxFilesSize.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir)
    __obj.asInstanceOf[FormOptions]
  }
}

