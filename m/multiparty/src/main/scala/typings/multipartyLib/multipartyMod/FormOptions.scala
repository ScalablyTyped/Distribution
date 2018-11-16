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

