package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFTriggerWeekDay extends js.Object

@JSGlobal("MFiles.MFTriggerWeekDay")
@js.native
object MFTriggerWeekDay extends js.Object {
  @js.native
  sealed trait EveryDay
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  @js.native
  sealed trait Friday
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  @js.native
  sealed trait Monday
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  @js.native
  sealed trait Saturday
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  @js.native
  sealed trait Sunday
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  @js.native
  sealed trait Thursday
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  @js.native
  sealed trait Tuesday
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  @js.native
  sealed trait Wednesday
    extends mfilesLib.MFilesNs.MFTriggerWeekDay
  
  /* 125 */ val EveryDay: EveryDay with scala.Double = js.native
  /* 32 */ val Friday: Friday with scala.Double = js.native
  /* 2 */ val Monday: Monday with scala.Double = js.native
  /* 64 */ val Saturday: Saturday with scala.Double = js.native
  /* 1 */ val Sunday: Sunday with scala.Double = js.native
  /* 16 */ val Thursday: Thursday with scala.Double = js.native
  /* 4 */ val Tuesday: Tuesday with scala.Double = js.native
  /* 8 */ val Wednesday: Wednesday with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFTriggerWeekDay with scala.Double] = js.native
}

