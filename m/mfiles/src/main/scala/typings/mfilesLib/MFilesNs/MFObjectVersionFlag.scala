package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFObjectVersionFlag extends js.Object

@JSGlobal("MFiles.MFObjectVersionFlag")
@js.native
object MFObjectVersionFlag extends js.Object {
  @js.native
  sealed trait Completed
    extends mfilesLib.MFilesNs.MFObjectVersionFlag
  
  @js.native
  sealed trait HasRelatedObjects
    extends mfilesLib.MFilesNs.MFObjectVersionFlag
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFObjectVersionFlag
  
  /* 1 */ val Completed: Completed with scala.Double = js.native
  /* 2 */ val HasRelatedObjects: HasRelatedObjects with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFObjectVersionFlag with scala.Double] = js.native
}

