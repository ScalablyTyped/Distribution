package typings.onDashChange.onDashChangeMod

import org.scalablytyped.runtime.StringDictionary
import typings.onDashChange.Anon_Default
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("on-change", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function onChange<ObjectType extends {[key: string]: unknown}>(
  // 	object: ObjectType,
  // 	onChange: (this: ObjectType, path: string, value: unknown, previousValue: unknown) => void
  // ): ObjectType;
  // export = onChange;
  @JSName("default")
  var default_Original: Anon_Default = js.native
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
  	const watchedObject = onChange(object, function (path, value, previousValue) {
  		console.log('Object changed:', ++i);
  		console.log('this:', this);
  		console.log('path:', path);
  		console.log('value:', value);
  		console.log('previousValue:', previousValue);
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
  	// Access the original object
  	onChange.target(watchedObject).foo = false;
  	// Callback isn't called
  	// Unsubscribe
  	onChange.unsubscribe(watchedObject);
  	watchedObject.foo = 'bar';
  	// Callback isn't called
  	```
  	*/
  def apply[ObjectType /* <: StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction3[
      /* this */ ObjectType, 
      /* path */ String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      Unit
    ]
  ): ObjectType = js.native
  def apply[ObjectType /* <: StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction3[
      /* this */ ObjectType, 
      /* path */ String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      Unit
    ],
    options: Options
  ): ObjectType = js.native
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
  	const watchedObject = onChange(object, function (path, value, previousValue) {
  		console.log('Object changed:', ++i);
  		console.log('this:', this);
  		console.log('path:', path);
  		console.log('value:', value);
  		console.log('previousValue:', previousValue);
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
  	// Access the original object
  	onChange.target(watchedObject).foo = false;
  	// Callback isn't called
  	// Unsubscribe
  	onChange.unsubscribe(watchedObject);
  	watchedObject.foo = 'bar';
  	// Callback isn't called
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function onChange<ObjectType extends {[key: string]: unknown}>(
  // 	object: ObjectType,
  // 	onChange: (this: ObjectType, path: string, value: unknown, previousValue: unknown) => void
  // ): ObjectType;
  // export = onChange;
  def default[ObjectType /* <: StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction3[
      /* this */ ObjectType, 
      /* path */ String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      Unit
    ]
  ): ObjectType = js.native
  def default[ObjectType /* <: StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction3[
      /* this */ ObjectType, 
      /* path */ String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      Unit
    ],
    options: Options
  ): ObjectType = js.native
  /**
  	@param object - Object that is already being watched for changes.
  	@returns The original unwatched object.
  	*/
  def target[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType): ObjectType = js.native
  /**
  	Cancels all future callbacks on a watched object.
  	@param object - Object that is already being watched for changes.
  	@returns The original unwatched object.
  	*/
  def unsubscribe[ObjectType /* <: StringDictionary[js.Any] */](`object`: ObjectType): ObjectType = js.native
}

