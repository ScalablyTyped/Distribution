package typings.objection.objectionMod

import typings.ajv.ajvMod.Ajv
import typings.ajv.ajvMod.Options
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AjvConfig extends js.Object {
  var options: js.UndefOr[Options] = js.undefined
  def onCreateAjv(ajv: Ajv): Unit
}

object AjvConfig {
  @scala.inline
  def apply(onCreateAjv: Ajv => Unit, options: Options = null): AjvConfig = {
    val __obj = js.Dynamic.literal(onCreateAjv = js.Any.fromFunction1(onCreateAjv))
    if (options != null) __obj.updateDynamic("options")(options)
    __obj.asInstanceOf[AjvConfig]
  }
}

