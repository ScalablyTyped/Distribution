package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait IFolderDef extends js.Object {
  val FolderDefType: mfilesLib.MFilesNs.MFFolderDefType = js.native
  val PropertyFolder: ITypedValue = js.native
  val SearchDef: ISearchDef = js.native
  val TraditionalFolder: scala.Double = js.native
  val View: mfilesLib.MFilesNs.MFBuiltInView | scala.Double = js.native
  def Clone(): IFolderDef = js.native
  def SetPropertyFolder(TypedValue: ITypedValue): scala.Unit = js.native
  def SetSearchDef(SearchDef: ISearchDef): scala.Unit = js.native
  def SetTraditionalFolder(TraditionalFolder: scala.Double): scala.Unit = js.native
  def SetView(View: mfilesLib.MFilesNs.MFBuiltInView): scala.Unit = js.native
  def SetView(View: scala.Double): scala.Unit = js.native
}

