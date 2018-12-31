package typings
package nwDotJsLib.NWJSUnderscoreHelpersNs

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
  def clear(): scala.Unit = js.native
  /**
    * Get the data of `type` from clipboard.
    *
    * @param type {string} (Optional) the type of the data. Support text, png, jpeg, html and rtf. By default, type is set to "text".
    * @param raw {boolean} (Optional) requiring raw image data. This option is only valid if type is png or jpeg.
    * @returns {string} the data retrieved from the clipboard.
    */
  def get(): java.lang.String = js.native
  def get(`type`: java.lang.String): java.lang.String = js.native
  def get(`type`: java.lang.String, raw: scala.Boolean): java.lang.String = js.native
  /**
    * Get an array contains list of available types of data in clipboard currenly.
    * You can use the returned list as a suggestion to get the right data from clipboard.
    *
    * @returns {string[]} List of available types of data in clipboard currenly.
    */
  def readAvailableTypes(): js.Array[java.lang.String] = js.native
  /**
    * Write `data` of `type` to the clipboard.
    *
    * @param data {string} the data to write to the clipboard
    * @param type {string} (Optional) the type of the data. Support text, png, jpeg, html and rtf. By default, type is set to "text".
    * @param raw {boolean} (Optional) requiring raw image data. This option is only valid if type is png or jpeg. By default, raw is set to false.
    */
  def set(data: java.lang.String): scala.Unit = js.native
  def set(data: java.lang.String, `type`: java.lang.String): scala.Unit = js.native
  def set(data: java.lang.String, `type`: java.lang.String, raw: scala.Boolean): scala.Unit = js.native
}

