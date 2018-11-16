package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFViewFlag extends js.Object

@JSGlobal("MFiles.MFViewFlag")
@js.native
object MFViewFlag extends js.Object {
  @js.native
  sealed trait Materialized
    extends mfilesLib.MFilesNs.MFViewFlag
  
  @js.native
  sealed trait sNone
    extends mfilesLib.MFilesNs.MFViewFlag
  
  /* 1 */ val Materialized: Materialized with scala.Double = js.native
  /* 0 */ val sNone: sNone with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFViewFlag with scala.Double] = js.native
}

