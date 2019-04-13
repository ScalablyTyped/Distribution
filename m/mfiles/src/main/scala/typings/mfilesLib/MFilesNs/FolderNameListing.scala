package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.FolderNameListing")
@js.native
class FolderNameListing ()
  extends mfilesLib.IFolderNameListing {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override val MoreValues: scala.Boolean = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.ITypedValue = js.native
  /* CompleteClass */
  override def SortWithExpression(Expression: mfilesLib.IExpression, Locale: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.FolderNameListing")
@js.native
object FolderNameListing
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IFolderNameListing]

