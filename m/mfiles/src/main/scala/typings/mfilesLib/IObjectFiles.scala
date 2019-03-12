package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFiles extends js.Object {
  val Count: scala.Double
  def GetObjectFileByNameForFileSystem(NameForFileSystem: java.lang.String): IObjectFile
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: java.lang.String): scala.Double
  def Item(Index: scala.Double): IObjectFile
  def Sort(ObjectFileComparer: IObjectFileComparer): scala.Unit
  def ToJSON(): java.lang.String
}

object IObjectFiles {
  @scala.inline
  def apply(
    Count: scala.Double,
    GetObjectFileByNameForFileSystem: java.lang.String => IObjectFile,
    GetObjectFileIndexByNameForFileSystem: java.lang.String => scala.Double,
    Item: scala.Double => IObjectFile,
    Sort: IObjectFileComparer => scala.Unit,
    ToJSON: () => java.lang.String
  ): IObjectFiles = {
    val __obj = js.Dynamic.literal(Count = Count, GetObjectFileByNameForFileSystem = js.Any.fromFunction1(GetObjectFileByNameForFileSystem), GetObjectFileIndexByNameForFileSystem = js.Any.fromFunction1(GetObjectFileIndexByNameForFileSystem), Item = js.Any.fromFunction1(Item), Sort = js.Any.fromFunction1(Sort), ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IObjectFiles]
  }
}

