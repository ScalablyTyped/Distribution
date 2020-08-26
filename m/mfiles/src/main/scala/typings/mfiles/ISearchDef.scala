package typings.mfiles

import typings.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait ISearchDef extends js.Object {
  var Conditions: ISearchConditions = js.native
  var Levels: IExpressionExs = js.native
  var LookInAllVersions: Boolean = js.native
  var ReturnLatestVisibleVersion: Boolean = js.native
  var SearchFlags: MFSearchFlags = js.native
  def Clone(): ISearchDef = js.native
  def IsIndirectionUsed(): Boolean = js.native
}

object ISearchDef {
  @scala.inline
  def apply(
    Clone: () => ISearchDef,
    Conditions: ISearchConditions,
    IsIndirectionUsed: () => Boolean,
    Levels: IExpressionExs,
    LookInAllVersions: Boolean,
    ReturnLatestVisibleVersion: Boolean,
    SearchFlags: MFSearchFlags
  ): ISearchDef = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions.asInstanceOf[js.Any], IsIndirectionUsed = js.Any.fromFunction0(IsIndirectionUsed), Levels = Levels.asInstanceOf[js.Any], LookInAllVersions = LookInAllVersions.asInstanceOf[js.Any], ReturnLatestVisibleVersion = ReturnLatestVisibleVersion.asInstanceOf[js.Any], SearchFlags = SearchFlags.asInstanceOf[js.Any])
    __obj.asInstanceOf[ISearchDef]
  }
  @scala.inline
  implicit class ISearchDefOps[Self <: ISearchDef] (val x: Self) extends AnyVal {
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
    def setClone(value: () => ISearchDef): Self = this.set("Clone", js.Any.fromFunction0(value))
    @scala.inline
    def setConditions(value: ISearchConditions): Self = this.set("Conditions", value.asInstanceOf[js.Any])
    @scala.inline
    def setIsIndirectionUsed(value: () => Boolean): Self = this.set("IsIndirectionUsed", js.Any.fromFunction0(value))
    @scala.inline
    def setLevels(value: IExpressionExs): Self = this.set("Levels", value.asInstanceOf[js.Any])
    @scala.inline
    def setLookInAllVersions(value: Boolean): Self = this.set("LookInAllVersions", value.asInstanceOf[js.Any])
    @scala.inline
    def setReturnLatestVisibleVersion(value: Boolean): Self = this.set("ReturnLatestVisibleVersion", value.asInstanceOf[js.Any])
    @scala.inline
    def setSearchFlags(value: MFSearchFlags): Self = this.set("SearchFlags", value.asInstanceOf[js.Any])
  }
  
}

