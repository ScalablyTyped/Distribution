package typings.pg.mod

import typings.node.eventsMod.EventEmitter
import typings.pg.pgStrings.end
import typings.pg.pgStrings.error
import typings.pg.pgStrings.row
import typings.std.Error
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Query")
@js.native
class Query[R /* <: QueryResultRow */, I /* <: js.Array[_] */] ()
  extends EventEmitter
     with Submittable {
  def this(queryTextOrConfig: String) = this()
  def this(queryTextOrConfig: QueryConfig[I]) = this()
  def this(queryTextOrConfig: String, values: I) = this()
  def this(queryTextOrConfig: QueryConfig[I], values: I) = this()
  @JSName("on")
  def on_end(event: end, listener: js.Function1[/* result */ ResultBuilder[R], Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: error, listener: js.Function1[/* err */ Error, Unit]): this.type = js.native
  @JSName("on")
  def on_row(event: row, listener: js.Function2[/* row */ R, /* result */ js.UndefOr[ResultBuilder[R]], Unit]): this.type = js.native
  /* CompleteClass */
  override def submit(connection: Connection): Unit = js.native
}

