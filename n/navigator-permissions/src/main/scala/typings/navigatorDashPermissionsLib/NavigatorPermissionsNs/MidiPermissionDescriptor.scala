package typings
package navigatorDashPermissionsLib.NavigatorPermissionsNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MidiPermissionDescriptor
  extends PermissionDescriptor[navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.midi] {
  /**
    * Indicates whether you need and/or receive system exclusive
    * messages. The default is false.
    */
  var sysex: js.UndefOr[scala.Boolean] = js.undefined
}

object MidiPermissionDescriptor {
  @scala.inline
  def apply(
    name: navigatorDashPermissionsLib.navigatorDashPermissionsLibStrings.midi,
    sysex: js.UndefOr[scala.Boolean] = js.undefined
  ): MidiPermissionDescriptor = {
    val __obj = js.Dynamic.literal(name = name)
    if (!js.isUndefined(sysex)) __obj.updateDynamic("sysex")(sysex)
    __obj.asInstanceOf[MidiPermissionDescriptor]
  }
}

