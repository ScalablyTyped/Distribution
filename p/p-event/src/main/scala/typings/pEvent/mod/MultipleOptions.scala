package typings.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait MultipleOptions[EmittedType /* <: js.Array[_] */] extends Options[EmittedType] {
  /**
  		The number of times the event needs to be emitted before the promise resolves.
  		*/
  val count: Double = js.native
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
  val resolveImmediately: js.UndefOr[Boolean] = js.native
}

object MultipleOptions {
  @scala.inline
  def apply[/* <: js.Array[_] */ EmittedType](count: Double): MultipleOptions[EmittedType] = {
    val __obj = js.Dynamic.literal(count = count.asInstanceOf[js.Any])
    __obj.asInstanceOf[MultipleOptions[EmittedType]]
  }
  @scala.inline
  implicit class MultipleOptionsOps[Self <: MultipleOptions[_], /* <: js.Array[_] */ EmittedType] (val x: Self with MultipleOptions[EmittedType]) extends AnyVal {
    @scala.inline
    def duplicate: Self = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x)).asInstanceOf[Self]
    @scala.inline
    def combineWith[Other <: js.Any](other: Other): Self with Other = (js.Dynamic.global.Object.assign(js.Dynamic.literal(), x, other.asInstanceOf[js.Any])).asInstanceOf[Self with Other]
    @scala.inline
    def set(key: String, value: js.Any): Self = {
        x.asInstanceOf[js.Dynamic].updateDynamic(key)(value)
        x
    }
    @scala.inline
    def setCount(value: Double): Self = this.set("count", value.asInstanceOf[js.Any])
    @scala.inline
    def setResolveImmediately(value: Boolean): Self = this.set("resolveImmediately", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteResolveImmediately: Self = this.set("resolveImmediately", js.undefined)
  }
  
}

