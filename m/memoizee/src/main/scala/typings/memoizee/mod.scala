package typings.memoizee

import typings.memoizee.memoizeeBooleans.`false`
import typings.memoizee.memoizeeBooleans.`true`
import typings.memoizee.memoizeeStrings.`then`
import typings.memoizee.memoizeeStrings.done
import typings.memoizee.memoizeeStrings.doneColonfinally
import typings.std.Parameters
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](f: F): F & Memoized[F] = ^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any]).asInstanceOf[F & Memoized[F]]
  inline def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](f: F, options: Options[F]): F & Memoized[F] = (^.asInstanceOf[js.Dynamic].apply(f.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[F & Memoized[F]]
  
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
    
    inline def apply[F](clear: F & js.Function0[Unit], delete: F): Memoized[F] = {
      val __obj = js.Dynamic.literal(clear = clear.asInstanceOf[js.Any], delete = delete.asInstanceOf[js.Any])
      __obj.asInstanceOf[Memoized[F]]
    }
    
    extension [Self <: Memoized[?], F](x: Self & Memoized[F]) {
      
      inline def setClear(value: F & js.Function0[Unit]): Self = StObject.set(x, "clear", value.asInstanceOf[js.Any])
      
      inline def setDelete(value: F): Self = StObject.set(x, "delete", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options[F /* <: js.Function1[/* repeated */ Any, Any] */] extends StObject {
    
    var async: js.UndefOr[Boolean] = js.undefined
    
    var dispose: js.UndefOr[js.Function1[/* value */ Any, Unit]] = js.undefined
    
    var length: js.UndefOr[Double | `false`] = js.undefined
    
    var max: js.UndefOr[Double] = js.undefined
    
    var maxAge: js.UndefOr[Double] = js.undefined
    
    var normalizer: js.UndefOr[js.Function1[/* args */ Parameters[F], String]] = js.undefined
    
    var preFetch: js.UndefOr[Double | `true`] = js.undefined
    
    var primitive: js.UndefOr[Boolean] = js.undefined
    
    var profileName: js.UndefOr[String] = js.undefined
    
    var promise: js.UndefOr[Boolean | `then` | done | doneColonfinally] = js.undefined
    
    var resolvers: js.UndefOr[js.Array[js.Function1[/* arg */ Any, Any]]] = js.undefined
  }
  object Options {
    
    inline def apply[F /* <: js.Function1[/* repeated */ Any, Any] */](): Options[F] = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options[F]]
    }
    
    extension [Self <: Options[?], F /* <: js.Function1[/* repeated */ Any, Any] */](x: Self & Options[F]) {
      
      inline def setAsync(value: Boolean): Self = StObject.set(x, "async", value.asInstanceOf[js.Any])
      
      inline def setAsyncUndefined: Self = StObject.set(x, "async", js.undefined)
      
      inline def setDispose(value: /* value */ Any => Unit): Self = StObject.set(x, "dispose", js.Any.fromFunction1(value))
      
      inline def setDisposeUndefined: Self = StObject.set(x, "dispose", js.undefined)
      
      inline def setLength(value: Double | `false`): Self = StObject.set(x, "length", value.asInstanceOf[js.Any])
      
      inline def setLengthUndefined: Self = StObject.set(x, "length", js.undefined)
      
      inline def setMax(value: Double): Self = StObject.set(x, "max", value.asInstanceOf[js.Any])
      
      inline def setMaxAge(value: Double): Self = StObject.set(x, "maxAge", value.asInstanceOf[js.Any])
      
      inline def setMaxAgeUndefined: Self = StObject.set(x, "maxAge", js.undefined)
      
      inline def setMaxUndefined: Self = StObject.set(x, "max", js.undefined)
      
      inline def setNormalizer(value: /* args */ Parameters[F] => String): Self = StObject.set(x, "normalizer", js.Any.fromFunction1(value))
      
      inline def setNormalizerUndefined: Self = StObject.set(x, "normalizer", js.undefined)
      
      inline def setPreFetch(value: Double | `true`): Self = StObject.set(x, "preFetch", value.asInstanceOf[js.Any])
      
      inline def setPreFetchUndefined: Self = StObject.set(x, "preFetch", js.undefined)
      
      inline def setPrimitive(value: Boolean): Self = StObject.set(x, "primitive", value.asInstanceOf[js.Any])
      
      inline def setPrimitiveUndefined: Self = StObject.set(x, "primitive", js.undefined)
      
      inline def setProfileName(value: String): Self = StObject.set(x, "profileName", value.asInstanceOf[js.Any])
      
      inline def setProfileNameUndefined: Self = StObject.set(x, "profileName", js.undefined)
      
      inline def setPromise(value: Boolean | `then` | done | doneColonfinally): Self = StObject.set(x, "promise", value.asInstanceOf[js.Any])
      
      inline def setPromiseUndefined: Self = StObject.set(x, "promise", js.undefined)
      
      inline def setResolvers(value: js.Array[js.Function1[/* arg */ Any, Any]]): Self = StObject.set(x, "resolvers", value.asInstanceOf[js.Any])
      
      inline def setResolversUndefined: Self = StObject.set(x, "resolvers", js.undefined)
      
      inline def setResolversVarargs(value: (js.Function1[/* arg */ Any, Any])*): Self = StObject.set(x, "resolvers", js.Array(value*))
    }
  }
}
