package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFacetFilterStatusFlags extends js.Object

@JSGlobal("MFiles.MFFacetFilterStatusFlags")
@js.native
object MFFacetFilterStatusFlags extends js.Object {
  @js.native
  sealed trait Applied
    extends mfilesLib.MFilesNs.MFFacetFilterStatusFlags
  
  @js.native
  sealed trait Available
    extends mfilesLib.MFilesNs.MFFacetFilterStatusFlags
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFFacetFilterStatusFlags
  
  /* 2 */ val Applied: Applied with scala.Double = js.native
  /* 1 */ val Available: Available with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFacetFilterStatusFlags with scala.Double] = js.native
}

