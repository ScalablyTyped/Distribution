package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait ListingEmptinessState extends js.Object

@JSGlobal("MFiles.ListingEmptinessState")
@js.native
object ListingEmptinessState extends js.Object {
  @js.native
  sealed trait Empty
    extends mfilesLib.MFilesNs.ListingEmptinessState
  
  @js.native
  sealed trait NotEmpty
    extends mfilesLib.MFilesNs.ListingEmptinessState
  
  @js.native
  sealed trait NotYetKnown
    extends mfilesLib.MFilesNs.ListingEmptinessState
  
  /* 3 */ val Empty: Empty with scala.Double = js.native
  /* 2 */ val NotEmpty: NotEmpty with scala.Double = js.native
  /* 1 */ val NotYetKnown: NotYetKnown with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.ListingEmptinessState with scala.Double] = js.native
}

