package typings.microsoftLiveConnect

import typings.microsoftLiveConnect.Microsoft.Live.IFile
import typings.microsoftLiveConnect.Microsoft.Live.IFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonFiles extends js.Object {
  /**
    * Information on files choden in the picker.
    */
  var files: js.UndefOr[js.Array[IFile]] = js.undefined
  /**
    * Information on folders chosen in the picker.
    */
  var folders: js.UndefOr[js.Array[IFolder]] = js.undefined
}

object AnonFiles {
  @scala.inline
  def apply(files: js.Array[IFile] = null, folders: js.Array[IFolder] = null): AnonFiles = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[AnonFiles]
  }
}

