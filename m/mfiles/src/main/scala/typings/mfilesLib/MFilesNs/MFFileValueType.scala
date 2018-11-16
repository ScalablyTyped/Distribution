package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFileValueType extends js.Object

@JSGlobal("MFiles.MFFileValueType")
@js.native
object MFFileValueType extends js.Object {
  @js.native
  sealed trait ChangeTime
    extends mfilesLib.MFilesNs.MFFileValueType
  
  @js.native
  sealed trait CreationTime
    extends mfilesLib.MFilesNs.MFFileValueType
  
  @js.native
  sealed trait FileID
    extends mfilesLib.MFilesNs.MFFileValueType
  
  @js.native
  sealed trait FileName
    extends mfilesLib.MFilesNs.MFFileValueType
  
  @js.native
  sealed trait FileSize
    extends mfilesLib.MFilesNs.MFFileValueType
  
  @js.native
  sealed trait HasFiles
    extends mfilesLib.MFilesNs.MFFileValueType
  
  @js.native
  sealed trait LinkedToExtLoc
    extends mfilesLib.MFilesNs.MFFileValueType
  
  @js.native
  sealed trait LinkedToExtLocID
    extends mfilesLib.MFilesNs.MFFileValueType
  
  /* 5 */ val ChangeTime: ChangeTime with scala.Double = js.native
  /* 4 */ val CreationTime: CreationTime with scala.Double = js.native
  /* 3 */ val FileID: FileID with scala.Double = js.native
  /* 1 */ val FileName: FileName with scala.Double = js.native
  /* 2 */ val FileSize: FileSize with scala.Double = js.native
  /* 0 */ val HasFiles: HasFiles with scala.Double = js.native
  /* 6 */ val LinkedToExtLoc: LinkedToExtLoc with scala.Double = js.native
  /* 7 */ val LinkedToExtLocID: LinkedToExtLocID with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFileValueType with scala.Double] = js.native
}

