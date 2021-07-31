package typings.mssql.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "ConnectionError")
@js.native
class ConnectionError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: String, code: js.Any) = this()
  
  var code: String = js.native
  
  /* CompleteClass */
  var message: String = js.native
  
  /* CompleteClass */
  var name: String = js.native
}
