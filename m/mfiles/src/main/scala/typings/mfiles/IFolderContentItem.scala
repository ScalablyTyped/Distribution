package typings.mfiles

import typings.mfiles.MFiles.MFFolderContentItemType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderContentItem extends js.Object {
  val FolderContentItemType: MFFolderContentItemType = js.native
  val ObjectVersion: IObjectVersion = js.native
  val PropertyFolder: ITypedValue = js.native
  val TraditionalFolder: ILookup = js.native
  val View: IView = js.native
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
  @scala.inline
  implicit class IFolderContentItemOps[Self <: IFolderContentItem] (val x: Self) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setFolderContentItemType(value: MFFolderContentItemType): Self = this.set("FolderContentItemType", value.asInstanceOf[js.Any])
    @scala.inline
    def setObjectVersion(value: IObjectVersion): Self = this.set("ObjectVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setPropertyFolder(value: ITypedValue): Self = this.set("PropertyFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setTraditionalFolder(value: ILookup): Self = this.set("TraditionalFolder", value.asInstanceOf[js.Any])
    @scala.inline
    def setView(value: IView): Self = this.set("View", value.asInstanceOf[js.Any])
  }
  
}

