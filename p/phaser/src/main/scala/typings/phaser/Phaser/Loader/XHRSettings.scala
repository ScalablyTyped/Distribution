package typings.phaser.Phaser.Loader

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Phaser.Loader.XHRSettings")
@js.native
object XHRSettings extends js.Object {
  /**
    * Creates an XHRSettings Object with default values.
    * @param responseType The responseType, such as 'text'. Default ''.
    * @param async Should the XHR request use async or not? Default true.
    * @param user Optional username for the XHR request. Default ''.
    * @param password Optional password for the XHR request. Default ''.
    * @param timeout Optional XHR timeout value. Default 0.
    */
  def apply(): XHRSettingsObject = js.native
  def apply(responseType: XMLHttpRequestResponseType): XHRSettingsObject = js.native
  def apply(responseType: XMLHttpRequestResponseType, async: Boolean): XHRSettingsObject = js.native
  def apply(responseType: XMLHttpRequestResponseType, async: Boolean, user: String): XHRSettingsObject = js.native
  def apply(responseType: XMLHttpRequestResponseType, async: Boolean, user: String, password: String): XHRSettingsObject = js.native
  def apply(
    responseType: XMLHttpRequestResponseType,
    async: Boolean,
    user: String,
    password: String,
    timeout: integer
  ): XHRSettingsObject = js.native
}

