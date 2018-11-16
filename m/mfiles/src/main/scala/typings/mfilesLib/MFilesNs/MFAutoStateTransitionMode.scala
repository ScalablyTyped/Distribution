package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFAutoStateTransitionMode extends js.Object

@JSGlobal("MFiles.MFAutoStateTransitionMode")
@js.native
object MFAutoStateTransitionMode extends js.Object {
  @js.native
  sealed trait AllowedByScript
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  @js.native
  sealed trait AssignmentComplete
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  @js.native
  sealed trait AssignmentCompleteAll
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  @js.native
  sealed trait AssignmentCompleteOne
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  @js.native
  sealed trait AssignmentRejected
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  @js.native
  sealed trait CriteriaFulfilled
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  @js.native
  sealed trait RelativeTime
    extends mfilesLib.MFilesNs.MFAutoStateTransitionMode
  
  /* 5 */ val AllowedByScript: AllowedByScript with scala.Double = js.native
  /* 6 */ val AssignmentComplete: AssignmentComplete with scala.Double = js.native
  /* 3 */ val AssignmentCompleteAll: AssignmentCompleteAll with scala.Double = js.native
  /* 2 */ val AssignmentCompleteOne: AssignmentCompleteOne with scala.Double = js.native
  /* 7 */ val AssignmentRejected: AssignmentRejected with scala.Double = js.native
  /* 4 */ val CriteriaFulfilled: CriteriaFulfilled with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val RelativeTime: RelativeTime with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFAutoStateTransitionMode with scala.Double] = js.native
}

