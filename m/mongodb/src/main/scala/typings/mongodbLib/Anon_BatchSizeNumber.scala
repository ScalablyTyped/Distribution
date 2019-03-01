package typings
package mongodbLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_BatchSizeNumber extends js.Object {
  var batchSize: js.UndefOr[scala.Double] = js.undefined
}

object Anon_BatchSizeNumber {
  @scala.inline
  def apply(batchSize: scala.Int | scala.Double = null): Anon_BatchSizeNumber = {
    val __obj = js.Dynamic.literal()
    if (batchSize != null) __obj.updateDynamic("batchSize")(batchSize.asInstanceOf[js.Any])
    __obj.asInstanceOf[Anon_BatchSizeNumber]
  }
}

