package typings.openfin.hostSpecsMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait GpuInfo extends js.Object {
  var name: String
}

object GpuInfo {
  @scala.inline
  def apply(name: String): GpuInfo = {
    val __obj = js.Dynamic.literal(name = name.asInstanceOf[js.Any])
    __obj.asInstanceOf[GpuInfo]
  }
}

