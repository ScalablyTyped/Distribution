package typings.pSettle.mod

import org.scalablytyped.runtime.TopLevel
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("p-settle", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
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
  def apply[ValueType /* <: js.Array[_] */](array: ValueType): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof ValueType ]: p-settle.p-settle.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>}
    */ typings.pSettle.pSettleStrings.^  with TopLevel[ValueType]
  ] = js.native
  def apply[ValueType /* <: js.Array[_] */](array: ValueType, options: Options): js.Promise[
    /* import warning: importer.ImportType#apply c Unsupported type mapping: 
  {-readonly [ P in keyof ValueType ]: p-settle.p-settle.PromiseResult<p-settle.p-settle.Awaited<p-settle.p-settle.ReturnValue<ValueType[P]>>>}
    */ typings.pSettle.pSettleStrings.^  with TopLevel[ValueType]
  ] = js.native
}
