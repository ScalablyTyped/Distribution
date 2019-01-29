package typings
package mssqlLib.mssqlMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("mssql", "RequestError")
@js.native
class RequestError protected ()
  extends nodeLib.Error {
  def this(message: java.lang.String) = this()
  def this(message: java.lang.String, code: js.Any) = this()
  var `class`: js.UndefOr[scala.Double] = js.native
  var code: java.lang.String = js.native
  var lineNumber: js.UndefOr[scala.Double] = js.native
  var message: java.lang.String = js.native
  var name: java.lang.String = js.native
  var number: js.UndefOr[scala.Double] = js.native
  var procName: js.UndefOr[java.lang.String] = js.native
  var serverName: js.UndefOr[java.lang.String] = js.native
  var state: js.UndefOr[scala.Double] = js.native
}

