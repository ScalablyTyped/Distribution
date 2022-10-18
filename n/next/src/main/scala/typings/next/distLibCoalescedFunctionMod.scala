package typings.next

import typings.std.Parameters
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object distLibCoalescedFunctionMod {
  
  @JSImport("next/dist/lib/coalesced-function", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def withCoalescedInvoke[F /* <: js.Function1[/* args */ Any, Any] */](func: F): js.Function2[
    /* key */ String, 
    /* args */ Parameters[F], 
    js.Promise[CoalescedInvoke[UnwrapPromise[ReturnType[F]]]]
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("withCoalescedInvoke")(func.asInstanceOf[js.Any]).asInstanceOf[js.Function2[
    /* key */ String, 
    /* args */ Parameters[F], 
    js.Promise[CoalescedInvoke[UnwrapPromise[ReturnType[F]]]]
  ]]
  
  trait CoalescedInvoke[T] extends StObject {
    
    var isOrigin: Boolean
    
    var value: T
  }
  object CoalescedInvoke {
    
    inline def apply[T](isOrigin: Boolean, value: T): CoalescedInvoke[T] = {
      val __obj = js.Dynamic.literal(isOrigin = isOrigin.asInstanceOf[js.Any], value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[CoalescedInvoke[T]]
    }
    
    extension [Self <: CoalescedInvoke[?], T](x: Self & CoalescedInvoke[T]) {
      
      inline def setIsOrigin(value: Boolean): Self = StObject.set(x, "isOrigin", value.asInstanceOf[js.Any])
      
      inline def setValue(value: T): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * You'll have to cast your way around this structure, unfortunately. 
    * TS definition: {{{
    T extends std.Promise<infer U> ? U : T
    }}}
    */
  @js.native
  trait UnwrapPromise[T] extends StObject
}
