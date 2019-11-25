package typings.pDashEvent.pDashEventMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  /**
  		The number of times the event needs to be emitted before the promise resolves.
  		*/
  val count: Double
  /**
  		Whether to resolve the promise immediately. Emitting one of the `rejectionEvents` won't throw an error.
  		__Note__: The returned array will be mutated when an event is emitted.
  		@example
  		```
  		import pEvent = require('p-event');
  		const emitter = new EventEmitter();
  		const promise = pEvent.multiple(emitter, 'hello', {
  			resolveImmediately: true,
  			count: Infinity
  		});
  		const result = await promise;
  		console.log(result);
  		//=> []
  		emitter.emit('hello', 'Jack');
  		console.log(result);
  		//=> ['Jack']
  		emitter.emit('hello', 'Mark');
  		console.log(result);
  		//=> ['Jack', 'Mark']
  		// Stops listening
  		emitter.emit('error', new Error('😿'));
  		emitter.emit('hello', 'John');
  		console.log(result);
  		//=> ['Jack', 'Mark']
  		```
  		*/
  val resolveImmediately: js.UndefOr[Boolean] = js.undefined
}

object MultipleOptions {
  @scala.inline
  def apply[EmittedType /* <: js.Array[_] */](
    count: Double,
    filter: EmittedType => Boolean = null,
    multiArgs: js.UndefOr[Boolean] = js.undefined,
    rejectionEvents: js.Array[String | js.Symbol] = null,
    resolveImmediately: js.UndefOr[Boolean] = js.undefined,
    timeout: Int | Double = null
  ): MultipleOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    if (filter != null) __obj.updateDynamic("filter")(js.Any.fromFunction1(filter))
    if (!js.isUndefined(multiArgs)) __obj.updateDynamic("multiArgs")(multiArgs.asInstanceOf[js.Any])
    if (rejectionEvents != null) __obj.updateDynamic("rejectionEvents")(rejectionEvents.asInstanceOf[js.Any])
    if (!js.isUndefined(resolveImmediately)) __obj.updateDynamic("resolveImmediately")(resolveImmediately.asInstanceOf[js.Any])
    if (timeout != null) __obj.updateDynamic("timeout")(timeout.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOptions[EmittedType]]
  }
}

