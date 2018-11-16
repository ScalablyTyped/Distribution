package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFileDataStorage extends js.Object

@JSGlobal("MFiles.MFFileDataStorage")
@js.native
object MFFileDataStorage extends js.Object {
  @js.native
  sealed trait DB
    extends mfilesLib.MFilesNs.MFFileDataStorage
  
  @js.native
  sealed trait Default
    extends mfilesLib.MFilesNs.MFFileDataStorage
  
  @js.native
  sealed trait Disk
    extends mfilesLib.MFilesNs.MFFileDataStorage
  
  @js.native
  sealed trait External
    extends mfilesLib.MFilesNs.MFFileDataStorage
  
  /* 2 */ val DB: DB with scala.Double = js.native
  /* 0 */ val Default: Default with scala.Double = js.native
  /* 1 */ val Disk: Disk with scala.Double = js.native
  /* 3 */ val External: External with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFileDataStorage with scala.Double] = js.native
}

