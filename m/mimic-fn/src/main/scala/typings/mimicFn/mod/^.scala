package typings.mimicFn.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mimic-fn", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  /**
  Modifies the `to` function to mimic the `from` function. Returns the `to` function.
  `name`, `displayName`, and any other properties of `from` are copied. The `length` property is not copied. Prototype, class, and inherited properties are copied.
  `to.toString()` will return the same as `from.toString()` but prepended with a `Wrapped with to()` comment.
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
  def apply[ArgumentsType /* <: js.Array[_] */, ReturnType, FunctionType /* <: js.Function1[/* arguments */ ArgumentsType, ReturnType] */](to: js.Function1[/* arguments */ ArgumentsType, ReturnType], from: FunctionType, options: Options): FunctionType = js.native
}
