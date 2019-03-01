package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/**
	 * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
	 * Any class that implements a view method can be used as a Mithril component.
	 * Components can be consumed via the m() utility.
	 */
trait ClassComponent[A] extends Lifecycle[A, ClassComponent[A]] {
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  @JSName("onbeforeremove")
  var onbeforeremove_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], js.Promise[_] | scala.Unit]] = js.undefined
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  @JSName("onbeforeupdate")
  var onbeforeupdate_ClassComponent: js.UndefOr[
    js.Function2[
      /* vnode */ Vnode[A, this.type], 
      /* old */ VnodeDOM[A, this.type], 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  @JSName("oncreate")
  var oncreate_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.undefined
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  @JSName("oninit")
  var oninit_ClassComponent: js.UndefOr[js.Function1[/* vnode */ Vnode[A, this.type], _]] = js.undefined
  /** The onremove hook is called before a DOM element is removed from the document. */
  @JSName("onremove")
  var onremove_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.undefined
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  @JSName("onupdate")
  var onupdate_ClassComponent: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], _]] = js.undefined
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[A, this.type]): Children | scala.Null | scala.Unit
}

object ClassComponent {
  @scala.inline
  def apply[A](
    view: js.Function1[Vnode[A, ClassComponent[A]], Children | scala.Null | scala.Unit],
    onbeforeremove: js.Function1[/* vnode */ VnodeDOM[A, ClassComponent[A]], js.Promise[_] | scala.Unit] = null,
    onbeforeupdate: js.Function2[
      /* vnode */ Vnode[A, ClassComponent[A]], 
      /* old */ VnodeDOM[A, ClassComponent[A]], 
      scala.Boolean | scala.Unit
    ] = null,
    oncreate: js.Function1[/* vnode */ VnodeDOM[A, ClassComponent[A]], _] = null,
    oninit: js.Function1[/* vnode */ Vnode[A, ClassComponent[A]], _] = null,
    onremove: js.Function1[/* vnode */ VnodeDOM[A, ClassComponent[A]], _] = null,
    onupdate: js.Function1[/* vnode */ VnodeDOM[A, ClassComponent[A]], _] = null
  ): ClassComponent[A] = {
    val __obj = js.Dynamic.literal()
    __obj.updateDynamic("view")(view)
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(onbeforeremove)
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(onbeforeupdate)
    if (oncreate != null) __obj.updateDynamic("oncreate")(oncreate)
    if (oninit != null) __obj.updateDynamic("oninit")(oninit)
    if (onremove != null) __obj.updateDynamic("onremove")(onremove)
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate)
    __obj.asInstanceOf[ClassComponent[A]]
  }
}

