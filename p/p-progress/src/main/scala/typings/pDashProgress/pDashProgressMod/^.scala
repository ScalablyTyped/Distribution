package typings.pDashProgress.pDashProgressMod

import typings.std.Iterable
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-progress", JSImport.Namespace)
@js.native
class ^[ValueType] protected () extends PProgress[ValueType] {
  /**
  	Same as the [`Promise` constructor](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise).
  	@param executor - Same as the `Promise` constructor but with an appended `progress` parameter in `executor`.
  	@example
  	```
  	import PProgress = require('p-progress');
  	const progressPromise = new PProgress((resolve, reject, progress) => {
  		const job = new Job();
  		job.on('data', data => {
  			progress(data.length / job.totalSize);
  		});
  		job.on('finish', resolve);
  		job.on('error', reject);
  	});
  	(async () => {
  		progressPromise.onProgress(progress => {
  			console.log(`${progress * 100}%`);
  			//=> 9%
  			//=> 23%
  			//=> 59%
  			//=> 75%
  			//=> 100%
  		});
  		await progressPromise;
  	})();
  	```
  	*/
  def this(/**
  		@param progress - Call this with progress updates. It expects a number between 0 and 1.
  		Multiple calls with the same number will result in only one `onProgress()` event.
  		Progress percentage `1` is reported for you when the promise resolves. If you set it yourself, it will simply be ignored.
  		*/
  executor: js.Function3[
        /* resolve */ js.Function1[/* value */ js.UndefOr[ValueType | js.Thenable[ValueType]], Unit], 
        /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], Unit], 
        /* progress */ ProgressNotifier, 
        Unit
      ]) = this()
}

