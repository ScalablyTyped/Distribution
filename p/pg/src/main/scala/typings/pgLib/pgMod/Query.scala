package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Query")
@js.native
class Query ()
  extends nodeLib.eventsMod.EventEmitter
     with Submittable {
  def this(queryTextOrConfig: java.lang.String) = this()
  def this(queryTextOrConfig: QueryConfig) = this()
  def this(queryTextOrConfig: java.lang.String, values: js.Array[_]) = this()
  def this(queryTextOrConfig: QueryConfig, values: js.Array[_]) = this()
  @JSName("on")
  def on_end(event: pgLib.pgLibStrings.end, listener: js.Function1[/* result */ ResultBuilder, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_error(event: pgLib.pgLibStrings.error, listener: js.Function1[/* err */ stdLib.Error, scala.Unit]): this.type = js.native
  @JSName("on")
  def on_row(
    event: pgLib.pgLibStrings.row,
    listener: js.Function2[/* row */ js.Any, /* result */ js.UndefOr[ResultBuilder], scala.Unit]
  ): this.type = js.native
  /* CompleteClass */
  override def submit(connection: Connection): scala.Unit = js.native
}

