package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFServerConnection extends js.Object

@JSGlobal("MFiles.MFServerConnection")
@js.native
object MFServerConnection extends js.Object {
  @js.native
  sealed trait nonymous
    extends mfilesLib.MFilesNs.MFServerConnection
  
  @js.native
  sealed trait uthenticated
    extends mfilesLib.MFilesNs.MFServerConnection
  
  /* 2 */ val nonymous: nonymous with scala.Double = js.native
  /* 1 */ val uthenticated: uthenticated with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFServerConnection with scala.Double] = js.native
}

