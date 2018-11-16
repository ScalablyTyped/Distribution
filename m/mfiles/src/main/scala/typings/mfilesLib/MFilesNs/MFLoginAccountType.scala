package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFLoginAccountType extends js.Object

@JSGlobal("MFiles.MFLoginAccountType")
@js.native
object MFLoginAccountType extends js.Object {
  @js.native
  sealed trait MFiles
    extends mfilesLib.MFilesNs.MFLoginAccountType
  
  @js.native
  sealed trait Windows
    extends mfilesLib.MFilesNs.MFLoginAccountType
  
  /* 1 */ val MFiles: MFiles with scala.Double = js.native
  /* 2 */ val Windows: Windows with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFLoginAccountType with scala.Double] = js.native
}

