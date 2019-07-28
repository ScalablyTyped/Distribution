package typings.mfiles

import typings.mfiles.MFilesNs.MFFolderListingColumnFlags
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IFolderListingColumn extends js.Object {
  var Flags: MFFolderListingColumnFlags
  val ID: Double
  val Name: String
  var Position: Double
  var Visible: Boolean
  var Width: Double
  def Clone(): IFolderListingColumn
}

object IFolderListingColumn {
  @scala.inline
  def apply(
    Clone: () => IFolderListingColumn,
    Flags: MFFolderListingColumnFlags,
    ID: Double,
    Name: String,
    Position: Double,
    Visible: Boolean,
    Width: Double
  ): IFolderListingColumn = {
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Flags = Flags, ID = ID, Name = Name, Position = Position, Visible = Visible, Width = Width)
  
    __obj.asInstanceOf[IFolderListingColumn]
  }
}

