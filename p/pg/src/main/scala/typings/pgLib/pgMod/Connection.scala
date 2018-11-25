package typings
package pgLib.pgMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("pg", "Connection")
@js.native
class Connection ()
  extends eventsLib.eventsMod.EventEmitter {
  def this(config: ConnectionConfig) = this()
  val stream: nodeLib.streamMod.Duplex = js.native
  def bind(config: BindConfig, more: scala.Boolean): scala.Unit = js.native
  def bind(config: scala.Null, more: scala.Boolean): scala.Unit = js.native
  def close(msg: MessageConfig, more: scala.Boolean): scala.Unit = js.native
  def describe(msg: MessageConfig, more: scala.Boolean): scala.Unit = js.native
  def end(): scala.Unit = js.native
  def execute(config: ExecuteConfig, more: scala.Boolean): scala.Unit = js.native
  def execute(config: scala.Null, more: scala.Boolean): scala.Unit = js.native
  def flush(): scala.Unit = js.native
  def parse(query: QueryParse, more: scala.Boolean): scala.Unit = js.native
  def query(text: java.lang.String): scala.Unit = js.native
  def sync(): scala.Unit = js.native
}

