package typings
package nwDotJsLib.nwNs

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
  def openExternal(uri: java.lang.String): scala.Unit
  /**
    * Open the given file_path in the desktop"s default manner.
    *
    * @param file_path {string} path to a local file
    */
  def openItem(file_path: java.lang.String): scala.Unit
  /**
    * Show the given file_path in the parent folder with file manager. If possible, select the file.
    *
    * @param file_path {string} path to a local file
    */
  def showItemInFolder(file_path: java.lang.String): scala.Unit
}

object Shell {
  @scala.inline
  def apply(
    openExternal: js.Function1[java.lang.String, scala.Unit],
    openItem: js.Function1[java.lang.String, scala.Unit],
    showItemInFolder: js.Function1[java.lang.String, scala.Unit]
  ): Shell = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("openExternal")(openExternal)
    __obj.updateDynamic("openItem")(openItem)
    __obj.updateDynamic("showItemInFolder")(showItemInFolder)
    __obj.asInstanceOf[Shell]
  }
}

