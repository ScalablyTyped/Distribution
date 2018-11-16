package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFObjectTypeAccess extends js.Object

@JSGlobal("MFiles.MFObjectTypeAccess")
@js.native
object MFObjectTypeAccess extends js.Object {
  @js.native
  sealed trait AddNewItems
    extends mfilesLib.MFilesNs.MFObjectTypeAccess
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFObjectTypeAccess
  
  @js.native
  sealed trait SeeName
    extends mfilesLib.MFilesNs.MFObjectTypeAccess
  
  /* 2 */ val AddNewItems: AddNewItems with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val SeeName: SeeName with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFObjectTypeAccess with scala.Double] = js.native
}

