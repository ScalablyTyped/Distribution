package typings.node.utilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait EncodeIntoResult extends js.Object {
  /**
    * The read Unicode code units of input.
    */
  var read: Double
  /**
    * The written UTF-8 bytes of output.
    */
  var written: Double
}

object EncodeIntoResult {
  @scala.inline
  def apply(read: Double, written: Double): EncodeIntoResult = {
    val __obj = js.Dynamic.literal(read = read.asInstanceOf[js.Any], written = written.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[EncodeIntoResult]
  }
}