@JSImport("p-progress", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def all[ValueType1](promises: js.Array[js.Thenable[ValueType1] | PromiseFactory[ValueType1]]): PProgress[js.Array[ValueType1]] = js.native
  def all[ValueType1](promises: js.Array[PromiseFactory[ValueType1]], options: Options): PProgress[js.Array[ValueType1]] = js.native
  def all[AllValuesType](promises: Iterable[js.Thenable[AllValuesType] | PromiseFactory[AllValuesType]]): PProgress[AllValuesType] = js.native
  def all[AllValuesType](promises: Iterable[PromiseFactory[AllValuesType]], options: Options): PProgress[AllValuesType] = js.native
  def all[ValueType1, ValueType2](
    promises: js.Tuple2[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2]
    ]
  ): PProgress[js.Tuple2[ValueType1, ValueType2]] = js.native
  def all[ValueType1, ValueType2](promises: js.Tuple2[PromiseFactory[ValueType1], PromiseFactory[ValueType2]], options: Options): PProgress[js.Tuple2[ValueType1, ValueType2]] = js.native
  def all[ValueType1, ValueType2, ValueType3](
    promises: js.Tuple3[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3]
    ]
  ): PProgress[js.Tuple3[ValueType1, ValueType2, ValueType3]] = js.native
  def all[ValueType1, ValueType2, ValueType3](
    promises: js.Tuple3[PromiseFactory[ValueType1], PromiseFactory[ValueType2], PromiseFactory[ValueType3]],
    options: Options
  ): PProgress[js.Tuple3[ValueType1, ValueType2, ValueType3]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4](
    promises: js.Tuple4[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | PromiseFactory[ValueType4]
    ]
  ): PProgress[js.Tuple4[ValueType1, ValueType2, ValueType3, ValueType4]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4](
    promises: js.Tuple4[
      PromiseFactory[ValueType1], 
      PromiseFactory[ValueType2], 
      PromiseFactory[ValueType3], 
      PromiseFactory[ValueType4]
    ],
    options: Options
  ): PProgress[js.Tuple4[ValueType1, ValueType2, ValueType3, ValueType4]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5](
    promises: js.Tuple5[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | PromiseFactory[ValueType5]
    ]
  ): PProgress[js.Tuple5[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5](
    promises: js.Tuple5[
      PromiseFactory[ValueType1], 
      PromiseFactory[ValueType2], 
      PromiseFactory[ValueType3], 
      PromiseFactory[ValueType4], 
      PromiseFactory[ValueType5]
    ],
    options: Options
  ): PProgress[js.Tuple5[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5]] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6](
    promises: js.Tuple6[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | PromiseFactory[ValueType6]
    ]
  ): PProgress[
    js.Tuple6[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6](
    promises: js.Tuple6[
      PromiseFactory[ValueType1], 
      PromiseFactory[ValueType2], 
      PromiseFactory[ValueType3], 
      PromiseFactory[ValueType4], 
      PromiseFactory[ValueType5], 
      PromiseFactory[ValueType6]
    ],
    options: Options
  ): PProgress[
    js.Tuple6[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7](
    promises: js.Tuple7[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | PromiseFactory[ValueType7]
    ]
  ): PProgress[
    js.Tuple7[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7](
    promises: js.Tuple7[
      PromiseFactory[ValueType1], 
      PromiseFactory[ValueType2], 
      PromiseFactory[ValueType3], 
      PromiseFactory[ValueType4], 
      PromiseFactory[ValueType5], 
      PromiseFactory[ValueType6], 
      PromiseFactory[ValueType7]
    ],
    options: Options
  ): PProgress[
    js.Tuple7[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8](
    promises: js.Tuple8[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | PromiseFactory[ValueType7], 
      js.Thenable[ValueType8] | PromiseFactory[ValueType8]
    ]
  ): PProgress[
    js.Tuple8[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8](
    promises: js.Tuple8[
      PromiseFactory[ValueType1], 
      PromiseFactory[ValueType2], 
      PromiseFactory[ValueType3], 
      PromiseFactory[ValueType4], 
      PromiseFactory[ValueType5], 
      PromiseFactory[ValueType6], 
      PromiseFactory[ValueType7], 
      PromiseFactory[ValueType8]
    ],
    options: Options
  ): PProgress[
    js.Tuple8[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9](
    promises: js.Tuple9[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | PromiseFactory[ValueType7], 
      js.Thenable[ValueType8] | PromiseFactory[ValueType8], 
      js.Thenable[ValueType9] | PromiseFactory[ValueType9]
    ]
  ): PProgress[
    js.Tuple9[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9
    ]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9](
    promises: js.Tuple9[
      PromiseFactory[ValueType1], 
      PromiseFactory[ValueType2], 
      PromiseFactory[ValueType3], 
      PromiseFactory[ValueType4], 
      PromiseFactory[ValueType5], 
      PromiseFactory[ValueType6], 
      PromiseFactory[ValueType7], 
      PromiseFactory[ValueType8], 
      PromiseFactory[ValueType9]
    ],
    options: Options
  ): PProgress[
    js.Tuple9[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9
    ]
  ] = js.native
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9, ValueType10](
    promises: js.Tuple10[
      js.Thenable[ValueType1] | PromiseFactory[ValueType1], 
      js.Thenable[ValueType2] | PromiseFactory[ValueType2], 
      js.Thenable[ValueType3] | PromiseFactory[ValueType3], 
      js.Thenable[ValueType4] | PromiseFactory[ValueType4], 
      js.Thenable[ValueType5] | PromiseFactory[ValueType5], 
      js.Thenable[ValueType6] | PromiseFactory[ValueType6], 
      js.Thenable[ValueType7] | PromiseFactory[ValueType7], 
      js.Thenable[ValueType8] | PromiseFactory[ValueType8], 
      js.Thenable[ValueType9] | PromiseFactory[ValueType9], 
      js.Thenable[ValueType10] | PromiseFactory[ValueType10]
    ]
  ): PProgress[
    js.Tuple10[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9, 
      ValueType10
    ]
  ] = js.native
  /**
  	Convenience method to run multiple promises and get a total progress of all of them. It counts normal promises with progress `0` when pending and progress `1` when resolved. For `PProgress` type promises, it listens to their `onProgress()` method for more fine grained progress reporting. You can mix and match normal promises and `PProgress` promises.
  	@param promises - Array of promises or promise-returning functions, similar to [p-all](https://github.com/sindresorhus/p-all).
  	@example
  	```
  	import PProgress = require('p-progress');
  	import delay = require('delay');
  	const progressPromise = PProgress.fn(async progress => {
  		progress(0.14);
  		await delay(52);
  		progress(0.37);
  		await delay(104);
  		progress(0.41);
  		await delay(26);
  		progress(0.93);
  		await delay(55);
  	});
  	const allProgressPromise = PProgress.all([
  		delay(103),
  		progressPromise(),
  		delay(55),
  		delay(209)
  	]);
  	(async () => {
  		allProgressPromise.onProgress(console.log);
  		//=> 0.0925
  		//=> 0.3425
  		//=> 0.5925
  		//=> 0.6025
  		//=> 0.7325
  		//=> 0.9825
  		//=> 1
  		await allProgressPromise;
  	})();
  	```
  	*/
  def all[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ValueType9, ValueType10](
    promises: js.Tuple10[
      PromiseFactory[ValueType1], 
      PromiseFactory[ValueType2], 
      PromiseFactory[ValueType3], 
      PromiseFactory[ValueType4], 
      PromiseFactory[ValueType5], 
      PromiseFactory[ValueType6], 
      PromiseFactory[ValueType7], 
      PromiseFactory[ValueType8], 
      PromiseFactory[ValueType9], 
      PromiseFactory[ValueType10]
    ],
    options: Options
  ): PProgress[
    js.Tuple10[
      ValueType1, 
      ValueType2, 
      ValueType3, 
      ValueType4, 
      ValueType5, 
      ValueType6, 
      ValueType7, 
      ValueType8, 
      ValueType9, 
      ValueType10
    ]
  ] = js.native
  /**
  	Convenience method to make your promise-returning or async function report progress.
  	The function you specify will have the `progress()` function appended to its parameters.
  	@example
  	```
  	import PProgress = require('p-progress');
  	const runJob = PProgress.fn(async (name, progress) => {
  		const job = new Job(name);
  		job.on('data', data => {
  			progress(data.length / job.totalSize);
  		});
  		await job.run();
  	});
  	(async () => {
  		const progressPromise = runJob('Gather rainbows');
  		progressPromise.onProgress(console.log);
  		//=> 0.09
  		//=> 0.23
  		//=> 0.59
  		//=> 0.75
  		//=> 1
  		await progressPromise;
  	})();
  	```
  	*/
  def fn[ReturnType](input: js.Function1[/* progress */ ProgressNotifier, js.Thenable[ReturnType]]): js.Function0[PProgress[ReturnType]] = js.native
  def fn[ParameterType1, ReturnType](
    input: js.Function2[
      /* parameter1 */ ParameterType1, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function1[/* parameter1 */ ParameterType1, PProgress[ReturnType]] = js.native
  def fn[ParameterType1, ParameterType2, ReturnType](
    input: js.Function3[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function2[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ReturnType](
    input: js.Function4[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function3[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ReturnType](
    input: js.Function5[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function4[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ReturnType](
    input: js.Function6[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function5[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ReturnType](
    input: js.Function7[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function6[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ReturnType](
    input: js.Function8[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function7[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ParameterType8, ReturnType](
    input: js.Function9[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* parameter8 */ ParameterType8, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function8[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    /* parameter8 */ ParameterType8, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ParameterType8, ParameterType9, ReturnType](
    input: js.Function10[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* parameter8 */ ParameterType8, 
      /* parameter9 */ ParameterType9, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function9[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    /* parameter8 */ ParameterType8, 
    /* parameter9 */ ParameterType9, 
    PProgress[ReturnType]
  ] = js.native
  def fn[ParameterType1, ParameterType2, ParameterType3, ParameterType4, ParameterType5, ParameterType6, ParameterType7, ParameterType8, ParameterType9, ParameterType10, ReturnType](
    input: js.Function11[
      /* parameter1 */ ParameterType1, 
      /* parameter2 */ ParameterType2, 
      /* parameter3 */ ParameterType3, 
      /* parameter4 */ ParameterType4, 
      /* parameter5 */ ParameterType5, 
      /* parameter6 */ ParameterType6, 
      /* parameter7 */ ParameterType7, 
      /* parameter8 */ ParameterType8, 
      /* parameter9 */ ParameterType9, 
      /* parameter10 */ ParameterType10, 
      /* progress */ ProgressNotifier, 
      js.Thenable[ReturnType]
    ]
  ): js.Function10[
    /* parameter1 */ ParameterType1, 
    /* parameter2 */ ParameterType2, 
    /* parameter3 */ ParameterType3, 
    /* parameter4 */ ParameterType4, 
    /* parameter5 */ ParameterType5, 
    /* parameter6 */ ParameterType6, 
    /* parameter7 */ ParameterType7, 
    /* parameter8 */ ParameterType8, 
    /* parameter9 */ ParameterType9, 
    /* parameter10 */ ParameterType10, 
    PProgress[ReturnType]
  ] = js.native
  @JSName("fn")
  def fn_ReturnType_Function1[ReturnType](input: js.Function1[/* repeated */ js.Any, js.Thenable[ReturnType]]): js.Function1[/* repeated */ js.Any, PProgress[ReturnType]] = js.native
}

