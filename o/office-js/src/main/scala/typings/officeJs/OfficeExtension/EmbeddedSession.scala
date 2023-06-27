package typings.officeJs.OfficeExtension

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

/**
  * Represents a session of a Visio diagram embedded in a SharePoint page. 
	 * For more information, see {@link https://learn.microsoft.com/office/dev/add-ins/reference/overview/visio-javascript-reference-overview | Visio JavaScript API overview}.
  */
trait EmbeddedSession extends StObject {
  
  /**
  		* Initializes the session.
  		*/
  def init(): js.Promise[Any]
}
object EmbeddedSession {
  
  inline def apply(init: () => js.Promise[Any]): EmbeddedSession = {
    val __obj = js.Dynamic.literal(init = js.Any.fromFunction0(init))
    __obj.asInstanceOf[EmbeddedSession]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: EmbeddedSession] (val x: Self) extends AnyVal {
    
    inline def setInit(value: () => js.Promise[Any]): Self = StObject.set(x, "init", js.Any.fromFunction0(value))
  }
}
