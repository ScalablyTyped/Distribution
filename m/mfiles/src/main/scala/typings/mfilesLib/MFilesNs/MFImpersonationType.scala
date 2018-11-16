package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFImpersonationType extends js.Object

@JSGlobal("MFiles.MFImpersonationType")
@js.native
object MFImpersonationType extends js.Object {
  @js.native
  sealed trait ExtAccount
    extends mfilesLib.MFilesNs.MFImpersonationType
  
  @js.native
  sealed trait LocalSystem
    extends mfilesLib.MFilesNs.MFImpersonationType
  
  @js.native
  sealed trait SpecificAccount
    extends mfilesLib.MFilesNs.MFImpersonationType
  
  /* 2 */ val ExtAccount: ExtAccount with scala.Double = js.native
  /* 0 */ val LocalSystem: LocalSystem with scala.Double = js.native
  /* 1 */ val SpecificAccount: SpecificAccount with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFImpersonationType with scala.Double] = js.native
}

