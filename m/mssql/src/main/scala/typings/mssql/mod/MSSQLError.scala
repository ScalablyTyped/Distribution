package typings.mssql.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "MSSQLError")
@js.native
open class MSSQLError protected ()
  extends StObject
     with Error {
  def this(message: String) = this()
  def this(message: js.Error) = this()
  def this(message: String, code: String) = this()
  def this(message: js.Error, code: String) = this()
  
  var code: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var message: String = js.native
  
  /* standard es5 */
  /* CompleteClass */
  var name: String = js.native
  
  var originalError: js.UndefOr[js.Error] = js.native
}
