package typings.mssql.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "TransactionError")
@js.native
class TransactionError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: js.Any) = this()
  
  var code: String = js.native
}
