package typings.objectDashMerge.objectDashMergeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ObjectMergeOptions extends js.Object {
  var depth: Double | Boolean
  var throwOnCircularRef: Boolean
}

object ObjectMergeOptions {
  @scala.inline
  def apply(depth: Double | Boolean, throwOnCircularRef: Boolean): ObjectMergeOptions = {
    val __obj = js.Dynamic.literal(depth = depth.asInstanceOf[js.Any], throwOnCircularRef = throwOnCircularRef.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ObjectMergeOptions]
  }
}

