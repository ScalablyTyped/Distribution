package typings.mithril.anon

import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.mithril.mod.Vnode
import typings.mithril.mod.VnodeDOM
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined mithril.mithril.Lifecycle<any, any> & {[key: string] : any} */
@js.native
trait Lifecycleanyanykeystringa
  extends /* key */ StringDictionary[js.Any]
     with /** WORKAROUND: TypeScript 2.4 does not allow extending an interface with all-optional properties. */
/* _ */ NumberDictionary[js.Any] {
  
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  var onbeforeremove: js.UndefOr[
    js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], js.Promise[_] | Unit]
  ] = js.native
  
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  var onbeforeupdate: js.UndefOr[
    js.ThisFunction2[/* this */ js.Any, /* vnode */ Vnode[_, _], /* old */ VnodeDOM[_, _], Boolean | Unit]
  ] = js.native
  
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  var oncreate: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.native
  
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  var oninit: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ Vnode[_, _], _]] = js.native
  
  /** The onremove hook is called before a DOM element is removed from the document. */
  var onremove: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.native
  
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  var onupdate: js.UndefOr[js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]] = js.native
}
object Lifecycleanyanykeystringa {
  
  @scala.inline
  def apply(): Lifecycleanyanykeystringa = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Lifecycleanyanykeystringa]
  }
  
  @scala.inline
  implicit class LifecycleanyanykeystringaOps[Self <: Lifecycleanyanykeystringa] (val x: Self) extends AnyVal {
    
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    
    @scala.inline
    def set(key: String, value: js.Any): Self = {
      x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
      x
    }
    
    @scala.inline
    def setOnbeforeremove(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], js.Promise[_] | Unit]): Self = this.set("onbeforeremove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforeremove: Self = this.set("onbeforeremove", js.undefined)
    
    @scala.inline
    def setOnbeforeupdate(
      value: js.ThisFunction2[/* this */ js.Any, /* vnode */ Vnode[_, _], /* old */ VnodeDOM[_, _], Boolean | Unit]
    ): Self = this.set("onbeforeupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnbeforeupdate: Self = this.set("onbeforeupdate", js.undefined)
    
    @scala.inline
    def setOncreate(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = this.set("oncreate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOncreate: Self = this.set("oncreate", js.undefined)
    
    @scala.inline
    def setOninit(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ Vnode[_, _], _]): Self = this.set("oninit", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOninit: Self = this.set("oninit", js.undefined)
    
    @scala.inline
    def setOnremove(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = this.set("onremove", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnremove: Self = this.set("onremove", js.undefined)
    
    @scala.inline
    def setOnupdate(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = this.set("onupdate", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteOnupdate: Self = this.set("onupdate", js.undefined)
  }
}
