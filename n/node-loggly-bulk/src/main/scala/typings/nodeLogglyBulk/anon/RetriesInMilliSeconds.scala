package typings.nodeLogglyBulk.anon

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait RetriesInMilliSeconds extends js.Object {
  var retriesInMilliSeconds: Double
  var size: Double
}

object RetriesInMilliSeconds {
  @scala.inline
  def apply(retriesInMilliSeconds: Double, size: Double): RetriesInMilliSeconds = {
    val __obj = js.Dynamic.literal(retriesInMilliSeconds = retriesInMilliSeconds.asInstanceOf[js.Any], size = size.asInstanceOf[js.Any])
    __obj.asInstanceOf[RetriesInMilliSeconds]
  }
}

