package typings
package parseLib.ParseNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("Parse")
@js.native
object ParseNsMembers extends js.Object {
  var VERSION: java.lang.String = js.native
  var applicationId: java.lang.String = js.native
  var javaScriptKey: js.UndefOr[java.lang.String] = js.native
  var liveQueryServerURL: java.lang.String = js.native
  var masterKey: js.UndefOr[java.lang.String] = js.native
  var serverURL: java.lang.String = js.native
  /**
    * Call this method first to set up your authentication tokens for Parse.
    * You can get your keys from the Data Browser on parse.com.
    * @param {String} applicationId Your Parse Application ID.
    * @param {String} javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
    * @param {String} masterKey (optional) Your Parse Master Key. (Node.js only!)
    */
  def initialize(applicationId: java.lang.String): scala.Unit = js.native
  def initialize(applicationId: java.lang.String, javaScriptKey: java.lang.String): scala.Unit = js.native
  def initialize(applicationId: java.lang.String, javaScriptKey: java.lang.String, masterKey: java.lang.String): scala.Unit = js.native
  /**
    * Additionally on React-Native / Expo environments, add AsyncStorage from 'react-native' package
    * @param AsyncStorage AsyncStorage from 'react-native' package
    */
  def setAsyncStorage(AsyncStorage: js.Any): scala.Unit = js.native
}

