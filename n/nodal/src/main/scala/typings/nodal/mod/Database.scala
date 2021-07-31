package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "Database")
@js.native
class Database () extends StObject {
  
  var __logColorFuncs: js.Array[js.Function] = js.native
  
  var _useLogColor: js.Any = js.native
  
  var adapter: js.Any = js.native
  
  def close(callback: js.Function): Boolean = js.native
  
  def connect(cfg: js.Any): Boolean = js.native
  
  def create(): Unit = js.native
  
  def drop(): Unit = js.native
  
  def error(message: String): Boolean = js.native
  
  def info(message: String): Unit = js.native
  
  def log(sql: String): Boolean = js.native
  def log(sql: String, params: js.Any): Boolean = js.native
  def log(sql: String, params: js.Any, time: Double): Boolean = js.native
  def log(sql: String, params: Unit, time: Double): Boolean = js.native
  
  def query(args: js.Any*): Unit = js.native
  
  def transaction(args: js.Any*): Unit = js.native
}
