package typings.mithril

import org.scalablytyped.runtime.Instantiable1
import org.scalablytyped.runtime.NumberDictionary
import org.scalablytyped.runtime.StringDictionary
import typings.mithril.mod.CVnode
import typings.mithril.mod.ClassComponent
import typings.mithril.mod.ComponentTypes
import typings.mithril.mod.JsonpOptions
import typings.mithril.mod.RequestOptions
import typings.mithril.mod.Vnode
import typings.mithril.mod.VnodeDOM
import typings.mithril.mod._ComponentTypes
import typings.std.BodyInit
import typings.std.Document
import typings.std.Element
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  @js.native
  trait Fn0 extends StObject {
    
    def apply[T](options: JsonpOptionsurlstring): js.Promise[T] = js.native
    def apply[T](url: String): js.Promise[T] = js.native
    def apply[T](url: String, options: JsonpOptions): js.Promise[T] = js.native
  }
  
  @js.native
  trait FnCall extends StObject {
    
    def apply(): Unit = js.native
    def apply(body: BodyInit): Unit = js.native
    def apply(body: Document): Unit = js.native
  }
  
  @js.native
  trait FnCallElementComponent extends StObject {
    
    def apply(element: Element, component: Null): Unit = js.native
    def apply(element: Element, component: ComponentTypes[_, _]): Unit = js.native
  }
  
  @js.native
  trait FnCallUrlOptions extends StObject {
    
    def apply[T](options: RequestOptions[T] with Url): js.Promise[T] = js.native
    def apply[T](url: String): js.Promise[T] = js.native
    def apply[T](url: String, options: RequestOptions[T]): js.Promise[T] = js.native
  }
  
  @js.native
  trait Instantiable[A]
    extends _ComponentTypes[A, js.Any]
       with Instantiable1[/* vnode */ CVnode[A], ClassComponent[A]]
  
  /* Inlined mithril.mithril.JsonpOptions & {  url :string} */
  @js.native
  trait JsonpOptionsurlstring extends StObject {
    
    /** If false, redraws mounted components upon completion of the request. If true, it does not. */
    var background: js.UndefOr[Boolean] = js.native
    
    /** The data to be serialized into the request body. */
    var body: js.UndefOr[js.Any] = js.native
    
    /** The name of the querystring parameter name that specifies the callback name. */
    var callbackKey: js.UndefOr[String] = js.native
    
    /** The name of the function that will be called as the callback. */
    var callbackName: js.UndefOr[String] = js.native
    
    /** The data to be interpolated into the URL and serialized into the querystring. */
    var params: js.UndefOr[StringDictionary[js.Any]] = js.native
    
    /** A constructor to be applied to each object in the response. */
    var `type`: js.UndefOr[Instantiable1[/* o */ js.Any, js.Any]] = js.native
    
    var url: String = js.native
  }
  object JsonpOptionsurlstring {
    
    @scala.inline
    def apply(url: String): JsonpOptionsurlstring = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[JsonpOptionsurlstring]
    }
    
    @scala.inline
    implicit class JsonpOptionsurlstringMutableBuilder[Self <: JsonpOptionsurlstring] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setBackground(value: Boolean): Self = StObject.set(x, "background", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBackgroundUndefined: Self = StObject.set(x, "background", js.undefined)
      
      @scala.inline
      def setBody(value: js.Any): Self = StObject.set(x, "body", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setBodyUndefined: Self = StObject.set(x, "body", js.undefined)
      
      @scala.inline
      def setCallbackKey(value: String): Self = StObject.set(x, "callbackKey", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackKeyUndefined: Self = StObject.set(x, "callbackKey", js.undefined)
      
      @scala.inline
      def setCallbackName(value: String): Self = StObject.set(x, "callbackName", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setCallbackNameUndefined: Self = StObject.set(x, "callbackName", js.undefined)
      
      @scala.inline
      def setParams(value: StringDictionary[js.Any]): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setParamsUndefined: Self = StObject.set(x, "params", js.undefined)
      
      @scala.inline
      def setType(value: Instantiable1[/* o */ js.Any, js.Any]): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setTypeUndefined: Self = StObject.set(x, "type", js.undefined)
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Key extends StObject {
    
    var key: js.UndefOr[String | Double] = js.native
  }
  object Key {
    
    @scala.inline
    def apply(): Key = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Key]
    }
    
    @scala.inline
    implicit class KeyMutableBuilder[Self <: Key] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setKey(value: String | Double): Self = StObject.set(x, "key", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setKeyUndefined: Self = StObject.set(x, "key", js.undefined)
    }
  }
  
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
    implicit class LifecycleanyanykeystringaMutableBuilder[Self <: Lifecycleanyanykeystringa] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setOnbeforeremove(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], js.Promise[_] | Unit]): Self = StObject.set(x, "onbeforeremove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnbeforeremoveUndefined: Self = StObject.set(x, "onbeforeremove", js.undefined)
      
      @scala.inline
      def setOnbeforeupdate(
        value: js.ThisFunction2[/* this */ js.Any, /* vnode */ Vnode[_, _], /* old */ VnodeDOM[_, _], Boolean | Unit]
      ): Self = StObject.set(x, "onbeforeupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnbeforeupdateUndefined: Self = StObject.set(x, "onbeforeupdate", js.undefined)
      
      @scala.inline
      def setOncreate(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = StObject.set(x, "oncreate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOncreateUndefined: Self = StObject.set(x, "oncreate", js.undefined)
      
      @scala.inline
      def setOninit(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ Vnode[_, _], _]): Self = StObject.set(x, "oninit", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOninitUndefined: Self = StObject.set(x, "oninit", js.undefined)
      
      @scala.inline
      def setOnremove(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = StObject.set(x, "onremove", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnremoveUndefined: Self = StObject.set(x, "onremove", js.undefined)
      
      @scala.inline
      def setOnupdate(value: js.ThisFunction1[/* this */ js.Any, /* vnode */ VnodeDOM[_, _], _]): Self = StObject.set(x, "onupdate", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setOnupdateUndefined: Self = StObject.set(x, "onupdate", js.undefined)
    }
  }
  
  @js.native
  trait Params extends StObject {
    
    var params: typings.mithril.mod.Params = js.native
    
    var path: String = js.native
  }
  object Params {
    
    @scala.inline
    def apply(params: typings.mithril.mod.Params, path: String): Params = {
      val __obj = js.Dynamic.literal(params = params.asInstanceOf[js.Any], path = path.asInstanceOf[js.Any])
      __obj.asInstanceOf[Params]
    }
    
    @scala.inline
    implicit class ParamsMutableBuilder[Self <: Params] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setParams(value: typings.mithril.mod.Params): Self = StObject.set(x, "params", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPath(value: String): Self = StObject.set(x, "path", value.asInstanceOf[js.Any])
    }
  }
  
  @js.native
  trait Url extends StObject {
    
    var url: String = js.native
  }
  object Url {
    
    @scala.inline
    def apply(url: String): Url = {
      val __obj = js.Dynamic.literal(url = url.asInstanceOf[js.Any])
      __obj.asInstanceOf[Url]
    }
    
    @scala.inline
    implicit class UrlMutableBuilder[Self <: Url] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setUrl(value: String): Self = StObject.set(x, "url", value.asInstanceOf[js.Any])
    }
  }
}
