package typings.navigo

import org.scalablytyped.runtime.StringDictionary
import org.scalablytyped.runtime.TopLevel
import typings.navigo.anon.As
import typings.navigo.anon.Hooks
import typings.std.RegExp
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("navigo", JSImport.Namespace)
  @js.native
  /**
    * Constructs the router
    * @param root The main URL of your application.
    * @param useHash If useHash set to true then the router uses an old routing approach with hash in the URL. Navigo anyways falls back to this mode if there is no History API supported.
    */
  class ^ ()
    extends StObject
       with Navigo {
    def this(root: String) = this()
    def this(root: String, useHash: Boolean) = this()
    def this(root: Null, useHash: Boolean) = this()
    def this(root: Unit, useHash: Boolean) = this()
    def this(root: String, useHash: Boolean, hash: String) = this()
    def this(root: String, useHash: Unit, hash: String) = this()
    def this(root: Null, useHash: Boolean, hash: String) = this()
    def this(root: Null, useHash: Unit, hash: String) = this()
    def this(root: Unit, useHash: Boolean, hash: String) = this()
    def this(root: Unit, useHash: Unit, hash: String) = this()
  }
  
  trait GenericHooks extends StObject {
    
    var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
    
    var before: js.UndefOr[
        js.Function2[
          /* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], 
          /* params */ js.UndefOr[Params], 
          Unit
        ]
      ] = js.undefined
  }
  object GenericHooks {
    
    @scala.inline
    def apply(): GenericHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[GenericHooks]
    }
    
    @scala.inline
    implicit class GenericHooksMutableBuilder[Self <: GenericHooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: /* params */ js.UndefOr[Params] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setBefore(
        value: (/* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], /* params */ js.UndefOr[Params]) => Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
    }
  }
  
  type Keys = String
  
  @js.native
  trait Navigo extends StObject {
    
    def destroy(): Unit = js.native
    
    def disableIfAPINotAvailable(): Unit = js.native
    
    def generate(path: String): String = js.native
    def generate(path: String, params: js.Any): String = js.native
    
    def getLinkPath(link: js.Any): js.Any = js.native
    
    def historyAPIUpdateMethod(): Unit = js.native
    def historyAPIUpdateMethod(method: String): Unit = js.native
    
    def hooks(hooks: GenericHooks): Unit = js.native
    
    def lastRouteResolved(): Hooks = js.native
    
    def link(path: String): String = js.native
    
    def navigate(path: String): Unit = js.native
    def navigate(path: String, absolute: Boolean): Unit = js.native
    
    def notFound(handler: js.Function1[/* query */ String, Unit]): Unit = js.native
    def notFound(handler: js.Function1[/* query */ String, Unit], hooks: NavigoHooks): Unit = js.native
    
    def off(location: String, handler: RouteHandler): Unit = js.native
    
    def on(location: String, handler: RouteHandler): Navigo = js.native
    def on(location: String, handler: RouteHandler, hooks: NavigoHooks): Navigo = js.native
    def on(location: RegExp, handler: js.Function1[/* repeated */ String, Unit]): Navigo = js.native
    def on(location: RegExp, handler: js.Function1[/* repeated */ String, Unit], hooks: NavigoHooks): Navigo = js.native
    def on(rootHandler: RouteHandler): Navigo = js.native
    def on(rootHandler: RouteHandler, hooks: NavigoHooks): Navigo = js.native
    def on(routes: StringDictionary[RouteHandler]): Navigo = js.native
    
    def pause(): Unit = js.native
    def pause(change: Boolean): Unit = js.native
    
    def resolve(): Boolean = js.native
    def resolve(currentURL: String): Boolean = js.native
    
    def resume(): Unit = js.native
    
    def updatePageLinks(): Unit = js.native
  }
  
  trait NavigoHooks extends StObject {
    
    var after: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
    
    var already: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
    
    var before: js.UndefOr[
        js.Function2[
          /* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], 
          /* params */ js.UndefOr[Params], 
          Unit
        ]
      ] = js.undefined
    
    var leave: js.UndefOr[js.Function1[/* params */ js.UndefOr[Params], Unit]] = js.undefined
  }
  object NavigoHooks {
    
    @scala.inline
    def apply(): NavigoHooks = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[NavigoHooks]
    }
    
    @scala.inline
    implicit class NavigoHooksMutableBuilder[Self <: NavigoHooks] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setAfter(value: /* params */ js.UndefOr[Params] => Unit): Self = StObject.set(x, "after", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAfterUndefined: Self = StObject.set(x, "after", js.undefined)
      
      @scala.inline
      def setAlready(value: /* params */ js.UndefOr[Params] => Unit): Self = StObject.set(x, "already", js.Any.fromFunction1(value))
      
      @scala.inline
      def setAlreadyUndefined: Self = StObject.set(x, "already", js.undefined)
      
      @scala.inline
      def setBefore(
        value: (/* done */ js.Function1[/* suppress */ js.UndefOr[Boolean], Unit], /* params */ js.UndefOr[Params]) => Unit
      ): Self = StObject.set(x, "before", js.Any.fromFunction2(value))
      
      @scala.inline
      def setBeforeUndefined: Self = StObject.set(x, "before", js.undefined)
      
      @scala.inline
      def setLeave(value: /* params */ js.UndefOr[Params] => Unit): Self = StObject.set(x, "leave", js.Any.fromFunction1(value))
      
      @scala.inline
      def setLeaveUndefined: Self = StObject.set(x, "leave", js.undefined)
    }
  }
  
  type Params = State
  
  type RouteHandler = (js.Function2[/* params */ Params, /* query */ String, Unit]) | As
  
  type State = /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {[ k in navigo.navigo.Keys ]: any}
    */ typings.navigo.navigoStrings.State & TopLevel[js.Any]
}
