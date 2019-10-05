package typings.nwDotJs.NWJS_Helpers

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The clipboard object.
  */
@js.native
trait clip extends js.Object {
  /**
    * Clear the clipboard.
    */
  def clear(): Unit = js.native
  /**
    * Get the data of `type` from clipboard.
    *
    * @param type {string} (Optional) the type of the data. Support text, png, jpeg, html and rtf. By default, type is set to "text".
    * @param raw {boolean} (Optional) requiring raw image data. This option is only valid if type is png or jpeg.
    * @returns {string} the data retrieved from the clipboard.
    */
  def get(): String = js.native
  def get(`type`: String): String = js.native
  def get(`type`: String, raw: Boolean): String = js.native
  /**
    * Get an array contains list of available types of data in clipboard currenly.
    * You can use the returned list as a suggestion to get the right data from clipboard.
    *
    * @returns {string[]} List of available types of data in clipboard currenly.
    */
  def readAvailableTypes(): js.Array[String] = js.native
  /**
    * Write `data` of `type` to the clipboard.
    *
    * @param data {string} the data to write to the clipboard
    * @param type {string} (Optional) the type of the data. Support text, png, jpeg, html and rtf. By default, type is set to "text".
    * @param raw {boolean} (Optional) requiring raw image data. This option is only valid if type is png or jpeg. By default, raw is set to false.
    */
  def set(data: String): Unit = js.native
  def set(data: String, `type`: String): Unit = js.native
  def set(data: String, `type`: String, raw: Boolean): Unit = js.native
}

