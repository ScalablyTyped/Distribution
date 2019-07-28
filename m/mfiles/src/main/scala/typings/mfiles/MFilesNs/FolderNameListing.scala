package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IExpression
import typings.mfiles.IFolderNameListing
import typings.mfiles.ITypedValue
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.FolderNameListing")
@js.native
class FolderNameListing () extends IFolderNameListing {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override val MoreValues: Boolean = js.native
  /* CompleteClass */
  override def Item(Index: Double): ITypedValue = js.native
  /* CompleteClass */
  override def SortWithExpression(Expression: IExpression, Locale: Double): Unit = js.native
}

@JSGlobal("MFiles.FolderNameListing")
@js.native
object FolderNameListing extends Instantiable0[IFolderNameListing]

