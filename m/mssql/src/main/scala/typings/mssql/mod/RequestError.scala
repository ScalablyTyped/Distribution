package typings.mssql.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "RequestError")
@js.native
open class RequestError protected () extends MSSQLError {
  def this(message: String) = this()
  def this(message: js.Error) = this()
  def this(message: String, code: String) = this()
  def this(message: js.Error, code: String) = this()
  
  var `class`: js.UndefOr[String] = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var procName: js.UndefOr[String] = js.native
  
  var serverName: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[String] = js.native
}
