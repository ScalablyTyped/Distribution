package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchDef")
@js.native
class SearchDef ()
  extends mfilesLib.ISearchDef {
  /* CompleteClass */
  override var Conditions: mfilesLib.ISearchConditions = js.native
  /* CompleteClass */
  override var Levels: mfilesLib.IExpressionExs = js.native
  /* CompleteClass */
  override var LookInAllVersions: scala.Boolean = js.native
  /* CompleteClass */
  override var ReturnLatestVisibleVersion: scala.Boolean = js.native
  /* CompleteClass */
  override var SearchFlags: MFSearchFlags = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISearchDef = js.native
  /* CompleteClass */
  override def IsIndirectionUsed(): scala.Boolean = js.native
}

