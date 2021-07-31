package typings.octokitTypes.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  var enabled: Boolean
  
  var required_status_checks: Contexts
}
object Enabled {
  
  @scala.inline
  def apply(enabled: Boolean, required_status_checks: Contexts): Enabled = {
    val __obj = js.Dynamic.literal(enabled = enabled.asInstanceOf[js.Any], required_status_checks = required_status_checks.asInstanceOf[js.Any])
    __obj.asInstanceOf[Enabled]
  }
  
  @scala.inline
  implicit class EnabledMutableBuilder[Self <: Enabled] (val x: Self) extends AnyVal {
    
    @scala.inline
    def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    @scala.inline
    def setRequired_status_checks(value: Contexts): Self = StObject.set(x, "required_status_checks", value.asInstanceOf[js.Any])
  }
}
