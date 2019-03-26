package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.ObjectFiles")
@js.native
class ObjectFiles ()
  extends mfilesLib.IObjectFiles {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def GetObjectFileByNameForFileSystem(NameForFileSystem: java.lang.String): mfilesLib.IObjectFile = js.native
  /* CompleteClass */
  override def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: java.lang.String): scala.Double = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.IObjectFile = js.native
  /* CompleteClass */
  override def Sort(ObjectFileComparer: mfilesLib.IObjectFileComparer): scala.Unit = js.native
  /* CompleteClass */
  override def ToJSON(): java.lang.String = js.native
}

