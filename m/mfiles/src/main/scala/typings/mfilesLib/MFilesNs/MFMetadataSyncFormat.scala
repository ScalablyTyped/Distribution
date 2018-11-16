package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFMetadataSyncFormat extends js.Object

@JSGlobal("MFiles.MFMetadataSyncFormat")
@js.native
object MFMetadataSyncFormat extends js.Object {
  @js.native
  sealed trait Excel
    extends mfilesLib.MFilesNs.MFMetadataSyncFormat
  
  @js.native
  sealed trait PowerPoint
    extends mfilesLib.MFilesNs.MFMetadataSyncFormat
  
  @js.native
  sealed trait Word
    extends mfilesLib.MFilesNs.MFMetadataSyncFormat
  
  /* 1 */ val Excel: Excel with scala.Double = js.native
  /* 2 */ val PowerPoint: PowerPoint with scala.Double = js.native
  /* 0 */ val Word: Word with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFMetadataSyncFormat with scala.Double] = js.native
}

