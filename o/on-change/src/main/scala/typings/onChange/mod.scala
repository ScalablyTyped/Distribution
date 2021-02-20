package typings.onChange

import org.scalablytyped.runtime.StringDictionary
import typings.onChange.anon.OptionspathAsArrayfalseun
import typings.onChange.anon.OptionspathAsArraytrue
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

object mod {
  
  /**
  	Watch an object or array for changes. It works recursively, so it will even detect if you modify a deep property like `obj.a.b[0].c = true`.
  	@param object - Object to watch for changes.
  	@param onChange - Function that gets called anytime the object changes.
  	@returns A version of `object` that is watched. It's the exact same object, just with some `Proxy` traps.
  	@example
  	```
  	import onChange = require('on-change');
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
  	let i = 0;
  	const watchedObject = onChange(object, function (path, value, previousValue, name) {
  		console.log('Object changed:', ++i);
  		console.log('this:', this);
  		console.log('path:', path);
  		console.log('value:', value);
  		console.log('previousValue:', previousValue);
  		console.log('name:', name);
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
  	//=> 'name: undefined'
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
  	//=> 'name: undefined'
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
  	//=> 'name: "push"'
  	// Access the original object
  	onChange.target(watchedObject).foo = false;
  	// Callback isn't called
  	// Unsubscribe
  	onChange.unsubscribe(watchedObject);
  	watchedObject.foo = 'bar';
  	// Callback isn't called
  	```
  	*/
  @JSImport("on-change", JSImport.Namespace)
  @js.native
  def apply[ObjectType /* <: StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction4[
      /* this */ ObjectType, 
      /* path */ String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      /* name */ String, 
      Unit
    ]
  ): ObjectType = js.native
  @JSImport("on-change", JSImport.Namespace)
  @js.native
  def apply[ObjectType /* <: StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction4[
      /* this */ ObjectType, 
      /* path */ String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      /* name */ String, 
      Unit
    ],
    options: OptionspathAsArrayfalseun
  ): ObjectType = js.native
  // Overload that returns an Array as path when pathAsArray is true
  @JSImport("on-change", JSImport.Namespace)
  @js.native
  def apply[ObjectType /* <: StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction4[
      /* this */ ObjectType, 
      /* path */ js.Array[String | js.Symbol], 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      /* name */ String, 
      Unit
    ],
    options: OptionspathAsArraytrue
  ): ObjectType = js.native
  
  /**
  	@param object - Object that is already being watched for changes.
  	@returns The original unwatched object.
  	*/
  @JSImport("on-change", "target")
  @js.native
  def target[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType): ObjectType = js.native
  
  // eslint-disable-line @typescript-eslint/method-signature-style
  /**
  	Cancels all future callbacks on a watched object.
  	@param object - Object that is already being watched for changes.
  	@returns The original unwatched object.
  	*/
  @JSImport("on-change", "unsubscribe")
  @js.native
  def unsubscribe[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType): ObjectType = js.native
  
  @js.native
  trait Options extends StObject {
    
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
    var equals_FOptions: js.UndefOr[js.Function2[/* a */ js.Any, /* b */ js.Any, Boolean]] = js.native
    
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
    var pathAsArray: js.UndefOr[Boolean] = js.native
  }
  object Options {
    
    @scala.inline
    def apply(): Options = {
      val __obj = js.Dynamic.literal()
      __obj.asInstanceOf[Options]
    }
    
    @scala.inline
    implicit class OptionsMutableBuilder[Self <: Options] (val x: Self) extends AnyVal {
      
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
      def setPathAsArray(value: Boolean): Self = StObject.set(x, "pathAsArray", value.asInstanceOf[js.Any])
      
      @scala.inline
      def setPathAsArrayUndefined: Self = StObject.set(x, "pathAsArray", js.undefined)
    }
  }
}
