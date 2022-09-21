package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Components are a mechanism to encapsulate parts of a view to make code easier to organize and/or reuse.
  * Any Javascript object that has a view method can be used as a Mithril component.
  * Components can be consumed via the m() utility.
  */
trait Component[Attrs, State]
  extends StObject
     with _ComponentTypes[Attrs, State] {
  
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  var onbeforeremove: js.UndefOr[
    js.ThisFunction1[
      /* this */ NoLifecycle[this.type & State], 
      /* vnode */ VnodeDOM[Attrs, NoLifecycle[this.type & State]], 
      js.Promise[Any] | Unit
    ]
  ] = js.undefined
  
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  var onbeforeupdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ NoLifecycle[this.type & State], 
      /* vnode */ Vnode[Attrs, NoLifecycle[this.type & State]], 
      /* old */ VnodeDOM[Attrs, NoLifecycle[this.type & State]], 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  var oncreate: js.UndefOr[
    js.ThisFunction1[
      /* this */ NoLifecycle[this.type & State], 
      /* vnode */ VnodeDOM[Attrs, NoLifecycle[this.type & State]], 
      Any
    ]
  ] = js.undefined
  
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  var oninit: js.UndefOr[
    js.ThisFunction1[
      /* this */ NoLifecycle[this.type & State], 
      /* vnode */ Vnode[Attrs, NoLifecycle[this.type & State]], 
      Any
    ]
  ] = js.undefined
  
  /** The onremove hook is called before a DOM element is removed from the document. */
  var onremove: js.UndefOr[
    js.ThisFunction1[
      /* this */ NoLifecycle[this.type & State], 
      /* vnode */ VnodeDOM[Attrs, NoLifecycle[this.type & State]], 
      Any
    ]
  ] = js.undefined
  
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  var onupdate: js.UndefOr[
    js.ThisFunction1[
      /* this */ NoLifecycle[this.type & State], 
      /* vnode */ VnodeDOM[Attrs, NoLifecycle[this.type & State]], 
      Any
    ]
  ] = js.undefined
  
  /** Creates a view out of virtual elements. */
  def view(vnode: Vnode[Attrs, NoLifecycle[this.type & State]]): Children | Null | Unit
}
object Component {
  
  inline def apply[Attrs, State](view: Vnode[Attrs, NoLifecycle[(Component[Attrs, State]) & State]] => Children | Null | Unit): Component[Attrs, State] = {
    val __obj = js.Dynamic.literal(view = js.Any.fromFunction1(view))
    __obj.asInstanceOf[Component[Attrs, State]]
  }
  
  extension [Self <: Component[?, ?], Attrs, State](x: Self & (Component[Attrs, State])) {
    
    inline def setOnbeforeremove(
      value: js.ThisFunction1[
          /* this */ NoLifecycle[(Component[Attrs, State]) & State], 
          /* vnode */ VnodeDOM[Attrs, NoLifecycle[(Component[Attrs, State]) & State]], 
          js.Promise[Any] | Unit
        ]
    ): Self = StObject.set(x, "onbeforeremove", value.asInstanceOf[js.Any])
    
    inline def setOnbeforeremoveUndefined: Self = StObject.set(x, "onbeforeremove", js.undefined)
    
    inline def setOnbeforeupdate(
      value: js.ThisFunction2[
          /* this */ NoLifecycle[(Component[Attrs, State]) & State], 
          /* vnode */ Vnode[Attrs, NoLifecycle[(Component[Attrs, State]) & State]], 
          /* old */ VnodeDOM[Attrs, NoLifecycle[(Component[Attrs, State]) & State]], 
          Boolean | Unit
        ]
    ): Self = StObject.set(x, "onbeforeupdate", value.asInstanceOf[js.Any])
    
    inline def setOnbeforeupdateUndefined: Self = StObject.set(x, "onbeforeupdate", js.undefined)
    
    inline def setOncreate(
      value: js.ThisFunction1[
          /* this */ NoLifecycle[(Component[Attrs, State]) & State], 
          /* vnode */ VnodeDOM[Attrs, NoLifecycle[(Component[Attrs, State]) & State]], 
          Any
        ]
    ): Self = StObject.set(x, "oncreate", value.asInstanceOf[js.Any])
    
    inline def setOncreateUndefined: Self = StObject.set(x, "oncreate", js.undefined)
    
    inline def setOninit(
      value: js.ThisFunction1[
          /* this */ NoLifecycle[(Component[Attrs, State]) & State], 
          /* vnode */ Vnode[Attrs, NoLifecycle[(Component[Attrs, State]) & State]], 
          Any
        ]
    ): Self = StObject.set(x, "oninit", value.asInstanceOf[js.Any])
    
    inline def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
    
    inline def setOnremove(
      value: js.ThisFunction1[
          /* this */ NoLifecycle[(Component[Attrs, State]) & State], 
          /* vnode */ VnodeDOM[Attrs, NoLifecycle[(Component[Attrs, State]) & State]], 
          Any
        ]
    ): Self = StObject.set(x, "onremove", value.asInstanceOf[js.Any])
    
    inline def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
    
    inline def setOnupdate(
      value: js.ThisFunction1[
          /* this */ NoLifecycle[(Component[Attrs, State]) & State], 
          /* vnode */ VnodeDOM[Attrs, NoLifecycle[(Component[Attrs, State]) & State]], 
          Any
        ]
    ): Self = StObject.set(x, "onupdate", value.asInstanceOf[js.Any])
    
    inline def setOnupdateUndefined: Self = StObject.set(x, "onupdate", js.undefined)
    
    inline def setView(value: Vnode[Attrs, NoLifecycle[(Component[Attrs, State]) & State]] => Children | Null | Unit): Self = StObject.set(x, "view", js.Any.fromFunction1(value))
  }
}
