package typings
package powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IEnumMember extends js.Object {
  var displayName: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.DisplayNameGetter
  var value: EnumMemberValue
}

object IEnumMember {
  @scala.inline
  def apply(
    displayName: powerbiDashVisualsDashToolsLib.powerbiDashVisualsDashToolsMod.powerbiNs.dataNs.DisplayNameGetter,
    value: EnumMemberValue
  ): IEnumMember = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("displayName")(displayName.asInstanceOf[js.Any])
    __obj.updateDynamic("value")(value.asInstanceOf[js.Any])
    __obj.asInstanceOf[IEnumMember]
  }
}

