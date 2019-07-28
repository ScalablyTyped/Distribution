package typings.nwDotJs.nwNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Shell: http://docs.nwjs.io/en/latest/References/Shell/ */
/**
  * `Shell` is a collection of APIs that do desktop related jobs.
  */
trait Shell extends js.Object {
  /**
    * Open the given external URI in the desktop"s default manner.
    *
    * @param uri {string} A URL to open in system default manner.
    */
  def openExternal(uri: String): Unit
  /**
    * Open the given file_path in the desktop"s default manner.
    *
    * @param file_path {string} path to a local file
    */
  def openItem(file_path: String): Unit
  /**
    * Show the given file_path in the parent folder with file manager. If possible, select the file.
    *
    * @param file_path {string} path to a local file
    */
  def showItemInFolder(file_path: String): Unit
}

object Shell {
  @scala.inline
  def apply(openExternal: String => Unit, openItem: String => Unit, showItemInFolder: String => Unit): Shell = {
    val __obj = js.Dynamic.literal(openExternal = js.Any.fromFunction1(openExternal), openItem = js.Any.fromFunction1(openItem), showItemInFolder = js.Any.fromFunction1(showItemInFolder))
  
    __obj.asInstanceOf[Shell]
  }
}

