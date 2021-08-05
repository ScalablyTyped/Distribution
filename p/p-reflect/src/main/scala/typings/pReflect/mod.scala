package typings.pReflect

import typings.pReflect.pReflectBooleans.`false`
import typings.pReflect.pReflectBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Make a promise always fulfill with its actual fulfillment value or rejection reason.
  	@param promise - A promise to reflect upon.
  	@returns Promise reflection.
  	@example
  	```
  	import pReflect = require('p-reflect');
  	// Here, `Promise.all` would normally fail early because one of the promises rejects, but by using `p-reflect`, we can ignore the rejection and handle it later on.
  	(async () => {
  		const promises = [
  			getPromise(),
  			getPromiseThatRejects(),
  			getPromise()
  		];
  		const results = await Promise.all(promises.map(pReflect));
  		console.log(results);
  		/ *
  		[
  			{
  				isFulfilled: true,
  				isRejected: false,
  				value: '🦄'
  			},
  			{
  				isFulfilled: false,
  				isRejected: true,
  				reason: [Error: 👹]
  			},
  			{
  				isFulfilled: true,
  				isRejected: false,
  				value: '🐴'
  			}
  		]
  		*\/
  		const resolvedString = results
  			.filter(result => result.isFulfilled)
  			.map(result => result.value)
  			.join('');
  		console.log(resolvedString);
  		//=> '🦄🐴'
  	})();
  	```
  	*/
  inline def apply[ValueType](promise: js.Thenable[ValueType]): js.Promise[PromiseResult[ValueType]] = ^.asInstanceOf[js.Dynamic].apply(promise.asInstanceOf[js.Any]).asInstanceOf[js.Promise[PromiseResult[ValueType]]]
  
  @JSImport("p-reflect", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function pReflect<ValueType>(
  // 	promise: PromiseLike<ValueType>
  // ): Promise<pReflect.PromiseResult<ValueType>>;
  // export = pReflect;
  @JSImport("p-reflect", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pReflect */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pReflect */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  trait PromiseFulfilledResult[ValueType]
    extends StObject
       with PromiseResult[ValueType] {
    
    var isFulfilled: `true`
    
    var isRejected: `false`
    
    var value: ValueType
  }
  object PromiseFulfilledResult {
    
    inline def apply[ValueType](value: ValueType): PromiseFulfilledResult[ValueType] = {
      val __obj = js.Dynamic.literal(isFulfilled = true, isRejected = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseFulfilledResult[ValueType]]
    }
    
    extension [Self <: PromiseFulfilledResult[?], ValueType](x: Self & PromiseFulfilledResult[ValueType]) {
      
      inline def setIsFulfilled(value: `true`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
      
      inline def setIsRejected(value: `false`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
      
      inline def setValue(value: ValueType): Self = StObject.set(x, "value", value.asInstanceOf[js.Any])
    }
  }
  
  trait PromiseRejectedResult
    extends StObject
       with PromiseResult[js.Any] {
    
    var isFulfilled: `false`
    
    var isRejected: `true`
    
    var reason: js.Any
  }
  object PromiseRejectedResult {
    
    inline def apply(reason: js.Any): PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(isFulfilled = false, isRejected = true, reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[PromiseRejectedResult]
    }
    
    extension [Self <: PromiseRejectedResult](x: Self) {
      
      inline def setIsFulfilled(value: `false`): Self = StObject.set(x, "isFulfilled", value.asInstanceOf[js.Any])
      
      inline def setIsRejected(value: `true`): Self = StObject.set(x, "isRejected", value.asInstanceOf[js.Any])
      
      inline def setReason(value: js.Any): Self = StObject.set(x, "reason", value.asInstanceOf[js.Any])
    }
  }
  
  /* Rewritten from type alias, can be one of: 
    - typings.pReflect.mod.PromiseFulfilledResult[ValueType]
    - typings.pReflect.mod.PromiseRejectedResult
  */
  trait PromiseResult[ValueType] extends StObject
  object PromiseResult {
    
    inline def PromiseFulfilledResult[ValueType](value: ValueType): typings.pReflect.mod.PromiseFulfilledResult[ValueType] = {
      val __obj = js.Dynamic.literal(isFulfilled = true, isRejected = false, value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pReflect.mod.PromiseFulfilledResult[ValueType]]
    }
    
    inline def PromiseRejectedResult(reason: js.Any): typings.pReflect.mod.PromiseRejectedResult = {
      val __obj = js.Dynamic.literal(isFulfilled = false, isRejected = true, reason = reason.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pReflect.mod.PromiseRejectedResult]
    }
  }
}
