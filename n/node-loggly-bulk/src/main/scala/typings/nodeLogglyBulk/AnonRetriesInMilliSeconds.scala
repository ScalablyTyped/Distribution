package typings.nodeLogglyBulk

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AnonRetriesInMilliSeconds extends js.Object {
  var retriesInMilliSeconds: Double
  var size: Double
}

object AnonRetriesInMilliSeconds {
  @scala.inline
  def apply(retriesInMilliSeconds: Double, size: Double): AnonRetriesInMilliSeconds = {
    val __obj = js.Dynamic.literal(retriesInMilliSeconds = retriesInMilliSeconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[AnonRetriesInMilliSeconds]
  }
}

