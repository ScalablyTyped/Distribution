package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ISourceObjectFiles extends js.Object {
  val Count: scala.Double
  def Add(Index: scala.Double, SourceObjectFile: ISourceObjectFile): scala.Unit
  def AddEmptyFile(Title: java.lang.String, Extension: java.lang.String): ISourceObjectFile
  def AddFile(Title: java.lang.String, Extension: java.lang.String, SourcePath: java.lang.String): ISourceObjectFile
  def Item(Index: scala.Double): ISourceObjectFile
  def Remove(Index: scala.Double): scala.Unit
}

object ISourceObjectFiles {
  @scala.inline
  def apply(
    Add: js.Function2[scala.Double, ISourceObjectFile, scala.Unit],
    AddEmptyFile: js.Function2[java.lang.String, java.lang.String, ISourceObjectFile],
    AddFile: js.Function3[java.lang.String, java.lang.String, java.lang.String, ISourceObjectFile],
    Count: scala.Double,
    Item: js.Function1[scala.Double, ISourceObjectFile],
    Remove: js.Function1[scala.Double, scala.Unit]
  ): ISourceObjectFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Add")(Add)
    __obj.updateDynamic("AddEmptyFile")(AddEmptyFile)
    __obj.updateDynamic("AddFile")(AddFile)
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Remove")(Remove)
    __obj.asInstanceOf[ISourceObjectFiles]
  }
}

