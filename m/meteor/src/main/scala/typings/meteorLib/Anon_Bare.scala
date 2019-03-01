package typings
package meteorLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Bare extends js.Object {
  var bare: js.UndefOr[scala.Boolean] = js.undefined
}

object Anon_Bare {
  @scala.inline
  def apply(bare: js.UndefOr[scala.Boolean] = js.undefined): Anon_Bare = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(bare)) __obj.updateDynamic("bare")(bare)
    __obj.asInstanceOf[Anon_Bare]
  }
}

