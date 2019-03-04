package typings
package objectionLib.objectionMod.ObjectionNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjvConfig extends js.Object {
  var options: js.UndefOr[ajvLib.ajvMod.ajvNs.Options] = js.undefined
  def onCreateAjv(ajv: ajvLib.ajvMod.ajvNs.Ajv): scala.Unit
}

object AjvConfig {
  @scala.inline
  def apply(
    onCreateAjv: js.Function1[ajvLib.ajvMod.ajvNs.Ajv, scala.Unit],
    options: ajvLib.ajvMod.ajvNs.Options = null
  ): AjvConfig = {
    val __obj = js.Dynamic.literal(onCreateAjv = onCreateAjv)
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AjvConfig]
  }
}

