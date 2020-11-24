package typings.nodeRal.mod

import typings.nodeRal.mod.Balance.BalanceContextClass
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ral", "Balance")
@js.native
abstract class Balance () extends js.Object {
  
  def fetchServer(balanceContext: BalanceContextClass, conf: js.Any, prevBackend: Server): Server = js.native
  
  def getCategory(): js.Any = js.native
  
  def getContextClass(): BalanceContextConstructor = js.native
}
/* static members */
@JSImport("node-ral", "Balance")
@js.native
object Balance extends js.Object {
  
  var BalanceContext: BalanceContextConstructor = js.native
  
  @js.native
  class BalanceContextClass protected () extends js.Object {
    def this(serviceID: String, service: Service) = this()
    
    var crossIDCServers: js.Array[String] = js.native
    
    var currentIDC: String = js.native
    
    var reqIDCServers: js.Array[String] = js.native
    
    var serviceID: String = js.native
  }
}
