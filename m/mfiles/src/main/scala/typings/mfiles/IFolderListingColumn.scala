package typings.mfiles

import typings.mfiles.MFiles.MFFolderListingColumnFlags
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
    val __obj = js.Dynamic.literal(Clone = js.Any.fromFunction0(Clone), Flags = Flags.asInstanceOf[js.Any], ID = ID.asInstanceOf[js.Any], Name = Name.asInstanceOf[js.Any], Position = Position.asInstanceOf[js.Any], Visible = Visible.asInstanceOf[js.Any], Width = Width.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[IFolderListingColumn]
  }
}

