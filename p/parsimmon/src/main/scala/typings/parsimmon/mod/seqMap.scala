package typings.parsimmon.mod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "seqMap")
@js.native
object seqMap extends js.Object {
  /**
  	 * Matches all parsers sequentially, and passes their results as the arguments to a function.
  	 * Similar to calling Parsimmon.seq and then .map, but the values are not put in an array.
  	 */
  def apply[T, U](p1: Parser[T], cb: js.Function1[/* a1 */ T, U]): Parser[U] = js.native
  def apply[T, U, V](p1: Parser[T], p2: Parser[U], cb: js.Function2[/* a1 */ T, /* a2 */ U, V]): Parser[V] = js.native
  def apply[T, U, V, W](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    cb: js.Function3[/* a1 */ T, /* a2 */ U, /* a3 */ V, W]
  ): Parser[W] = js.native
  def apply[T, U, V, W, X](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    cb: js.Function4[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, X]
  ): Parser[X] = js.native
  def apply[T, U, V, W, X, Y](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    cb: js.Function5[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, Y]
  ): Parser[Y] = js.native
  def apply[T, U, V, W, X, Y, Z](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    cb: js.Function6[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, Z]
  ): Parser[Z] = js.native
  def apply[T, U, V, W, X, Y, Z, A](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z],
    cb: js.Function7[/* a1 */ T, /* a2 */ U, /* a3 */ V, /* a4 */ W, /* a5 */ X, /* a6 */ Y, /* a7 */ Z, A]
  ): Parser[A] = js.native
  def apply[T, U, V, W, X, Y, Z, A, B](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z],
    p8: Parser[A],
    cb: js.Function8[
      /* a1 */ T, 
      /* a2 */ U, 
      /* a3 */ V, 
      /* a4 */ W, 
      /* a5 */ X, 
      /* a6 */ Y, 
      /* a7 */ Z, 
      /* a8 */ A, 
      B
    ]
  ): Parser[B] = js.native
}

