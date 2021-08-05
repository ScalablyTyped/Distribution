package typings.pWaterfall

import typings.std.Iterable
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  inline def apply(tasks: Iterable[Task[js.Any, js.Any]]): js.Promise[js.Any] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[js.Any]]
  inline def apply(tasks: Iterable[Task[js.Any, js.Any]], initialValue: js.Any): js.Promise[js.Any] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[js.Any]]
  /**
  	Run promise-returning & async functions in series, each passing its result to the next.
  	@param tasks - Functions are expected to return a value. If a `Promise` is returned, it's awaited before continuing with the next task.
  	@param initialValue - Value to use as `previousValue` in the first task.
  	@returns Resolves when all promises returned from calling the functions in `tasks` are fulfilled, or rejects if any of the promises reject. The fulfilled value is the value returned from the last task.
  	@example
  	```
  	import pWaterfall = require('p-waterfall');
  	(async () => {
  		const tasks = [
  			initialValue => getEmoji(initialValue),
  			previousValue => `I ❤️ ${previousValue}`
  		];
  		console.log(await pWaterfall(tasks, 'unicorn'));
  		//=> 'I ❤️ 🦄'
  	})();
  	```
  	*/
  inline def apply[ReturnType](tasks: js.Array[InitialTask[ReturnType]]): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ReturnType](tasks: js.Array[Task[ValueType1, ReturnType]], initialValue: ValueType1): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ReturnType](tasks: js.Tuple2[InitialTask[ValueType1], Task[ValueType1, ReturnType]]): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ReturnType](
    tasks: js.Tuple2[Task[ValueType1, ValueType2], Task[ValueType2, ReturnType]],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ReturnType](
    tasks: js.Tuple3[InitialTask[ValueType1], Task[ValueType1, ValueType2], Task[ValueType2, ReturnType]]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ReturnType](
    tasks: js.Tuple3[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ReturnType](
    tasks: js.Tuple4[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ReturnType](
    tasks: js.Tuple4[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ReturnType](
    tasks: js.Tuple5[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ReturnType](
    tasks: js.Tuple5[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ReturnType](
    tasks: js.Tuple6[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ReturnType](
    tasks: js.Tuple6[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ReturnType](
    tasks: js.Tuple7[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ReturnType](
    tasks: js.Tuple7[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ValueType7], 
      Task[ValueType7, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ReturnType](
    tasks: js.Tuple8[
      InitialTask[ValueType1], 
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ValueType7], 
      Task[ValueType7, ReturnType]
    ]
  ): js.Promise[ReturnType] = ^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any]).asInstanceOf[js.Promise[ReturnType]]
  inline def apply[ValueType1, ValueType2, ValueType3, ValueType4, ValueType5, ValueType6, ValueType7, ValueType8, ReturnType](
    tasks: js.Tuple8[
      Task[ValueType1, ValueType2], 
      Task[ValueType2, ValueType3], 
      Task[ValueType3, ValueType4], 
      Task[ValueType4, ValueType5], 
      Task[ValueType5, ValueType6], 
      Task[ValueType6, ValueType7], 
      Task[ValueType7, ValueType8], 
      Task[ValueType8, ReturnType]
    ],
    initialValue: ValueType1
  ): js.Promise[ReturnType] = (^.asInstanceOf[js.Dynamic].apply(tasks.asInstanceOf[js.Any], initialValue.asInstanceOf[js.Any])).asInstanceOf[js.Promise[ReturnType]]
  
  @JSImport("p-waterfall", JSImport.Namespace)
  @js.native
  val ^ : js.Any = js.native
  
  // TODO: Remove this for the next major release
  @JSImport("p-waterfall", "default")
  @js.native
  def default: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pWaterfall */ js.Any = js.native
  inline def default_=(x: /* import warning: ResolveTypeQueries.resolve Couldn't resolve typeof pWaterfall */ js.Any): Unit = ^.asInstanceOf[js.Dynamic].updateDynamic("default")(x.asInstanceOf[js.Any])
  
  type InitialTask[ReturnType] = js.Function0[ReturnType | js.Thenable[ReturnType]]
  
  type Task[ValueType, ReturnType] = js.Function1[/* previousValue */ ValueType, ReturnType | js.Thenable[ReturnType]]
}
