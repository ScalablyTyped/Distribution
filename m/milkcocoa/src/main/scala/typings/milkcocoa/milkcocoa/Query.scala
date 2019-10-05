package typings.milkcocoa.milkcocoa

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

trait Query extends js.Object {
  def done(callback: js.Function1[/* data */ js.Any, Unit]): Unit
  def limit(number: Double): Query
  def skip(index: Double): Query
  // mode  asc, desc
  def sort(mode: String): Query
}

object Query {
  @scala.inline
  def apply(
    done: js.Function1[/* data */ js.Any, Unit] => Unit,
    limit: Double => Query,
    skip: Double => Query,
    sort: String => Query
  ): Query = {
    val __obj = js.Dynamic.literal(done = js.Any.fromFunction1(done), limit = js.Any.fromFunction1(limit), skip = js.Any.fromFunction1(skip), sort = js.Any.fromFunction1(sort))
  
    __obj.asInstanceOf[Query]
  }
}

