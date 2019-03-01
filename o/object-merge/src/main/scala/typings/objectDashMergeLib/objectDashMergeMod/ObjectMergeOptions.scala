package typings
package objectDashMergeLib.objectDashMergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMergeOptions extends js.Object {
  var depth: scala.Double | scala.Boolean
  var throwOnCircularRef: scala.Boolean
}

object ObjectMergeOptions {
  @scala.inline
  def apply(depth: scala.Double | scala.Boolean, throwOnCircularRef: scala.Boolean): ObjectMergeOptions = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("depth")(depth.asInstanceOf[js.Any])
    __obj.updateDynamic("throwOnCircularRef")(throwOnCircularRef)
    __obj.asInstanceOf[ObjectMergeOptions]
  }
}

