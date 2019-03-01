package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ITraditionalFolderContents extends js.Object {
  val ID: scala.Double
  val ObjectVersions: IObjectVersions
  val TraditionalFolders: ITraditionalFolders
}

object ITraditionalFolderContents {
  @scala.inline
  def apply(ID: scala.Double, ObjectVersions: IObjectVersions, TraditionalFolders: ITraditionalFolders): ITraditionalFolderContents = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("ID")(ID)
    __obj.updateDynamic("ObjectVersions")(ObjectVersions)
    __obj.updateDynamic("TraditionalFolders")(TraditionalFolders)
    __obj.asInstanceOf[ITraditionalFolderContents]
  }
}

