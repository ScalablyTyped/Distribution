package typings.onChange.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Options extends js.Object {
  /**
  		The function receives two arguments to be compared for equality. Should return `true` if the two values are determined to be equal.
  		@default Object.is
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
  		}, {equals: (a, b) => a === b});
  		watchedObject.a.b = 0;
  		// Nothing happens
  		watchedObject.a = true;
  		//=> 'Object changed: 1'
  		```
  		*/
  @JSName("equals")
  var equals_FOptions: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.undefined
  /**
  		Setting properties in this array won't trigger the callback.
  		@default undefined
  		*/
  var ignoreKeys: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
  /**
  		Setting properties as `Symbol` won't trigger the callback.
  		@default false
  		*/
  var ignoreSymbols: js.UndefOr[Boolean] = js.undefined
  /**
  		Setting properties with an underscore as the first character won't trigger the callback.
  		@default false
  		*/
  var ignoreUnderscores: js.UndefOr[Boolean] = js.undefined
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
  var isShallow: js.UndefOr[Boolean] = js.undefined
}

object Options {
  @scala.inline
  def apply(
    equals: (/* a */ js.Any, /* b */ js.Any) => Boolean = null,
    ignoreKeys: js.Array[String | js.Symbol] = null,
    ignoreSymbols: js.UndefOr[Boolean] = js.undefined,
    ignoreUnderscores: js.UndefOr[Boolean] = js.undefined,
    isShallow: js.UndefOr[Boolean] = js.undefined
  ): Options = {
    val __obj = js.Dynamic.literal()
    if (equals != null) __obj.updateDynamic("equals")(js.Any.fromFunction2(equals))
    if (ignoreKeys != null) __obj.updateDynamic("ignoreKeys")(ignoreKeys.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreSymbols)) __obj.updateDynamic("ignoreSymbols")(ignoreSymbols.asInstanceOf[js.Any])
    if (!js.isUndefined(ignoreUnderscores)) __obj.updateDynamic("ignoreUnderscores")(ignoreUnderscores.asInstanceOf[js.Any])
    if (!js.isUndefined(isShallow)) __obj.updateDynamic("isShallow")(isShallow.asInstanceOf[js.Any])
    __obj.asInstanceOf[Options]
  }
}

