package typings
package mfilesLib.MFilesNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSGlobal("MFiles.SourceObjectFiles")
@js.native
class SourceObjectFiles ()
  extends mfilesLib.ISourceObjectFiles {
  /* CompleteClass */
  override val Count: scala.Double = js.native
  /* CompleteClass */
  override def Add(Index: scala.Double, SourceObjectFile: mfilesLib.ISourceObjectFile): scala.Unit = js.native
  /* CompleteClass */
  override def AddEmptyFile(Title: java.lang.String, Extension: java.lang.String): mfilesLib.ISourceObjectFile = js.native
  /* CompleteClass */
  override def AddFile(Title: java.lang.String, Extension: java.lang.String, SourcePath: java.lang.String): mfilesLib.ISourceObjectFile = js.native
  /* CompleteClass */
  override def Item(Index: scala.Double): mfilesLib.ISourceObjectFile = js.native
  /* CompleteClass */
  override def Remove(Index: scala.Double): scala.Unit = js.native
}

