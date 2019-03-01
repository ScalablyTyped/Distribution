package typings
package microsoftDashLiveDashConnectLib.MicrosoftNs.LiveNs

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
  var description: js.UndefOr[java.lang.String] = js.undefined
  /**
    * The name of the folder.
    */
  var name: java.lang.String
  /**
    * Sorts the items to specify the following criteria: updated, name,
    * size, or default.
    */
  var sort_by: js.UndefOr[java.lang.String] = js.undefined
}

object INewFolder {
  @scala.inline
  def apply(name: java.lang.String, description: java.lang.String = null, sort_by: java.lang.String = null): INewFolder = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("name")(name)
    if (description != null) __obj.updateDynamic("description")(description)
    if (sort_by != null) __obj.updateDynamic("sort_by")(sort_by)
    __obj.asInstanceOf[INewFolder]
  }
}

