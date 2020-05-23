package typings.officeJs.anon

import typings.officeJs.Office.HostType
import typings.officeJs.Office.PlatformType
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Host extends js.Object {
  var host: HostType
  var platform: PlatformType
}

object Host {
  @scala.inline
  def apply(host: HostType, platform: PlatformType): Host = {
    val __obj = js.Dynamic.literal(host = host.asInstanceOf[js.Any], platform = platform.asInstanceOf[js.Any])
    __obj.asInstanceOf[Host]
  }
}

