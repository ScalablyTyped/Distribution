package typings.pgPromise.mod

import typings.pgPromise.mod.errors.PreparedStatementError
import typings.pgPromise.pgPromiseStrings.array
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

// PreparedStatement class;
// API: http://vitaly-t.github.io/pg-promise/PreparedStatement.html
@JSImport("pg-promise", "PreparedStatement")
@js.native
open class PreparedStatement ()
  extends StObject
     with _QueryParam {
  def this(options: IPreparedStatement) = this()
  
  // advanced properties:
  var binary: Boolean = js.native
  
  // standard properties:
  var name: String = js.native
  
  def parse(): IPreparedParsed | PreparedStatementError = js.native
  
  var rowMode: Unit | array = js.native
  
  var rows: Double = js.native
  
  var text: String | QueryFile = js.native
  
  def toString(level: Double): String = js.native
  
  var values: js.Array[Any] = js.native
}
