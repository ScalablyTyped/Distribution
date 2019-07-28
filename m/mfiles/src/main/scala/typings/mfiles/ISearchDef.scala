package typings.mfiles

import typings.mfiles.MFilesNs.MFSearchFlags
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Conditions = Conditions, IsIndirectionUsed = js.Any.fromFunction0(IsIndirectionUsed), Levels = Levels, LookInAllVersions = LookInAllVersions, ReturnLatestVisibleVersion = ReturnLatestVisibleVersion, SearchFlags = SearchFlags)
  
    __obj.asInstanceOf[ISearchDef]
  }
}

