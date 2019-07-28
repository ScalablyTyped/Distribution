package typings.mithril.mithrilMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
	 * Any Javascript object that has a view method can be used as a Mithril component.
	 * Components can be consumed via the m() utility.
	 */
trait Component[Attrs, State /* <: Lifecycle[Attrs, State] */]
  extends Lifecycle[Attrs, State]
     with _ComponentTypes[Attrs, State] {
  /** Creates a view out of virtual elements. */
  def view(`this`: State, vnode: Vnode[Attrs, State]): Children | Null | Unit
}

object Component {
  @scala.inline
  def apply[Attrs, State /* <: Lifecycle[Attrs, State] */](
    view: (State, Vnode[Attrs, State]) => Children | Null | Unit,
    onbeforeremove: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], js.Promise[_] | Unit] = null,
    onbeforeupdate: js.ThisFunction2[
      State, 
      /* vnode */ Vnode[Attrs, State], 
      /* old */ VnodeDOM[Attrs, State], 
      Boolean | Unit
    ] = null,
    oncreate: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], _] = null,
    oninit: js.ThisFunction1[State, /* vnode */ Vnode[Attrs, State], _] = null,
    onremove: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], _] = null,
    onupdate: js.ThisFunction1[State, /* vnode */ VnodeDOM[Attrs, State], _] = null
  ): Component[Attrs, State] = {
    val __obj = js.Dynamic.literal(view = js.Any.fromFunction2(view))
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(onbeforeremove)
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(onbeforeupdate)
    if (oncreate != null) __obj.updateDynamic("oncreate")(oncreate)
    if (oninit != null) __obj.updateDynamic("oninit")(oninit)
    if (onremove != null) __obj.updateDynamic("onremove")(onremove)
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate)
    __obj.asInstanceOf[Component[Attrs, State]]
  }
}

