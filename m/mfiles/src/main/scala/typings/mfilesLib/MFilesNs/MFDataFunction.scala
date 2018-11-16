package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFDataFunction extends js.Object

@JSGlobal("MFiles.MFDataFunction")
@js.native
object MFDataFunction extends js.Object {
  @js.native
  sealed trait Date
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait DaysFrom
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait DaysTo
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait InitialCharGroup
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait IntegerSegment
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait LeftChars
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait Month
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait NoOp
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait Year
    extends mfilesLib.MFilesNs.MFDataFunction
  
  @js.native
  sealed trait YearAndMonth
    extends mfilesLib.MFilesNs.MFDataFunction
  
  /* 4 */ val Date: Date with scala.Double = js.native
  /* 5 */ val DaysFrom: DaysFrom with scala.Double = js.native
  /* 6 */ val DaysTo: DaysTo with scala.Double = js.native
  /* 9 */ val InitialCharGroup: InitialCharGroup with scala.Double = js.native
  /* 7 */ val IntegerSegment: IntegerSegment with scala.Double = js.native
  /* 8 */ val LeftChars: LeftChars with scala.Double = js.native
  /* 2 */ val Month: Month with scala.Double = js.native
  /* 0 */ val NoOp: NoOp with scala.Double = js.native
  /* 1 */ val Year: Year with scala.Double = js.native
  /* 3 */ val YearAndMonth: YearAndMonth with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFDataFunction with scala.Double] = js.native
}

