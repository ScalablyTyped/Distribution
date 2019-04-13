package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.AdditionalFolders")
@js.native
class AdditionalFolders ()
  extends mfilesLib.IAdditionalFolders {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, AdditionalFolder: mfilesLib.IAdditionalFolder): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IAdditionalFolders = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IAdditionalFolder = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.AdditionalFolders")
@js.native
object AdditionalFolders
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IAdditionalFolders]

