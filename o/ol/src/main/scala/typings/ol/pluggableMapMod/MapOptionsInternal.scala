package typings.ol.pluggableMapMod

import org.scalablytyped.runtime.StringDictionary
import typings.std.Document
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MapOptionsInternal extends js.Object {
  var controls: js.UndefOr[typings.ol.collectionMod.default[typings.ol.controlControlMod.default]] = js.undefined
  var interactions: js.UndefOr[typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default]] = js.undefined
  var keyboardEventTarget: HTMLElement | Document
  var overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default]
  var values: StringDictionary[js.Any]
}

object MapOptionsInternal {
  @scala.inline
  def apply(
    keyboardEventTarget: HTMLElement | Document,
    overlays: typings.ol.collectionMod.default[typings.ol.overlayMod.default],
    values: StringDictionary[js.Any],
    controls: typings.ol.collectionMod.default[typings.ol.controlControlMod.default] = null,
    interactions: typings.ol.collectionMod.default[typings.ol.interactionInteractionMod.default] = null
  ): MapOptionsInternal = {
    val __obj = js.Dynamic.literal(keyboardEventTarget = keyboardEventTarget.asInstanceOf[js.Any], overlays = overlays, values = values)
    if (controls != null) __obj.updateDynamic("controls")(controls)
    if (interactions != null) __obj.updateDynamic("interactions")(interactions)
    __obj.asInstanceOf[MapOptionsInternal]
  }
}

