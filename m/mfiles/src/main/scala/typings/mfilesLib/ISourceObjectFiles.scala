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
    Add: (scala.Double, ISourceObjectFile) => scala.Unit,
    AddEmptyFile: (java.lang.String, java.lang.String) => ISourceObjectFile,
    AddFile: (java.lang.String, java.lang.String, java.lang.String) => ISourceObjectFile,
    Count: scala.Double,
    Item: scala.Double => ISourceObjectFile,
    Remove: scala.Double => scala.Unit
  ): ISourceObjectFiles = {
    val __obj = js.Dynamic.literal(Add = js.Any.fromFunction2(Add), AddEmptyFile = js.Any.fromFunction2(AddEmptyFile), AddFile = js.Any.fromFunction3(AddFile), Count = Count, Item = js.Any.fromFunction1(Item), Remove = js.Any.fromFunction1(Remove))
  
    __obj.asInstanceOf[ISourceObjectFiles]
  }
}

