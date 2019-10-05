package typings.parsimmon.parsimmonMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("parsimmon", "seq")
@js.native
object seq extends js.Object {
  def apply(parsers: Parser[_]*): Parser[js.Array[_]] = js.native
  /**
  	 * accepts a variable number of parsers that it expects to find in order, yielding an array of the results.
  	 */
  def apply[T](p1: Parser[T]): Parser[js.Array[T]] = js.native
  def apply[T, U](p1: Parser[T], p2: Parser[U]): Parser[js.Tuple2[T, U]] = js.native
  def apply[T, U, V](p1: Parser[T], p2: Parser[U], p3: Parser[V]): Parser[js.Tuple3[T, U, V]] = js.native
  def apply[T, U, V, W](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W]): Parser[js.Tuple4[T, U, V, W]] = js.native
  def apply[T, U, V, W, X](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X]): Parser[js.Tuple5[T, U, V, W, X]] = js.native
  def apply[T, U, V, W, X, Y](p1: Parser[T], p2: Parser[U], p3: Parser[V], p4: Parser[W], p5: Parser[X], p6: Parser[Y]): Parser[js.Tuple6[T, U, V, W, X, Y]] = js.native
  def apply[T, U, V, W, X, Y, Z](
    p1: Parser[T],
    p2: Parser[U],
    p3: Parser[V],
    p4: Parser[W],
    p5: Parser[X],
    p6: Parser[Y],
    p7: Parser[Z]
  ): Parser[js.Tuple7[T, U, V, W, X, Y, Z]] = js.native
}

