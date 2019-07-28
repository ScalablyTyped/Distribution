package typings.memoryDashPager.memoryDashPagerMod

import typings.node.Buffer
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Page extends js.Object {
  var buffer: Buffer
  var offset: Double
}

object Page {
  @scala.inline
  def apply(buffer: Buffer, offset: Double): Page = {
    val __obj = js.Dynamic.literal(buffer = buffer, offset = offset)
  
    __obj.asInstanceOf[Page]
  }
}

