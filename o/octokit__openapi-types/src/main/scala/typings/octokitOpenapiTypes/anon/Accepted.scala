package typings.octokitOpenapiTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Accepted extends StObject {
  
  /** @description Whether a private vulnerability report was accepted by the repository's administrators. */
  val accepted: Boolean
}
object Accepted {
  
  inline def apply(accepted: Boolean): Accepted = {
    val __obj = js.Dynamic.literal(accepted = accepted.asInstanceOf[js.Any])
    __obj.asInstanceOf[Accepted]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Accepted] (val x: Self) extends AnyVal {
    
    inline def setAccepted(value: Boolean): Self = StObject.set(x, "accepted", value.asInstanceOf[js.Any])
  }
}
