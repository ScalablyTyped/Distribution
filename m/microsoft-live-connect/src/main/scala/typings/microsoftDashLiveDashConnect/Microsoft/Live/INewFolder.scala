package typings.microsoftDashLiveDashConnect.Microsoft.Live

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Represents a new folder.
  */
trait INewFolder extends js.Object {
  /**
    * A description of the folder.
    */
  var description: js.UndefOr[String] = js.undefined
  /**
    * The name of the folder.
    */
  var name: String
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: js.UndefOr[String] = js.undefined
}

object INewFolder {
  @scala.inline
  def apply(name: String, description: String = null, sort_by: String = null): INewFolder = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    if (description != null) __obj.updateDynamic("description")(description.asInstanceOf[js.Any])
    if (sort_by != null) __obj.updateDynamic("sort_by")(sort_by.asInstanceOf[js.Any])
    __obj.asInstanceOf[INewFolder]
  }
}

