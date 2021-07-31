package typings.plaidLink.mod.Plaid

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait ExitOptions extends StObject {
  
  var force: Boolean
}
object ExitOptions {
  
  @scala.inline
  def apply(force: Boolean): ExitOptions = {
    val __obj = js.Dynamic.literal(force = force.asInstanceOf[js.Any])
    __obj.asInstanceOf[ExitOptions]
  }
  
  @scala.inline
  implicit class ExitOptionsMutableBuilder[Self <: ExitOptions] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setForce(value: Boolean): Self = StObject.set(x, "force", value.asInstanceOf[js.Any])
  }
}
