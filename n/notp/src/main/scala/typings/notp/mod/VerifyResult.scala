package typings.notp.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VerifyResult extends js.Object {
  /**
    * Time step difference between the client and the server.
    */
  var delta: Double
}

object VerifyResult {
  @scala.inline
  def apply(delta: Double): VerifyResult = {
    val __obj = js.Dynamic.literal(delta = delta.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[VerifyResult]
  }
}

