package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IExpressionExs
import typings.mfiles.ISearchConditions
import typings.mfiles.ISearchDef
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchDef")
@js.native
class SearchDef () extends ISearchDef {
  /* CompleteClass */
  override var Conditions: ISearchConditions = js.native
  /* CompleteClass */
  override var Levels: IExpressionExs = js.native
  /* CompleteClass */
  override var LookInAllVersions: Boolean = js.native
  /* CompleteClass */
  override var ReturnLatestVisibleVersion: Boolean = js.native
  /* CompleteClass */
  override var SearchFlags: MFSearchFlags = js.native
  /* CompleteClass */
  override def Clone(): ISearchDef = js.native
  /* CompleteClass */
  override def IsIndirectionUsed(): Boolean = js.native
}

@JSGlobal("MFiles.SearchDef")
@js.native
object SearchDef extends Instantiable0[ISearchDef]

