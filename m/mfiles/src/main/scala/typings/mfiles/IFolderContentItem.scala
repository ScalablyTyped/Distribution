package typings.mfiles

import typings.mfiles.MFiles.MFFolderContentItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderContentItem extends js.Object {
  val FolderContentItemType: MFFolderContentItemType
  val ObjectVersion: IObjectVersion
  val PropertyFolder: ITypedValue
  val TraditionalFolder: ILookup
  val View: IView
}

object IFolderContentItem {
  @scala.inline
  def apply(
    FolderContentItemType: MFFolderContentItemType,
    ObjectVersion: IObjectVersion,
    PropertyFolder: ITypedValue,
    TraditionalFolder: ILookup,
    View: IView
  ): IFolderContentItem = {
    val __obj = js.Dynamic.literal(FolderContentItemType = FolderContentItemType.asInstanceOf[js.Any], ObjectVersion = ObjectVersion.asInstanceOf[js.Any], PropertyFolder = PropertyFolder.asInstanceOf[js.Any], TraditionalFolder = TraditionalFolder.asInstanceOf[js.Any], View = View.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFolderContentItem]
  }
}

