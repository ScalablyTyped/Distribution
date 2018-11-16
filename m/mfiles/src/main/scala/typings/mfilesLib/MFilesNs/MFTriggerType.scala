package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFTriggerType extends js.Object

@JSGlobal("MFiles.MFTriggerType")
@js.native
object MFTriggerType extends js.Object {
  @js.native
  sealed trait Daily
    extends mfilesLib.MFilesNs.MFTriggerType
  
  @js.native
  sealed trait MonthlyDOW
    extends mfilesLib.MFilesNs.MFTriggerType
  
  @js.native
  sealed trait MonthlyDate
    extends mfilesLib.MFilesNs.MFTriggerType
  
  @js.native
  sealed trait Once
    extends mfilesLib.MFilesNs.MFTriggerType
  
  @js.native
  sealed trait Weekly
    extends mfilesLib.MFilesNs.MFTriggerType
  
  /* 1 */ val Daily: Daily with scala.Double = js.native
  /* 4 */ val MonthlyDOW: MonthlyDOW with scala.Double = js.native
  /* 3 */ val MonthlyDate: MonthlyDate with scala.Double = js.native
  /* 0 */ val Once: Once with scala.Double = js.native
  /* 2 */ val Weekly: Weekly with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFTriggerType with scala.Double] = js.native
}

