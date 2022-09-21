package typings.maximMazurokGapiClientStorage.anon

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Enabled extends StObject {
  
  /** Whether or not Autoclass is enabled on this bucket */
  var enabled: js.UndefOr[Boolean] = js.undefined
  
  /** A date and time in RFC 3339 format representing the instant at which "enabled" was last toggled. */
  var toggleTime: js.UndefOr[String] = js.undefined
}
object Enabled {
  
  inline def apply(): Enabled = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Enabled]
  }
  
  extension [Self <: Enabled](x: Self) {
    
    inline def setEnabled(value: Boolean): Self = StObject.set(x, "enabled", value.asInstanceOf[js.Any])
    
    inline def setEnabledUndefined: Self = StObject.set(x, "enabled", js.undefined)
    
    inline def setToggleTime(value: String): Self = StObject.set(x, "toggleTime", value.asInstanceOf[js.Any])
    
    inline def setToggleTimeUndefined: Self = StObject.set(x, "toggleTime", js.undefined)
  }
}
