package typings
package natsDashHemeraLib.natsDashHemeraMod.HemeraNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait LoadProcessConfig extends js.Object {
  var sampleInterval: js.UndefOr[scala.Double] = js.undefined
}

object LoadProcessConfig {
  @scala.inline
  def apply(sampleInterval: scala.Int | scala.Double = null): LoadProcessConfig = {
    val __obj = js.Dynamic.literal()
    if (sampleInterval != null) __obj.updateDynamic("sampleInterval")(sampleInterval.asInstanceOf[js.Any])
    __obj.asInstanceOf[LoadProcessConfig]
  }
}

