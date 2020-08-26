package typings.parse.mod.global.Parse

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse.initialize")
@js.native
object initialize extends js.Object {
  /**
    * Call this method first to set up your authentication tokens for Parse.
    * You can get your keys from the Data Browser on parse.com.
    * @param applicationId Your Parse Application ID.
    * @param javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
    * @param masterKey (optional) Your Parse Master Key. (Node.js only!)
    */
  def apply(applicationId: String): Unit = js.native
  def apply(applicationId: String, javaScriptKey: js.UndefOr[scala.Nothing], masterKey: String): Unit = js.native
  def apply(applicationId: String, javaScriptKey: String): Unit = js.native
  def apply(applicationId: String, javaScriptKey: String, masterKey: String): Unit = js.native
}

