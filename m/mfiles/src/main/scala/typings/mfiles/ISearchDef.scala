package typings.mfiles

import typings.mfiles.MFiles.MFSearchFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISearchDef extends js.Object {
  var Conditions: ISearchConditions
  var Levels: IExpressionExs
  var LookInAllVersions: Boolean
  var ReturnLatestVisibleVersion: Boolean
  var SearchFlags: MFSearchFlags
  def Clone(): ISearchDef
  def IsIndirectionUsed(): Boolean
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
}

