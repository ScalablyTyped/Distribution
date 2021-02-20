package typings.mysticateaSpy

import typings.mysticateaSpy.mod.Spy_.CallInformation
import typings.mysticateaSpy.mysticateaSpyStrings.`return`
import typings.mysticateaSpy.mysticateaSpyStrings.`throw`
import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("@mysticatea/spy/dist", "spy")
  @js.native
  def spy(): Spy_[js.Function0[Unit]] = js.native
  @JSImport("@mysticatea/spy/dist", "spy")
  @js.native
  def spy[T /* <: js.Function1[/* repeated */ js.Any, _] */](f: T): Spy_[T] = js.native
  
  object Spy_ {
    
    /** Information for each call. */
    /* Rewritten from type alias, can be one of: 
      - typings.mysticateaSpy.mod.Spy_.ReturnedCall[T]
      - typings.mysticateaSpy.mod.Spy_.ThrownCall[T]
    */
    trait Call[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends StObject
    object Call {
      
      @scala.inline
      def ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `return`: ReturnType[T], `type`: `return`): typings.mysticateaSpy.mod.Spy_.ReturnedCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.mysticateaSpy.mod.Spy_.ReturnedCall[T]]
      }
      
      @scala.inline
      def ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `throw`: js.Any, `type`: `throw`): typings.mysticateaSpy.mod.Spy_.ThrownCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[typings.mysticateaSpy.mod.Spy_.ThrownCall[T]]
      }
    }
    
    /** Information for calls on a spy. */
    @js.native
    trait CallInformation[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends StObject {
      
      /** Information for each call. */
      val calls: js.Array[Call[T]] = js.native
      
      /** Information of the first call. */
      val firstCall: Call[T] | Null = js.native
      
      /** Information of the first returned call. */
      val firstReturnedCall: ReturnedCall[T] | Null = js.native
      
      /** Information of the first thrown call. */
      val firstThrownCall: ThrownCall[T] | Null = js.native
      
      /** Information of the last call. */
      val lastCall: Call[T] | Null = js.native
      
      /** Information of the last returned call. */
      val lastReturnedCall: ReturnedCall[T] | Null = js.native
      
      /** Information of the last thrown call. */
      val lastThrownCall: ThrownCall[T] | Null = js.native
      
      /** Reset calls. */
      def reset(): Unit = js.native
      
      /** Information for each returned call. */
      val returnedCalls: js.Array[ReturnedCall[T]] = js.native
      
      /** Information for each thrown call. */
      val thrownCalls: js.Array[ThrownCall[T]] = js.native
    }
    object CallInformation {
      
      @scala.inline
      def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](
        calls: js.Array[Call[T]],
        reset: () => Unit,
        returnedCalls: js.Array[ReturnedCall[T]],
        thrownCalls: js.Array[ThrownCall[T]]
      ): CallInformation[T] = {
        val __obj = js.Dynamic.literal(calls = calls.asInstanceOf[js.Any], reset = js.Any.fromFunction0(reset), returnedCalls = returnedCalls.asInstanceOf[js.Any], thrownCalls = thrownCalls.asInstanceOf[js.Any])
        __obj.asInstanceOf[CallInformation[T]]
      }
      
      @scala.inline
      implicit class CallInformationMutableBuilder[Self <: CallInformation[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with CallInformation[T]) extends AnyVal {
        
        @scala.inline
        def setCalls(value: js.Array[Call[T]]): Self = StObject.set(x, "calls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setCallsVarargs(value: Call[T]*): Self = StObject.set(x, "calls", js.Array(value :_*))
        
        @scala.inline
        def setFirstCall(value: Call[T]): Self = StObject.set(x, "firstCall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstCallNull: Self = StObject.set(x, "firstCall", null)
        
        @scala.inline
        def setFirstReturnedCall(value: ReturnedCall[T]): Self = StObject.set(x, "firstReturnedCall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstReturnedCallNull: Self = StObject.set(x, "firstReturnedCall", null)
        
        @scala.inline
        def setFirstThrownCall(value: ThrownCall[T]): Self = StObject.set(x, "firstThrownCall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setFirstThrownCallNull: Self = StObject.set(x, "firstThrownCall", null)
        
        @scala.inline
        def setLastCall(value: Call[T]): Self = StObject.set(x, "lastCall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastCallNull: Self = StObject.set(x, "lastCall", null)
        
        @scala.inline
        def setLastReturnedCall(value: ReturnedCall[T]): Self = StObject.set(x, "lastReturnedCall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastReturnedCallNull: Self = StObject.set(x, "lastReturnedCall", null)
        
        @scala.inline
        def setLastThrownCall(value: ThrownCall[T]): Self = StObject.set(x, "lastThrownCall", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setLastThrownCallNull: Self = StObject.set(x, "lastThrownCall", null)
        
        @scala.inline
        def setReset(value: () => Unit): Self = StObject.set(x, "reset", js.Any.fromFunction0(value))
        
        @scala.inline
        def setReturnedCalls(value: js.Array[ReturnedCall[T]]): Self = StObject.set(x, "returnedCalls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturnedCallsVarargs(value: ReturnedCall[T]*): Self = StObject.set(x, "returnedCalls", js.Array(value :_*))
        
        @scala.inline
        def setThrownCalls(value: js.Array[ThrownCall[T]]): Self = StObject.set(x, "thrownCalls", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThrownCallsVarargs(value: ThrownCall[T]*): Self = StObject.set(x, "thrownCalls", js.Array(value :_*))
      }
    }
    
    /** Information for each returned call. */
    @js.native
    trait ReturnedCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
      
      var arguments: Parameters[T] = js.native
      
      var `return`: ReturnType[T] = js.native
      
      var `this`: This[T] = js.native
      
      var `type`: `return` = js.native
    }
    object ReturnedCall {
      
      @scala.inline
      def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `return`: ReturnType[T], `type`: `return`): ReturnedCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("return")(`return`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ReturnedCall[T]]
      }
      
      @scala.inline
      implicit class ReturnedCallMutableBuilder[Self <: ReturnedCall[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with ReturnedCall[T]) extends AnyVal {
        
        @scala.inline
        def setArguments(value: Parameters[T]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setReturn(value: ReturnType[T]): Self = StObject.set(x, "return", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThis(value: This[T]): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThisUndefined: Self = StObject.set(x, "this", js.undefined)
        
        @scala.inline
        def setType(value: `return`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
    
    /** Information for each thrown call. */
    @js.native
    trait ThrownCall[T /* <: js.Function1[/* repeated */ js.Any, _] */] extends Call[T] {
      
      var arguments: Parameters[T] = js.native
      
      var `this`: This[T] = js.native
      
      var `throw`: js.Any = js.native
      
      var `type`: `throw` = js.native
    }
    object ThrownCall {
      
      @scala.inline
      def apply[T /* <: js.Function1[/* repeated */ js.Any, _] */](arguments: Parameters[T], `throw`: js.Any, `type`: `throw`): ThrownCall[T] = {
        val __obj = js.Dynamic.literal(arguments = arguments.asInstanceOf[js.Any])
        __obj.updateDynamic("throw")(`throw`.asInstanceOf[js.Any])
        __obj.updateDynamic("type")(`type`.asInstanceOf[js.Any])
        __obj.asInstanceOf[ThrownCall[T]]
      }
      
      @scala.inline
      implicit class ThrownCallMutableBuilder[Self <: ThrownCall[_], T /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with ThrownCall[T]) extends AnyVal {
        
        @scala.inline
        def setArguments(value: Parameters[T]): Self = StObject.set(x, "arguments", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThis(value: This[T]): Self = StObject.set(x, "this", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setThisUndefined: Self = StObject.set(x, "this", js.undefined)
        
        @scala.inline
        def setThrow(value: js.Any): Self = StObject.set(x, "throw", value.asInstanceOf[js.Any])
        
        @scala.inline
        def setType(value: `throw`): Self = StObject.set(x, "type", value.asInstanceOf[js.Any])
      }
    }
  }
  type Spy_[T /* <: js.Function1[/* repeated */ js.Any, _] */] = T with CallInformation[T]
  
  type This[T] = js.UndefOr[scala.Nothing]
}
