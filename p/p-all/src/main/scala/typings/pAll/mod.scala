package typings.pAll

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-all", JSImport.Namespace)
@js.native
object mod extends js.Object {
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1](tasks: js.Array[PromiseFactory[Result1]]): js.Promise[js.Array[Result1]] = js.native
  def apply[Result1](tasks: js.Array[PromiseFactory[Result1]], options: Options): js.Promise[js.Array[Result1]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[TAll](tasks: Iterable[PromiseFactory[TAll]]): js.Promise[js.Array[TAll]] = js.native
  def apply[TAll](tasks: Iterable[PromiseFactory[TAll]], options: Options): js.Promise[js.Array[TAll]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2](tasks: js.Tuple2[PromiseFactory[Result1], PromiseFactory[Result2]]): js.Promise[js.Tuple2[Result1, Result2]] = js.native
  def apply[Result1, Result2](tasks: js.Tuple2[PromiseFactory[Result1], PromiseFactory[Result2]], options: Options): js.Promise[js.Tuple2[Result1, Result2]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3](tasks: js.Tuple3[PromiseFactory[Result1], PromiseFactory[Result2], PromiseFactory[Result3]]): js.Promise[js.Tuple3[Result1, Result2, Result3]] = js.native
  def apply[Result1, Result2, Result3](
    tasks: js.Tuple3[PromiseFactory[Result1], PromiseFactory[Result2], PromiseFactory[Result3]],
    options: Options
  ): js.Promise[js.Tuple3[Result1, Result2, Result3]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3, Result4](
    tasks: js.Tuple4[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4]
    ]
  ): js.Promise[js.Tuple4[Result1, Result2, Result3, Result4]] = js.native
  def apply[Result1, Result2, Result3, Result4](
    tasks: js.Tuple4[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4]
    ],
    options: Options
  ): js.Promise[js.Tuple4[Result1, Result2, Result3, Result4]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3, Result4, Result5](
    tasks: js.Tuple5[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5]
    ]
  ): js.Promise[js.Tuple5[Result1, Result2, Result3, Result4, Result5]] = js.native
  def apply[Result1, Result2, Result3, Result4, Result5](
    tasks: js.Tuple5[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5]
    ],
    options: Options
  ): js.Promise[js.Tuple5[Result1, Result2, Result3, Result4, Result5]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3, Result4, Result5, Result6](
    tasks: js.Tuple6[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6]
    ]
  ): js.Promise[js.Tuple6[Result1, Result2, Result3, Result4, Result5, Result6]] = js.native
  def apply[Result1, Result2, Result3, Result4, Result5, Result6](
    tasks: js.Tuple6[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6]
    ],
    options: Options
  ): js.Promise[js.Tuple6[Result1, Result2, Result3, Result4, Result5, Result6]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7](
    tasks: js.Tuple7[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7]
    ]
  ): js.Promise[js.Tuple7[Result1, Result2, Result3, Result4, Result5, Result6, Result7]] = js.native
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7](
    tasks: js.Tuple7[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7]
    ],
    options: Options
  ): js.Promise[js.Tuple7[Result1, Result2, Result3, Result4, Result5, Result6, Result7]] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8](
    tasks: js.Tuple8[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7], 
      PromiseFactory[Result8]
    ]
  ): js.Promise[
    js.Tuple8[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8]
  ] = js.native
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8](
    tasks: js.Tuple8[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7], 
      PromiseFactory[Result8]
    ],
    options: Options
  ): js.Promise[
    js.Tuple8[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8]
  ] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9](
    tasks: js.Tuple9[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7], 
      PromiseFactory[Result8], 
      PromiseFactory[Result9]
    ]
  ): js.Promise[
    js.Tuple9[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9]
  ] = js.native
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9](
    tasks: js.Tuple9[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7], 
      PromiseFactory[Result8], 
      PromiseFactory[Result9]
    ],
    options: Options
  ): js.Promise[
    js.Tuple9[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9]
  ] = js.native
  // TODO: Refactor the whole definition back to multiple overloaded functions
  /**
  Run promise-returning & async functions concurrently with optional limited concurrency.
  @param tasks - Iterable with promise-returning/async functions.
  @returns A `Promise` that is fulfilled when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is an `Array` of the fulfilled values in `tasks` order.
  @example
  ```
  import pAll = require('p-all');
  import got = require('got');
  (async () => {
  	const actions = [
  		() => got('https://sindresorhus.com'),
  		() => got('https://ava.li'),
  		() => checkSomething(),
  		() => doSomethingElse()
  	];
  	console.log(await pAll(actions, {concurrency: 2}));
  })();
  ```
  */
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9, Result10](
    tasks: js.Tuple10[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7], 
      PromiseFactory[Result8], 
      PromiseFactory[Result9], 
      PromiseFactory[Result10]
    ]
  ): js.Promise[
    js.Tuple10[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9, Result10]
  ] = js.native
  def apply[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9, Result10](
    tasks: js.Tuple10[
      PromiseFactory[Result1], 
      PromiseFactory[Result2], 
      PromiseFactory[Result3], 
      PromiseFactory[Result4], 
      PromiseFactory[Result5], 
      PromiseFactory[Result6], 
      PromiseFactory[Result7], 
      PromiseFactory[Result8], 
      PromiseFactory[Result9], 
      PromiseFactory[Result10]
    ],
    options: Options
  ): js.Promise[
    js.Tuple10[Result1, Result2, Result3, Result4, Result5, Result6, Result7, Result8, Result9, Result10]
  ] = js.native
  type Options = typings.pMap.mod.Options
  type PromiseFactory[T] = js.Function0[js.Thenable[T]]
}

