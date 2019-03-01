package typings
package objectDashInspectLib.objectDashInspectMod.objectInspectNs

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
  var depth: js.UndefOr[scala.Double] = js.undefined
}

object Options {
  @scala.inline
  def apply(depth: scala.Int | scala.Double = null): Options = {
    val __obj = js.Dynamic.literal()
    if (depth != null) __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

