package typings
package mfilesLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderListingColumn extends js.Object {
  var Flags: mfilesLib.MFilesNs.MFFolderListingColumnFlags
  val ID: scala.Double
  val Name: java.lang.String
  var Position: scala.Double
  var Visible: scala.Boolean
  var Width: scala.Double
  def Clone(): IFolderListingColumn
}

object IFolderListingColumn {
  @scala.inline
  def apply(
    Clone: js.Function0[IFolderListingColumn],
    Flags: mfilesLib.MFilesNs.MFFolderListingColumnFlags,
    ID: scala.Double,
    Name: java.lang.String,
    Position: scala.Double,
    Visible: scala.Boolean,
    Width: scala.Double
  ): IFolderListingColumn = {
    val __obj = js.Dynamic.literal(Clone = Clone, Flags = Flags, ID = ID, Name = Name, Position = Position, Visible = Visible, Width = Width)
  
    __obj.asInstanceOf[IFolderListingColumn]
  }
}

