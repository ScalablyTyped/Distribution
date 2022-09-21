package typings.mithril.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait CommonAttributes[Attrs, State] extends StObject {
  
  /** A key to optionally associate with this element. */
  var key: js.UndefOr[String | Double] = js.undefined
  
  /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
  var onbeforeremove: js.UndefOr[
    js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], js.Promise[Any] | Unit]
  ] = js.undefined
  
  /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
  var onbeforeupdate: js.UndefOr[
    js.ThisFunction2[
      /* this */ State, 
      /* vnode */ Vnode[Attrs, State], 
      /* old */ VnodeDOM[Attrs, State], 
      Boolean | Unit
    ]
  ] = js.undefined
  
  /** The oncreate hook is called after a DOM element is created and attached to the document. */
  var oncreate: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], Any]] = js.undefined
  
  /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
  var oninit: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ Vnode[Attrs, State], Any]] = js.undefined
  
  /** The onremove hook is called before a DOM element is removed from the document. */
  var onremove: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], Any]] = js.undefined
  
  /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
  var onupdate: js.UndefOr[js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], Any]] = js.undefined
}
object CommonAttributes {
  
  inline def apply[Attrs, State](): CommonAttributes[Attrs, State] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[CommonAttributes[Attrs, State]]
  }
  
  extension [Self <: CommonAttributes[?, ?], Attrs, State](x: Self & (CommonAttributes[Attrs, State])) {
    
    inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
    
    inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    
    inline def setOnbeforeremove(
      value: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], js.Promise[Any] | Unit]
    ): Self = StObject.set(x, "onbeforeremove", value.asInstanceOf[js.Any])
    
    inline def setOnbeforeremoveUndefined: Self = StObject.set(x, "onbeforeremove", js.undefined)
    
    inline def setOnbeforeupdate(
      value: js.ThisFunction2[
          /* this */ State, 
          /* vnode */ Vnode[Attrs, State], 
          /* old */ VnodeDOM[Attrs, State], 
          Boolean | Unit
        ]
    ): Self = StObject.set(x, "onbeforeupdate", value.asInstanceOf[js.Any])
    
    inline def setOnbeforeupdateUndefined: Self = StObject.set(x, "onbeforeupdate", js.undefined)
    
    inline def setOncreate(value: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], Any]): Self = StObject.set(x, "oncreate", value.asInstanceOf[js.Any])
    
    inline def setOncreateUndefined: Self = StObject.set(x, "oncreate", js.undefined)
    
    inline def setOninit(value: js.ThisFunction1[/* this */ State, /* vnode */ Vnode[Attrs, State], Any]): Self = StObject.set(x, "oninit", value.asInstanceOf[js.Any])
    
    inline def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
    
    inline def setOnremove(value: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], Any]): Self = StObject.set(x, "onremove", value.asInstanceOf[js.Any])
    
    inline def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
    
    inline def setOnupdate(value: js.ThisFunction1[/* this */ State, /* vnode */ VnodeDOM[Attrs, State], Any]): Self = StObject.set(x, "onupdate", value.asInstanceOf[js.Any])
    
    inline def setOnupdateUndefined: Self = StObject.set(x, "onupdate", js.undefined)
  }
}
