package typings.mongodb.mod

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@JSImport("mongodb", "ServerSession")
@js.native
open class ServerSession () extends StObject {
  
  /* Excluded from this release type: __constructor */
  /**
    * Determines if the server session has timed out.
    *
    * @param sessionTimeoutMinutes - The server's "logicalSessionTimeoutMinutes"
    */
  def hasTimedOut(sessionTimeoutMinutes: scala.Double): Boolean = js.native
  
  var id: ServerSessionId = js.native
  
  var isDirty: Boolean = js.native
  
  var lastUse: scala.Double = js.native
  
  var txnNumber: scala.Double = js.native
}
