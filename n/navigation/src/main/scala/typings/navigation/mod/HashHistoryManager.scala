package typings.navigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("navigation", "HashHistoryManager")
@js.native
/**
  * Initializes a new instance of the HashHistoryManager class
  * @param replaceQueryIdentifier a value indicating whether to use '#'
  * in place of '?'. Set to true for Internet explorer 6 and 7 support
  */
class HashHistoryManager () extends HistoryManager {
  def this(replaceQueryIdentifier: Boolean) = this()
  
  /**
    * Sets the browser Url's hash to the url
    * @param url The current url
    * @param replace A value indicating whether to replace the current
    * browser history entry
    */
  def addHistory(url: String, replace: Boolean): Unit = js.native
  
  /**
    * Registers a listener for the hashchange event
    * @param navigateHistory The history navigation event handler
    */
  def init(navigateHistory: js.Any): Unit = js.native
}
