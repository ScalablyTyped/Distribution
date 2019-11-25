package typings.atPhosphorDatagrid.libTextrendererMod.TextRenderer.formatPrecision

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * The options for creating a precision format function.
  */
trait IOptions extends js.Object {
  /**
    * The number of significant figures to include in the value.
    *
    * The default is determined by the user agent.
    */
  var digits: js.UndefOr[Double] = js.undefined
  /**
    * The text to use for a `null` or `undefined` data value.
    *
    * The default is `''`.
    */
  var missing: js.UndefOr[String] = js.undefined
}

object IOptions {
  @scala.inline
  def apply(digits: Int | Double = null, missing: String = null): IOptions = {
    val __obj = js.Dynamic.literal()
    if (digits != null) __obj.updateDynamic("digits")(digits.asInstanceOf[js.Any])
    if (missing != null) __obj.updateDynamic("missing")(missing.asInstanceOf[js.Any])
    __obj.asInstanceOf[IOptions]
  }
}

