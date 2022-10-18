package typings.mysticateaSpy

import typings.mysticateaSpy.distMod.Spy_.CallInformation
import typings.mysticateaSpy.mysticateaSpyStrings.`return`
import typings.mysticateaSpy.mysticateaSpyStrings.`throw`
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distMod {
  
  @JSImport("@mysticatea/spy/dist", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def spy(): Spy_[js.Function0[Unit]] = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")().asInstanceOf[Spy_[js.Function0[Unit]]]
  inline def spy[T /* <: js.Function1[/* repeated */ Any, Any] */](f: T): Spy_[T] = ^.asInstanceOf[js.Dynamic].applyDynamic("spy")(f.asInstanceOf[js.Any]).asInstanceOf[Spy_[T]]
  
  object Spy_ {
    
    /** Information for each call. */
    /* Rewritten from type alias, can be one of: 
      - typings.mysticateaSpy.distMod.Spy_.ReturnedCall[T]
      - typings.mysticateaSpy.distMod.Spy_.ThrownCall[T]
    */
    trait Call[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject
    object Call {
      
      inline def ReturnedCall[T /* <: js.Function1[/* repeated */ Any, Any] */](arguments: Parameters[T], `return`: ReturnType[T], `this`: This[T]): typings.mysticateaSpy.distMod.Spy_.ReturnedCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
        __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("return")
        __obj.asInstanceOf[typings.mysticateaSpy.distMod.Spy_.ReturnedCall[T]]
      }
      
      inline def ThrownCall[T /* <: js.Function1[/* repeated */ Any, Any] */](arguments: Parameters[T], `this`: This[T], `throw`: Any): typings.mysticateaSpy.distMod.Spy_.ThrownCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
        __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("throw")
        __obj.asInstanceOf[typings.mysticateaSpy.distMod.Spy_.ThrownCall[T]]
      }
    }
    
    /** Information for calls on a spy. */
    trait CallInformation[T /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
      
      /** Information for each call. */
      val calls: js.Array[Call[T]]
      
      /** Information of the first call. */
      val firstCall: Call[T] | Null
      
      /** Information of the first returned call. */
      val firstReturnedCall: ReturnedCall[T] | Null
      
      /** Information of the first thrown call. */
      val firstThrownCall: ThrownCall[T] | Null
      
      /** Information of the last call. */
      val lastCall: Call[T] | Null
      
      /** Information of the last returned call. */
      val lastReturnedCall: ReturnedCall[T] | Null
      
      /** Information of the last thrown call. */
      val lastThrownCall: ThrownCall[T] | Null
      
      /** Reset calls. */
      def reset(): Unit
      
      /** Information for each returned call. */
      val returnedCalls: js.Array[ReturnedCall[T]]
      
      /** Information for each thrown call. */
      val thrownCalls: js.Array[ThrownCall[T]]
    }
    object CallInformation {
      
      inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](
        calls: js.Array[Call[T]],
        reset: () => Unit,
        returnedCalls: js.Array[ReturnedCall[T]],
        thrownCalls: js.Array[ThrownCall[T]]
      ): CallInformation[T] = {
        val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), returnedCalls = returnedCalls.asInstanceOf[js.Any], thrownCalls = thrownCalls.asInstanceOf[js.Any], firstCall = null, firstReturnedCall = null, firstThrownCall = null, lastCall = null, lastReturnedCall = null, lastThrownCall = null)
        __obj.asInstanceOf[CallInformation[T]]
      }
      
      extension [Self <: CallInformation[?], T /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & CallInformation[T]) {
        
        inline def setCalls(value: js.Array[Call[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
        
        inline def setCallsVarargs(value: Call[T]*): Self = StObject.set(x, "calls", js.Array(value*))
        
        inline def setFirstCall(value: Call[T]): Self = StObject.set(x, "firstCall", value.asInstanceOf[js.Any])
        
        inline def setFirstCallNull: Self = StObject.set(x, "firstCall", null)
        
        inline def setFirstReturnedCall(value: ReturnedCall[T]): Self = StObject.set(x, "firstReturnedCall", value.asInstanceOf[js.Any])
        
        inline def setFirstReturnedCallNull: Self = StObject.set(x, "firstReturnedCall", null)
        
        inline def setFirstThrownCall(value: ThrownCall[T]): Self = StObject.set(x, "firstThrownCall", value.asInstanceOf[js.Any])
        
        inline def setFirstThrownCallNull: Self = StObject.set(x, "firstThrownCall", null)
        
        inline def setLastCall(value: Call[T]): Self = StObject.set(x, "lastCall", value.asInstanceOf[js.Any])
        
        inline def setLastCallNull: Self = StObject.set(x, "lastCall", null)
        
        inline def setLastReturnedCall(value: ReturnedCall[T]): Self = StObject.set(x, "lastReturnedCall", value.asInstanceOf[js.Any])
        
        inline def setLastReturnedCallNull: Self = StObject.set(x, "lastReturnedCall", null)
        
        inline def setLastThrownCall(value: ThrownCall[T]): Self = StObject.set(x, "lastThrownCall", value.asInstanceOf[js.Any])
        
        inline def setLastThrownCallNull: Self = StObject.set(x, "lastThrownCall", null)
        
        inline def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
        
        inline def setReturnedCalls(value: js.Array[ReturnedCall[T]]): Self = StObject.set(x, "returnedCalls", value.asInstanceOf[js.Any])
        
        inline def setReturnedCallsVarargs(value: ReturnedCall[T]*): Self = StObject.set(x, "returnedCalls", js.Array(value*))
        
        inline def setThrownCalls(value: js.Array[ThrownCall[T]]): Self = StObject.set(x, "thrownCalls", value.asInstanceOf[js.Any])
        
        inline def setThrownCallsVarargs(value: ThrownCall[T]*): Self = StObject.set(x, "thrownCalls", js.Array(value*))
      }
    }
    
    /** Information for each returned call. */
    trait ReturnedCall[T /* <: js.Function1[/* repeated */ Any, Any] */]
      extends StObject
         with Call[T] {
      
      var arguments: Parameters[T]
      
      var `return`: ReturnType[T]
      
      var `this`: This[T]
      
      var `type`: `return`
    }
    object ReturnedCall {
      
      inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](arguments: Parameters[T], `return`: ReturnType[T], `this`: This[T]): ReturnedCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
        __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("return")
        __obj.asInstanceOf[ReturnedCall[T]]
      }
      
      extension [Self <: ReturnedCall[?], T /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & ReturnedCall[T]) {
        
        inline def setArguments(value: Parameters[T]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        inline def setReturn(value: ReturnType[T]): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
        
        inline def setThis(value: This[T]): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
        
        inline def setType(value: `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /** Information for each thrown call. */
    trait ThrownCall[T /* <: js.Function1[/* repeated */ Any, Any] */]
      extends StObject
         with Call[T] {
      
      var arguments: Parameters[T]
      
      var `this`: This[T]
      
      var `throw`: Any
      
      var `type`: `throw`
    }
    object ThrownCall {
      
      inline def apply[T /* <: js.Function1[/* repeated */ Any, Any] */](arguments: Parameters[T], `this`: This[T], `throw`: Any): ThrownCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("this")(`this`.asInstanceOf[js.Any])
        __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")("throw")
        __obj.asInstanceOf[ThrownCall[T]]
      }
      
      extension [Self <: ThrownCall[?], T /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & ThrownCall[T]) {
        
        inline def setArguments(value: Parameters[T]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        inline def setThis(value: This[T]): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
        
        inline def setThrow(value: Any): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
        
        inline def setType(value: `throw`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  type Spy_[T /* <: js.Function1[/* repeated */ Any, Any] */] = T & CallInformation[T]
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends (this : infer TT, args : ...any): any ? TT : undefined
    }}}
    */
  @js.native
  trait This[T] extends StObject
}
