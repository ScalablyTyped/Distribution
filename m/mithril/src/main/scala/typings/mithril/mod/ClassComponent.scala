package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  * Any class that implements a view method can be used as a Mithril component.
  * Components can be consumed via the m() utility.
  */
trait ClassComponent[A] extends StObject {
  
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  var onbeforeremove: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], js.Promise[Any] | Unit]] = js.undefined
  
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  var onbeforeupdate: js.UndefOr[
    js.Function2[/* vnode */ Vnode[A, this.type], /* old */ VnodeDOM[A, this.type], Boolean | Unit]
  ] = js.undefined
  
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  var oncreate: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], Any]] = js.undefined
  
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  var oninit: js.UndefOr[js.Function1[/* vnode */ Vnode[A, this.type], Any]] = js.undefined
  
  /** The onremove hook is called before a DOM element is removed from the document. */
  var onremove: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], Any]] = js.undefined
  
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  var onupdate: js.UndefOr[js.Function1[/* vnode */ VnodeDOM[A, this.type], Any]] = js.undefined
  
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[A, this.type]): Children | Null | Unit
}
object ClassComponent {
  
  inline def apply[A](view: Vnode[A, ClassComponent[A]] => Children | Null | Unit): ClassComponent[A] = {
    val __obj = js.Dynamic.literal(view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[ClassComponent[A]]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: ClassComponent[?], A] (val x: Self & ClassComponent[A]) extends AnyVal {
    
    inline def setOnbeforeremove(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => js.Promise[Any] | Unit): Self = StObject.set(x, "onbeforeremove", js.Any.fromFunction1(value))
    
    inline def setOnbeforeremoveUndefined: Self = StObject.set(x, "onbeforeremove", js.undefined)
    
    inline def setOnbeforeupdate(
      value: (/* vnode */ Vnode[A, ClassComponent[A]], /* old */ VnodeDOM[A, ClassComponent[A]]) => Boolean | Unit
    ): Self = StObject.set(x, "onbeforeupdate", js.Any.fromFunction2(value))
    
    inline def setOnbeforeupdateUndefined: Self = StObject.set(x, "onbeforeupdate", js.undefined)
    
    inline def setOncreate(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => Any): Self = StObject.set(x, "oncreate", js.Any.fromFunction1(value))
    
    inline def setOncreateUndefined: Self = StObject.set(x, "oncreate", js.undefined)
    
    inline def setOninit(value: /* vnode */ Vnode[A, ClassComponent[A]] => Any): Self = StObject.set(x, "oninit", js.Any.fromFunction1(value))
    
    inline def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
    
    inline def setOnremove(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => Any): Self = StObject.set(x, "onremove", js.Any.fromFunction1(value))
    
    inline def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
    
    inline def setOnupdate(value: /* vnode */ VnodeDOM[A, ClassComponent[A]] => Any): Self = StObject.set(x, "onupdate", js.Any.fromFunction1(value))
    
    inline def setOnupdateUndefined: Self = StObject.set(x, "onupdate", js.undefined)
    
    inline def setView(value: Vnode[A, ClassComponent[A]] => Children | Null | Unit): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
