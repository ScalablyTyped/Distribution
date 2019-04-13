package typings
package objectionLib.objectionMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjvConfig extends js.Object {
  var options: js.UndefOr[ajvLib.ajvMod.Options] = js.undefined
  def onCreateAjv(ajv: ajvLib.ajvMod.Ajv): scala.Unit
}

object AjvConfig {
  @scala.inline
  def apply(onCreateAjv: ajvLib.ajvMod.Ajv => scala.Unit, options: ajvLib.ajvMod.Options = null): AjvConfig = {
    val __obj = js.Dynamic.literal(onCreateAjv = js.Any.fromFunction1(onCreateAjv))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AjvConfig]
  }
}

