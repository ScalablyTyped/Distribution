package typings
package pDashTryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-try", JSImport.Namespace)
@js.native
object pDashTryMod extends js.Object {
  def apply[T](cb: js.Function0[stdLib.Promise[T] | stdLib.PromiseLike[T] | T]): stdLib.Promise[T] = js.native
  def apply[T, A](cb: js.Function1[/* a */ A, stdLib.Promise[T] | stdLib.PromiseLike[T] | T], a: A): stdLib.Promise[T] = js.native
  def apply[T, A, B](cb: js.Function2[/* a */ A, /* b */ B, stdLib.Promise[T] | stdLib.PromiseLike[T] | T], a: A, b: B): stdLib.Promise[T] = js.native
  def apply[T, A, B, C](
    cb: js.Function3[/* a */ A, /* b */ B, /* c */ C, stdLib.Promise[T] | stdLib.PromiseLike[T] | T],
    a: A,
    b: B,
    c: C
  ): stdLib.Promise[T] = js.native
  def apply[T, A, B, C, D](
    cb: js.Function4[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      stdLib.Promise[T] | stdLib.PromiseLike[T] | T
    ],
    a: A,
    b: B,
    c: C,
    d: D
  ): stdLib.Promise[T] = js.native
  def apply[T, A, B, C, D, E](
    cb: js.Function5[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      stdLib.Promise[T] | stdLib.PromiseLike[T] | T
    ],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): stdLib.Promise[T] = js.native
  def apply[T, A, B, C, D, E, F](
    cb: js.Function6[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      stdLib.Promise[T] | stdLib.PromiseLike[T] | T
    ],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): stdLib.Promise[T] = js.native
  def apply[T, A, B, C, D, E, F](
    cb: js.Function7[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* repeated */js.Any, 
      stdLib.Promise[T] | stdLib.PromiseLike[T] | T
    ],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    args: js.Any*
  ): stdLib.Promise[T] = js.native
}

