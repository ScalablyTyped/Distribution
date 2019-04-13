package typings
package atOracleOraclejetLib.ojcontextMod

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation._

@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
class ^ () extends Context {
  /* CompleteClass */
  override def getBusyContext(): BusyContext = js.native
}

@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  def getContext(node: stdLib.Element): Context = js.native
  def getPageContext(): Context = js.native
  def setBusyContextDefaultTimeout(timeout: scala.Double): js.Any = js.native
}

