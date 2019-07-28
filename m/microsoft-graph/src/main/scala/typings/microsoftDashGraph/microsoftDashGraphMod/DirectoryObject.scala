package typings.microsoftDashGraph.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DirectoryObject extends Entity {
  var deletedDateTime: js.UndefOr[String] = js.undefined
}

object DirectoryObject {
  @scala.inline
  def apply(deletedDateTime: String = null, id: String = null): DirectoryObject = {
    val __obj = js.Dynamic.literal()
    if (deletedDateTime != null) __obj.updateDynamic("deletedDateTime")(deletedDateTime)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[DirectoryObject]
  }
}

