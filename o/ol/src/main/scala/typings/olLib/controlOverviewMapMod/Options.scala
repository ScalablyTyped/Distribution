package typings
package olLib.controlOverviewMapMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  var className: js.UndefOr[java.lang.String] = js.undefined
  var collapseLabel: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var collapsed: js.UndefOr[scala.Boolean] = js.undefined
  var collapsible: js.UndefOr[scala.Boolean] = js.undefined
  var label: js.UndefOr[java.lang.String | stdLib.HTMLElement] = js.undefined
  var layers: js.UndefOr[
    js.Array[olLib.layerLayerMod.default] | olLib.collectionMod.default[olLib.layerLayerMod.default]
  ] = js.undefined
  var render: js.UndefOr[js.Function1[/* param0 */ olLib.mapEventMod.default, scala.Unit]] = js.undefined
  var target: js.UndefOr[stdLib.HTMLElement | java.lang.String] = js.undefined
  var tipLabel: js.UndefOr[java.lang.String] = js.undefined
  var view: js.UndefOr[olLib.viewMod.default] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    className: java.lang.String = null,
    collapseLabel: java.lang.String | stdLib.HTMLElement = null,
    collapsed: js.UndefOr[scala.Boolean] = js.undefined,
    collapsible: js.UndefOr[scala.Boolean] = js.undefined,
    label: java.lang.String | stdLib.HTMLElement = null,
    layers: js.Array[olLib.layerLayerMod.default] | olLib.collectionMod.default[olLib.layerLayerMod.default] = null,
    render: /* param0 */ olLib.mapEventMod.default => scala.Unit = null,
    target: stdLib.HTMLElement | java.lang.String = null,
    tipLabel: java.lang.String = null,
    view: olLib.viewMod.default = null
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (className != null) __obj.updateDynamic("className")(className)
    if (collapseLabel != null) __obj.updateDynamic("collapseLabel")(collapseLabel.asInstanceOf[js.Any])
    if (!js.isUndefined(collapsed)) __obj.updateDynamic("collapsed")(collapsed)
    if (!js.isUndefined(collapsible)) __obj.updateDynamic("collapsible")(collapsible)
    if (label != null) __obj.updateDynamic("label")(label.asInstanceOf[js.Any])
    if (layers != null) __obj.updateDynamic("layers")(layers.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction1(render))
    if (target != null) __obj.updateDynamic("target")(target.asInstanceOf[js.Any])
    if (tipLabel != null) __obj.updateDynamic("tipLabel")(tipLabel)
    if (view != null) __obj.updateDynamic("view")(view)
    __obj.asInstanceOf[Options]
  }
}

