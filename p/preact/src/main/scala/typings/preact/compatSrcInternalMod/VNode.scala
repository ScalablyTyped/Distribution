package typings.preact.compatSrcInternalMod

import typings.preact.Anon_Children
import typings.preact.srcInternalMod.ComponentFactory
import typings.preact.srcInternalMod.PreactElement
import typings.preact.srcMod.Key
import typings.preact.srcMod.Ref
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode[T]
  extends typings.preact.srcInternalMod.VNode[T] {
  @JSName("$$typeof")
  var $$typeof: js.UndefOr[js.Symbol | String] = js.undefined
  var preactCompatNormalized: js.UndefOr[Boolean] = js.undefined
}

object VNode {
  @scala.inline
  def apply[T](
    key: Key,
    $$typeof: js.Symbol | String = null,
    _children: js.Array[typings.preact.srcInternalMod.VNode[_]] = null,
    _component: typings.preact.srcInternalMod.Component[js.Object, js.Object] = null,
    _depth: Int | Double = null,
    _dom: PreactElement | Text = null,
    _lastDomChild: PreactElement | Text = null,
    _parent: typings.preact.srcInternalMod.VNode[js.Object] = null,
    constructor: js.UndefOr[scala.Nothing] = js.undefined,
    endTime: Int | Double = null,
    preactCompatNormalized: js.UndefOr[Boolean] = js.undefined,
    props: (T with Anon_Children) | String | Double = null,
    ref: Ref[_] = null,
    startTime: Int | Double = null,
    `type`: String | ComponentFactory[T] = null
  ): VNode[T] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if ($$typeof != null) __obj.updateDynamic("$$typeof")($$typeof.asInstanceOf[js.Any])
    if (_children != null) __obj.updateDynamic("_children")(_children)
    if (_component != null) __obj.updateDynamic("_component")(_component)
    if (_depth != null) __obj.updateDynamic("_depth")(_depth.asInstanceOf[js.Any])
    if (_dom != null) __obj.updateDynamic("_dom")(_dom.asInstanceOf[js.Any])
    if (_lastDomChild != null) __obj.updateDynamic("_lastDomChild")(_lastDomChild.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent)
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (!js.isUndefined(preactCompatNormalized)) __obj.updateDynamic("preactCompatNormalized")(preactCompatNormalized)
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[T]]
  }
}

