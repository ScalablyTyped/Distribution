package typings.officeJsPreview.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait EmbeddedSession extends StObject {
  
  def init(): js.Promise[js.Any]
}
object EmbeddedSession {
  
  @scala.inline
  def apply(init: () => js.Promise[js.Any]): EmbeddedSession = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[EmbeddedSession]
  }
  
  @scala.inline
  implicit class EmbeddedSessionMutableBuilder[Self <: EmbeddedSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => js.Promise[js.Any]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
