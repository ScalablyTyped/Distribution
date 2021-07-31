package typings.memoizee

import typings.memoizee.memoizeeBooleans.`false`
import typings.memoizee.memoizeeBooleans.`true`
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @scala.inline
  def apply[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](f: F): F & Memoized[F] = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[F & Memoized[F]]
  @scala.inline
  def apply[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](f: F, options: Options[F]): F & Memoized[F] = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[F & Memoized[F]]
  
  @JSImport("memoizee", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  trait Memoized[F] extends StObject {
    
    def clear(): Unit
    @JSName("clear")
    var clear_Original: F & js.Function0[Unit]
    
    var delete: F
  }
  object Memoized {
    
    @scala.inline
    def apply[F](clear: F & js.Function0[Unit], delete: F): Memoized[F] = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[Memoized[F]]
    }
    
    @scala.inline
    implicit class MemoizedMutableBuilder[Self <: Memoized[?], F] (val x: Self & Memoized[F]) extends AnyVal {
      
      @scala.inline
      def setClear(value: F & js.Function0[Unit]): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setDelete(value: F): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */] extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var dispose: js.UndefOr[js.Function1[/* value */ js.Any, Unit]] = js.undefined
    
    var length: js.UndefOr[Double | `false`] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var normalizer: js.UndefOr[js.Function1[/* args */ Parameters[F], String]] = js.undefined
    
    var preFetch: js.UndefOr[Double | `true`] = js.undefined
    
    var primitive: js.UndefOr[Boolean] = js.undefined
    
    var promise: js.UndefOr[Boolean] = js.undefined
    
    var resolvers: js.UndefOr[js.Array[js.Function1[/* arg */ js.Any, js.Any]]] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply[F /* <: js.Function1[/* repeated */ js.Any, js.Any] */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options[?], F /* <: js.Function1[/* repeated */ js.Any, js.Any] */] (val x: Self & Options[F]) extends AnyVal {
      
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
      def setResolvers(value: js.Array[js.Function1[/* arg */ js.Any, js.Any]]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      @scala.inline
      def setResolversVarargs(value: (js.Function1[/* arg */ js.Any, js.Any])*): Self = StObject.set(x, "resolvers", js.Array(value :_*))
    }
  }
}
