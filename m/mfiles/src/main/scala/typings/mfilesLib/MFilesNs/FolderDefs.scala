package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.FolderDefs")
@js.native
class FolderDefs ()
  extends mfilesLib.IFolderDefs {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, FolderDef: mfilesLib.IFolderDef): scala.Unit = js.native
  /* CompleteClass */
  override def Clone(): mfilesLib.IFolderDefs = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IFolderDef = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

@JSGlobal("MFiles.FolderDefs")
@js.native
object FolderDefs
  extends org.scalablytyped.runtime.Instantiable0[mfilesLib.IFolderDefs]

