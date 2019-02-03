package typings
package atOracleOraclejetLib.ojcontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
class namespaced () extends Context {
  /* CompleteClass */
  override def getBusyContext(): BusyContext = js.native
}

/* static members */
@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
object namespaced extends js.Object {
  def getContext(node: stdLib.Element): atOracleOraclejetLib.ojcontextMod.Context = js.native
  def getPageContext(): atOracleOraclejetLib.ojcontextMod.Context = js.native
  def setBusyContextDefaultTimeout(timeout: scala.Double): js.Any = js.native
}

