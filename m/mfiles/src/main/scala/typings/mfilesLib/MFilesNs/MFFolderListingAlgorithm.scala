package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
sealed trait MFFolderListingAlgorithm extends js.Object

@JSGlobal("MFiles.MFFolderListingAlgorithm")
@js.native
object MFFolderListingAlgorithm extends js.Object {
  @js.native
  sealed trait GetValuesByDistinctUse
    extends mfilesLib.MFilesNs.MFFolderListingAlgorithm
  
  @js.native
  sealed trait None
    extends mfilesLib.MFilesNs.MFFolderListingAlgorithm
  
  @js.native
  sealed trait TestEachValue
    extends mfilesLib.MFilesNs.MFFolderListingAlgorithm
  
  @js.native
  sealed trait TestEachValueWithSeparateQueries
    extends mfilesLib.MFilesNs.MFFolderListingAlgorithm
  
  /* 2 */ val GetValuesByDistinctUse: GetValuesByDistinctUse with scala.Double = js.native
  /* 0 */ val None: None with scala.Double = js.native
  /* 1 */ val TestEachValue: TestEachValue with scala.Double = js.native
  /* 3 */ val TestEachValueWithSeparateQueries: TestEachValueWithSeparateQueries with scala.Double = js.native
  @JSBracketAccess
  def apply(value: scala.Double): js.UndefOr[mfilesLib.MFilesNs.MFFolderListingAlgorithm with scala.Double] = js.native
}

