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
    GetObjectFileByNameForFileSystem: js.Function1[java.lang.String, IObjectFile],
    GetObjectFileIndexByNameForFileSystem: js.Function1[java.lang.String, scala.Double],
    Item: js.Function1[scala.Double, IObjectFile],
    Sort: js.Function1[IObjectFileComparer, scala.Unit],
    ToJSON: js.Function0[java.lang.String]
  ): IObjectFiles = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("Count")(Count)
    __obj.updateDynamic("GetObjectFileByNameForFileSystem")(GetObjectFileByNameForFileSystem)
    __obj.updateDynamic("GetObjectFileIndexByNameForFileSystem")(GetObjectFileIndexByNameForFileSystem)
    __obj.updateDynamic("Item")(Item)
    __obj.updateDynamic("Sort")(Sort)
    __obj.updateDynamic("ToJSON")(ToJSON)
    __obj.asInstanceOf[IObjectFiles]
  }
}

