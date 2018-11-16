package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFPropertyDefAccess extends js.Object

@JSGlobal("MFiles.MFPropertyDefAccess")
@js.native
object MFPropertyDefAccess extends js.Object {
  @js.native
  sealed trait Edit
    extends mfilesLib.MFilesNs.MFPropertyDefAccess
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFPropertyDefAccess
  
  @js.native
  sealed trait See
    extends mfilesLib.MFilesNs.MFPropertyDefAccess
  
  /* 2 */ val Edit: Edit with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val See: See with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFPropertyDefAccess with scala.Double] = js.native
}

