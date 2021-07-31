package typings.optimism

import typings.optimism.anon.Forget
import typings.optimism.anon.Subscribe
import typings.optimism.depMod.OptimisticDependencyFunction
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("optimism", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("optimism", "KeyTrie")
  @js.native
  class KeyTrie[K] protected ()
    extends typings.optimism.keyTrieMod.KeyTrie[K] {
    def this(weakness: Boolean) = this()
    def this(weakness: Boolean, makeData: js.Function1[/* array */ js.Array[js.Any], K]) = this()
  }
  
  @scala.inline
  def asyncFromGen[TArgs /* <: js.Array[js.Any] */](genFn: js.Function1[/* args */ TArgs, js.Any]): js.Function1[/* args */ TArgs, js.Promise[js.Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncFromGen")(genFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ TArgs, js.Promise[js.Any]]]
  
  @scala.inline
  def defaultMakeCacheKey(args: js.Any*): js.Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMakeCacheKey")(args.asInstanceOf[js.Any]).asInstanceOf[js.Any]
  
  @scala.inline
  def dep[TKey](): OptimisticDependencyFunction[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("dep")().asInstanceOf[OptimisticDependencyFunction[TKey]]
  @scala.inline
  def dep[TKey](options: Subscribe[TKey]): OptimisticDependencyFunction[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("dep")(options.asInstanceOf[js.Any]).asInstanceOf[OptimisticDependencyFunction[TKey]]
  
  @scala.inline
  def setTimeout(callback: js.Function0[js.Any], delay: Double): js.Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[js.Any]
  
  @scala.inline
  def wrap[TArgs /* <: js.Array[js.Any] */, TResult, TKeyArgs /* <: js.Array[js.Any] */](originalFunction: js.Function1[/* args */ TArgs, TResult]): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(originalFunction.asInstanceOf[js.Any]).asInstanceOf[OptimisticWrapperFunction[TArgs, TResult, TKeyArgs]]
  @scala.inline
  def wrap[TArgs /* <: js.Array[js.Any] */, TResult, TKeyArgs /* <: js.Array[js.Any] */](
    originalFunction: js.Function1[/* args */ TArgs, TResult],
    options: OptimisticWrapOptions[TArgs, TKeyArgs]
  ): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(originalFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OptimisticWrapperFunction[TArgs, TResult, TKeyArgs]]
  
  trait OptimisticWrapOptions[TArgs /* <: js.Array[js.Any] */, TKeyArgs /* <: js.Array[js.Any] */] extends StObject {
    
    var keyArgs: js.UndefOr[js.Function1[/* args */ TArgs, TKeyArgs]] = js.undefined
    
    var makeCacheKey: js.UndefOr[js.Function1[/* args */ TKeyArgs, TCacheKey]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var subscribe: js.UndefOr[js.Function1[/* args */ TArgs, Unit | js.Function0[js.Any]]] = js.undefined
  }
  object OptimisticWrapOptions {
    
    @scala.inline
    def apply[TArgs /* <: js.Array[js.Any] */, TKeyArgs /* <: js.Array[js.Any] */](): OptimisticWrapOptions[TArgs, TKeyArgs] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimisticWrapOptions[TArgs, TKeyArgs]]
    }
    
    @scala.inline
    implicit class OptimisticWrapOptionsMutableBuilder[Self <: OptimisticWrapOptions[?, ?], TArgs /* <: js.Array[js.Any] */, TKeyArgs /* <: js.Array[js.Any] */] (val x: Self & (OptimisticWrapOptions[TArgs, TKeyArgs])) extends AnyVal {
      
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
      def setSubscribe(value: /* args */ TArgs => Unit | js.Function0[js.Any]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      @scala.inline
      def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  type OptimisticWrapperFunction[TArgs /* <: js.Array[js.Any] */, TResult, TKeyArgs /* <: js.Array[js.Any] */] = (js.Function1[/* args */ TArgs, TResult]) & (Forget[TKeyArgs, TResult])
  
  type TCacheKey = js.Any
}
