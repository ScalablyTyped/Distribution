package typings.nodal.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("nodal", "Database")
@js.native
open class Database () extends StObject {
  
  var __logColorFuncs: js.Array[js.Function] = js.native
  
  /* private */ var _useLogColor: Any = js.native
  
  var adapter: Any = js.native
  
  def close(callback: js.Function): Boolean = js.native
  
  def connect(cfg: Any): Boolean = js.native
  
  def create(): Unit = js.native
  
  def drop(): Unit = js.native
  
  def error(message: String): Boolean = js.native
  
  def info(message: String): Unit = js.native
  
  def log(sql: String): Boolean = js.native
  def log(sql: String, params: Any): Boolean = js.native
  def log(sql: String, params: Any, time: Double): Boolean = js.native
  def log(sql: String, params: Unit, time: Double): Boolean = js.native
  
  def query(args: Any*): Unit = js.native
  
  def transaction(args: Any*): Unit = js.native
}
