package typings.pSettle

import typings.pReflect.mod.PromiseResult
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-settle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ValueType /* <: js.Array[Any] */](array: ValueType): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof ValueType ]: p-reflect.p-reflect.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>} */ js.Any
  ] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof ValueType ]: p-reflect.p-reflect.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>} */ js.Any
  ]]
  inline def default[ValueType /* <: js.Array[Any] */](array: ValueType, options: Options): js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof ValueType ]: p-reflect.p-reflect.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>} */ js.Any
  ] = (^.asInstanceOf[js.Dynamic].applyDynamic("default")(array.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply Failed type conversion: {-readonly [ P in keyof ValueType ]: p-reflect.p-reflect.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>} */ js.Any
  ]]
  
  inline def isFulfilled[T](promiseResult: PromiseResult[T]): /* is p-reflect.p-reflect.PromiseFulfilledResult<T> */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isFulfilled")(promiseResult.asInstanceOf[js.Any]).asInstanceOf[/* is p-reflect.p-reflect.PromiseFulfilledResult<T> */ Boolean]
  
  inline def isRejected[T](promiseResult: PromiseResult[T]): /* is p-reflect.p-reflect.PromiseRejectedResult */ Boolean = ^.asInstanceOf[js.Dynamic].applyDynamic("isRejected")(promiseResult.asInstanceOf[js.Any]).asInstanceOf[/* is p-reflect.p-reflect.PromiseRejectedResult */ Boolean]
  
  // TODO: Use the native version in the next major version of this package.
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends undefined ? T : T extends std.PromiseLike<infer U> ? U : T
    }}}
    */
  type Awaited[T] = T
  
  trait Options extends StObject {
    
    /**
    	The number of concurrently pending promises.
    	Must be an integer from 1 and up or `Infinity`.
    	Note: This only limits concurrency for elements that are async functions, not promises.
    	@default Infinity
    	*/
    val concurrency: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      inline def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    }
  }
  
  /** NOTE: Conditional type definitions are impossible to translate to Scala.
    * See https://www.typescriptlang.org/docs/handbook/2/conditional-types.html for an intro.
    * This RHS of the type alias is guess work. You should cast if it's not correct in your case.
    * TS definition: {{{
    T extends (args : any): any ? std.ReturnType<T> : T
    }}}
    */
  type ReturnValue[T] = T
}
