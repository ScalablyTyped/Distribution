package typings
package nodalLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bootstrapper extends js.Object {
  var Config: js.UndefOr[js.Any] = js.undefined
  var Schema: js.UndefOr[js.Any] = js.undefined
  var bootstrapper: js.UndefOr[js.Any] = js.undefined
}

object Anon_Bootstrapper {
  @scala.inline
  def apply(Config: js.Any = null, Schema: js.Any = null, bootstrapper: js.Any = null): Anon_Bootstrapper = {
    val __obj = js.Dynamic.literal()
    if (Config != null) __obj.updateDynamic("Config")(Config)
    if (Schema != null) __obj.updateDynamic("Schema")(Schema)
    if (bootstrapper != null) __obj.updateDynamic("bootstrapper")(bootstrapper)
    __obj.asInstanceOf[Anon_Bootstrapper]
  }
}

