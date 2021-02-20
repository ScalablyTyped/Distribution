package typings.mssql.mod

import typings.std.Error
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mssql", "RequestError")
@js.native
class RequestError protected () extends Error {
  def this(message: String) = this()
  def this(message: String, code: js.Any) = this()
  
  var `class`: js.UndefOr[Double] = js.native
  
  var code: String = js.native
  
  var lineNumber: js.UndefOr[Double] = js.native
  
  var number: js.UndefOr[Double] = js.native
  
  var procName: js.UndefOr[String] = js.native
  
  var serverName: js.UndefOr[String] = js.native
  
  var state: js.UndefOr[Double] = js.native
}
