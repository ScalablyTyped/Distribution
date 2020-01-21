package typings.objectInspect.mod

import typings.objectInspect.objectInspectStrings.double
import typings.objectInspect.objectInspectStrings.single
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
  * Inspection options
  */
trait Options extends js.Object {
  /**
    * Maximum depth of the inspection. Default: `5`.
    */
  var depth: js.UndefOr[Double] = js.undefined
  /**
    * Must be "single" or "double", if present.
    */
  var quoteStyle: js.UndefOr[single | double] = js.undefined
}

object Options {
  @scala.inline
  def apply(depth: Int | Double = null, quoteStyle: single | double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    if (quoteStyle != null) __obj.updateDynamic("quoteStyle")(quoteStyle.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

