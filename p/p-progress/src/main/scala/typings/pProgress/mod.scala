package typings.pProgress

import org.scalablytyped.runtime.TopLevel
import typings.std.Promise
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-progress", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  inline def default[ReturnValue](input: js.Function1[/* progress */ ProgressNotifier, js.Thenable[ReturnValue] | ReturnValue]): PProgress[ReturnValue] = ^.asInstanceOf[js.Dynamic].applyDynamic("default")(input.asInstanceOf[js.Any]).asInstanceOf[PProgress[ReturnValue]]
  
  @JSImport("p-progress", "PProgress")
  @js.native
  open class PProgress[ValueType] protected ()
    extends StObject
       with Promise[ValueType] {
    /**
    	Same as the [`Promise` constructor](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise).
    	@param executor - Same as the `Promise` constructor but with an appended `progress` parameter in `executor`.
    	@example
    	```
    	import {PProgress} from 'p-progress';
    	const progressPromise = new PProgress((resolve, reject, progress) => {
    		const job = new Job();
    		job.on('data', data => {
    			progress(data.length / job.totalSize);
    		});
    		job.on('finish', resolve);
    		job.on('error', reject);
    	});
    	progressPromise.onProgress(progress => {
    		console.log(`${progress * 100}%`);
    		//=> 9%
    		//=> 23%
    		//=> 59%
    		//=> 75%
    		//=> 100%
    	});
    	await progressPromise;
    	```
    	*/
    def this(/**
    		@param progress - Call this with progress updates. It expects a number between 0 and 1.
    		Multiple calls with the same number will result in only one `onProgress()` event.
    		Calling with a number lower than previously will be ignored.
    		Progress percentage `1` is reported for you when the promise resolves. If you set it yourself, it will simply be ignored.
    		*/
    executor: js.Function3[
            /* resolve */ js.Function1[/* value */ js.UndefOr[ValueType | js.Thenable[ValueType]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            /* progress */ ProgressNotifier, 
            Unit
          ]) = this()
    
    /**
    	Accepts a function that gets `instance.progress` as an argument and is called for every progress event.
    	*/
    def onProgress(callback: ProgressNotifier): Unit = js.native
    
    /**
    	The current progress percentage of the promise as a number between 0 and 1.
    	*/
    val progress: Double = js.native
  }
  /* static members */
  object PProgress {
    
    @JSImport("p-progress", "PProgress")
    @js.native
    val ^ : js.Any = js.native
    
    // eslint-disable-line @typescript-eslint/naming-convention
    /**
    	Convenience method to run multiple promises and get a total progress of all of them. It counts normal promises with progress `0` when pending and progress `1` when resolved. For `PProgress` type promises, it listens to their `onProgress()` method for more fine grained progress reporting. You can mix and match normal promises and `PProgress` promises.
    	@param promises - Promises or promise-returning functions, similar to [p-all](https://github.com/sindresorhus/p-all).
    	@example
    	```
    	import pProgress, {PProgress} from 'p-progress';
    	import delay from 'delay';
    	const progressPromise = () => pProgress(async progress => {
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
    	allProgressPromise.onProgress(console.log);
    	//=> 0.0925
    	//=> 0.3425
    	//=> 0.5925
    	//=> 0.6025
    	//=> 0.7325
    	//=> 0.9825
    	//=> 1
    	await allProgressPromise;
    	```
    	*/
    inline def all[Promises /* <: js.Array[PromiseFactory[Any] | js.Thenable[Any]] */](
      promises: /* import warning: importer.ImportType#apply c repeated non-array type: Promises */ js.Array[Promises]
    ): PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]}
      */ typings.pProgress.pProgressStrings.all & TopLevel[Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]}
      */ typings.pProgress.pProgressStrings.all & TopLevel[Any]
      ]]
    inline def all[Promises /* <: js.Array[PromiseFactory[Any] | js.Thenable[Any]] */](
      promises: /* import warning: importer.ImportType#apply c repeated non-array type: Promises */ js.Array[Promises],
      options: Options
    ): PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]}
      */ typings.pProgress.pProgressStrings.all & TopLevel[Any]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]}
      */ typings.pProgress.pProgressStrings.all & TopLevel[Any]
      ]]
    inline def all[ReturnValue](promises: js.Iterable[PromiseFactory[ReturnValue] | js.Thenable[ReturnValue]]): PProgress[js.Iterable[ReturnValue]] = ^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any]).asInstanceOf[PProgress[js.Iterable[ReturnValue]]]
    inline def all[ReturnValue](promises: js.Iterable[PromiseFactory[ReturnValue] | js.Thenable[ReturnValue]], options: Options): PProgress[js.Iterable[ReturnValue]] = (^.asInstanceOf[js.Dynamic].applyDynamic("all")(promises.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PProgress[js.Iterable[ReturnValue]]]
    
    /**
    	Like [`Promise.allSettled`](https://developer.mozilla.org/en-US/docs/Web/JavaScript/Reference/Global_Objects/Promise/allSettled) but also exposes the total progress of all of the promises like `PProgress.all`.
    	@param promises - Promises or promise-returning functions, similar to [p-all](https://github.com/sindresorhus/p-all).
    	@example
    	```
    	import pProgress, {PProgress} from 'p-progress';
    	import delay from 'delay';
    	const progressPromise = () => pProgress(async progress => {
    		progress(0.14);
    		await delay(52);
    		progress(0.37);
    		await delay(104);
    		progress(0.41);
    		await delay(26);
    		progress(0.93);
    		await delay(55);
    		return 1;
    	});
    	const progressPromise2 = () => pProgress(async progress => {
    		progress(0.14);
    		await delay(52);
    		progress(0.37);
    		await delay(104);
    		progress(0.41);
    		await delay(26);
    		progress(0.93);
    		await delay(55);
    		throw new Error('Catch me if you can!');
    	});
    	const allProgressPromise = PProgress.allSettled([
    		progressPromise(),
    		progressPromise2()
    	]);
    	allProgressPromise.onProgress(console.log);
    	//=> 0.0925
    	//=> 0.3425
    	//=> 0.5925
    	//=> 0.6025
    	//=> 0.7325
    	//=> 0.9825
    	//=> 1
    	console.log(await allProgressPromise);
    	//=> [{status: 'fulfilled', value: 1}, {status: 'rejected', reason: Error: Catch me if you can!}]
    	```
    	*/
    inline def allSettled[Promises /* <: js.Array[PromiseFactory[Any] | js.Thenable[Any]] */](
      promises: /* import warning: importer.ImportType#apply c repeated non-array type: Promises */ js.Array[Promises]
    ): PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: p-progress.p-progress.PromiseSettledResult<Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]>}
      */ typings.pProgress.pProgressStrings.allSettled & TopLevel[Any]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(promises.asInstanceOf[js.Any]).asInstanceOf[PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: p-progress.p-progress.PromiseSettledResult<Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]>}
      */ typings.pProgress.pProgressStrings.allSettled & TopLevel[Any]
      ]]
    inline def allSettled[Promises /* <: js.Array[PromiseFactory[Any] | js.Thenable[Any]] */](
      promises: /* import warning: importer.ImportType#apply c repeated non-array type: Promises */ js.Array[Promises],
      options: Options
    ): PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: p-progress.p-progress.PromiseSettledResult<Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]>}
      */ typings.pProgress.pProgressStrings.allSettled & TopLevel[Any]
      ] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(promises.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PProgress[
        /* import warning: importer.ImportType#apply c Unsupported type mapping: 
    {[ Promise_ in keyof Promises ]: p-progress.p-progress.PromiseSettledResult<Promises[Promise_] extends std.PromiseLike<unknown>? p-progress.p-progress.Awaited<Promises[Promise_]> : Promises[Promise_] extends p-progress.p-progress.PromiseFactory<unknown>? p-progress.p-progress.Awaited<std.ReturnType<Promises[Promise_]>> : Promises[Promise_]>}
      */ typings.pProgress.pProgressStrings.allSettled & TopLevel[Any]
      ]]
    inline def allSettled[ReturnValue](promises: js.Iterable[PromiseFactory[ReturnValue] | js.Thenable[ReturnValue]]): PProgress[js.Iterable[PromiseSettledResult[ReturnValue]]] = ^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(promises.asInstanceOf[js.Any]).asInstanceOf[PProgress[js.Iterable[PromiseSettledResult[ReturnValue]]]]
    inline def allSettled[ReturnValue](promises: js.Iterable[PromiseFactory[ReturnValue] | js.Thenable[ReturnValue]], options: Options): PProgress[js.Iterable[PromiseSettledResult[ReturnValue]]] = (^.asInstanceOf[js.Dynamic].applyDynamic("allSettled")(promises.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[PProgress[js.Iterable[PromiseSettledResult[ReturnValue]]]]
  }
  
  type Awaited[ValueType] = ValueType
  
  trait Options extends StObject {
    
    /**
    	The number of concurrently pending promises. Minimum: `1`.
    	To run the promises in series, set it to `1`.
    	When this option is set, the first argument must be an array of promise-returning functions.
    	@default Infinity
    	*/
    val concurrency: Double
  }
  object Options {
    
    inline def apply(concurrency: Double): Options = {
      val __obj = js.Dynamic.literal(concurrency = concurrency.asInstanceOf[js.Any])
      __obj.asInstanceOf[Options]
    }
    
    extension [Self <: Options](x: Self) {
      
      inline def setConcurrency(value: Double): Self = StObject.set(x, "concurrency", value.asInstanceOf[js.Any])
    }
  }
  
  type ProgressNotifier = js.Function1[/* progress */ Double, Unit]
  
  type PromiseFactory[ValueType] = js.Function0[js.Thenable[ValueType]]
  
  /* Rewritten from type alias, can be one of: 
    - typings.pProgress.anon.Status[ResolveValueType]
    - typings.pProgress.anon.Reason
  */
  trait PromiseSettledResult[ResolveValueType] extends StObject
  object PromiseSettledResult {
    
    inline def Reason(reason: Any): typings.pProgress.anon.Reason = {
      val __obj = js.Dynamic.literal(reason = reason.asInstanceOf[js.Any], status = "rejected")
      __obj.asInstanceOf[typings.pProgress.anon.Reason]
    }
    
    inline def Status[ResolveValueType](value: ResolveValueType): typings.pProgress.anon.Status[ResolveValueType] = {
      val __obj = js.Dynamic.literal(status = "fulfilled", value = value.asInstanceOf[js.Any])
      __obj.asInstanceOf[typings.pProgress.anon.Status[ResolveValueType]]
    }
  }
}
