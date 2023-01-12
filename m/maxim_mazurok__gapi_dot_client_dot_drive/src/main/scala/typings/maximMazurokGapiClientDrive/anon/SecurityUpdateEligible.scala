package typings.maximMazurokGapiClientDrive.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait SecurityUpdateEligible extends StObject {
  
  /** Whether the file is eligible for security update. */
  var securityUpdateEligible: js.UndefOr[Boolean] = js.undefined
  
  /** Whether the security update is enabled for this file. */
  var securityUpdateEnabled: js.UndefOr[Boolean] = js.undefined
}
object SecurityUpdateEligible {
  
  inline def apply(): SecurityUpdateEligible = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[SecurityUpdateEligible]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: SecurityUpdateEligible] (val x: Self) extends AnyVal {
    
    inline def setSecurityUpdateEligible(value: Boolean): Self = StObject.set(x, "securityUpdateEligible", value.asInstanceOf[js.Any])
    
    inline def setSecurityUpdateEligibleUndefined: Self = StObject.set(x, "securityUpdateEligible", js.undefined)
    
    inline def setSecurityUpdateEnabled(value: Boolean): Self = StObject.set(x, "securityUpdateEnabled", value.asInstanceOf[js.Any])
    
    inline def setSecurityUpdateEnabledUndefined: Self = StObject.set(x, "securityUpdateEnabled", js.undefined)
  }
}
