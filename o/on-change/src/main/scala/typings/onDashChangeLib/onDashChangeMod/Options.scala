package typings
package onDashChangeLib.onDashChangeMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		Deep changes will not trigger the callback. Only changes to the immediate properties of the original object.
  		@default false
  		@example
  		```
  		import onChange = require('on-change');
  		const object = {
  			a: {
  				b: false
  			}
  		};
  		let i = 0;
  		const watchedObject = onChange(object, () => {
  			console.log('Object changed:', ++i);
  		}, {isShallow: true});
  		watchedObject.a.b = true;
  		// Nothing happens
  		watchedObject.a = true;
  		//=> 'Object changed: 1'
  		```
  		*/
  val isShallow: js.UndefOr[scala.Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(isShallow: js.UndefOr[scala.Boolean] = js.undefined): Options = {
    val __obj = js.Dynamic.literal()
    if (!js.isUndefined(isShallow)) __obj.updateDynamic("isShallow")(isShallow)
    __obj.asInstanceOf[Options]
  }
}

