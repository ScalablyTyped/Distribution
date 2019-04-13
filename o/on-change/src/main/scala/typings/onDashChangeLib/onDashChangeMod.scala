package typings
package onDashChangeLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("on-change", JSImport.Namespace)
@js.native
object onDashChangeMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function onChange<ObjectType extends {[key: string]: unknown}>(
  // 	object: ObjectType,
  // 	onChange: (this: ObjectType, path: string, value: unknown, previousValue: unknown) => void
  // ): ObjectType;
  // export = onChange;
  @JSName("default")
  var default_Original: onDashChangeLib.Anon_Default = js.native
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
  	```
  	*/
  def apply[ObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction3[
      /* this */ ObjectType, 
      /* path */ java.lang.String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      scala.Unit
    ]
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
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function onChange<ObjectType extends {[key: string]: unknown}>(
  // 	object: ObjectType,
  // 	onChange: (this: ObjectType, path: string, value: unknown, previousValue: unknown) => void
  // ): ObjectType;
  // export = onChange;
  def default[ObjectType /* <: org.scalablytyped.runtime.StringDictionary[js.Any] */](
    `object`: ObjectType,
    onChange: js.ThisFunction3[
      /* this */ ObjectType, 
      /* path */ java.lang.String, 
      /* value */ js.Any, 
      /* previousValue */ js.Any, 
      scala.Unit
    ]
  ): ObjectType = js.native
}

