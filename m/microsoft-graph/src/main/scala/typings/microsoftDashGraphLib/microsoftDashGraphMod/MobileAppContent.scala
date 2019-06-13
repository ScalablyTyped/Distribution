package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MobileAppContent extends Entity {
  /** The list of files for this app content version. */
  var files: js.UndefOr[js.Array[MobileAppContentFile]] = js.undefined
}

object MobileAppContent {
  @scala.inline
  def apply(files: js.Array[MobileAppContentFile] = null, id: java.lang.String = null): MobileAppContent = {
    val __obj = js.Dynamic.literal()
    if (files != null) __obj.updateDynamic("files")(files)
    if (id != null) __obj.updateDynamic("id")(id)
    __obj.asInstanceOf[MobileAppContent]
  }
}

