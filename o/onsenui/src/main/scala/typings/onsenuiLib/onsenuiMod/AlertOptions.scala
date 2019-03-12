package typings
package onsenuiLib.onsenuiMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait AlertOptions extends js.Object {
  var animation: js.UndefOr[java.lang.String] = js.undefined
  var buttonLabel: js.UndefOr[java.lang.String] = js.undefined
  var buttonLabels: js.UndefOr[js.Array[java.lang.String]] = js.undefined
  var callback: js.UndefOr[js.Any] = js.undefined
  var cancelable: js.UndefOr[scala.Boolean] = js.undefined
  var id: js.UndefOr[java.lang.String] = js.undefined
  var message: js.UndefOr[java.lang.String] = js.undefined
  var messageHTML: js.UndefOr[java.lang.String] = js.undefined
  var modifier: js.UndefOr[java.lang.String] = js.undefined
  var primaryButtonIndex: js.UndefOr[scala.Double] = js.undefined
  var title: js.UndefOr[java.lang.String] = js.undefined
}

object AlertOptions {
  @scala.inline
  def apply(
    animation: java.lang.String = null,
    buttonLabel: java.lang.String = null,
    buttonLabels: js.Array[java.lang.String] = null,
    callback: js.Any = null,
    cancelable: js.UndefOr[scala.Boolean] = js.undefined,
    id: java.lang.String = null,
    message: java.lang.String = null,
    messageHTML: java.lang.String = null,
    modifier: java.lang.String = null,
    primaryButtonIndex: scala.Int | scala.Double = null,
    title: java.lang.String = null
  ): AlertOptions = {
    val __obj = js.Dynamic.literal()
    if (animation != null) __obj.updateDynamic("animation")(animation)
    if (buttonLabel != null) __obj.updateDynamic("buttonLabel")(buttonLabel)
    if (buttonLabels != null) __obj.updateDynamic("buttonLabels")(buttonLabels)
    if (callback != null) __obj.updateDynamic("callback")(callback)
    if (!js.isUndefined(cancelable)) __obj.updateDynamic("cancelable")(cancelable)
    if (id != null) __obj.updateDynamic("id")(id)
    if (message != null) __obj.updateDynamic("message")(message)
    if (messageHTML != null) __obj.updateDynamic("messageHTML")(messageHTML)
    if (modifier != null) __obj.updateDynamic("modifier")(modifier)
    if (primaryButtonIndex != null) __obj.updateDynamic("primaryButtonIndex")(primaryButtonIndex.asInstanceOf[js.Any])
    if (title != null) __obj.updateDynamic("title")(title)
    __obj.asInstanceOf[AlertOptions]
  }
}

