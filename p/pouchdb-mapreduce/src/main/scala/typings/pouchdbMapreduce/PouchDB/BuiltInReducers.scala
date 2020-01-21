package typings.pouchdbMapreduce.PouchDB

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

/* Rewritten from type alias, can be one of: 
  - typings.pouchdbMapreduce.pouchdbMapreduceStrings._sum
  - typings.pouchdbMapreduce.pouchdbMapreduceStrings._count
  - typings.pouchdbMapreduce.pouchdbMapreduceStrings._stats
*/
trait BuiltInReducers extends js.Object

object BuiltInReducers {
  @scala.inline
  def _count: typings.pouchdbMapreduce.pouchdbMapreduceStrings._count = this.cast("_count")
  @scala.inline
  def _stats: typings.pouchdbMapreduce.pouchdbMapreduceStrings._stats = this.cast("_stats")
  @scala.inline
  def _sum: typings.pouchdbMapreduce.pouchdbMapreduceStrings._sum = this.cast("_sum")
  @scala.inline
  /* private */ def cast[T](in: js.Any): T = in.asInstanceOf[T]
}

