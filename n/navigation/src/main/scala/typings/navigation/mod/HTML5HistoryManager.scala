package typings.navigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("navigation", "HTML5HistoryManager")
@js.native
/**
  * Initializes a new instance of the HTML5HistoryManager class
  * @param applicationPath The application path
  */
class HTML5HistoryManager () extends HistoryManager {
  def this(applicationPath: String) = this()
  
  /**
    * Sets the browser Url to the url using pushState
    * @param url The current url
    * @param replace A value indicating whether to replace the current
    * browser history entry
    */
  def addHistory(url: String, replace: Boolean): Unit = js.native
  
  /**
    * Registers a listener for the popstate event
    * @param navigateHistory The history navigation event handler
    */
  def init(navigateHistory: js.Function0[Unit]): Unit = js.native
}
