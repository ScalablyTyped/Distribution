package typings
package openpgpLib.openpgpMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("openpgp", "LocalStorage")
@js.native
/**
  * This object is used for storing and retrieving configuration from HTML5 local storage.
  */
class LocalStorage () extends js.Object {
  /**
    * Reads the config out of the HTML5 local storage
    * and initializes the object config.
    * if config is null the default config will be used
    */
  def read(): scala.Unit = js.native
  /**
    * Writes the config to HTML5 local storage
    */
  def write(): scala.Unit = js.native
}

