package typings.oracleOraclejet.ojcontextMod

import typings.std.Element
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
class ^ () extends Context
@JSImport("@oracle/oraclejet/ojcontext", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  def getContext(node: Element): Context = js.native
  
  def getPageContext(): Context = js.native
  
  def setBusyContextDefaultTimeout(timeout: Double): js.Any = js.native
}
