package typings.pgPromise.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// QueryFile class;
// API: http://vitaly-t.github.io/pg-promise/QueryFile.html
@JSImport("pg-promise", "QueryFile")
@js.native
open class QueryFile protected ()
  extends StObject
     with _QueryParam {
  def this(file: String) = this()
  def this(file: String, options: IQueryFileOptions) = this()
  
  val error: js.Error = js.native
  
  val file: String = js.native
  
  val options: Any = js.native
  
  def prepare(): Unit = js.native
  
  def toString(level: Double): String = js.native
}
