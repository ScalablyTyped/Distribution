package typings.mongodb.anon

import typings.mongodb.mod.ClientSession
import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ScaleSession extends StObject {
  
  var scale: Double
  
  var session: js.UndefOr[ClientSession] = js.undefined
}
object ScaleSession {
  
  @scala.inline
  def apply(scale: Double): ScaleSession = {
    val __obj = js.Dynamic.literal(scale = scale.asInstanceOf[js.Any])
    __obj.asInstanceOf[ScaleSession]
  }
  
  @scala.inline
  implicit class ScaleSessionMutableBuilder[Self <: ScaleSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setScale(value: Double): Self = StObject.set(x, "scale", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSession(value: ClientSession): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
  }
}
