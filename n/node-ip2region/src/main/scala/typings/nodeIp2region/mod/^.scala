package typings.nodeIp2region.mod

import typings.nodeIp2region.anon.DbPath
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("node-ip2region", JSImport.Namespace)
@js.native
//#endregion
class ^ () extends IP2Region {
  def this(options: DbPath) = this()
}
@JSImport("node-ip2region", JSImport.Namespace)
@js.native
object ^ extends js.Object {
  
  //#region Static Functions
  // Single Instance
  def create(): IP2Region = js.native
  def create(dbPath: String): IP2Region = js.native
  
  /**
    * For backward compatibility
    */
  def destroy(): Unit = js.native
}
