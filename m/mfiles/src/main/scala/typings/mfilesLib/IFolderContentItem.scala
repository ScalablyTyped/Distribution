package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderContentItem extends js.Object {
  val FolderContentItemType: mfilesLib.MFilesNs.MFFolderContentItemType
  val ObjectVersion: IObjectVersion
  val PropertyFolder: ITypedValue
  val TraditionalFolder: ILookup
  val View: IView
}

object IFolderContentItem {
  @scala.inline
  def apply(
    FolderContentItemType: mfilesLib.MFilesNs.MFFolderContentItemType,
    ObjectVersion: IObjectVersion,
    PropertyFolder: ITypedValue,
    TraditionalFolder: ILookup,
    View: IView
  ): IFolderContentItem = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("FolderContentItemType")(FolderContentItemType)
    __obj.updateDynamic("ObjectVersion")(ObjectVersion)
    __obj.updateDynamic("PropertyFolder")(PropertyFolder)
    __obj.updateDynamic("TraditionalFolder")(TraditionalFolder)
    __obj.updateDynamic("View")(View)
    __obj.asInstanceOf[IFolderContentItem]
  }
}

