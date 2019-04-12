package typings
package pDashForeverLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait Anon_DefaultEnd extends js.Object {
  // TODO: Remove this for the next major release
  @JSName("default")
  var default_Original: Anon_Default = js.native
  /**
  	Symbol used to end the loop.
  	*/
  val end: js.Symbol = js.native
  /**
  	Run promise-returning & async functions until you end it.
  	@param fn - Receives the previously returned value. If a `Promise` is returned, it's awaited before calling `fn` again.
  	@param initialValue - Initial value to pass to `fn`.
  	@returns Fulfills when `fn` returns `pForever.end`, or rejects if any of the promises returned from `fn` rejects.
  	@example
  	```
  	import pForever = require('p-forever');
  	pForever(async i => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  		return i;
  	}, 0);
  	// or
  	let i = 0;
  	pForever(async () => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  	});
  	```
  	*/
  def apply[ValueType](
    fn: js.Function1[
      /* previousValue */ js.UndefOr[ValueType], 
      ValueType | js.Thenable[ValueType] | js.Symbol
    ]
  ): js.Promise[scala.Unit] = js.native
  def apply[ValueType](
    fn: js.Function1[/* previousValue */ ValueType, ValueType | js.Thenable[ValueType] | js.Symbol],
    initialValue: ValueType
  ): js.Promise[scala.Unit] = js.native
  def apply[ValueType](
    fn: js.Function1[/* previousValue */ ValueType, ValueType | js.Thenable[ValueType] | js.Symbol],
    initialValue: js.Thenable[ValueType]
  ): js.Promise[scala.Unit] = js.native
  /**
  	Run promise-returning & async functions until you end it.
  	@param fn - Receives the previously returned value. If a `Promise` is returned, it's awaited before calling `fn` again.
  	@param initialValue - Initial value to pass to `fn`.
  	@returns Fulfills when `fn` returns `pForever.end`, or rejects if any of the promises returned from `fn` rejects.
  	@example
  	```
  	import pForever = require('p-forever');
  	pForever(async i => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  		return i;
  	}, 0);
  	// or
  	let i = 0;
  	pForever(async () => {
  		i++;
  		if (i > 100) {
  			return pForever.end;
  		}
  		await createFixture(i);
  	});
  	```
  	*/
  // TODO: Remove this for the next major release
  def default[ValueType](
    fn: js.Function1[
      /* previousValue */ js.UndefOr[ValueType], 
      ValueType | js.Thenable[ValueType] | (/* import warning: ImportType.apply Failed type conversion: typeof pForever.end */ js.Any)
    ]
  ): js.Promise[scala.Unit] = js.native
  // TODO: Remove this for the next major release
  def default[ValueType](
    fn: js.Function1[
      /* previousValue */ ValueType, 
      ValueType | js.Thenable[ValueType] | (/* import warning: ImportType.apply Failed type conversion: typeof pForever.end */ js.Any)
    ],
    initialValue: ValueType
  ): js.Promise[scala.Unit] = js.native
  def default[ValueType](
    fn: js.Function1[
      /* previousValue */ ValueType, 
      ValueType | js.Thenable[ValueType] | (/* import warning: ImportType.apply Failed type conversion: typeof pForever.end */ js.Any)
    ],
    initialValue: js.Thenable[ValueType]
  ): js.Promise[scala.Unit] = js.native
}

