package typings.postRobot

import typings.postRobot.anon.Data
import typings.postRobot.anon.Origin
import typings.postRobot.postRobotBooleans.`false`
import typings.postRobot.postRobotBooleans.`true`
import typings.std.Window
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("post-robot", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def on(name: String, options: HandlerType): CancelableType = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelableType]
  inline def on(name: String, options: HandlerType, handler: HandlerType): CancelableType = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[CancelableType]
  inline def on(name: String, options: ServerOptionsType): CancelableType = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[CancelableType]
  inline def on(name: String, options: ServerOptionsType, handler: HandlerType): CancelableType = (^.asInstanceOf[js.Dynamic].applyDynamic("on")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[CancelableType]
  
  inline def once(name: String): js.Promise[Origin] = ^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any]).asInstanceOf[js.Promise[Origin]]
  inline def once(name: String, options: Unit, handler: HandlerType): js.Promise[Origin] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Origin]]
  inline def once(name: String, options: HandlerType): js.Promise[Origin] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Origin]]
  inline def once(name: String, options: HandlerType, handler: HandlerType): js.Promise[Origin] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Origin]]
  inline def once(name: String, options: ServerOptionsType): js.Promise[Origin] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Origin]]
  inline def once(name: String, options: ServerOptionsType, handler: HandlerType): js.Promise[Origin] = (^.asInstanceOf[js.Dynamic].applyDynamic("once")(name.asInstanceOf[js.Any], options.asInstanceOf[js.Any], handler.asInstanceOf[js.Any])).asInstanceOf[js.Promise[Origin]]
  
  inline def send(win: CrossDomainWindowType, name: String): js.Promise[ResponseMessageEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(win.asInstanceOf[js.Any], name.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseMessageEvent]]
  inline def send(win: CrossDomainWindowType, name: String, data: js.Object): js.Promise[ResponseMessageEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(win.asInstanceOf[js.Any], name.asInstanceOf[js.Any], data.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseMessageEvent]]
  inline def send(
    win: CrossDomainWindowType,
    name: String,
    data: js.Object,
    options: FireAndForgetRequestOptionsType & RegularRequestOptionsType
  ): js.Promise[ResponseMessageEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(win.asInstanceOf[js.Any], name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseMessageEvent]]
  inline def send(
    win: CrossDomainWindowType,
    name: String,
    data: Unit,
    options: FireAndForgetRequestOptionsType & RegularRequestOptionsType
  ): js.Promise[ResponseMessageEvent] = (^.asInstanceOf[js.Dynamic].applyDynamic("send")(win.asInstanceOf[js.Any], name.asInstanceOf[js.Any], data.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ResponseMessageEvent]]
  
  trait CancelableType extends StObject {
    
    def cancel(): Unit
  }
  object CancelableType {
    
    inline def apply(cancel: () => Unit): CancelableType = {
      val __obj = js.Dynamic.literal(cancel = js.Any.fromFunction0(cancel))
      __obj.asInstanceOf[CancelableType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: CancelableType] (val x: Self) extends AnyVal {
      
      inline def setCancel(value: () => Unit): Self = StObject.set(x, "cancel", js.Any.fromFunction0(value))
    }
  }
  
  // For the purposes of using the library on it's own Window is CrossDomain enough
  type CrossDomainWindowType = Window | Null
  
  type DomainMatcher = String | js.RegExp | js.Array[String]
  
  type ErrorHandlerType = js.Function1[/* err */ Any, Unit]
  
  trait FireAndForgetRequestOptionsType extends StObject {
    
    var domain: js.UndefOr[DomainMatcher] = js.undefined
    
    var fireAndForget: js.UndefOr[`true`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object FireAndForgetRequestOptionsType {
    
    inline def apply(): FireAndForgetRequestOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[FireAndForgetRequestOptionsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: FireAndForgetRequestOptionsType] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: DomainMatcher): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setFireAndForget(value: `true`): Self = StObject.set(x, "fireAndForget", value.asInstanceOf[js.Any])
      
      inline def setFireAndForgetUndefined: Self = StObject.set(x, "fireAndForget", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  type HandlerType = js.Function1[/* event */ Data, js.Promise[Any]]
  
  trait RegularRequestOptionsType extends StObject {
    
    var domain: js.UndefOr[DomainMatcher] = js.undefined
    
    var fireAndForget: js.UndefOr[`false`] = js.undefined
    
    var timeout: js.UndefOr[Double] = js.undefined
  }
  object RegularRequestOptionsType {
    
    inline def apply(): RegularRequestOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[RegularRequestOptionsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: RegularRequestOptionsType] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: DomainMatcher): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setFireAndForget(value: `false`): Self = StObject.set(x, "fireAndForget", value.asInstanceOf[js.Any])
      
      inline def setFireAndForgetUndefined: Self = StObject.set(x, "fireAndForget", js.undefined)
      
      inline def setTimeout(value: Double): Self = StObject.set(x, "timeout", value.asInstanceOf[js.Any])
      
      inline def setTimeoutUndefined: Self = StObject.set(x, "timeout", js.undefined)
    }
  }
  
  trait ResponseMessageEvent extends StObject {
    
    var data: js.Object
    
    var origin: String
    
    var source: CrossDomainWindowType
  }
  object ResponseMessageEvent {
    
    inline def apply(data: js.Object, origin: String): ResponseMessageEvent = {
      val __obj = js.Dynamic.literal(data = data.asInstanceOf[js.Any], origin = origin.asInstanceOf[js.Any], source = null)
      __obj.asInstanceOf[ResponseMessageEvent]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ResponseMessageEvent] (val x: Self) extends AnyVal {
      
      inline def setData(value: js.Object): Self = StObject.set(x, "data", value.asInstanceOf[js.Any])
      
      inline def setOrigin(value: String): Self = StObject.set(x, "origin", value.asInstanceOf[js.Any])
      
      inline def setSource(value: CrossDomainWindowType): Self = StObject.set(x, "source", value.asInstanceOf[js.Any])
      
      inline def setSourceNull: Self = StObject.set(x, "source", null)
    }
  }
  
  trait ServerOptionsType extends StObject {
    
    var domain: js.UndefOr[DomainMatcher] = js.undefined
    
    var errorHandler: js.UndefOr[ErrorHandlerType] = js.undefined
    
    var errorOnClose: js.UndefOr[Boolean] = js.undefined
    
    var handler: js.UndefOr[HandlerType] = js.undefined
    
    var name: js.UndefOr[String] = js.undefined
    
    var once: js.UndefOr[Boolean] = js.undefined
    
    var window: js.UndefOr[CrossDomainWindowType] = js.undefined
  }
  object ServerOptionsType {
    
    inline def apply(): ServerOptionsType = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[ServerOptionsType]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ServerOptionsType] (val x: Self) extends AnyVal {
      
      inline def setDomain(value: DomainMatcher): Self = StObject.set(x, "domain", value.asInstanceOf[js.Any])
      
      inline def setDomainUndefined: Self = StObject.set(x, "domain", js.undefined)
      
      inline def setDomainVarargs(value: String*): Self = StObject.set(x, "domain", js.Array(value*))
      
      inline def setErrorHandler(value: /* err */ Any => Unit): Self = StObject.set(x, "errorHandler", js.Any.fromFunction1(value))
      
      inline def setErrorHandlerUndefined: Self = StObject.set(x, "errorHandler", js.undefined)
      
      inline def setErrorOnClose(value: Boolean): Self = StObject.set(x, "errorOnClose", value.asInstanceOf[js.Any])
      
      inline def setErrorOnCloseUndefined: Self = StObject.set(x, "errorOnClose", js.undefined)
      
      inline def setHandler(value: /* event */ Data => js.Promise[Any]): Self = StObject.set(x, "handler", js.Any.fromFunction1(value))
      
      inline def setHandlerUndefined: Self = StObject.set(x, "handler", js.undefined)
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setNameUndefined: Self = StObject.set(x, "name", js.undefined)
      
      inline def setOnce(value: Boolean): Self = StObject.set(x, "once", value.asInstanceOf[js.Any])
      
      inline def setOnceUndefined: Self = StObject.set(x, "once", js.undefined)
      
      inline def setWindow(value: CrossDomainWindowType): Self = StObject.set(x, "window", value.asInstanceOf[js.Any])
      
      inline def setWindowNull: Self = StObject.set(x, "window", null)
      
      inline def setWindowUndefined: Self = StObject.set(x, "window", js.undefined)
    }
  }
  
  // Warning: This is not actually a Promise, but the interface is the same.
  type ZalgoPromise[T] = js.Promise[T]
}
