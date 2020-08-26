package typings.mfiles

import typings.mfiles.MFiles.MFSearchFlags
import typings.mfiles.MFiles.MFViewFlag
import typings.mfiles.MFiles.MFViewType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IView extends js.Object {
  var AccessControlList: IAccessControlList = js.native
  var Common: Boolean = js.native
  val GUID: String = js.native
  var HasParent: Boolean = js.native
  var ID: Double = js.native
  var Levels: IExpressionExs = js.native
  var LookInAllVersions: Boolean = js.native
  var Name: String = js.native
  var Parent: Double = js.native
  var ReturnLatestVisibleVersion: Boolean = js.native
  var SearchConditions: ISearchConditions = js.native
  var SearchDef: ISearchDef = js.native
  var SearchFlags: MFSearchFlags = js.native
  var ViewFlags: MFViewFlag = js.native
  var ViewLocation: IViewLocation = js.native
  var ViewType: MFViewType = js.native
  var Visible: Boolean = js.native
  def Clone(): IView = js.native
  def CloneFrom(View: IView): Unit = js.native
}

object IView {
  @scala.inline
  def apply(
    AccessControlList: IAccessControlList,
    Clone: () => IView,
    CloneFrom: IView => Unit,
    Common: Boolean,
    GUID: String,
    HasParent: Boolean,
    ID: Double,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    Name: String,
    Parent: Double,
    ReturnLatestVisibleVersion: Boolean,
    SearchConditions: ISearchConditions,
    SearchDef: ISearchDef,
    SearchFlags: MFSearchFlags,
    ViewFlags: MFViewFlag,
    ViewLocation: IViewLocation,
    ViewType: MFViewType,
    Visible: Boolean
  ): IView = {
    val __obj = js.Dynamic.literal(AccessControlList = AccessControlList.asInstanceOf[js.Any], Clone = js.Any.fromFunction0(Clone), CloneFrom = js.Any.fromFunction1(CloneFrom), Common = Common.asInstanceOf[js.Any], GUID = GUID.asInstanceOf[js.Any], HasParent = HasParent.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Parent = Parent.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchConditions = SearchConditions.asInstanceOf[js.Any], SearchDef = SearchDef.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any], ViewFlags = ViewFlags.asInstanceOf[js.Any], ViewLocation = ViewLocation.asInstanceOf[js.Any], ViewType = ViewType.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any])
    __obj.asInstanceOf[IView]
  }
  @scala.inline
  implicit class IViewOps[Self <: IView] (val x: Self) extends AnyVal {
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
    def setAccessControlList(value: IAccessControlList): Self = this.set("AccessControlList", value.asInstanceOf[js.Any])
    @scala.inline
    def setClone(value: () => IView): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setCloneFrom(value: IView => Unit): Self = this.set("CloneFrom", js.Any.fromFunction1(value))
    @scala.inline
    def setCommon(value: Boolean): Self = this.set("Common", value.asInstanceOf[js.Any])
    @scala.inline
    def setGUID(value: String): Self = this.set("GUID", value.asInstanceOf[js.Any])
    @scala.inline
    def setHasParent(value: Boolean): Self = this.set("HasParent", value.asInstanceOf[js.Any])
    @scala.inline
    def setID(value: Double): Self = this.set("ID", value.asInstanceOf[js.Any])
    @scala.inline
    def setLevels(value: IExpressionExs): Self = this.set("Levels", value.asInstanceOf[js.Any])
    @scala.inline
    def setLookInAllVersions(value: Boolean): Self = this.set("LookInAllVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setName(value: String): Self = this.set("Name", value.asInstanceOf[js.Any])
    @scala.inline
    def setParent(value: Double): Self = this.set("Parent", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnLatestVisibleVersion(value: Boolean): Self = this.set("ReturnLatestVisibleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchConditions(value: ISearchConditions): Self = this.set("SearchConditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchDef(value: ISearchDef): Self = this.set("SearchDef", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchFlags(value: MFSearchFlags): Self = this.set("SearchFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewFlags(value: MFViewFlag): Self = this.set("ViewFlags", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewLocation(value: IViewLocation): Self = this.set("ViewLocation", value.asInstanceOf[js.Any])
    @scala.inline
    def setViewType(value: MFViewType): Self = this.set("ViewType", value.asInstanceOf[js.Any])
    @scala.inline
    def setVisible(value: Boolean): Self = this.set("Visible", value.asInstanceOf[js.Any])
  }
  
}

