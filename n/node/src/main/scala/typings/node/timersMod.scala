package typings.node

import typings.node.NodeJS.RefCounted
import typings.node.eventsMod.Abortable
import typings.node.timersMod.global.NodeJS.Immediate
import typings.node.timersMod.global.NodeJS.Timeout
import typings.node.timersMod.global.NodeJS.Timer
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object timersMod {
  
  @JSImport("timers", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("timers", "clearImmediate")
  @js.native
  def clearImmediate: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearImmediate */ Any = js.native
  inline def clearImmediate_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearImmediate */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearImmediate")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "clearInterval")
  @js.native
  def clearInterval: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearInterval */ Any = js.native
  inline def clearInterval_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearInterval */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearInterval")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "clearTimeout")
  @js.native
  def clearTimeout: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearTimeout */ Any = js.native
  inline def clearTimeout_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.clearTimeout */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("clearTimeout")(x.asInstanceOf[js.Any])
  
  object global {
    
    inline def clearImmediate(): Unit = js.Dynamic.global.applyDynamic("clearImmediate")().asInstanceOf[Unit]
    inline def clearImmediate(immediateId: Immediate): Unit = js.Dynamic.global.applyDynamic("clearImmediate")(immediateId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearInterval(): Unit = js.Dynamic.global.applyDynamic("clearInterval")().asInstanceOf[Unit]
    inline def clearInterval(intervalId: String): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearInterval(intervalId: Double): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearInterval(intervalId: Timeout): Unit = js.Dynamic.global.applyDynamic("clearInterval")(intervalId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def clearTimeout(): Unit = js.Dynamic.global.applyDynamic("clearTimeout")().asInstanceOf[Unit]
    inline def clearTimeout(timeoutId: String): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearTimeout(timeoutId: Double): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    inline def clearTimeout(timeoutId: Timeout): Unit = js.Dynamic.global.applyDynamic("clearTimeout")(timeoutId.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    inline def queueMicrotask(callback: js.Function0[Unit]): Unit = js.Dynamic.global.applyDynamic("queueMicrotask")(callback.asInstanceOf[js.Any]).asInstanceOf[Unit]
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    inline def setImmediate(callback: js.Function1[/* args */ Unit, Unit]): Immediate = js.Dynamic.global.applyDynamic("setImmediate")(callback.asInstanceOf[js.Any]).asInstanceOf[Immediate]
    inline def setImmediate[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Immediate = (js.Dynamic.global.applyDynamic("setImmediate")(callback.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Immediate]
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    inline def setInterval(callback: js.Function1[/* args */ Unit, Unit]): Timer = js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any]).asInstanceOf[Timer]
    inline def setInterval(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timer = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Timer]
    inline def setInterval[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timer = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timer]
    inline def setInterval[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timer = (js.Dynamic.global.applyDynamic("setInterval")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timer]
    
    // util.promisify no rest args compability
    // tslint:disable-next-line void-return
    inline def setTimeout(callback: js.Function1[/* args */ Unit, Unit]): Timeout = js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any]).asInstanceOf[Timeout]
    inline def setTimeout(callback: js.Function1[/* args */ Unit, Unit], ms: Double): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any])).asInstanceOf[Timeout]
    inline def setTimeout[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Double,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
    inline def setTimeout[TArgs /* <: js.Array[Any] */](
      callback: js.Function1[/* args */ TArgs, Unit],
      ms: Unit,
      /* import warning: parser.TsParser#functionParam Dropping repeated marker of param args because its type TArgs is not an array type */ args: TArgs
    ): Timeout = (js.Dynamic.global.applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], ms.asInstanceOf[js.Any], args.asInstanceOf[js.Any])).asInstanceOf[Timeout]
    
    object NodeJS {
      
      trait Immediate
        extends StObject
           with RefCounted {
        
        var _onImmediate: js.Function
        
        /**
          * If true, the `Immediate` object will keep the Node.js event loop active.
          * @since v11.0.0
          */
        def hasRef(): Boolean
      }
      object Immediate {
        
        inline def apply(_onImmediate: js.Function, hasRef: () => Boolean, ref: () => Immediate, unref: () => Immediate): Immediate = {
          val __obj = js.Dynamic.literal(_onImmediate = _onImmediate.asInstanceOf[js.Any], hasRef = js.Any.fromFunction0(hasRef), ref = js.Any.fromFunction0(ref), unref = js.Any.fromFunction0(unref))
          __obj.asInstanceOf[Immediate]
        }
        
        @scala.inline
        implicit open class MutableBuilder[Self <: Immediate] (val x: Self) extends AnyVal {
          
          inline def setHasRef(value: () => Boolean): Self = StObject.set(x, "hasRef", js.Any.fromFunction0(value))
          
          inline def set_onImmediate(value: js.Function): Self = StObject.set(x, "_onImmediate", value.asInstanceOf[js.Any])
        }
      }
      
      @js.native
      trait Timeout
        extends StObject
           with Timer
      
      // compatibility with older typings
      @js.native
      trait Timer
        extends StObject
           with RefCounted {
        
        def hasRef(): Boolean = js.native
        
        def refresh(): this.type = js.native
        
        @JSName(js.Symbol.toPrimitive)
        var toPrimitive: js.Function0[Double] = js.native
      }
    }
  }
  
  @JSImport("timers", "setImmediate")
  @js.native
  def setImmediate: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setImmediate */ Any = js.native
  inline def setImmediate_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setImmediate */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setImmediate")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "setInterval")
  @js.native
  def setInterval: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setInterval */ Any = js.native
  inline def setInterval_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setInterval */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setInterval")(x.asInstanceOf[js.Any])
  
  @JSImport("timers", "setTimeout")
  @js.native
  def setTimeout: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setTimeout */ Any = js.native
  inline def setTimeout_=(
    x: /* import warning: ResolveTypeQueries.newMembers rewritten Couldn't resolve typeof global.setTimeout */ Any
  ): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("setTimeout")(x.asInstanceOf[js.Any])
  
  trait TimerOptions
    extends StObject
       with Abortable {
    
    /**
      * Set to `false` to indicate that the scheduled `Timeout`
      * should not require the Node.js event loop to remain active.
      * @default true
      */
    var ref: js.UndefOr[Boolean] = js.undefined
  }
  object TimerOptions {
    
    inline def apply(): TimerOptions = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[TimerOptions]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: TimerOptions] (val x: Self) extends AnyVal {
      
      inline def setRef(value: Boolean): Self = StObject.set(x, "ref", value.asInstanceOf[js.Any])
      
      inline def setRefUndefined: Self = StObject.set(x, "ref", js.undefined)
    }
  }
}
