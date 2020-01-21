package typings.officeUiFabricReact.personaTypesMod

import typings.uifabricMergeStyles.istyleMod.IStyle
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait IPersonaPresenceStyles extends js.Object {
  var presence: IStyle
  var presenceIcon: IStyle
}

object IPersonaPresenceStyles {
  @scala.inline
  def apply(presence: IStyle = null, presenceIcon: IStyle = null): IPersonaPresenceStyles = {
    val __obj = js.Dynamic.literal()
    if (presence != null) __obj.updateDynamic("presence")(presence.asInstanceOf[js.Any])
    if (presenceIcon != null) __obj.updateDynamic("presenceIcon")(presenceIcon.asInstanceOf[js.Any])
    __obj.asInstanceOf[IPersonaPresenceStyles]
  }
}

