package typings.onChange

import typings.onChange.onChangeBooleans.`false`
import typings.onChange.onChangeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined on-change.on-change.Options & {  pathAsArray :false | undefined} */
  @js.native
  trait OptionspathAsArrayfalseun extends StObject {
    
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
    implicit class OptionspathAsArrayfalseunMutableBuilder[Self <: OptionspathAsArrayfalseun] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setIgnoreDetached(value: Boolean): Self = StObject.set(x, "ignoreDetached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDetachedUndefined: Self = StObject.set(x, "ignoreDetached", js.undefined)
      
      @scala.inline
      def setIgnoreKeys(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "ignoreKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreKeysUndefined: Self = StObject.set(x, "ignoreKeys", js.undefined)
      
      @scala.inline
      def setIgnoreKeysVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "ignoreKeys", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreSymbols(value: Boolean): Self = StObject.set(x, "ignoreSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSymbolsUndefined: Self = StObject.set(x, "ignoreSymbols", js.undefined)
      
      @scala.inline
      def setIgnoreUnderscores(value: Boolean): Self = StObject.set(x, "ignoreUnderscores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUnderscoresUndefined: Self = StObject.set(x, "ignoreUnderscores", js.undefined)
      
      @scala.inline
      def setIsShallow(value: Boolean): Self = StObject.set(x, "isShallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsShallowUndefined: Self = StObject.set(x, "isShallow", js.undefined)
      
      @scala.inline
      def setPathAsArray(value: js.UndefOr[Boolean] with js.UndefOr[`false`]): Self = StObject.set(x, "pathAsArray", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined on-change.on-change.Options & {  pathAsArray :true} */
  @js.native
  trait OptionspathAsArraytrue extends StObject {
    
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
    var equals_FOptionspathAsArraytrue: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.native
    
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
    var pathAsArray: js.UndefOr[Boolean] with `true` = js.native
  }
  object OptionspathAsArraytrue {
    
    @scala.inline
    def apply(pathAsArray: js.UndefOr[Boolean] with `true`): OptionspathAsArraytrue = {
      val __obj = js.Dynamic.literal(pathAsArray = pathAsArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionspathAsArraytrue]
    }
    
    @scala.inline
    implicit class OptionspathAsArraytrueMutableBuilder[Self <: OptionspathAsArraytrue] (val x: Self) extends AnyVal {
      
      @scala.inline
      def setEquals_(value: (/* a */ js.Any, /* b */ js.Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      @scala.inline
      def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      @scala.inline
      def setIgnoreDetached(value: Boolean): Self = StObject.set(x, "ignoreDetached", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreDetachedUndefined: Self = StObject.set(x, "ignoreDetached", js.undefined)
      
      @scala.inline
      def setIgnoreKeys(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "ignoreKeys", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreKeysUndefined: Self = StObject.set(x, "ignoreKeys", js.undefined)
      
      @scala.inline
      def setIgnoreKeysVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "ignoreKeys", js.Array(value :_*))
      
      @scala.inline
      def setIgnoreSymbols(value: Boolean): Self = StObject.set(x, "ignoreSymbols", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreSymbolsUndefined: Self = StObject.set(x, "ignoreSymbols", js.undefined)
      
      @scala.inline
      def setIgnoreUnderscores(value: Boolean): Self = StObject.set(x, "ignoreUnderscores", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIgnoreUnderscoresUndefined: Self = StObject.set(x, "ignoreUnderscores", js.undefined)
      
      @scala.inline
      def setIsShallow(value: Boolean): Self = StObject.set(x, "isShallow", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setIsShallowUndefined: Self = StObject.set(x, "isShallow", js.undefined)
      
      @scala.inline
      def setPathAsArray(value: js.UndefOr[Boolean] with `true`): Self = StObject.set(x, "pathAsArray", value.asInstanceOf[js.Any])
    }
  }
}
