package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait DropTargetSession extends StObject {
  
  var dropTarget: js.UndefOr[Boolean] = js.native
  
  var session: js.UndefOr[ClientSession] = js.native
}
object DropTargetSession {
  
  @scala.inline
  def apply(): DropTargetSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetSession]
  }
  
  @scala.inline
  implicit class DropTargetSessionMutableBuilder[Self <: DropTargetSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setDropTarget(value: Boolean): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
