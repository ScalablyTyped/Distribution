package typings.parse.parseMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse", "initialize")
@js.native
object initialize extends js.Object {
  /**
    * Call this method first to set up your authentication tokens for Parse.
    * You can get your keys from the Data Browser on parse.com.
    * @param {String} applicationId Your Parse Application ID.
    * @param {String} javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
    * @param {String} masterKey (optional) Your Parse Master Key. (Node.js only!)
    */
  def apply(applicationId: String): Unit = js.native
  def apply(applicationId: String, javaScriptKey: String): Unit = js.native
  def apply(applicationId: String, javaScriptKey: String, masterKey: String): Unit = js.native
}

