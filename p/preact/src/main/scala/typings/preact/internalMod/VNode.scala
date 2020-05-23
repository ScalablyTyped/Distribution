package typings.preact.internalMod

import typings.preact.anon.Children
import typings.preact.mod.ComponentType
import typings.preact.mod.Key
import typings.preact.mod.Ref
import typings.std.Text
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait VNode[P]
  extends typings.preact.mod.VNode[P] {
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
  var _nextDom: PreactElement | Text | Null
  var _original: js.UndefOr[VNode[js.Object] | Null] = js.undefined
  var _parent: VNode[js.Object] | Null
  var constructor: js.UndefOr[scala.Nothing] = js.undefined
}

object VNode {
  @scala.inline
  def apply[P](
    key: Key,
    props: P with Children,
    `type`: ComponentType[P] | String,
    _children: js.Array[VNode[_]] = null,
    _component: Component[js.Object, js.Object] = null,
    _depth: Double = null.asInstanceOf[Double],
    _dom: PreactElement | Text = null,
    _nextDom: PreactElement | Text = null,
    _original: js.UndefOr[Null | VNode[js.Object]] = js.undefined,
    _parent: VNode[js.Object] = null,
    endTime: js.UndefOr[Double] = js.undefined,
    ref: js.UndefOr[Null | Ref[_]] = js.undefined,
    startTime: js.UndefOr[Double] = js.undefined
  ): VNode[P] = {
    val __obj = js.Dynamic.literal(key = key.asInstanceOf[js.Any], props = props.asInstanceOf[js.Any], _children = _children.asInstanceOf[js.Any], _component = _component.asInstanceOf[js.Any], _depth = _depth.asInstanceOf[js.Any], _dom = _dom.asInstanceOf[js.Any], _nextDom = _nextDom.asInstanceOf[js.Any], _parent = _parent.asInstanceOf[js.Any])
    __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
    if (!js.isUndefined(_original)) __obj.updateDynamic("_original")(_original.asInstanceOf[js.Any])
    if (!js.isUndefined(endTime)) __obj.updateDynamic("endTime")(endTime.get.asInstanceOf[js.Any])
    if (!js.isUndefined(ref)) __obj.updateDynamic("ref")(ref.asInstanceOf[js.Any])
    if (!js.isUndefined(startTime)) __obj.updateDynamic("startTime")(startTime.get.asInstanceOf[js.Any])
    __obj.asInstanceOf[VNode[P]]
  }
}

