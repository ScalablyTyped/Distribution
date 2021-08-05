package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait DropTargetSession extends StObject {
  
  var dropTarget: js.UndefOr[Boolean] = js.undefined
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object DropTargetSession {
  
  inline def apply(): DropTargetSession = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[DropTargetSession]
  }
  
  extension [Self <: DropTargetSession](x: Self) {
    
    inline def setDropTarget(value: Boolean): Self = StObject.set(x, "dropTarget", value.asInstanceOf[js.Any])
    
    inline def setDropTargetUndefined: Self = StObject.set(x, "dropTarget", js.undefined)
    
    inline def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
