package typings.pSettle

import org.scalablytyped.runtime.TopLevel
import typings.std.ReturnType
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  Settle promises concurrently and get their fulfillment value or rejection reason.
  @param array - Can contain a mix of any value, promise, and async function. Promises are awaited. Async functions are executed and awaited. The `concurrency` option only works for elements that are async functions.
  @returns A promise that is fulfilled when all promises from the `array` argument are settled.
  @example
  ```
  import {promises as fs} from 'fs';
  import pSettle = require('p-settle');
  (async () => {
  	const files = [
  		'a.txt',
  		'b.txt' // Doesn't exist
  	].map(fileName => fs.readFile(fileName, 'utf8'));
  	console.log(await pSettle(files));
  	// [
  	// 	{
  	// 		isFulfilled: true,
  	// 		isRejected: false,
  	// 		value: '🦄'
  	// 	},
  	// 	{
  	// 		isFulfilled: false,
  	// 		isRejected: true,
  	// 		reason: [Error: ENOENT: no such file or directory, open 'b.txt']
  	// 	}
  	// ]
  })();
  ```
  */
  @scala.inline
  def apply[ValueType /* <: js.Array[js.Any] */](array: ValueType): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof ValueType ]: p-settle.p-settle.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>}
    */ typings.pSettle.pSettleStrings.^ & TopLevel[ValueType]
  ] = ^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any]).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof ValueType ]: p-settle.p-settle.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>}
    */ typings.pSettle.pSettleStrings.^ & TopLevel[ValueType]
  ]]
  @scala.inline
  def apply[ValueType /* <: js.Array[js.Any] */](array: ValueType, options: Options): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof ValueType ]: p-settle.p-settle.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>}
    */ typings.pSettle.pSettleStrings.^ & TopLevel[ValueType]
  ] = (^.asInstanceOf[js.Dynamic].apply(array.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof ValueType ]: p-settle.p-settle.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>}
    */ typings.pSettle.pSettleStrings.^ & TopLevel[ValueType]
  ]]
  
  @JSImport("p-settle", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Use the native version when TS supports it (should be in v4).
  type Awaited[T] = T
  
  trait Options extends StObject {
    
    /**
    		Number of concurrently pending promises.
    		Must be an integer from 1 and up or `Infinity`.
    		Note: This only limits concurrency for elements that are async functions, not promises.
    		@default Infinity
    		*/
    val concurrency: js.UndefOr[Double] = js.undefined
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setConcurrencyUndefined: Self = StObject.set(x, "concurrency", js.undefined)
    }
  }
  
  type PromiseFulfilledResult[ValueType] = typings.pReflect.mod.PromiseFulfilledResult[ValueType]
  
  type PromiseRejectedResult = typings.pReflect.mod.PromiseRejectedResult
  
  type PromiseResult[ValueType] = typings.pReflect.mod.PromiseResult[ValueType]
  
  type ReturnValue[T] = T | ReturnType[T]
}
