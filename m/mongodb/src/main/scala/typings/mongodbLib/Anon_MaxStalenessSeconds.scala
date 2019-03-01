package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_MaxStalenessSeconds extends js.Object {
  /**
    * Max Secondary Read Stalleness in Seconds
    */
  var maxStalenessSeconds: js.UndefOr[scala.Double] = js.undefined
}

object Anon_MaxStalenessSeconds {
  @scala.inline
  def apply(maxStalenessSeconds: scala.Int | scala.Double = null): Anon_MaxStalenessSeconds = {
    val __obj = js.Dynamic.literal()
    if (maxStalenessSeconds != null) __obj.updateDynamic("maxStalenessSeconds")(maxStalenessSeconds.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_MaxStalenessSeconds]
  }
}

