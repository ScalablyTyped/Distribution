package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait SearchFeature extends js.Object

@JSGlobal("MFiles.SearchFeature")
@js.native
object SearchFeature extends js.Object {
  @js.native
  sealed trait FacetSearch
    extends mfilesLib.MFilesNs.SearchFeature
  
  @js.native
  sealed trait MultiVaultSearch
    extends mfilesLib.MFilesNs.SearchFeature
  
  @js.native
  sealed trait Undefined
    extends mfilesLib.MFilesNs.SearchFeature
  
  /* 1 */ val FacetSearch: FacetSearch with scala.Double = js.native
  /* 2 */ val MultiVaultSearch: MultiVaultSearch with scala.Double = js.native
  /* 0 */ val Undefined: Undefined with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.SearchFeature with scala.Double] = js.native
}

