package typings.mithril

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.mithril.mod.Vnode
import typings.mithril.mod.VnodeDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Inlined mithril.mithril.Lifecycle<any, any> & {[key: string] : any} */
trait Lifecycleanyanykeystringa
  extends /* key */ StringDictionary[js.Any]
     with /** WORKAROUND: TypeScript 2.4 does not allow extending an interface with all-optional properties. */
/* _ */ NumberDictionary[js.Any] {
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  var onbeforeremove: js.UndefOr[
    js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], js.Promise[_] | Unit]
  ] = js.undefined
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  var onbeforeupdate: js.UndefOr[
    js.ThisFunction2[/* this */ js.Any, /* vnode */ Vnode[_, _], /* old */ VnodeDOM[_, _], Boolean | Unit]
  ] = js.undefined
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  var oncreate: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.undefined
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  var oninit: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ Vnode[_, _], _]] = js.undefined
  /** The onremove hook is called before a DOM element is removed from the document. */
  var onremove: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.undefined
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  var onupdate: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.undefined
}

object Lifecycleanyanykeystringa {
  @scala.inline
  def apply(
    NumberDictionary: /** WORKAROUND: TypeScript 2.4 does not allow extending an interface with all-optional properties. */
  /* _ */ NumberDictionary[js.Any] = null,
    StringDictionary: /* key */ StringDictionary[js.Any] = null,
    onbeforeremove: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], js.Promise[_] | Unit] = null,
    onbeforeupdate: js.ThisFunction2[/* this */ js.Any, /* vnode */ Vnode[_, _], /* old */ VnodeDOM[_, _], Boolean | Unit] = null,
    oncreate: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _] = null,
    oninit: js.ThisFunction1[/* this */ js.Any, /* vnode */ Vnode[_, _], _] = null,
    onremove: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _] = null,
    onupdate: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _] = null
  ): Lifecycleanyanykeystringa = {
    val __obj = js.Dynamic.literal()
    if (NumberDictionary != null) js.Dynamic.global.Object.assign(__obj, NumberDictionary)
    if (StringDictionary != null) js.Dynamic.global.Object.assign(__obj, StringDictionary)
    if (onbeforeremove != null) __obj.updateDynamic("onbeforeremove")(onbeforeremove.asInstanceOf[js.Any])
    if (onbeforeupdate != null) __obj.updateDynamic("onbeforeupdate")(onbeforeupdate.asInstanceOf[js.Any])
    if (oncreate != null) __obj.updateDynamic("oncreate")(oncreate.asInstanceOf[js.Any])
    if (oninit != null) __obj.updateDynamic("oninit")(oninit.asInstanceOf[js.Any])
    if (onremove != null) __obj.updateDynamic("onremove")(onremove.asInstanceOf[js.Any])
    if (onupdate != null) __obj.updateDynamic("onupdate")(onupdate.asInstanceOf[js.Any])
    __obj.asInstanceOf[Lifecycleanyanykeystringa]
  }
}

