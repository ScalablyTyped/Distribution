package typings.mongodbMemoryServerCore.typesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ReplStatusReplT extends js.Object {
  var ismaster: Boolean
}

object ReplStatusReplT {
  @scala.inline
  def apply(ismaster: Boolean): ReplStatusReplT = {
    val __obj = js.Dynamic.literal(ismaster = ismaster.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[ReplStatusReplT]
  }
}

