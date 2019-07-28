package typings.pDashSettle

import typings.pDashSettle.pDashSettleMod.Options
import typings.pDashSettle.pDashSettleMod.PromiseResult
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_Default extends js.Object {
  /**
  	Settle promises concurrently and get their fulfillment value or rejection reason.
  	@returns A promise that is fulfilled when all promises in `promises` are settled.
  	@example
  	```
  	import {promisify} from 'util';
  	import * as fs from 'fs';
  	import pSettle = require('p-settle');
  	const pReadFile = promisify(fs.readFile);
  	(async () => {
  		const files = [
  			'a.txt',
  			'b.txt' // Doesn't exist
  		].map(fileName => pReadFile(fileName, 'utf8'));
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
  def apply[ValueType](promises: js.Array[ValueType | js.Thenable[ValueType]]): js.Promise[js.Array[PromiseResult[ValueType]]] = js.native
  def apply[ValueType](promises: js.Array[ValueType | js.Thenable[ValueType]], options: Options): js.Promise[js.Array[PromiseResult[ValueType]]] = js.native
}

