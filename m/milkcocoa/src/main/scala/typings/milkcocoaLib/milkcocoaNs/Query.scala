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
    done: js.Function1[js.Function1[/* data */ js.Any, scala.Unit], scala.Unit],
    limit: js.Function1[scala.Double, Query],
    skip: js.Function1[scala.Double, Query],
    sort: js.Function1[java.lang.String, Query]
  ): Query = {
    val __obj = js.Dynamic.literal(done = done, limit = limit, skip = skip, sort = sort)
  
    __obj.asInstanceOf[Query]
  }
}

