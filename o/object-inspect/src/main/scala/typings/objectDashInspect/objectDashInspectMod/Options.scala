package typings.objectDashInspect.objectDashInspectMod

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
}

object Options {
  @scala.inline
  def apply(depth: Int | Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

