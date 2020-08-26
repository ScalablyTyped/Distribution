package typings.pEvent.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Options[EmittedType /* <: js.Array[_] */] extends js.Object {
  /**
  		Filter function for accepting an event.
  		@example
  		```
  		import pEvent = require('p-event');
  		import emitter from './some-event-emitter';
  		(async () => {
  			const result = await pEvent(emitter, '🦄', value => value > 3);
  			// Do something with first 🦄 event with a value greater than 3
  		})();
  		```
  		*/
  val filter: js.UndefOr[FilterFunction[EmittedType]] = js.native
  /**
  		By default, the promisified function will only return the first argument from the event callback, which works fine for most APIs. This option can be useful for APIs that return multiple arguments in the callback. Turning this on will make it return an array of all arguments from the callback, instead of just the first argument. This also applies to rejections.
  		@default false
  		@example
  		```
  		import pEvent = require('p-event');
  		import emitter from './some-event-emitter';
  		(async () => {
  			const [foo, bar] = await pEvent(emitter, 'finish', {multiArgs: true});
  		})();
  		```
  		*/
  val multiArgs: js.UndefOr[Boolean] = js.native
  /**
  		Events that will reject the promise.
  		@default ['error']
  		*/
  val rejectionEvents: js.UndefOr[js.Array[String | js.Symbol]] = js.native
  /**
  		Time in milliseconds before timing out.
  		@default Infinity
  		*/
  val timeout: js.UndefOr[Double] = js.native
}

object Options {
  @scala.inline
  def apply[/* <: js.Array[_] */ EmittedType](): Options[EmittedType] = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Options[EmittedType]]
  }
  @scala.inline
  implicit class OptionsOps[Self <: Options[_], /* <: js.Array[_] */ EmittedType] (val x: Self with Options[EmittedType]) extends AnyVal {
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
    def setFilter(value: EmittedType => Boolean): Self = this.set("filter", js.Any.fromFunction1(value))
    @scala.inline
    def deleteFilter: Self = this.set("filter", js.undefined)
    @scala.inline
    def setMultiArgs(value: Boolean): Self = this.set("multiArgs", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteMultiArgs: Self = this.set("multiArgs", js.undefined)
    @scala.inline
    def setRejectionEventsVarargs(value: (String | js.Symbol)*): Self = this.set("rejectionEvents", js.Array(value :_*))
    @scala.inline
    def setRejectionEvents(value: js.Array[String | js.Symbol]): Self = this.set("rejectionEvents", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteRejectionEvents: Self = this.set("rejectionEvents", js.undefined)
    @scala.inline
    def setTimeout(value: Double): Self = this.set("timeout", value.asInstanceOf[js.Any])
    @scala.inline
    def deleteTimeout: Self = this.set("timeout", js.undefined)
  }
  
}

