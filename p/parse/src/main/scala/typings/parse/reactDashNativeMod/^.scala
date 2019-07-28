package typings.parse.reactDashNativeMod

import org.scalablytyped.runtime.StringDictionary
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parse/react-native", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  var VERSION: String = js.native
  var applicationId: String = js.native
  var javaScriptKey: js.UndefOr[String] = js.native
  var liveQueryServerURL: String = js.native
  var masterKey: js.UndefOr[String] = js.native
  var serverURL: String = js.native
  /**
    * Gets all contents from Local Datastore.
    */
  def dumpLocalDatastore(): js.Promise[StringDictionary[_]] = js.native
  /**
    * Enable pinning in your application.
    * This must be called before your application can use pinning.
    */
  def enableLocalDatastore(): Unit = js.native
  /**
    * Call this method first to set up your authentication tokens for Parse.
    * You can get your keys from the Data Browser on parse.com.
    * @param {String} applicationId Your Parse Application ID.
    * @param {String} javaScriptKey (optional) Your Parse JavaScript Key (Not needed for parse-server)
    * @param {String} masterKey (optional) Your Parse Master Key. (Node.js only!)
    */
  def initialize(applicationId: String): Unit = js.native
  def initialize(applicationId: String, javaScriptKey: String): Unit = js.native
  def initialize(applicationId: String, javaScriptKey: String, masterKey: String): Unit = js.native
  /**
    * Flag that indicates whether Local Datastore is enabled.
    */
  def isLocalDatastoreEnabled(): Boolean = js.native
  /**
    * Additionally on React-Native / Expo environments, add AsyncStorage from 'react-native' package
    * @param AsyncStorage AsyncStorage from 'react-native' package
    */
  def setAsyncStorage(AsyncStorage: js.Any): Unit = js.native
  def setLocalDatastoreController(controller: js.Any): Unit = js.native
}

