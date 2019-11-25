package typings.pouchdbDashMapreduce.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pouchdbDashMapreduce.pouchdbDashMapreduceStrings._sum
  - typings.pouchdbDashMapreduce.pouchdbDashMapreduceStrings._count
  - typings.pouchdbDashMapreduce.pouchdbDashMapreduceStrings._stats
*/
trait BuiltInReducers extends js.Object

object BuiltInReducers {
  @scala.inline
  def _count: typings.pouchdbDashMapreduce.pouchdbDashMapreduceStrings._count = this.cast("_count")
  @scala.inline
  def _stats: typings.pouchdbDashMapreduce.pouchdbDashMapreduceStrings._stats = this.cast("_stats")
  @scala.inline
  def _sum: typings.pouchdbDashMapreduce.pouchdbDashMapreduceStrings._sum = this.cast("_sum")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

