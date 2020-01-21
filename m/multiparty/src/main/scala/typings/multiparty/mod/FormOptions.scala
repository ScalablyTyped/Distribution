package typings.multiparty.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait FormOptions extends js.Object {
  /**
    * Enables field events and disables part events for fields.
    * This is automatically set to true if you add a field listener.
    */
  var autoFields: js.UndefOr[Boolean] = js.undefined
  /**
    * Enables file events and disables part events for files.
    * This is automatically set to true if you add a file listener.
    */
  var autoFiles: js.UndefOr[Boolean] = js.undefined
  /**
    * sets encoding for the incoming form fields. Defaults to utf8.
    */
  var encoding: js.UndefOr[String] = js.undefined
  /**
    * Limits the number of fields that will be parsed before emitting an error event.
    * A file counts as a field in this case. Defaults to 1000.
    */
  var maxFields: js.UndefOr[Double] = js.undefined
  /**
    * Limits the amount of memory all fields (not files) can allocate in bytes.
    * If this value is exceeded, an error event is emitted. The default size is 2MB.
    */
  var maxFieldsSize: js.UndefOr[Double] = js.undefined
  /**
    * Only relevant when autoFiles is true.
    * Limits the total bytes accepted for all files combined.
    * If this value is exceeded, an error event is emitted.
    * The default is Infinity.
    */
  var maxFilesSize: js.UndefOr[Double] = js.undefined
  /**
    * Only relevant when autoFiles is true.
    * The directory for placing file uploads in.
    * You can move them later using fs.rename(). Defaults to os.tmpDir().
    */
  var uploadDir: js.UndefOr[String] = js.undefined
}

object FormOptions {
  @scala.inline
  def apply(
    autoFields: js.UndefOr[Boolean] = js.undefined,
    autoFiles: js.UndefOr[Boolean] = js.undefined,
    encoding: String = null,
    maxFields: Int | Double = null,
    maxFieldsSize: Int | Double = null,
    maxFilesSize: Int | Double = null,
    uploadDir: String = null
  ): FormOptions = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(autoFields)) __obj.updateDynamic("autoFields")(autoFields.asInstanceOf[js.Any])
    if (!js.isUndefined(autoFiles)) __obj.updateDynamic("autoFiles")(autoFiles.asInstanceOf[js.Any])
    if (encoding != null) __obj.updateDynamic("encoding")(encoding.asInstanceOf[js.Any])
    if (maxFields != null) __obj.updateDynamic("maxFields")(maxFields.asInstanceOf[js.Any])
    if (maxFieldsSize != null) __obj.updateDynamic("maxFieldsSize")(maxFieldsSize.asInstanceOf[js.Any])
    if (maxFilesSize != null) __obj.updateDynamic("maxFilesSize")(maxFilesSize.asInstanceOf[js.Any])
    if (uploadDir != null) __obj.updateDynamic("uploadDir")(uploadDir.asInstanceOf[js.Any])
    __obj.asInstanceOf[FormOptions]
  }
}

