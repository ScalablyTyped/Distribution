package typings.optimism

import typings.optimism.anon.Forget
import typings.optimism.anon.Subscribe
import typings.optimism.depMod.OptimisticDependencyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("optimism", "KeyTrie")
  @js.native
  class KeyTrie[K] protected ()
    extends typings.optimism.keyTrieMod.KeyTrie[K] {
    def this(weakness: Boolean) = this()
    def this(weakness: Boolean, makeData: js.Function1[/* array */ js.Array[_], K]) = this()
  }
  
  @JSImport("optimism", "asyncFromGen")
  @js.native
  def asyncFromGen[TArgs /* <: js.Array[_] */](genFn: js.Function1[/* args */ TArgs, _]): js.Function1[/* args */ TArgs, js.Promise[_]] = js.native
  
  @JSImport("optimism", "defaultMakeCacheKey")
  @js.native
  def defaultMakeCacheKey(args: js.Any*): js.Any = js.native
  
  @JSImport("optimism", "dep")
  @js.native
  def dep[TKey](): OptimisticDependencyFunction[TKey] = js.native
  @JSImport("optimism", "dep")
  @js.native
  def dep[TKey](options: Subscribe[TKey]): OptimisticDependencyFunction[TKey] = js.native
  
  @JSImport("optimism", "setTimeout")
  @js.native
  def setTimeout(callback: js.Function0[_], delay: Double): js.Any = js.native
  
  @JSImport("optimism", "wrap")
  @js.native
  def wrap[TArgs /* <: js.Array[_] */, TResult, TKeyArgs /* <: js.Array[_] */](originalFunction: js.Function1[/* args */ TArgs, TResult]): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs] = js.native
  @JSImport("optimism", "wrap")
  @js.native
  def wrap[TArgs /* <: js.Array[_] */, TResult, TKeyArgs /* <: js.Array[_] */](
    originalFunction: js.Function1[/* args */ TArgs, TResult],
    options: OptimisticWrapOptions[TArgs, TKeyArgs]
  ): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs] = js.native
  
  @js.native
  trait OptimisticWrapOptions[TArgs /* <: js.Array[_] */, TKeyArgs /* <: js.Array[_] */] extends StObject {
    
    var keyArgs: js.UndefOr[js.Function1[/* args */ TArgs, TKeyArgs]] = js.native
    
    var makeCacheKey: js.UndefOr[js.Function1[/* args */ TKeyArgs, TCacheKey]] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var subscribe: js.UndefOr[js.Function1[/* args */ TArgs, Unit | js.Function0[_]]] = js.native
  }
  object OptimisticWrapOptions {
    
    @scala.inline
    def apply[TArgs /* <: js.Array[_] */, TKeyArgs /* <: js.Array[_] */](): OptimisticWrapOptions[TArgs, TKeyArgs] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimisticWrapOptions[TArgs, TKeyArgs]]
    }
    
    @scala.inline
    implicit class OptimisticWrapOptionsMutableBuilder[Self <: OptimisticWrapOptions[_, _], TArgs /* <: js.Array[_] */, TKeyArgs /* <: js.Array[_] */] (val x: Self with (OptimisticWrapOptions[TArgs, TKeyArgs])) extends AnyVal {
      
      @scala.inline
      def setKeyArgs(value: /* args */ TArgs => TKeyArgs): Self = StObject.set(x, "keyArgs", js.Any.fromFunction1(value))
      
      @scala.inline
      def setKeyArgsUndefined: Self = StObject.set(x, "keyArgs", js.undefined)
      
      @scala.inline
      def setMakeCacheKey(value: /* args */ TKeyArgs => TCacheKey): Self = StObject.set(x, "makeCacheKey", js.Any.fromFunction1(value))
      
      @scala.inline
      def setMakeCacheKeyUndefined: Self = StObject.set(x, "makeCacheKey", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setSubscribe(value: /* args */ TArgs => Unit | js.Function0[_]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  type OptimisticWrapperFunction[TArgs /* <: js.Array[_] */, TResult, TKeyArgs /* <: js.Array[_] */] = (js.Function1[/* args */ TArgs, TResult]) with (Forget[TKeyArgs, TResult])
  
  type TCacheKey = js.Any
}
