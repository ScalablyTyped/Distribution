package typings
package microsoftDashLiveDashConnectLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Files extends js.Object {
  /**
    * Information on files choden in the picker.
    */
  var files: js.UndefOr[js.Array[microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IFile]] = js.undefined
  /**
    * Information on folders chosen in the picker.
    */
  var folders: js.UndefOr[js.Array[microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IFolder]] = js.undefined
}

object Anon_Files {
  @scala.inline
  def apply(
    files: js.Array[microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IFile] = null,
    folders: js.Array[microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs.IFolder] = null
  ): Anon_Files = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (folders != null) __obj.updateDynamic("folders")(folders)
    __obj.asInstanceOf[Anon_Files]
  }
}

