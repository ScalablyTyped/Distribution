package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFContentType extends js.Object

@JSGlobal("MFiles.MFContentType")
@js.native
object MFContentType extends js.Object {
  @js.native
  sealed trait EmailAddress
    extends mfilesLib.MFilesNs.MFContentType
  
  @js.native
  sealed trait Generic
    extends mfilesLib.MFilesNs.MFContentType
  
  @js.native
  sealed trait HTML
    extends mfilesLib.MFilesNs.MFContentType
  
  @js.native
  sealed trait RTF
    extends mfilesLib.MFilesNs.MFContentType
  
  @js.native
  sealed trait URL
    extends mfilesLib.MFilesNs.MFContentType
  
  /* 1 */ val EmailAddress: EmailAddress with scala.Double = js.native
  /* 0 */ val Generic: Generic with scala.Double = js.native
  /* 4 */ val HTML: HTML with scala.Double = js.native
  /* 3 */ val RTF: RTF with scala.Double = js.native
  /* 2 */ val URL: URL with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFContentType with scala.Double] = js.native
}

