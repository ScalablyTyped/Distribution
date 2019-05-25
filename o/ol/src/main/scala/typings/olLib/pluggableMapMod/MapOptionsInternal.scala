package typings
package olLib.pluggableMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptionsInternal extends js.Object {
  var controls: js.UndefOr[olLib.collectionMod.default[olLib.controlControlMod.default]] = js.undefined
  var interactions: js.UndefOr[olLib.collectionMod.default[olLib.interactionInteractionMod.default]] = js.undefined
  var keyboardEventTarget: stdLib.HTMLElement | stdLib.Document
  var overlays: olLib.collectionMod.default[olLib.overlayMod.default]
  var values: org.scalablytyped.runtime.StringDictionary[js.Any]
}

object MapOptionsInternal {
  @scala.inline
  def apply(
    keyboardEventTarget: stdLib.HTMLElement | stdLib.Document,
    overlays: olLib.collectionMod.default[olLib.overlayMod.default],
    values: org.scalablytyped.runtime.StringDictionary[js.Any],
    controls: olLib.collectionMod.default[olLib.controlControlMod.default] = null,
    interactions: olLib.collectionMod.default[olLib.interactionInteractionMod.default] = null
  ): MapOptionsInternal = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], overlays = overlays, values = values)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (interactions != null) __obj.updateDynamic("interactions")(interactions)
    __obj.asInstanceOf[MapOptionsInternal]
  }
}

