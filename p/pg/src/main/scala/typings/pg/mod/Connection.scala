package typings.pg.mod

import typings.node.eventsMod.EventEmitter
import typings.node.streamMod.Duplex
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("pg", "Connection")
@js.native
class Connection () extends EventEmitter {
  def this(config: ConnectionConfig) = this()
  
  def bind(config: Null, more: Boolean): Unit = js.native
  def bind(config: BindConfig, more: Boolean): Unit = js.native
  
  def close(msg: MessageConfig, more: Boolean): Unit = js.native
  
  def describe(msg: MessageConfig, more: Boolean): Unit = js.native
  
  def end(): Unit = js.native
  
  def execute(config: Null, more: Boolean): Unit = js.native
  def execute(config: ExecuteConfig, more: Boolean): Unit = js.native
  
  def flush(): Unit = js.native
  
  def parse(query: QueryParse, more: Boolean): Unit = js.native
  
  def query(text: String): Unit = js.native
  
  val stream: Duplex = js.native
  
  def sync(): Unit = js.native
}
