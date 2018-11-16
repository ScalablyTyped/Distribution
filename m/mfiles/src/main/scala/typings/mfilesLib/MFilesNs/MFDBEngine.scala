package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFDBEngine extends js.Object

@JSGlobal("MFiles.MFDBEngine")
@js.native
object MFDBEngine extends js.Object {
  @js.native
  sealed trait Firebird
    extends mfilesLib.MFilesNs.MFDBEngine
  
  @js.native
  sealed trait MSSQLServer
    extends mfilesLib.MFilesNs.MFDBEngine
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFDBEngine
  
  /* 1 */ val Firebird: Firebird with scala.Double = js.native
  /* 2 */ val MSSQLServer: MSSQLServer with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFDBEngine with scala.Double] = js.native
}

