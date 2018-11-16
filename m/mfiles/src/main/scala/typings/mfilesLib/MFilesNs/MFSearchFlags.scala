package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFSearchFlags extends js.Object

@JSGlobal("MFiles.MFSearchFlags")
@js.native
object MFSearchFlags extends js.Object {
  @js.native
  sealed trait DisableRelevancyRanking
    extends mfilesLib.MFilesNs.MFSearchFlags
  
  @js.native
  sealed trait LookAllObjectTypes
    extends mfilesLib.MFilesNs.MFSearchFlags
  
  @js.native
  sealed trait LookInAllVersions
    extends mfilesLib.MFilesNs.MFSearchFlags
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFSearchFlags
  
  @js.native
  sealed trait ReturnLatestVisibleVersion
    extends mfilesLib.MFilesNs.MFSearchFlags
  
  /* 16 */ val DisableRelevancyRanking: DisableRelevancyRanking with scala.Double = js.native
  /* 4 */ val LookAllObjectTypes: LookAllObjectTypes with scala.Double = js.native
  /* 1 */ val LookInAllVersions: LookInAllVersions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 2 */ val ReturnLatestVisibleVersion: ReturnLatestVisibleVersion with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFSearchFlags with scala.Double] = js.native
}

