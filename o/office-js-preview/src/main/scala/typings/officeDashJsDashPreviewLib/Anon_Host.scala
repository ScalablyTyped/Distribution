package typings
package officeDashJsDashPreviewLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Anon_Host extends js.Object {
  var host: officeDashJsDashPreviewLib.OfficeNs.HostType
  var platform: officeDashJsDashPreviewLib.OfficeNs.PlatformType
}

object Anon_Host {
  @scala.inline
  def apply(
    host: officeDashJsDashPreviewLib.OfficeNs.HostType,
    platform: officeDashJsDashPreviewLib.OfficeNs.PlatformType
  ): Anon_Host = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("host")(host)
    __obj.updateDynamic("platform")(platform)
    __obj.asInstanceOf[Anon_Host]
  }
}

