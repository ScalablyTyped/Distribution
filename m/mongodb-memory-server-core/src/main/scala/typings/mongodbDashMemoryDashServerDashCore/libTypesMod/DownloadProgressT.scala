package typings.mongodbDashMemoryDashServerDashCore.libTypesMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait DownloadProgressT extends js.Object {
  var current: Double
  var lastPrintedAt: Double
  var length: Double
  var totalMb: Double
}

object DownloadProgressT {
  @scala.inline
  def apply(current: Double, lastPrintedAt: Double, length: Double, totalMb: Double): DownloadProgressT = {
    val __obj = js.Dynamic.literal(current = current, lastPrintedAt = lastPrintedAt, length = length, totalMb = totalMb)
  
    __obj.asInstanceOf[DownloadProgressT]
  }
}

