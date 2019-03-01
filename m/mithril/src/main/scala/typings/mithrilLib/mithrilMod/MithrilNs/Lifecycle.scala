package typings
package mithrilLib.mithrilMod.MithrilNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Lifecycle[Attrs, State]
  extends /** WORKAROUND: TypeScript 2.4 does not allow extending an interface with all-optional properties. */
/* _ */ org.scalablytyped.runtime.NumberDictionary[js.Any] {
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  var onbeforeremove: js.UndefOr[
    js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], js.Promise[_] | scala.Unit]
  ] = js.undefined
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  var onbeforeupdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ State, 
      /* vnode */ Vnode[Attrs, State], 
      /* old */ VnodeDOM[Attrs, State], 
      scala.Boolean | scala.Unit
    ]
  ] = js.undefined
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  var oncreate: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], _]] = js.undefined
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  var oninit: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ Vnode[Attrs, State], _]] = js.undefined
  /** The onremove hook is called before a DOM element is removed from the document. */
  var onremove: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], _]] = js.undefined
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  var onupdate: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], _]] = js.undefined
}

object Lifecycle {
  @scala.inline
  def apply[Attrs, State](
    NumberDictionary: /** WORKAROUND: TypeScript 2.4 does not allow extending an interface with all-optional properties. */
  /* _ */ org.scalablytyped.runtime.NumberDictionary[js.Any] = null,
    onbeforeremove: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], js.Promise[_] | scala.Unit] = null,
    onbeforeupdate: js.ThisFunction2[
      /* this */ State, 
      /* vnode */ Vnode[Attrs, State], 
      /* old */ VnodeDOM[Attrs, State], 
      scala.Boolean | scala.Unit
    ] = null,
    oncreate: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], _] = null,
    oninit: js.ThisFunction1[/* this */ State, /* vnode */ Vnode[Attrs, State], _] = null,
    onremove: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], _] = null,
    onupdate: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], _] = null
  ): Lifecycle[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(onbeforeremove)
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(onbeforeupdate)
    if (oncreate != null) __obj.updateDynamic("oncreate")(oncreate)
    if (oninit != null) __obj.updateDynamic("oninit")(oninit)
    if (onremove != null) __obj.updateDynamic("onremove")(onremove)
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate)
    __obj.asInstanceOf[Lifecycle[Attrs, State]]
  }
}

