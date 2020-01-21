package typings.navigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("navigation", "HTML5HistoryManager")
@js.native
/**
  * Initializes a new instance of the HTML5HistoryManager class
  * @param applicationPath The application path
  */
class HTML5HistoryManager () extends HistoryManager {
  def this(applicationPath: String) = this()
  /**
    * Registers a listener for the popstate event
    * @param navigateHistory The history navigation event handler
    */
  def init(navigateHistory: js.Function0[Unit]): Unit = js.native
}

