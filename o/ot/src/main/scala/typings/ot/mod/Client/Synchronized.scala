package typings.ot.mod.Client

import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * In the 'Synchronized' state, there is no pending operation that the client
  * has sent to the server.
  */
@js.native
trait Synchronized
  extends Sync[AwaitingConfirm, Synchronized, scala.Nothing]
@JSImport("ot", "Client.Synchronized")
@js.native
object Synchronized extends js.Object {
  
  def apply(): Synchronized = js.native
}
