package typings.objection.mod

import typings.ajv.mod.Ajv
import typings.ajv.mod.Options
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
    if (options != null) __obj.updateDynamic("options")(options.asInstanceOf[js.Any])
    __obj.asInstanceOf[AjvConfig]
  }
}

