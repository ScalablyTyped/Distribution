package typings.microsoftDashLiveDashConnect

import typings.microsoftDashLiveDashConnect.Microsoft.Live.IFile
import typings.microsoftDashLiveDashConnect.Microsoft.Live.IFolder
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  /**
    * Information on files choden in the picker.
    */
  var files: js.UndefOr[js.Array[IFile]] = js.undefined
  /**
    * Information on folders chosen in the picker.
    */
  var folders: js.UndefOr[js.Array[IFolder]] = js.undefined
}

object Anon_Files {
  @scala.inline
  def apply(files: js.Array[IFile] = null, folders: js.Array[IFolder] = null): Anon_Files = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files.asInstanceOf[js.Any])
    if (folders != null) __obj.updateDynamic("folders")(folders.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_Files]
  }
}

