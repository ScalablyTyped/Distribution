package typings.mfiles

import typings.mfiles.MFilesNs.MFBuiltInView
import typings.mfiles.MFilesNs.MFFolderDefType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderDef extends js.Object {
  val FolderDefType: MFFolderDefType = js.native
  val PropertyFolder: ITypedValue = js.native
  val SearchDef: ISearchDef = js.native
  val TraditionalFolder: Double = js.native
  val View: MFBuiltInView | Double = js.native
  def Clone(): IFolderDef = js.native
  def SetPropertyFolder(TypedValue: ITypedValue): Unit = js.native
  def SetSearchDef(SearchDef: ISearchDef): Unit = js.native
  def SetTraditionalFolder(TraditionalFolder: Double): Unit = js.native
  def SetView(View: Double): Unit = js.native
  def SetView(View: MFBuiltInView): Unit = js.native
}

