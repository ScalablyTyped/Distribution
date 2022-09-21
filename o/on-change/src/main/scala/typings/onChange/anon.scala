package typings.onChange

import typings.onChange.mod.ApplyData
import typings.onChange.onChangeBooleans.`false`
import typings.onChange.onChangeBooleans.`true`
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object anon {
  
  /* Inlined on-change.on-change.Options & {  pathAsArray :false | undefined} */
  trait OptionspathAsArrayfalseun extends StObject {
    
    /**
    	Trigger callbacks for each change within specified method calls or all method calls.
    	@default false
    	 */
    val details: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
    	The function receives two arguments to be compared for equality. Should return `true` if the two values are determined to be equal.
    	@default Object.is
    	@example
    	 ```
    	import onChange from 'on-change';
    	const object = {
    		a: {
    			b: false
    		}
    	};
    	let index = 0;
    	const watchedObject = onChange(object, () => {
    		console.log('Object changed:', ++index);
    	}, {equals: (a, b) => a === b});
    	watchedObject.a.b = 0;
    	// Nothing happens
    	watchedObject.a = true;
    	//=> 'Object changed: 1'
    	```
    	*/
    @JSName("equals")
    var equals_FOptionspathAsArrayfalseun: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Boolean]] = js.undefined
    
    /**
    	Ignore changes to objects that become detached from the watched object.
    	@default false
    	*/
    val ignoreDetached: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Setting properties in this array won't trigger the callback.
    	@default undefined
    	*/
    val ignoreKeys: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
    
    /**
    	Setting properties as `Symbol` won't trigger the callback.
    	@default false
    	*/
    val ignoreSymbols: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Setting properties with an underscore as the first character won't trigger the callback.
    	@default false
    	*/
    val ignoreUnderscores: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Deep changes will not trigger the callback. Only changes to the immediate properties of the original object.
    	@default false
    	@example
    	```
    	import onChange from 'on-change';
    	const object = {
    		a: {
    			b: false
    		}
    	};
    	let index = 0;
    	const watchedObject = onChange(object, () => {
    		console.log('Object changed:', ++index);
    	}, {isShallow: true});
    	watchedObject.a.b = true;
    	// Nothing happens
    	watchedObject.a = true;
    	//=> 'Object changed: 1'
    	```
    	*/
    val isShallow: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The function receives the same arguments and context as the [onChange callback](#onchange). The function is called whenever a change is attempted. Returning true will allow the change to be made and the onChange callback to execute, returning anything else will prevent the change from being made and the onChange callback will not trigger.
    	@example
    	 ```
    	import onChange from 'on-change';
    	const object = {a: 0};
    	let index = 0;
    	const watchedObject = onChange(object, () => {
    		console.log('Object changed:', ++index);
    	}, {onValidate: () => false});
    	watchedObject.a = true;
    	// watchedObject.a still equals 0
    	```
    	 */
    var onValidate: js.UndefOr[
        js.ThisFunction4[
          /* this */ Any, 
          /* path */ String, 
          /* value */ Any, 
          /* previousValue */ Any, 
          /* applyData */ ApplyData, 
          Boolean
        ]
      ] = js.undefined
    
    /**
    	The path will be provided as an array of keys instead of a delimited string.
    	@default false
    	*/
    val pathAsArray: js.UndefOr[Boolean] & js.UndefOr[`false`]
  }
  object OptionspathAsArrayfalseun {
    
    inline def apply(pathAsArray: js.UndefOr[Boolean] & js.UndefOr[`false`]): OptionspathAsArrayfalseun = {
      val __obj = js.Dynamic.literal(pathAsArray = pathAsArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionspathAsArrayfalseun]
    }
    
    extension [Self <: OptionspathAsArrayfalseun](x: Self) {
      
      inline def setDetails(value: Boolean | js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setEquals_(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setIgnoreDetached(value: Boolean): Self = StObject.set(x, "ignoreDetached", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDetachedUndefined: Self = StObject.set(x, "ignoreDetached", js.undefined)
      
      inline def setIgnoreKeys(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "ignoreKeys", value.asInstanceOf[js.Any])
      
      inline def setIgnoreKeysUndefined: Self = StObject.set(x, "ignoreKeys", js.undefined)
      
      inline def setIgnoreKeysVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "ignoreKeys", js.Array(value*))
      
      inline def setIgnoreSymbols(value: Boolean): Self = StObject.set(x, "ignoreSymbols", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSymbolsUndefined: Self = StObject.set(x, "ignoreSymbols", js.undefined)
      
      inline def setIgnoreUnderscores(value: Boolean): Self = StObject.set(x, "ignoreUnderscores", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnderscoresUndefined: Self = StObject.set(x, "ignoreUnderscores", js.undefined)
      
      inline def setIsShallow(value: Boolean): Self = StObject.set(x, "isShallow", value.asInstanceOf[js.Any])
      
      inline def setIsShallowUndefined: Self = StObject.set(x, "isShallow", js.undefined)
      
      inline def setOnValidate(
        value: js.ThisFunction4[
              /* this */ Any, 
              /* path */ String, 
              /* value */ Any, 
              /* previousValue */ Any, 
              /* applyData */ ApplyData, 
              Boolean
            ]
      ): Self = StObject.set(x, "onValidate", value.asInstanceOf[js.Any])
      
      inline def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      inline def setPathAsArray(value: js.UndefOr[Boolean] & js.UndefOr[`false`]): Self = StObject.set(x, "pathAsArray", value.asInstanceOf[js.Any])
    }
  }
  
  /* Inlined on-change.on-change.Options & {  pathAsArray :true} */
  trait OptionspathAsArraytrue extends StObject {
    
    /**
    	Trigger callbacks for each change within specified method calls or all method calls.
    	@default false
    	 */
    val details: js.UndefOr[Boolean | js.Array[String]] = js.undefined
    
    /**
    	The function receives two arguments to be compared for equality. Should return `true` if the two values are determined to be equal.
    	@default Object.is
    	@example
    	 ```
    	import onChange from 'on-change';
    	const object = {
    		a: {
    			b: false
    		}
    	};
    	let index = 0;
    	const watchedObject = onChange(object, () => {
    		console.log('Object changed:', ++index);
    	}, {equals: (a, b) => a === b});
    	watchedObject.a.b = 0;
    	// Nothing happens
    	watchedObject.a = true;
    	//=> 'Object changed: 1'
    	```
    	*/
    @JSName("equals")
    var equals_FOptionspathAsArraytrue: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Boolean]] = js.undefined
    
    /**
    	Ignore changes to objects that become detached from the watched object.
    	@default false
    	*/
    val ignoreDetached: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Setting properties in this array won't trigger the callback.
    	@default undefined
    	*/
    val ignoreKeys: js.UndefOr[js.Array[String | js.Symbol]] = js.undefined
    
    /**
    	Setting properties as `Symbol` won't trigger the callback.
    	@default false
    	*/
    val ignoreSymbols: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Setting properties with an underscore as the first character won't trigger the callback.
    	@default false
    	*/
    val ignoreUnderscores: js.UndefOr[Boolean] = js.undefined
    
    /**
    	Deep changes will not trigger the callback. Only changes to the immediate properties of the original object.
    	@default false
    	@example
    	```
    	import onChange from 'on-change';
    	const object = {
    		a: {
    			b: false
    		}
    	};
    	let index = 0;
    	const watchedObject = onChange(object, () => {
    		console.log('Object changed:', ++index);
    	}, {isShallow: true});
    	watchedObject.a.b = true;
    	// Nothing happens
    	watchedObject.a = true;
    	//=> 'Object changed: 1'
    	```
    	*/
    val isShallow: js.UndefOr[Boolean] = js.undefined
    
    /**
    	The function receives the same arguments and context as the [onChange callback](#onchange). The function is called whenever a change is attempted. Returning true will allow the change to be made and the onChange callback to execute, returning anything else will prevent the change from being made and the onChange callback will not trigger.
    	@example
    	 ```
    	import onChange from 'on-change';
    	const object = {a: 0};
    	let index = 0;
    	const watchedObject = onChange(object, () => {
    		console.log('Object changed:', ++index);
    	}, {onValidate: () => false});
    	watchedObject.a = true;
    	// watchedObject.a still equals 0
    	```
    	 */
    var onValidate: js.UndefOr[
        js.ThisFunction4[
          /* this */ Any, 
          /* path */ String, 
          /* value */ Any, 
          /* previousValue */ Any, 
          /* applyData */ ApplyData, 
          Boolean
        ]
      ] = js.undefined
    
    /**
    	The path will be provided as an array of keys instead of a delimited string.
    	@default false
    	*/
    val pathAsArray: js.UndefOr[Boolean] & `true`
  }
  object OptionspathAsArraytrue {
    
    inline def apply(pathAsArray: js.UndefOr[Boolean] & `true`): OptionspathAsArraytrue = {
      val __obj = js.Dynamic.literal(pathAsArray = pathAsArray.asInstanceOf[js.Any])
      __obj.asInstanceOf[OptionspathAsArraytrue]
    }
    
    extension [Self <: OptionspathAsArraytrue](x: Self) {
      
      inline def setDetails(value: Boolean | js.Array[String]): Self = StObject.set(x, "details", value.asInstanceOf[js.Any])
      
      inline def setDetailsUndefined: Self = StObject.set(x, "details", js.undefined)
      
      inline def setDetailsVarargs(value: String*): Self = StObject.set(x, "details", js.Array(value*))
      
      inline def setEquals_(value: (/* a */ Any, /* b */ Any) => Boolean): Self = StObject.set(x, "equals", js.Any.fromFunction2(value))
      
      inline def setEquals_Undefined: Self = StObject.set(x, "equals", js.undefined)
      
      inline def setIgnoreDetached(value: Boolean): Self = StObject.set(x, "ignoreDetached", value.asInstanceOf[js.Any])
      
      inline def setIgnoreDetachedUndefined: Self = StObject.set(x, "ignoreDetached", js.undefined)
      
      inline def setIgnoreKeys(value: js.Array[String | js.Symbol]): Self = StObject.set(x, "ignoreKeys", value.asInstanceOf[js.Any])
      
      inline def setIgnoreKeysUndefined: Self = StObject.set(x, "ignoreKeys", js.undefined)
      
      inline def setIgnoreKeysVarargs(value: (String | js.Symbol)*): Self = StObject.set(x, "ignoreKeys", js.Array(value*))
      
      inline def setIgnoreSymbols(value: Boolean): Self = StObject.set(x, "ignoreSymbols", value.asInstanceOf[js.Any])
      
      inline def setIgnoreSymbolsUndefined: Self = StObject.set(x, "ignoreSymbols", js.undefined)
      
      inline def setIgnoreUnderscores(value: Boolean): Self = StObject.set(x, "ignoreUnderscores", value.asInstanceOf[js.Any])
      
      inline def setIgnoreUnderscoresUndefined: Self = StObject.set(x, "ignoreUnderscores", js.undefined)
      
      inline def setIsShallow(value: Boolean): Self = StObject.set(x, "isShallow", value.asInstanceOf[js.Any])
      
      inline def setIsShallowUndefined: Self = StObject.set(x, "isShallow", js.undefined)
      
      inline def setOnValidate(
        value: js.ThisFunction4[
              /* this */ Any, 
              /* path */ String, 
              /* value */ Any, 
              /* previousValue */ Any, 
              /* applyData */ ApplyData, 
              Boolean
            ]
      ): Self = StObject.set(x, "onValidate", value.asInstanceOf[js.Any])
      
      inline def setOnValidateUndefined: Self = StObject.set(x, "onValidate", js.undefined)
      
      inline def setPathAsArray(value: js.UndefOr[Boolean] & `true`): Self = StObject.set(x, "pathAsArray", value.asInstanceOf[js.Any])
    }
  }
}
