package typings.mongodbMemoryServerCore.typesMod

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
    val __obj = js.Dynamic.literal(current = current.asInstanceOf[js.Any], lastPrintedAt = lastPrintedAt.asInstanceOf[js.Any], length = length.asInstanceOf[js.Any], totalMb = totalMb.asInstanceOf[js.Any])
  
    __obj.asInstanceOf[DownloadProgressT]
  }
}

