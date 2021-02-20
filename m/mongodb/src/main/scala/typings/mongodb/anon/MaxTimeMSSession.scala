package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait MaxTimeMSSession extends StObject {
  
  var maxTimeMS: js.UndefOr[Double] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
}
object MaxTimeMSSession {
  
  @scala.inline
  def apply(): MaxTimeMSSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[MaxTimeMSSession]
  }
  
  @scala.inline
  implicit class MaxTimeMSSessionMutableBuilder[Self <: MaxTimeMSSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setMaxTimeMS(value: Double): Self = StObject.set(x, "maxTimeMS", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setMaxTimeMSUndefined: Self = StObject.set(x, "maxTimeMS", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
