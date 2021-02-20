package typings.officeJs.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.`|`
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

@js.native
trait EmbeddedSession extends StObject {
  
  def init(): js.Promise[_] = js.native
}
object EmbeddedSession {
  
  @scala.inline
  def apply(init: () => js.Promise[_]): EmbeddedSession = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[EmbeddedSession]
  }
  
  @scala.inline
  implicit class EmbeddedSessionMutableBuilder[Self <: EmbeddedSession] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setInit(value: () => js.Promise[_]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
