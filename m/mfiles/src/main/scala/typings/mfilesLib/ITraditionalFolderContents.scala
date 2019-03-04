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
    val __obj = js.Dynamic.literal(ID = ID, ObjectVersions = ObjectVersions, TraditionalFolders = TraditionalFolders)
  
    __obj.asInstanceOf[ITraditionalFolderContents]
  }
}

