package typings.preact.srcInternalMod

import typings.preact.Anon_Children
import typings.preact.srcMod.Key
import typings.preact.srcMod.Ref
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode[P]
  extends typings.preact.srcMod.VNode[P] {
  var _children: js.Array[VNode[_]] | Null
  var _component: (Component[js.Object, js.Object]) | Null
  var _depth: Double | Null
  /**
  	 * The [first (for Fragments)] DOM child of a VNode
  	 */
  var _dom: PreactElement | Text | Null
  /**
  	 * The last dom child of a Fragment, or components that return a Fragment
  	 */
  var _lastDomChild: PreactElement | Text | Null
  var _parent: VNode[js.Object] | Null
  var constructor: js.UndefOr[scala.Nothing] = js.undefined
  // Redefine type here using our internal ComponentFactory type
  @JSName("type")
  var type_VNode: String | ComponentFactory[P] | Null
}

object VNode {
  @scala.inline
  def apply[P](
    key: Key,
    _children: js.Array[VNode[_]] = null,
    _component: Component[js.Object, js.Object] = null,
    _depth: Int | Double = null,
    _dom: PreactElement | Text = null,
    _lastDomChild: PreactElement | Text = null,
    _parent: VNode[js.Object] = null,
    constructor: js.UndefOr[scala.Nothing] = js.undefined,
    endTime: Int | Double = null,
    props: (P with Anon_Children) | String | Double = null,
    ref: Ref[_] = null,
    startTime: Int | Double = null,
    `type`: String | ComponentFactory[P] = null
  ): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any])
    if (_children != null) __obj.updateDynamic("_children")(_children)
    if (_component != null) __obj.updateDynamic("_component")(_component)
    if (_depth != null) __obj.updateDynamic("_depth")(_depth.asInstanceOf[js.Any])
    if (_dom != null) __obj.updateDynamic("_dom")(_dom.asInstanceOf[js.Any])
    if (_lastDomChild != null) __obj.updateDynamic("_lastDomChild")(_lastDomChild.asInstanceOf[js.Any])
    if (_parent != null) __obj.updateDynamic("_parent")(_parent)
    if (!js.isUndefined(constructor)) __obj.updateDynamic("constructor")(constructor)
    if (endTime != null) __obj.updateDynamic("endTime")(endTime.asInstanceOf[js.Any])
    if (props != null) __obj.updateDynamic("props")(props.asInstanceOf[js.Any])
    if (ref != null) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (startTime != null) __obj.updateDynamic("startTime")(startTime.asInstanceOf[js.Any])
    if (`type` != null) __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
}

