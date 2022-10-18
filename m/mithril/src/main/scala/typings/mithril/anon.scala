package typings.mithril

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.StringDictionary
import typings.mithril.mod.CVnode
import typings.mithril.mod.ClassComponent
import typings.mithril.mod.ComponentTypes
import typings.mithril.mod.JsonpOptions
import typings.mithril.mod.RequestOptions
import typings.mithril.mod.Vnode
import typings.mithril.mod.VnodeDOM
import typings.mithril.mod._ComponentTypes
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined mithril.mithril.CommonAttributes<any, any> & {[key: string] : any} */
  trait CommonAttributesanyanykey
    extends StObject
       with /* key */ StringDictionary[Any] {
    
    /** A key to optionally associate with this element. */
    var key: js.UndefOr[String | Double] = js.undefined
    
    /** The onbeforeremove hook is called before a DOM element is detached from the document. If a Promise is returned, Mithril only detaches the DOM element after the promise completes. */
    var onbeforeremove: js.UndefOr[
        js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], js.Promise[Any] | Unit]
      ] = js.undefined
    
    /** The onbeforeupdate hook is called before a vnode is diffed in a update. */
    var onbeforeupdate: js.UndefOr[
        js.ThisFunction2[
          /* this */ Any, 
          /* vnode */ Vnode[Any, Any], 
          /* old */ VnodeDOM[Any, Any], 
          Boolean | Unit
        ]
      ] = js.undefined
    
    /** The oncreate hook is called after a DOM element is created and attached to the document. */
    var oncreate: js.UndefOr[js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], Any]] = js.undefined
    
    /** The oninit hook is called before a vnode is touched by the virtual DOM engine. */
    var oninit: js.UndefOr[js.ThisFunction1[/* this */ Any, /* vnode */ Vnode[Any, Any], Any]] = js.undefined
    
    /** The onremove hook is called before a DOM element is removed from the document. */
    var onremove: js.UndefOr[js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], Any]] = js.undefined
    
    /** The onupdate hook is called after a DOM element is updated, while attached to the document. */
    var onupdate: js.UndefOr[js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], Any]] = js.undefined
  }
  object CommonAttributesanyanykey {
    
    inline def apply(): CommonAttributesanyanykey = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[CommonAttributesanyanykey]
    }
    
    extension [Self <: CommonAttributesanyanykey](x: Self) {
      
      inline def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      inline def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
      
      inline def setOnbeforeremove(value: js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], js.Promise[Any] | Unit]): Self = StObject.set(x, "onbeforeremove", value.asInstanceOf[js.Any])
      
      inline def setOnbeforeremoveUndefined: Self = StObject.set(x, "onbeforeremove", js.undefined)
      
      inline def setOnbeforeupdate(
        value: js.ThisFunction2[
              /* this */ Any, 
              /* vnode */ Vnode[Any, Any], 
              /* old */ VnodeDOM[Any, Any], 
              Boolean | Unit
            ]
      ): Self = StObject.set(x, "onbeforeupdate", value.asInstanceOf[js.Any])
      
      inline def setOnbeforeupdateUndefined: Self = StObject.set(x, "onbeforeupdate", js.undefined)
      
      inline def setOncreate(value: js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], Any]): Self = StObject.set(x, "oncreate", value.asInstanceOf[js.Any])
      
      inline def setOncreateUndefined: Self = StObject.set(x, "oncreate", js.undefined)
      
      inline def setOninit(value: js.ThisFunction1[/* this */ Any, /* vnode */ Vnode[Any, Any], Any]): Self = StObject.set(x, "oninit", value.asInstanceOf[js.Any])
      
      inline def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
      
      inline def setOnremove(value: js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], Any]): Self = StObject.set(x, "onremove", value.asInstanceOf[js.Any])
      
      inline def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
      
      inline def setOnupdate(value: js.ThisFunction1[/* this */ Any, /* vnode */ VnodeDOM[Any, Any], Any]): Self = StObject.set(x, "onupdate", value.asInstanceOf[js.Any])
      
      inline def setOnupdateUndefined: Self = StObject.set(x, "onupdate", js.undefined)
    }
  }
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](options: JsonpOptionsurlstring): js.Promise[T] = js.native
    def apply[T](url: String): js.Promise[T] = js.native
    def apply[T](url: String, options: JsonpOptions): js.Promise[T] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(element: Element, component: Null): Unit = js.native
    def apply(element: Element, component: ComponentTypes[Any, Any]): Unit = js.native
  }
  
  @js.native
  trait FnCallUrlOptions extends StObject {
    
    def apply[T](options: RequestOptions[T] & Url): js.Promise[T] = js.native
    def apply[T](url: String): js.Promise[T] = js.native
    def apply[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
  }
  
  @js.native
  trait Instantiable[A]
    extends StObject
       with Instantiable1[/* vnode */ CVnode[A], ClassComponent[A]]
       with _ComponentTypes[A, Any]
  
  /* Inlined mithril.mithril.JsonpOptions & {  url :string} */
  trait JsonpOptionsurlstring extends StObject {
    
    /** If false, redraws mounted components upon completion of the request. If true, it does not. */
    var background: js.UndefOr[Boolean] = js.undefined
    
    /** The data to be serialized into the request body. */
    var body: js.UndefOr[Any] = js.undefined
    
    /** The name of the querystring parameter name that specifies the callback name. */
    var callbackKey: js.UndefOr[String] = js.undefined
    
    /** The name of the function that will be called as the callback. */
    var callbackName: js.UndefOr[String] = js.undefined
    
    /** The data to be interpolated into the URL and serialized into the querystring. */
    var params: js.UndefOr[StringDictionary[Any]] = js.undefined
    
    /** A constructor to be applied to each object in the response. */
    var `type`: js.UndefOr[Instantiable1[/* o */ Any, Any]] = js.undefined
    
    var url: String
  }
  object JsonpOptionsurlstring {
    
    inline def apply(url: String): JsonpOptionsurlstring = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonpOptionsurlstring]
    }
    
    extension [Self <: JsonpOptionsurlstring](x: Self) {
      
      inline def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      inline def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      inline def setBody(value: Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      inline def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      inline def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
      
      inline def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
      
      inline def setCallbackName(value: String): Self = StObject.set(x, "callbackName", value.asInstanceOf[js.Any])
      
      inline def setCallbackNameUndefined: Self = StObject.set(x, "callbackName", js.undefined)
      
      inline def setParams(value: StringDictionary[Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      inline def setType(value: Instantiable1[/* o */ Any, Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      inline def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  trait Params extends StObject {
    
    var params: typings.mithril.mod.Params
    
    var path: String
  }
  object Params {
    
    inline def apply(params: typings.mithril.mod.Params, path: String): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    extension [Self <: Params](x: Self) {
      
      inline def setParams(value: typings.mithril.mod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      inline def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  trait Url extends StObject {
    
    var url: String
  }
  object Url {
    
    inline def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    extension [Self <: Url](x: Self) {
      
      inline def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
