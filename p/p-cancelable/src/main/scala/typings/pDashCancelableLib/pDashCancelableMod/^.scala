package typings
package pDashCancelableLib.pDashCancelableMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-cancelable", JSImport.Namespace)
@js.native
class ^[ValueType] protected () extends PCancelable[ValueType] {
  /**
  	Create a promise that can be canceled.
  	Can be constructed in the same was as a [`Promise` constructor](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise), but with an appended `onCancel` parameter in `executor`. `PCancelable` is a subclass of `Promise`.
  	Cancelling will reject the promise with `CancelError`. To avoid that, set `onCancel.shouldReject` to `false`.
  	@example
  	```
  	import PCancelable = require('p-cancelable');
  	const cancelablePromise = new PCancelable((resolve, reject, onCancel) => {
  		const job = new Job();
  		onCancel.shouldReject = false;
  		onCancel(() => {
  			job.stop();
  		});
  		job.on('finish', resolve);
  	});
  	cancelablePromise.cancel(); // Doesn't throw an error
  	```
  	*/
  def this(executor: js.Function3[
      /* resolve */ js.Function1[/* value */ js.UndefOr[ValueType | js.Thenable[ValueType]], scala.Unit], 
      /* reject */ js.Function1[/* reason */ js.UndefOr[js.Any], scala.Unit], 
      /* onCancel */ OnCancelFunction, 
      scala.Unit
    ]) = this()
}

@JSImport("p-cancelable", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  /**
  	Rejection reason when `.cancel()` is called.
  	It includes a `.isCanceled` property for convenience.
  	*/
  var CancelError: org.scalablytyped.runtime.Instantiable1[js.UndefOr[/* reason */ java.lang.String], CancelErrorClass] = js.native
  def fn[ReturnType](userFn: js.Function1[/* repeated */ js.Any, js.Thenable[ReturnType]]): js.Function1[/* repeated */ js.Any, PCancelable[ReturnType]] = js.native
  def fn[Agument1Type, ReturnType](
    userFn: js.Function2[
      /* argument1 */ Agument1Type, 
      /* onCancel */ OnCancelFunction, 
      js.Thenable[ReturnType]
    ]
  ): js.Function1[/* argument1 */ Agument1Type, PCancelable[ReturnType]] = js.native
  def fn[Agument1Type, Agument2Type, ReturnType](
    userFn: js.Function3[
      /* argument1 */ Agument1Type, 
      /* argument2 */ Agument2Type, 
      /* onCancel */ OnCancelFunction, 
      js.Thenable[ReturnType]
    ]
  ): js.Function2[/* argument1 */ Agument1Type, /* argument2 */ Agument2Type, PCancelable[ReturnType]] = js.native
  def fn[Agument1Type, Agument2Type, Agument3Type, ReturnType](
    userFn: js.Function4[
      /* argument1 */ Agument1Type, 
      /* argument2 */ Agument2Type, 
      /* argument3 */ Agument3Type, 
      /* onCancel */ OnCancelFunction, 
      js.Thenable[ReturnType]
    ]
  ): js.Function3[
    /* argument1 */ Agument1Type, 
    /* argument2 */ Agument2Type, 
    /* argument3 */ Agument3Type, 
    PCancelable[ReturnType]
  ] = js.native
  def fn[Agument1Type, Agument2Type, Agument3Type, Agument4Type, ReturnType](
    userFn: js.Function5[
      /* argument1 */ Agument1Type, 
      /* argument2 */ Agument2Type, 
      /* argument3 */ Agument3Type, 
      /* argument4 */ Agument4Type, 
      /* onCancel */ OnCancelFunction, 
      js.Thenable[ReturnType]
    ]
  ): js.Function4[
    /* argument1 */ Agument1Type, 
    /* argument2 */ Agument2Type, 
    /* argument3 */ Agument3Type, 
    /* argument4 */ Agument4Type, 
    PCancelable[ReturnType]
  ] = js.native
  def fn[Agument1Type, Agument2Type, Agument3Type, Agument4Type, Agument5Type, ReturnType](
    userFn: js.Function6[
      /* argument1 */ Agument1Type, 
      /* argument2 */ Agument2Type, 
      /* argument3 */ Agument3Type, 
      /* argument4 */ Agument4Type, 
      /* argument5 */ Agument5Type, 
      /* onCancel */ OnCancelFunction, 
      js.Thenable[ReturnType]
    ]
  ): js.Function5[
    /* argument1 */ Agument1Type, 
    /* argument2 */ Agument2Type, 
    /* argument3 */ Agument3Type, 
    /* argument4 */ Agument4Type, 
    /* argument5 */ Agument5Type, 
    PCancelable[ReturnType]
  ] = js.native
  /**
  	Convenience method to make your promise-returning or async function cancelable.
  	@param fn - A promise-returning function. The function you specify will have `onCancel` appended to its parameters.
  	@example
  	```
  	import PCancelable = require('p-cancelable');
  	const fn = PCancelable.fn((input, onCancel) => {
  		const job = new Job();
  		onCancel(() => {
  			job.cleanup();
  		});
  		return job.start(); //=> Promise
  	});
  	const cancelablePromise = fn('input'); //=> PCancelable
  	// …
  	cancelablePromise.cancel();
  	```
  	*/
  @JSName("fn")
  def fn_ReturnTypeFunction0[ReturnType](userFn: js.Function1[/* onCancel */ OnCancelFunction, js.Thenable[ReturnType]]): js.Function0[PCancelable[ReturnType]] = js.native
}

