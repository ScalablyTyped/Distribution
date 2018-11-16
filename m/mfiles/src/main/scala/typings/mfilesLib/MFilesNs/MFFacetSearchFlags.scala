package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFacetSearchFlags extends js.Object

@JSGlobal("MFiles.MFFacetSearchFlags")
@js.native
object MFFacetSearchFlags extends js.Object {
  @js.native
  sealed trait AscendingOrder
    extends mfilesLib.MFilesNs.MFFacetSearchFlags
  
  @js.native
  sealed trait IgnoreFacetGroupPermissions
    extends mfilesLib.MFilesNs.MFFacetSearchFlags
  
  @js.native
  sealed trait IgnoreFacetValuePermissions
    extends mfilesLib.MFilesNs.MFFacetSearchFlags
  
  @js.native
  sealed trait IgnoreSearchPermissions
    extends mfilesLib.MFilesNs.MFFacetSearchFlags
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFFacetSearchFlags
  
  @js.native
  sealed trait OverrideByConfiguration
    extends mfilesLib.MFilesNs.MFFacetSearchFlags
  
  @js.native
  sealed trait SortFacetValues
    extends mfilesLib.MFilesNs.MFFacetSearchFlags
  
  /* 32 */ val AscendingOrder: AscendingOrder with scala.Double = js.native
  /* 4 */ val IgnoreFacetGroupPermissions: IgnoreFacetGroupPermissions with scala.Double = js.native
  /* 8 */ val IgnoreFacetValuePermissions: IgnoreFacetValuePermissions with scala.Double = js.native
  /* 2 */ val IgnoreSearchPermissions: IgnoreSearchPermissions with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 64 */ val OverrideByConfiguration: OverrideByConfiguration with scala.Double = js.native
  /* 16 */ val SortFacetValues: SortFacetValues with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFacetSearchFlags with scala.Double] = js.native
}

