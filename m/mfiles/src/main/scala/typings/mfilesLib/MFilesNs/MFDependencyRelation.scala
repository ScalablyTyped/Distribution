package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFDependencyRelation extends js.Object

@JSGlobal("MFiles.MFDependencyRelation")
@js.native
object MFDependencyRelation extends js.Object {
  @js.native
  sealed trait AutomaticFilling
    extends mfilesLib.MFilesNs.MFDependencyRelation
  
  @js.native
  sealed trait Filtering
    extends mfilesLib.MFilesNs.MFDependencyRelation
  
  @js.native
  sealed trait Nothing
    extends mfilesLib.MFilesNs.MFDependencyRelation
  
  /* 1 */ val AutomaticFilling: AutomaticFilling with scala.Double = js.native
  /* 2 */ val Filtering: Filtering with scala.Double = js.native
  /* 0 */ val Nothing: Nothing with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFDependencyRelation with scala.Double] = js.native
}

