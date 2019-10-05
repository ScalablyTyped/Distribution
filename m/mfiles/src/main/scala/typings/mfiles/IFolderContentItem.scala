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
    val __obj = js.Dynamic.literal(FolderContentItemType = FolderContentItemType, ObjectVersion = ObjectVersion, PropertyFolder = PropertyFolder, TraditionalFolder = TraditionalFolder, View = View)
  
    __obj.asInstanceOf[IFolderContentItem]
  }
}

