package typings.memoizee

import typings.memoizee.memoizeeBooleans.`false`
import typings.memoizee.memoizeeBooleans.`true`
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("memoizee", JSImport.Namespace)
  @js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](f: F): F with Memoized[F] = js.native
  @JSImport("memoizee", JSImport.Namespace)
  @js.native
  def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](f: F, options: Options[F]): F with Memoized[F] = js.native
  
  @js.native
  trait Memoized[F] extends StObject {
    
    def clear(): Unit = js.native
    @JSName("clear")
    var clear_Original: F with js.Function0[Unit] = js.native
    
    var delete: F = js.native
  }
  
  @js.native
  trait Options[F /* <: js.Function1[/* repeated */ js.Any, _] */] extends StObject {
    
    var async: js.UndefOr[Boolean] = js.native
    
    var dispose: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.native
    
    var length: js.UndefOr[Double | `false`] = js.native
    
    var max: js.UndefOr[Double] = js.native
    
    var maxAge: js.UndefOr[Double] = js.native
    
    var normalizer: js.UndefOr[js.Function1[/* args */ Parameters[F], String]] = js.native
    
    var preFetch: js.UndefOr[Double | `true`] = js.native
    
    var primitive: js.UndefOr[Boolean] = js.native
    
    var promise: js.UndefOr[Boolean] = js.native
    
    var resolvers: js.UndefOr[js.Array[js.Function1[/* arg */ _, _]]] = js.native
  }
  object Options {
    
    @scala.inline
    def apply[F /* <: js.Function1[/* repeated */ js.Any, _] */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[_], F /* <: js.Function1[/* repeated */ js.Any, _] */] (val x: Self with Options[F]) extends AnyVal {
      
      @scala.inline
      def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      @scala.inline
      def setDispose(value: /* value */ js.Any => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
      
      @scala.inline
      def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      @scala.inline
      def setLength(value: Double | `false`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      @scala.inline
      def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      @scala.inline
      def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      @scala.inline
      def setNormalizer(value: /* args */ Parameters[F] => String): Self = StObject.set(x, "normalizer", js.Any.fromFunction1(value))
      
      @scala.inline
      def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
      
      @scala.inline
      def setPreFetch(value: Double | `true`): Self = StObject.set(x, "preFetch", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPreFetchUndefined: Self = StObject.set(x, "preFetch", js.undefined)
      
      @scala.inline
      def setPrimitive(value: Boolean): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
      
      @scala.inline
      def setPromise(value: Boolean): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      @scala.inline
      def setResolvers(value: js.Array[js.Function1[/* arg */ _, _]]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      @scala.inline
      def setResolversVarargs(value: (js.Function1[js.Any, js.Any])*): Self = StObject.set(x, "resolvers", js.Array(value :_*))
    }
  }
}
