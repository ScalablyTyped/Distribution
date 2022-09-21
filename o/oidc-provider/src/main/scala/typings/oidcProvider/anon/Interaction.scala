package typings.oidcProvider.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Interaction extends StObject {
  
  var interaction: js.UndefOr[String] = js.undefined
  
  var resume: js.UndefOr[String] = js.undefined
  
  var session: js.UndefOr[String] = js.undefined
  
  var state: js.UndefOr[String] = js.undefined
}
object Interaction {
  
  inline def apply(): Interaction = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Interaction]
  }
  
  extension [Self <: Interaction](x: Self) {
    
    inline def setInteraction(value: String): Self = StObject.set(x, "interaction", value.asInstanceOf[js.Any])
    
    inline def setInteractionUndefined: Self = StObject.set(x, "interaction", js.undefined)
    
    inline def setResume(value: String): Self = StObject.set(x, "resume", value.asInstanceOf[js.Any])
    
    inline def setResumeUndefined: Self = StObject.set(x, "resume", js.undefined)
    
    inline def setSession(value: String): Self = StObject.set(x, "session", value.asInstanceOf[js.Any])
    
    inline def setSessionUndefined: Self = StObject.set(x, "session", js.undefined)
    
    inline def setState(value: String): Self = StObject.set(x, "state", value.asInstanceOf[js.Any])
    
    inline def setStateUndefined: Self = StObject.set(x, "state", js.undefined)
  }
}
