package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFTriggerWeekOfMonth extends js.Object

@JSGlobal("MFiles.MFTriggerWeekOfMonth")
@js.native
object MFTriggerWeekOfMonth extends js.Object {
  @js.native
  sealed trait FirstWeek
    extends mfilesLib.MFilesNs.MFTriggerWeekOfMonth
  
  @js.native
  sealed trait FourthWeek
    extends mfilesLib.MFilesNs.MFTriggerWeekOfMonth
  
  @js.native
  sealed trait LastWeek
    extends mfilesLib.MFilesNs.MFTriggerWeekOfMonth
  
  @js.native
  sealed trait SecondWeek
    extends mfilesLib.MFilesNs.MFTriggerWeekOfMonth
  
  @js.native
  sealed trait ThirdWeek
    extends mfilesLib.MFilesNs.MFTriggerWeekOfMonth
  
  /* 1 */ val FirstWeek: FirstWeek with scala.Double = js.native
  /* 4 */ val FourthWeek: FourthWeek with scala.Double = js.native
  /* 5 */ val LastWeek: LastWeek with scala.Double = js.native
  /* 2 */ val SecondWeek: SecondWeek with scala.Double = js.native
  /* 3 */ val ThirdWeek: ThirdWeek with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFTriggerWeekOfMonth with scala.Double] = js.native
}

