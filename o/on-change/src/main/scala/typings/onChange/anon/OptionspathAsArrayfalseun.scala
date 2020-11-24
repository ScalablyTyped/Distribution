package typings.onChange.anon

import typings.onChange.onChangeBooleans.`false`
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/* Inlined on-change.on-change.Options & {  pathAsArray :false | undefined} */
@js.native
trait OptionspathAsArrayfalseun extends js.Object {
  
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
  var equals_FOptionspathAsArrayfalseun: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.native
  
  /**
  		Ignore changes to objects that become detached from the watched object.
  		@default false
  		*/
  var ignoreDetached: js.UndefOr[Boolean] = js.native
  
  /**
  		Setting properties in this array won't trigger the callback.
  		@default undefined
  		*/
  var ignoreKeys: js.UndefOr[js.Array[String | js.Symbol]] = js.native
  
  /**
  		Setting properties as `Symbol` won't trigger the callback.
  		@default false
  		*/
  var ignoreSymbols: js.UndefOr[Boolean] = js.native
  
  /**
  		Setting properties with an underscore as the first character won't trigger the callback.
  		@default false
  		*/
  var ignoreUnderscores: js.UndefOr[Boolean] = js.native
  
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
  var isShallow: js.UndefOr[Boolean] = js.native
  
  /**
  		The path will be provided as an array of keys instead of a delimited string.
  		@default false
  		*/
  var pathAsArray: js.UndefOr[Boolean] with js.UndefOr[`false`] = js.native
}
object OptionspathAsArrayfalseun {
  
  @scala.inline
  def apply(pathAsArray: js.UndefOr[Boolean] with js.UndefOr[`false`]): OptionspathAsArrayfalseun = {
    val __obj = js.Dynamic.literal(pathAsArray = pathAsArray.asInstanceOf[js.Any])
    __obj.asInstanceOf[OptionspathAsArrayfalseun]
  }
  
  @scala.inline
  implicit class OptionspathAsArrayfalseunOps[Self <: OptionspathAsArrayfalseun] (val x: Self) extends AnyVal {
    
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
    def setPathAsArray(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = this.set("pathAsArray", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setEquals(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = this.set("equals", js.Any.fromFunction2(value))
    
    @scala.inline
    def deleteEquals: Self = this.set("equals", js.undefined)
    
    @scala.inline
    def setIgnoreDetached(value: Boolean): Self = this.set("ignoreDetached", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreDetached: Self = this.set("ignoreDetached", js.undefined)
    
    @scala.inline
    def setIgnoreKeysVarargs(value: (String | js.Symbol)*): Self = this.set("ignoreKeys", js.Array(value :_*))
    
    @scala.inline
    def setIgnoreKeys(value: js.Array[String | js.Symbol]): Self = this.set("ignoreKeys", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreKeys: Self = this.set("ignoreKeys", js.undefined)
    
    @scala.inline
    def setIgnoreSymbols(value: Boolean): Self = this.set("ignoreSymbols", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreSymbols: Self = this.set("ignoreSymbols", js.undefined)
    
    @scala.inline
    def setIgnoreUnderscores(value: Boolean): Self = this.set("ignoreUnderscores", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIgnoreUnderscores: Self = this.set("ignoreUnderscores", js.undefined)
    
    @scala.inline
    def setIsShallow(value: Boolean): Self = this.set("isShallow", value.asInstanceOf[js.Any])
    
    @scala.inline
    def deleteIsShallow: Self = this.set("isShallow", js.undefined)
  }
}
