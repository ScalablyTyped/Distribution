package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFProductMode extends js.Object

@JSGlobal("MFiles.MFProductMode")
@js.native
object MFProductMode extends js.Object {
  @js.native
  sealed trait Business
    extends mfilesLib.MFilesNs.MFProductMode
  
  @js.native
  sealed trait Express
    extends mfilesLib.MFilesNs.MFProductMode
  
  @js.native
  sealed trait Full
    extends mfilesLib.MFilesNs.MFProductMode
  
  /* 2 */ val Business: Business with scala.Double = js.native
  /* 1 */ val Express: Express with scala.Double = js.native
  /* 0 */ val Full: Full with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFProductMode with scala.Double] = js.native
}

