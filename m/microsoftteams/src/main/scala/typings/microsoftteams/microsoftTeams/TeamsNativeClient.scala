package typings.microsoftteams.microsoftTeams

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Hide from docs
  */
trait TeamsNativeClient extends StObject {
  
  def framelessPostMessage(msg: String): Unit
}
object TeamsNativeClient {
  
  inline def apply(framelessPostMessage: String => Unit): TeamsNativeClient = {
    val __obj = js.Dynamic.literal(framelessPostMessage = js.Any.fromFunction1(framelessPostMessage))
    __obj.asInstanceOf[TeamsNativeClient]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: TeamsNativeClient] (val x: Self) extends AnyVal {
    
    inline def setFramelessPostMessage(value: String => Unit): Self = StObject.set(x, "framelessPostMessage", js.Any.fromFunction1(value))
  }
}
