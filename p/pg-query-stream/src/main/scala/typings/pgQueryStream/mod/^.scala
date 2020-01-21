package typings.pgQueryStream.mod

import typings.pg.mod.Connection
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg-query-stream", JSImport.Namespace)
@js.native
class ^ protected () extends QueryStream {
  def this(text: String) = this()
  def this(text: String, values: js.Array[_]) = this()
  def this(text: String, values: js.Array[_], options: Options) = this()
  /* CompleteClass */
  override def submit(connection: Connection): Unit = js.native
}

