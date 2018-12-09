package typings
package pDashTryLib

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("p-try", JSImport.Namespace)
@js.native
object pDashTryMod extends js.Object {
  def apply[T](cb: js.Function0[js.Promise[T] | js.Thenable[T] | T]): js.Promise[T] = js.native
  def apply[T, A](cb: js.Function1[/* a */ A, js.Promise[T] | js.Thenable[T] | T], a: A): js.Promise[T] = js.native
  def apply[T, A, B](cb: js.Function2[/* a */ A, /* b */ B, js.Promise[T] | js.Thenable[T] | T], a: A, b: B): js.Promise[T] = js.native
  def apply[T, A, B, C](
    cb: js.Function3[/* a */ A, /* b */ B, /* c */ C, js.Promise[T] | js.Thenable[T] | T],
    a: A,
    b: B,
    c: C
  ): js.Promise[T] = js.native
  def apply[T, A, B, C, D](
    cb: js.Function4[/* a */ A, /* b */ B, /* c */ C, /* d */ D, js.Promise[T] | js.Thenable[T] | T],
    a: A,
    b: B,
    c: C,
    d: D
  ): js.Promise[T] = js.native
  def apply[T, A, B, C, D, E](
    cb: js.Function5[/* a */ A, /* b */ B, /* c */ C, /* d */ D, /* e */ E, js.Promise[T] | js.Thenable[T] | T],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E
  ): js.Promise[T] = js.native
  def apply[T, A, B, C, D, E, F](
    cb: js.Function6[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      js.Promise[T] | js.Thenable[T] | T
    ],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F
  ): js.Promise[T] = js.native
  def apply[T, A, B, C, D, E, F](
    cb: js.Function7[
      /* a */ A, 
      /* b */ B, 
      /* c */ C, 
      /* d */ D, 
      /* e */ E, 
      /* f */ F, 
      /* repeated */js.Any, 
      js.Promise[T] | js.Thenable[T] | T
    ],
    a: A,
    b: B,
    c: C,
    d: D,
    e: E,
    f: F,
    args: js.Any*
  ): js.Promise[T] = js.native
}

