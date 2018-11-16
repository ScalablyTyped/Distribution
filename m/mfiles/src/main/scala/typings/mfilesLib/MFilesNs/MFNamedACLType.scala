package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFNamedACLType extends js.Object

@JSGlobal("MFiles.MFNamedACLType")
@js.native
object MFNamedACLType extends js.Object {
  @js.native
  sealed trait Internal
    extends mfilesLib.MFilesNs.MFNamedACLType
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFNamedACLType
  
  @js.native
  sealed trait Normal
    extends mfilesLib.MFilesNs.MFNamedACLType
  
  /* 2 */ val Internal: Internal with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val Normal: Normal with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFNamedACLType with scala.Double] = js.native
}

