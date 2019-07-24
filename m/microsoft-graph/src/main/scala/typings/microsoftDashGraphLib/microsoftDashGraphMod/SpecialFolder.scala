package typings
package microsoftDashGraphLib.microsoftDashGraphMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait SpecialFolder extends js.Object {
  // The unique identifier for this item in the /drive/special collection
  var name: js.UndefOr[java.lang.String] = js.undefined
}

object SpecialFolder {
  @scala.inline
  def apply(name: java.lang.String = null): SpecialFolder = {
    val __obj = js.Dynamic.literal()
    if (name != null) __obj.updateDynamic("name")(name)
    __obj.asInstanceOf[SpecialFolder]
  }
}

