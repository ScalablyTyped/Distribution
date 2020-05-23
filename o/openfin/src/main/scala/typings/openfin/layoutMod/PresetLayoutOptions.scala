package typings.openfin.layoutMod

import typings.openfin.utilsMod.LayoutPresetTypes
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait PresetLayoutOptions extends js.Object {
  var presetType: LayoutPresetTypes
}

object PresetLayoutOptions {
  @scala.inline
  def apply(presetType: LayoutPresetTypes): PresetLayoutOptions = {
    val __obj = js.Dynamic.literal(presetType = presetType.asInstanceOf[js.Any])
    __obj.asInstanceOf[PresetLayoutOptions]
  }
}

