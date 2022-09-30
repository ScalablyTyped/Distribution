package typings.pCancelable

import typings.pCancelable.pCancelableBooleans.`true`
import typings.std.Error
import typings.std.Promise
import typings.std.PromiseLike
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  @JSImport("p-cancelable", JSImport.Default)
  @js.native
  open class default[ValueType] protected ()
    extends StObject
       with PCancelable[ValueType] {
    /**
    	Create a promise that can be canceled.
    	Can be constructed in the same was as a [`Promise` constructor](https://developer.mozilla.org/en/docs/Web/JavaScript/Reference/Global_Objects/Promise), but with an appended `onCancel` parameter in `executor`. `PCancelable` is a subclass of `Promise`.
    	Cancelling will reject the promise with `CancelError`. To avoid that, set `onCancel.shouldReject` to `false`.
    	@example
    	```
    	import PCancelable from 'p-cancelable';
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
            /* resolve */ js.Function1[/* value */ js.UndefOr[ValueType | PromiseLike[ValueType]], Unit], 
            /* reject */ js.Function1[/* reason */ js.UndefOr[Any], Unit], 
            /* onCancel */ OnCancelFunction, 
            Unit
          ]) = this()
  }
  /* static members */
  object default {
    
    @JSImport("p-cancelable", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	Convenience method to make your promise-returning or async function cancelable.
    	@param fn - A promise-returning function. The function you specify will have `onCancel` appended to its parameters.
    	@example
    	```
    	import PCancelable from 'p-cancelable';
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
    inline def fn[ReturnType](userFn: js.Function1[/* onCancel */ OnCancelFunction, PromiseLike[ReturnType]]): js.Function0[PCancelable[ReturnType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(userFn.asInstanceOf[js.Any]).asInstanceOf[js.Function0[PCancelable[ReturnType]]]
    inline def fn[Agument1Type, ReturnType](
      userFn: js.Function2[
          /* argument1 */ Agument1Type, 
          /* onCancel */ OnCancelFunction, 
          PromiseLike[ReturnType]
        ]
    ): js.Function1[/* argument1 */ Agument1Type, PCancelable[ReturnType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(userFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* argument1 */ Agument1Type, PCancelable[ReturnType]]]
    inline def fn[Agument1Type, Agument2Type, ReturnType](
      userFn: js.Function3[
          /* argument1 */ Agument1Type, 
          /* argument2 */ Agument2Type, 
          /* onCancel */ OnCancelFunction, 
          PromiseLike[ReturnType]
        ]
    ): js.Function2[/* argument1 */ Agument1Type, /* argument2 */ Agument2Type, PCancelable[ReturnType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(userFn.asInstanceOf[js.Any]).asInstanceOf[js.Function2[/* argument1 */ Agument1Type, /* argument2 */ Agument2Type, PCancelable[ReturnType]]]
    inline def fn[Agument1Type, Agument2Type, Agument3Type, ReturnType](
      userFn: js.Function4[
          /* argument1 */ Agument1Type, 
          /* argument2 */ Agument2Type, 
          /* argument3 */ Agument3Type, 
          /* onCancel */ OnCancelFunction, 
          PromiseLike[ReturnType]
        ]
    ): js.Function3[
        /* argument1 */ Agument1Type, 
        /* argument2 */ Agument2Type, 
        /* argument3 */ Agument3Type, 
        PCancelable[ReturnType]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(userFn.asInstanceOf[js.Any]).asInstanceOf[js.Function3[
        /* argument1 */ Agument1Type, 
        /* argument2 */ Agument2Type, 
        /* argument3 */ Agument3Type, 
        PCancelable[ReturnType]
      ]]
    inline def fn[Agument1Type, Agument2Type, Agument3Type, Agument4Type, ReturnType](
      userFn: js.Function5[
          /* argument1 */ Agument1Type, 
          /* argument2 */ Agument2Type, 
          /* argument3 */ Agument3Type, 
          /* argument4 */ Agument4Type, 
          /* onCancel */ OnCancelFunction, 
          PromiseLike[ReturnType]
        ]
    ): js.Function4[
        /* argument1 */ Agument1Type, 
        /* argument2 */ Agument2Type, 
        /* argument3 */ Agument3Type, 
        /* argument4 */ Agument4Type, 
        PCancelable[ReturnType]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(userFn.asInstanceOf[js.Any]).asInstanceOf[js.Function4[
        /* argument1 */ Agument1Type, 
        /* argument2 */ Agument2Type, 
        /* argument3 */ Agument3Type, 
        /* argument4 */ Agument4Type, 
        PCancelable[ReturnType]
      ]]
    inline def fn[Agument1Type, Agument2Type, Agument3Type, Agument4Type, Agument5Type, ReturnType](
      userFn: js.Function6[
          /* argument1 */ Agument1Type, 
          /* argument2 */ Agument2Type, 
          /* argument3 */ Agument3Type, 
          /* argument4 */ Agument4Type, 
          /* argument5 */ Agument5Type, 
          /* onCancel */ OnCancelFunction, 
          PromiseLike[ReturnType]
        ]
    ): js.Function5[
        /* argument1 */ Agument1Type, 
        /* argument2 */ Agument2Type, 
        /* argument3 */ Agument3Type, 
        /* argument4 */ Agument4Type, 
        /* argument5 */ Agument5Type, 
        PCancelable[ReturnType]
      ] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(userFn.asInstanceOf[js.Any]).asInstanceOf[js.Function5[
        /* argument1 */ Agument1Type, 
        /* argument2 */ Agument2Type, 
        /* argument3 */ Agument3Type, 
        /* argument4 */ Agument4Type, 
        /* argument5 */ Agument5Type, 
        PCancelable[ReturnType]
      ]]
    
    inline def fn_ReturnType_Function1[ReturnType](userFn: js.Function1[/* repeated */ Any, PromiseLike[ReturnType]]): js.Function1[/* repeated */ Any, PCancelable[ReturnType]] = ^.asInstanceOf[js.Dynamic].applyDynamic("fn")(userFn.asInstanceOf[js.Any]).asInstanceOf[js.Function1[/* repeated */ Any, PCancelable[ReturnType]]]
  }
  
  @JSImport("p-cancelable", "CancelError")
  @js.native
  open class CancelError ()
    extends StObject
       with Error {
    def this(reason: String) = this()
    
    val isCanceled: `true` = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var message: String = js.native
    
    /* standard es5 */
    /* CompleteClass */
    var name: String = js.native
    @JSName("name")
    val name_CancelError: typings.pCancelable.pCancelableStrings.CancelError = js.native
  }
  
  @js.native
  trait OnCancelFunction extends StObject {
    
    def apply(cancelHandler: js.Function0[Unit]): Unit = js.native
    
    var shouldReject: Boolean = js.native
  }
  
  @js.native
  trait PCancelable[ValueType]
    extends StObject
       with Promise[ValueType] {
    
    /**
    	Cancel the promise and optionally provide a reason.
    	The cancellation is synchronous. Calling it after the promise has settled or multiple times does nothing.
    	@param reason - The cancellation reason to reject the promise with.
    	*/
    def cancel(): Unit = js.native
    def cancel(reason: String): Unit = js.native
    
    /**
    	Whether the promise is canceled.
    	*/
    val isCanceled: Boolean = js.native
  }
}
