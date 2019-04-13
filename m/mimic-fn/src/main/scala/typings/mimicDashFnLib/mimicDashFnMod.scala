package typings
package mimicDashFnLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mimic-fn", JSImport.Namespace)
@js.native
object mimicDashFnMod extends js.Object {
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function mimicFn<
  //	ArgumentsType extends unknown[],
  //	ReturnType,
  //	FunctionType extends (...arguments: ArgumentsType) => ReturnType
  // >(
  //	to: (...arguments: ArgumentsType) => ReturnType,
  //	from: FunctionType
  // ): FunctionType;
  // export = mimicFn;
  @JSName("default")
  var default_Original: mimicDashFnLib.Anon_Arguments = js.native
  /**
  	Make a function mimic another one. It will copy over the properties `name`, `length`, `displayName`, and any custom properties you may have set.
  	@param to - Mimicking function.
  	@param from - Function to mimic.
  	@returns The modified `to` function.
  	@example
  	```
  	import mimicFn = require('mimic-fn');
  	function foo() {}
  	foo.unicorn = '🦄';
  	function wrapper() {
  		return foo();
  	}
  	console.log(wrapper.name);
  	//=> 'wrapper'
  	mimicFn(wrapper, foo);
  	console.log(wrapper.name);
  	//=> 'foo'
  	console.log(wrapper.unicorn);
  	//=> '🦄'
  	```
  	*/
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, FunctionType /* <: js.Function1[/* arguments */ ArgumentsType, ReturnType] */](to: js.Function1[/* arguments */ ArgumentsType, ReturnType], from: FunctionType): FunctionType = js.native
  /**
  	Make a function mimic another one. It will copy over the properties `name`, `length`, `displayName`, and any custom properties you may have set.
  	@param to - Mimicking function.
  	@param from - Function to mimic.
  	@returns The modified `to` function.
  	@example
  	```
  	import mimicFn = require('mimic-fn');
  	function foo() {}
  	foo.unicorn = '🦄';
  	function wrapper() {
  		return foo();
  	}
  	console.log(wrapper.name);
  	//=> 'wrapper'
  	mimicFn(wrapper, foo);
  	console.log(wrapper.name);
  	//=> 'foo'
  	console.log(wrapper.unicorn);
  	//=> '🦄'
  	```
  	*/
  // TODO: Remove this for the next major release, refactor the whole definition to:
  // declare function mimicFn<
  //	ArgumentsType extends unknown[],
  //	ReturnType,
  //	FunctionType extends (...arguments: ArgumentsType) => ReturnType
  // >(
  //	to: (...arguments: ArgumentsType) => ReturnType,
  //	from: FunctionType
  // ): FunctionType;
  // export = mimicFn;
  def default[ArgumentsType /* <: js.Array[_] */, ReturnType, FunctionType /* <: js.Function1[/* arguments */ ArgumentsType, ReturnType] */](to: js.Function1[/* arguments */ ArgumentsType, ReturnType], from: FunctionType): FunctionType = js.native
}

