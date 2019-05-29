package typings
package atPhosphorCoreutilsLib.libMimeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@phosphor/coreutils/lib/mime", "MimeData")
@js.native
class MimeData () extends js.Object {
  var _types: js.Any = js.native
  var _values: js.Any = js.native
  /**
    * Remove all data entries from the dataset.
    */
  def clear(): scala.Unit = js.native
  /**
    * Remove the data entry for the given MIME type.
    *
    * @param mime - The MIME type of interest.
    *
    * #### Notes
    * This is a no-op if there is no entry for the given MIME type.
    */
  def clearData(mime: java.lang.String): scala.Unit = js.native
  /**
    * Get the data value for the given MIME type.
    *
    * @param mime - The MIME type of interest.
    *
    * @returns The value for the given MIME type, or `undefined` if
    *   the dataset does not contain a value for the type.
    */
  def getData(mime: java.lang.String): js.UndefOr[js.Any] = js.native
  /**
    * Test whether the dataset has an entry for the given type.
    *
    * @param mime - The MIME type of interest.
    *
    * @returns `true` if the dataset contains a value for the given
    *   MIME type, `false` otherwise.
    */
  def hasData(mime: java.lang.String): scala.Boolean = js.native
  /**
    * Set the data value for the given MIME type.
    *
    * @param mime - The MIME type of interest.
    *
    * @param data - The data value for the given MIME type.
    *
    * #### Notes
    * This will overwrite any previous entry for the MIME type.
    */
  def setData(mime: java.lang.String, data: js.Any): scala.Unit = js.native
  /**
    * Get an array of the MIME types contained within the dataset.
    *
    * @returns A new array of the MIME types, in order of insertion.
    */
  def types(): js.Array[java.lang.String] = js.native
}

