package typings.mfiles

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IObjectFiles extends js.Object {
  val Count: Double
  def GetObjectFileByNameForFileSystem(NameForFileSystem: String): IObjectFile
  def GetObjectFileIndexByNameForFileSystem(NameForFileSystem: String): Double
  def Item(Index: Double): IObjectFile
  def Sort(ObjectFileComparer: IObjectFileComparer): Unit
  def ToJSON(): String
}

object IObjectFiles {
  @scala.inline
  def apply(
    Count: Double,
    GetObjectFileByNameForFileSystem: String => IObjectFile,
    GetObjectFileIndexByNameForFileSystem: String => Double,
    Item: Double => IObjectFile,
    Sort: IObjectFileComparer => Unit,
    ToJSON: () => String
  ): IObjectFiles = {
    val __obj = js.Dynamic.literal(Count = Count, GetObjectFileByNameForFileSystem = js.Any.fromFunction1(GetObjectFileByNameForFileSystem), GetObjectFileIndexByNameForFileSystem = js.Any.fromFunction1(GetObjectFileIndexByNameForFileSystem), Item = js.Any.fromFunction1(Item), Sort = js.Any.fromFunction1(Sort), ToJSON = js.Any.fromFunction0(ToJSON))
  
    __obj.asInstanceOf[IObjectFiles]
  }
}

