package typings.navigation.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

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
    * Registers a listener for the hashchange event
    * @param navigateHistory The history navigation event handler
    */
  def init(navigateHistory: js.Any): Unit = js.native
}

