package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "TransactionError")
@js.native
open class TransactionError protected () extends MSSQLError {
  def this(message: String) = this()
  def this(message: js.Error) = this()
  def this(message: String, code: String) = this()
  def this(message: js.Error, code: String) = this()
}
