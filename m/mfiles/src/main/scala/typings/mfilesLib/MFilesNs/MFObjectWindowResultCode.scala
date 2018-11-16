package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFObjectWindowResultCode extends js.Object

@JSGlobal("MFiles.MFObjectWindowResultCode")
@js.native
object MFObjectWindowResultCode extends js.Object {
  @js.native
  sealed trait Cancel
    extends mfilesLib.MFilesNs.MFObjectWindowResultCode
  
  @js.native
  sealed trait Ok
    extends mfilesLib.MFilesNs.MFObjectWindowResultCode
  
  @js.native
  sealed trait OkToAll
    extends mfilesLib.MFilesNs.MFObjectWindowResultCode
  
  @js.native
  sealed trait SkipThis
    extends mfilesLib.MFilesNs.MFObjectWindowResultCode
  
  /* 1 */ val Cancel: Cancel with scala.Double = js.native
  /* 0 */ val Ok: Ok with scala.Double = js.native
  /* 2 */ val OkToAll: OkToAll with scala.Double = js.native
  /* 3 */ val SkipThis: SkipThis with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFObjectWindowResultCode with scala.Double] = js.native
}

