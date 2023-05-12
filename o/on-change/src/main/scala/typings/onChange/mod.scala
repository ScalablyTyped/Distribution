package typings.onChange

import typings.onChange.anon.OptionsignoreSymbolstruep
import typings.onChange.anon.OptionspathAsArrayfalseun
import typings.onChange.anon.OptionspathAsArraytrue
import typings.std.Record
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  object default {
    
    /**
    	Watch an object or array for changes. It works recursively, so it will even detect if you modify a deep property like `obj.a.b[0].c = true`.
    	@param object - Object to watch for changes.
    	@param onChange - Function that gets called anytime the object changes.
    	@param [options] - Options for altering the behavior of onChange.
    	@returns A version of `object` that is watched. It's the exact same object, just with some `Proxy` traps.
    	@example
    	```
    	import onChange from 'on-change';
    	const object = {
    		foo: false,
    		a: {
    			b: [
    				{
    					c: false
    				}
    			]
    		}
    	};
    	let index = 0;
    	const watchedObject = onChange(object, function (path, value, previousValue, applyData) {
    		console.log('Object changed:', ++index);
    		console.log('this:', this);
    		console.log('path:', path);
    		console.log('value:', value);
    		console.log('previousValue:', previousValue);
    		console.log('applyData:', applyData);
    	});
    	watchedObject.foo = true;
    	//=> 'Object changed: 1'
    	//=> 'this: {
    	//   	foo: true,
    	//   	a: {
    	//   		b: [
    	//   			{
    	//   				c: false
    	//   			}
    	//   		]
    	//   	}
    	//   }'
    	//=> 'path: "foo"'
    	//=> 'value: true'
    	//=> 'previousValue: false'
    	//=> 'applyData: undefined'
    	watchedObject.a.b[0].c = true;
    	//=> 'Object changed: 2'
    	//=> 'this: {
    	//   	foo: true,
    	//   	a: {
    	//   		b: [
    	//   			{
    	//   				c: true
    	//   			}
    	//   		]
    	//   	}
    	//   }'
    	//=> 'path: "a.b.0.c"'
    	//=> 'value: true'
    	//=> 'previousValue: false'
    	//=> 'applyData: undefined'
    	watchedObject.a.b.push(3);
    	//=> 'Object changed: 3'
    	//=> 'this: {
    	//   	foo: true,
    	//   	a: {
    	//   		b: [
    	//   			{
    	//   				c: true
    	//   			},
    	//   			3
    	//   		]
    	//   	}
    	//   }'
    	//=> 'path: "a.b"'
    	//=> 'value: [{c: true}, 3]'
    	//=> 'previousValue: [{c: true}]'
    	//=> 'applyData: {
    	//       name: "push",
    	//       args: [3],
    	//       result: 2,
    	//   }'
    	// Access the original object
    	onChange.target(watchedObject).foo = false;
    	// Callback isn't called
    	// Unsubscribe
    	onChange.unsubscribe(watchedObject);
    	watchedObject.foo = 'bar';
    	// Callback isn't called
    	```
    	*/
    inline def apply[ObjectType /* <: Record[String, Any] */](
      `object`: ObjectType,
      onChange: js.ThisFunction4[
          /* this */ ObjectType, 
          /* path */ String, 
          /* value */ Any, 
          /* previousValue */ Any, 
          /* applyData */ ApplyData, 
          Unit
        ]
    ): ObjectType = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any])).asInstanceOf[ObjectType]
    // Overload that returns a string array as path when `ignoreSymbols` and `pathAsArray` options are true.
    inline def apply[ObjectType /* <: Record[String, Any] */](
      `object`: ObjectType,
      onChange: js.ThisFunction4[
          /* this */ ObjectType, 
          /* path */ js.Array[String], 
          /* value */ Any, 
          /* previousValue */ Any, 
          /* applyData */ ApplyData, 
          Unit
        ],
      options: OptionsignoreSymbolstruep
    ): ObjectType = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObjectType]
    inline def apply[ObjectType /* <: Record[String, Any] */](
      `object`: ObjectType,
      onChange: js.ThisFunction4[
          /* this */ ObjectType, 
          /* path */ String, 
          /* value */ Any, 
          /* previousValue */ Any, 
          /* applyData */ ApplyData, 
          Unit
        ],
      options: OptionspathAsArrayfalseun
    ): ObjectType = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObjectType]
    // Overload that returns an array as path when `pathAsArray` option is true.
    inline def apply[ObjectType /* <: Record[String, Any] */](
      `object`: ObjectType,
      onChange: js.ThisFunction4[
          /* this */ ObjectType, 
          /* path */ js.Array[String | js.Symbol], 
          /* value */ Any, 
          /* previousValue */ Any, 
          /* applyData */ ApplyData, 
          Unit
        ],
      options: OptionspathAsArraytrue
    ): ObjectType = (^.asInstanceOf[js.Dynamic].apply(`object`.asInstanceOf[js.Any], onChange.asInstanceOf[js.Any], options.asInstanceOf[js.Any])).asInstanceOf[ObjectType]
    
    @JSImport("on-change", JSImport.Default)
    @js.native
    val ^ : js.Any = js.native
    
    /**
    	@param object - Object that is already being watched for changes.
    	@returns The original unwatched object.
    	*/
    inline def target[ObjectType /* <: Record[String, Any] */](`object`: ObjectType): ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("target")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectType]
    
    /**
    	Cancels all future callbacks on a watched object.
    	@param object - Object that is already being watched for changes.
    	@returns The original unwatched object.
    	*/
    inline def unsubscribe[ObjectType /* <: Record[String, Any] */](`object`: ObjectType): ObjectType = ^.asInstanceOf[js.Dynamic].applyDynamic("unsubscribe")(`object`.asInstanceOf[js.Any]).asInstanceOf[ObjectType]
  }
  
  trait ApplyData extends StObject {
    
    /**
    	The arguments provided to the method that produced the change.
    	*/
    val args: js.Array[Any]
    
    /**
    	The name of the method that produced the change.
    	*/
    val name: String
    
    /**
    	The result returned from the method that produced the change.
    	*/
    val result: Any
  }
  object ApplyData {
    
    inline def apply(args: js.Array[Any], name: String, result: Any): ApplyData = {
      val __obj = js.Dynamic.literal(args = args.asInstanceOf[js.Any], name = name.asInstanceOf[js.Any], result = result.asInstanceOf[js.Any])
      __obj.asInstanceOf[ApplyData]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: ApplyData] (val x: Self) extends AnyVal {
      
      inline def setArgs(value: js.Array[Any]): Self = StObject.set(x, "args", value.asInstanceOf[js.Any])
      
      inline def setArgsVarargs(value: Any*): Self = StObject.set(x, "args", js.Array(value*))
      
      inline def setName(value: String): Self = StObject.set(x, "name", value.asInstanceOf[js.Any])
      
      inline def setResult(value: Any): Self = StObject.set(x, "result", value.asInstanceOf[js.Any])
    }
  }
  
  trait Options extends StObject {
    
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
    var equals_FOptions: js.UndefOr[js.Function2[/* a */ Any, /* b */ Any, Boolean]] = js.undefined
    
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
    val pathAsArray: js.UndefOr[Boolean] = js.undefined
  }
  object Options {
    
    inline def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit open class MutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      
      inline def setPathAsArray(value: Boolean): Self = StObject.set(x, "pathAsArray", value.asInstanceOf[js.Any])
      
      inline def setPathAsArrayUndefined: Self = StObject.set(x, "pathAsArray", js.undefined)
    }
  }
}
