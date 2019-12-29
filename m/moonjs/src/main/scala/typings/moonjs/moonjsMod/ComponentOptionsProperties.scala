package typings.moonjs.moonjsMod

import typings.moonjs.moonjsBooleans.`true`
import typings.std.HTMLElement
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait ComponentOptionsProperties[Props /* <: String */, Data, Methods] extends js.Object {
  var data: js.UndefOr[Data] = js.undefined
  var el: js.UndefOr[String | HTMLElement] = js.undefined
  var functional: js.UndefOr[`true`] = js.undefined
  var hooks: js.UndefOr[LifecycleHooks] = js.undefined
  var methods: js.UndefOr[Methods] = js.undefined
  var name: js.UndefOr[String] = js.undefined
  var props: js.UndefOr[js.Array[Props]] = js.undefined
  var render: js.UndefOr[js.Function2[/* h */ CreateElement, /* ctx */ js.Any, VDomElement]] = js.undefined
  var template: js.UndefOr[String] = js.undefined
}

object ComponentOptionsProperties {
  @scala.inline
  def apply[Props /* <: String */, Data, Methods](
    data: Data = null,
    el: String | HTMLElement = null,
    functional: `true` = null,
    hooks: LifecycleHooks = null,
    methods: Methods = null,
    name: String = null,
    props: js.Array[Props] = null,
    render: (/* h */ CreateElement, /* ctx */ js.Any) => VDomElement = null,
    template: String = null
  ): ComponentOptionsProperties[Props, Data, Methods] = {
    val __obj = js.Dynamic.literal()
    if (data != null) __obj.updateDynamic("data")(data.asInstanceOf[js.Any])
    if (el != null) __obj.updateDynamic("el")(el.asInstanceOf[js.Any])
    if (functional != null) __obj.updateDynamic("functional")(functional.asInstanceOf[js.Any])
    if (hooks != null) __obj.updateDynamic("hooks")(hooks.asInstanceOf[js.Any])
    if (methods != null) __obj.updateDynamic("methods")(methods.asInstanceOf[js.Any])
    if (name != null) __obj.updateDynamic("name")(name.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (render != null) __obj.updateDynamic("render")(js.Any.fromFunction2(render))
    if (template != null) __obj.updateDynamic("template")(template.asInstanceOf[js.Any])
    __obj.asInstanceOf[ComponentOptionsProperties[Props, Data, Methods]]
  }
}

