package typings
package miniprogramDashWxsLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@js.native
trait NewableFunction extends Function {
  /**
    * Calls the function with the specified object as the this value and the elements of specified array as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args An array of argument values to be passed to the function.
    */
  @JSName("apply")
  def apply[T](`this`: org.scalablytyped.runtime.Instantiable0[T], thisArg: T): scala.Unit = js.native
  @JSName("apply")
  def apply[T, A /* <: Array[_] */](`this`: org.scalablytyped.runtime.Instantiable1[/* args */ A, T], thisArg: T, args: A): scala.Unit = js.native
  /**
    * For a given function, creates a bound function that has the same body as the original function.
    * The this object of the bound function is associated with the specified object, and has the specified initial parameters.
    * @param thisArg The object to be used as the this object.
    * @param args Arguments to bind to the parameters of the function.
    */
  def bind[T](`this`: T, thisArg: js.Any): T = js.native
  def bind[AX, R](
    `this`: org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ AX, R],
    thisArg: js.Any,
    args: AX*
  ): org.scalablytyped.runtime.Instantiable1[/* args (repeated) */ AX, R] = js.native
  def bind[A0, A /* <: Array[_] */, R](
    `this`: org.scalablytyped.runtime.Instantiable2[/* arg0 */ A0, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0
  ): org.scalablytyped.runtime.Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A /* <: Array[_] */, R](
    `this`: org.scalablytyped.runtime.Instantiable3[/* arg0 */ A0, /* arg1 */ A1, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1
  ): org.scalablytyped.runtime.Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A2, A /* <: Array[_] */, R](
    `this`: org.scalablytyped.runtime.Instantiable4[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1,
    arg2: A2
  ): org.scalablytyped.runtime.Instantiable1[/* args */ A, R] = js.native
  def bind[A0, A1, A2, A3, A /* <: Array[_] */, R](
    `this`: org.scalablytyped.runtime.Instantiable5[/* arg0 */ A0, /* arg1 */ A1, /* arg2 */ A2, /* arg3 */ A3, /* args */ A, R],
    thisArg: js.Any,
    arg0: A0,
    arg1: A1,
    arg2: A2,
    arg3: A3
  ): org.scalablytyped.runtime.Instantiable1[/* args */ A, R] = js.native
  /**
    * Calls the function with the specified object as the this value and the specified rest arguments as the arguments.
    * @param thisArg The object to be used as the this object.
    * @param args Argument values to be passed to the function.
    */
  def call[T, A /* <: Array[_] */](
    `this`: org.scalablytyped.runtime.Instantiable1[/* args */ A, T],
    thisArg: T,
    /* import warning: parser.TsParser#functionParam $anonfun Dropping repeated marker of param args because its type A is not an array type */ args: A
  ): scala.Unit = js.native
}

