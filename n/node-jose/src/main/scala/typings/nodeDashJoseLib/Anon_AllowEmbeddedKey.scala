package typings
package nodeDashJoseLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_AllowEmbeddedKey extends js.Object {
  var allowEmbeddedKey: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_AllowEmbeddedKey {
  @scala.inline
  def apply(allowEmbeddedKey: js.UndefOr[scala.Boolean] = js.undefined): Anon_AllowEmbeddedKey = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(allowEmbeddedKey)) __obj.updateDynamic("allowEmbeddedKey")(allowEmbeddedKey)
    __obj.asInstanceOf[Anon_AllowEmbeddedKey]
  }
}

