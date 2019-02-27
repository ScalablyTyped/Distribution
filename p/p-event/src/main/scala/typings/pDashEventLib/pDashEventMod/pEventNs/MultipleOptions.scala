package typings
package pDashEventLib.pDashEventMod.pEventNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait MultipleOptions[T] extends Options[T] {
  /**
    * The number of times the event needs to be emitted before the promise resolves.
    */
  var count: scala.Double
  /**
    * Whether to resolve the promise immediately. Emitting one of the `rejectionEvents` won't throw an error.
    *
    * **Note**: The returned array will be mutated when an event is emitted.
    *
    * @example
    * const emitter = new EventEmitter();
    *
    * const promise = pEvent.multiple(emitter, 'hello', {
    *     resolveImmediately: true,
    *     count: Infinity
    * });
    *
    * const result = await promise;
    * console.log(result);
    * //=> []
    *
    * emitter.emit('hello', 'Jack');
    * console.log(result);
    * //=> ['Jack']
    *
    * emitter.emit('hello', 'Mark');
    * console.log(result);
    * //=> ['Jack', 'Mark']
    *
    * // Stops listening
    * emitter.emit('error', new Error('😿'));
    *
    * emitter.emit('hello', 'John');
    * console.log(result);
    * //=> ['Jack', 'Mark']
    */
  var resolveImmediately: js.UndefOr[scala.Boolean] = js.undefined
}

