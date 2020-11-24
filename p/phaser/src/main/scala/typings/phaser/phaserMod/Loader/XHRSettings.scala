package typings.phaser.phaserMod.Loader

import typings.phaser.Phaser.Types.Loader.XHRSettingsObject
import typings.phaser.integer
import typings.std.XMLHttpRequestResponseType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("phaser", "Loader.XHRSettings")
@js.native
object XHRSettings extends js.Object {
  
  /**
    * Creates an XHRSettings Object with default values.
    * @param responseType The responseType, such as 'text'. Default ''.
    * @param async Should the XHR request use async or not? Default true.
    * @param user Optional username for the XHR request. Default ''.
    * @param password Optional password for the XHR request. Default ''.
    * @param timeout Optional XHR timeout value. Default 0.
    * @param withCredentials Optional XHR withCredentials value. Default false.
    */
  def apply(
    responseType: js.UndefOr[XMLHttpRequestResponseType],
    async: js.UndefOr[Boolean],
    user: js.UndefOr[String],
    password: js.UndefOr[String],
    timeout: js.UndefOr[integer],
    withCredentials: js.UndefOr[Boolean]
  ): XHRSettingsObject = js.native
}
