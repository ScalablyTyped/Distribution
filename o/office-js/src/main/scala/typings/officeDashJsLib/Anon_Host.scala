package typings
package officeDashJsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: officeDashJsLib.OfficeNs.HostType
  var platform: officeDashJsLib.OfficeNs.PlatformType
}

object Anon_Host {
  @scala.inline
  def apply(host: officeDashJsLib.OfficeNs.HostType, platform: officeDashJsLib.OfficeNs.PlatformType): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Anon_Host]
  }
}

