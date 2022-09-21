package typings.optimism

import typings.optimism.anon.DirtyKey
import typings.optimism.anon.Subscribe
import typings.optimism.depMod.OptimisticDependencyFunction
import typings.std.Generator
import typings.wryTrie.mod.Trie
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("optimism", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  @JSImport("optimism", "KeyTrie")
  @js.native
  open class KeyTrie[Data] () extends Trie[Data] {
    def this(weakness: Boolean) = this()
    def this(weakness: Boolean, makeData: js.Function1[/* array */ js.Array[Any], Data]) = this()
    def this(weakness: Unit, makeData: js.Function1[/* array */ js.Array[Any], Data]) = this()
  }
  
  inline def asyncFromGen[TArgs /* <: js.Array[Any] */, TYield, TReturn, TNext](genFn: js.Function1[/* args */ TArgs, Generator[TYield, TReturn, TNext]]): js.Function1[/* args */ TArgs, js.Promise[Any]] = ^.asInstanceOf[js.Dynamic].applyDynamic("asyncFromGen")(genFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* args */ TArgs, js.Promise[Any]]]
  
  inline def defaultMakeCacheKey(args: Any*): Any = ^.asInstanceOf[js.Dynamic].applyDynamic("defaultMakeCacheKey")(args.asInstanceOf[Seq[js.Any]]*).asInstanceOf[Any]
  
  inline def dep[TKey](): OptimisticDependencyFunction[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("dep")().asInstanceOf[OptimisticDependencyFunction[TKey]]
  inline def dep[TKey](options: Subscribe[TKey]): OptimisticDependencyFunction[TKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("dep")(options.asInstanceOf[js.Any]).asInstanceOf[OptimisticDependencyFunction[TKey]]
  
  inline def setTimeout(callback: js.Function0[Any], delay: Double): Any = (^.asInstanceOf[js.Dynamic].applyDynamic("setTimeout")(callback.asInstanceOf[js.Any], delay.asInstanceOf[js.Any])).asInstanceOf[Any]
  
  inline def wrap[TArgs /* <: js.Array[Any] */, TResult, TKeyArgs /* <: js.Array[Any] */, TCacheKey](originalFunction: js.Function1[/* args */ TArgs, TResult]): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs, TCacheKey] = ^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(originalFunction.asInstanceOf[js.Any]).asInstanceOf[OptimisticWrapperFunction[TArgs, TResult, TKeyArgs, TCacheKey]]
  inline def wrap[TArgs /* <: js.Array[Any] */, TResult, TKeyArgs /* <: js.Array[Any] */, TCacheKey](
    originalFunction: js.Function1[/* args */ TArgs, TResult],
    options: OptimisticWrapOptions[TArgs, TKeyArgs, Any]
  ): OptimisticWrapperFunction[TArgs, TResult, TKeyArgs, TCacheKey] = (^.asInstanceOf[js.Dynamic].applyDynamic("wrap")(originalFunction.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[OptimisticWrapperFunction[TArgs, TResult, TKeyArgs, TCacheKey]]
  
  trait OptimisticWrapOptions[TArgs /* <: js.Array[Any] */, TKeyArgs /* <: js.Array[Any] */, TCacheKey] extends StObject {
    
    var keyArgs: js.UndefOr[js.Function1[/* args */ TArgs, TKeyArgs]] = js.undefined
    
    var makeCacheKey: js.UndefOr[js.Function1[/* args */ TKeyArgs, TCacheKey]] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var subscribe: js.UndefOr[js.Function1[/* args */ TArgs, Unit | js.Function0[Any]]] = js.undefined
  }
  object OptimisticWrapOptions {
    
    inline def apply[TArgs /* <: js.Array[Any] */, TKeyArgs /* <: js.Array[Any] */, TCacheKey](): OptimisticWrapOptions[TArgs, TKeyArgs, TCacheKey] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[OptimisticWrapOptions[TArgs, TKeyArgs, TCacheKey]]
    }
    
    extension [Self <: OptimisticWrapOptions[?, ?, ?], TArgs /* <: js.Array[Any] */, TKeyArgs /* <: js.Array[Any] */, TCacheKey](x: Self & (OptimisticWrapOptions[TArgs, TKeyArgs, TCacheKey])) {
      
      inline def setKeyArgs(value: /* args */ TArgs => TKeyArgs): Self = StObject.set(x, "keyArgs", js.Any.fromFunction1(value))
      
      inline def setKeyArgsUndefined: Self = StObject.set(x, "keyArgs", js.undefined)
      
      inline def setMakeCacheKey(value: /* args */ TKeyArgs => TCacheKey): Self = StObject.set(x, "makeCacheKey", js.Any.fromFunction1(value))
      
      inline def setMakeCacheKeyUndefined: Self = StObject.set(x, "makeCacheKey", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setSubscribe(value: /* args */ TArgs => Unit | js.Function0[Any]): Self = StObject.set(x, "subscribe", js.Any.fromFunction1(value))
      
      inline def setSubscribeUndefined: Self = StObject.set(x, "subscribe", js.undefined)
    }
  }
  
  type OptimisticWrapperFunction[TArgs /* <: js.Array[Any] */, TResult, TKeyArgs /* <: js.Array[Any] */, TCacheKey] = (js.Function1[/* args */ TArgs, TResult]) & (DirtyKey[TKeyArgs, TCacheKey, TResult, TArgs])
}
