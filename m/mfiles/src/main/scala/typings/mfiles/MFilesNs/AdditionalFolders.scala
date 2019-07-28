package typings.mfiles.MFilesNs

import org.scalablytyped.runtime.Instantiable0
import typings.mfiles.IAdditionalFolder
import typings.mfiles.IAdditionalFolders
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AdditionalFolders")
@js.native
class AdditionalFolders () extends IAdditionalFolders {
  /* CompleteClass */
  override val Count: Double = js.native
  /* CompleteClass */
  override def Add(Index: Double, AdditionalFolder: IAdditionalFolder): Unit = js.native
  /* CompleteClass */
  override def Clone(): IAdditionalFolders = js.native
  /* CompleteClass */
  override def Item(Index: Double): IAdditionalFolder = js.native
  /* CompleteClass */
  override def Remove(Index: Double): Unit = js.native
}

@JSGlobal("MFiles.AdditionalFolders")
@js.native
object AdditionalFolders extends Instantiable0[IAdditionalFolders]

