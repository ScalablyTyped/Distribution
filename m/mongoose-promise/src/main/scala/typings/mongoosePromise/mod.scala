package typings.mongoosePromise

import typings.mpromise.mod.^
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongoose", JSImport.Namespace)
@js.native
object mod extends js.Object {
  
  /*
    * mpromise definitions.
    * Callback signatures are from the mPromise type definitions.
    */
  @js.native
  /**
    * Promise constructor.
    * Promises are returned from executed queries.
    * @param fn a function which will be called when the promise
    *   is resolved that accepts fn(err, ...){} as signature
    * @event err Emits when the promise is rejected
    * @event complete Emits when the promise is fulfilled
    * @deprecated Mongoose 5.0 will use native promises by default (or bluebird, if native
    *   promises are not present) but still support plugging in your own ES6-compatible
    *   promises library. Mongoose 5.0 will not support mpromise.
    */
  class MongoosePromise[T] ()
    extends ^[T, js.Any] {
    def this(fn: js.Function2[/* err */ js.Any, /* repeated */ T, Unit]) = this()
    
    /**
      * Adds a single function as a listener to both err and complete.
      * It will be executed with traditional node.js argument position when the promise is resolved.
      * @deprecated Use onResolve instead.
      */
    def addBack(listener: js.Function2[/* err */ js.Any, /* repeated */ T, Unit]): this.type = js.native
    
    /**
      * Adds a listener to the complete (success) event.
      * @deprecated Adds a listener to the complete (success) event.
      */
    def addCallback(listener: js.Function1[/* repeated */ T, Unit]): this.type = js.native
    
    /**
      * Adds a listener to the err (rejected) event.
      * @deprecated Use onReject instead.
      */
    def addErrback(listener: js.Function1[/* err */ js.Any, Unit]): this.type = js.native
    
    /** ES6-style .catch() shorthand */
    def `catch`[TRes](): MongoosePromise[TRes] = js.native
    def `catch`[TRes](onReject: js.Function1[/* err */ js.Any, Unit | TRes | js.Thenable[TRes]]): MongoosePromise[TRes] = js.native
    
    /**
      * Fulfills this promise with passed arguments. Alias of mpromise#fulfill.
      * @deprecated Use fulfill instead.
      */
    def complete(args: T*): this.type = js.native
    
    /**
      * Rejects this promise with err.
      * If the promise has already been fulfilled or rejected, not action is taken.
      * Differs from #reject by first casting err to an Error if it is not instanceof Error.
      */
    def error(err: js.Any): this.type = js.native
    
    /**
      * Adds listener to the event.
      * If event is either the success or failure event and the event has already been emitted,
      * thelistener is called immediately and passed the results of the original emitted event.
      */
    def on(event: String, listener: js.Function): this.type = js.native
    
    def resolve(err: js.UndefOr[scala.Nothing], args: T*): this.type = js.native
  }
  /* static members */
  @js.native
  object MongoosePromise extends js.Object {
    
    /** ES6-style promise constructor wrapper around mpromise. */
    def ES6[TRes](
      resolver: js.Function2[
          /* complete */ js.Function1[/* repeated */ TRes, Unit | TRes | js.Thenable[TRes]], 
          /* error */ js.Function1[/* e */ js.Any, Unit | TRes | js.Thenable[TRes]], 
          Unit
        ]
    ): MongoosePromise[TRes] = js.native
  }
  
  type Promise[T] = MongoosePromise[T]
}
