package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/** Virtual DOM nodes, or vnodes, are Javascript objects that represent an element (or parts of the DOM). */
trait Vnode[Attrs, State /* <: Lifecycle[Attrs, State] */] extends js.Object {
  /** A hashmap of DOM attributes, events, properties and lifecycle methods. */
  var attrs: Attrs
  /** In most vnode types, the children property is an array of vnodes. For text and trusted HTML vnodes, The children property is either a string, a number or a boolean. */
  var children: js.UndefOr[ChildArrayOrPrimitive] = js.undefined
  /** The value used to map a DOM element to its respective item in an array of data. */
  var key: js.UndefOr[java.lang.String | scala.Double] = js.undefined
  /** An object that is persisted between redraws. In component vnodes, state is a shallow clone of the component object. */
  var state: State
  /** The nodeName of a DOM element. It may also be the string [ if a vnode is a fragment, # if it's a text vnode, or < if it's a trusted HTML vnode. Additionally, it may be a component. */
  var tag: java.lang.String | (ComponentTypes[Attrs, State])
  /**
  		 * This is used instead of children if a vnode contains a text node as its only child.
  		 * This is done for performance reasons.
  		 * Component vnodes never use the text property even if they have a text node as their only child.
  		 */
  var text: js.UndefOr[java.lang.String | scala.Double | scala.Boolean] = js.undefined
}

object Vnode {
  @scala.inline
  def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](
    attrs: Attrs,
    state: State,
    tag: java.lang.String | (ComponentTypes[Attrs, State]),
    children: ChildArrayOrPrimitive = null,
    key: java.lang.String | scala.Double = null,
    text: java.lang.String | scala.Double | scala.Boolean = null
  ): Vnode[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("attrs")(attrs.asInstanceOf[js.Any])
    __obj.updateDynamic("state")(state.asInstanceOf[js.Any])
    __obj.updateDynamic("tag")(tag.asInstanceOf[js.Any])
    if (children != null) __obj.updateDynamic("children")(children.asInstanceOf[js.Any])
    if (key != null) __obj.updateDynamic("key")(key.asInstanceOf[js.Any])
    if (text != null) __obj.updateDynamic("text")(text.asInstanceOf[js.Any])
    __obj.asInstanceOf[Vnode[Attrs, State]]
  }
}

