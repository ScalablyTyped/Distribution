package typings
package milkcocoaLib.milkcocoaNs

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  def done(callback: js.Function1[/* data */ js.Any, scala.Unit]): scala.Unit
  def limit(number: scala.Double): Query
  def skip(index: scala.Double): Query
  // mode  asc, desc
  def sort(mode: java.lang.String): Query
}

object Query {
  @scala.inline
  def apply(
    done: js.Function1[/* data */ js.Any, scala.Unit] => scala.Unit,
    limit: scala.Double => Query,
    skip: scala.Double => Query,
    sort: java.lang.String => Query
  ): Query = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), limit = js.Any.fromFunction1(limit), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Query]
  }
}

