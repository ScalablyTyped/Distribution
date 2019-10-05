package typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.formatISODateTime

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for creating an ISO datetime format function.
  */
trait IOptions extends js.Object {
  /**
    * The text to use for a `null` or `undefined` data value.
    *
    * The default is `''`.
    */
  var missing: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(missing: String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (missing != null) __obj.updateDynamic("missing")(missing)
    __obj.asInstanceOf[IOptions]
  }
}

