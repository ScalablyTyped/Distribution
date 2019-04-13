package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SearchConditionEx")
@js.native
class SearchConditionEx ()
  extends mfilesLib.ISearchConditionEx {
  /* CompleteClass */
  override var Enabled: scala.Boolean = js.native
  /* CompleteClass */
  override var Ignored: scala.Boolean = js.native
  /* CompleteClass */
  override var SearchCondition: mfilesLib.ISearchCondition = js.native
  /* CompleteClass */
  override var SpecialNULL: scala.Boolean = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.ISearchConditionEx = js.native
  /* CompleteClass */
  override def Set(
    SearchCondition: mfilesLib.ISearchCondition,
    Enabled: scala.Boolean,
    SpecialNULL: scala.Boolean,
    Ignored: scala.Boolean
  ): scala.Unit = js.native
}

@JSGlobal("MFiles.SearchConditionEx")
@js.native
object SearchConditionEx
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.ISearchConditionEx]

