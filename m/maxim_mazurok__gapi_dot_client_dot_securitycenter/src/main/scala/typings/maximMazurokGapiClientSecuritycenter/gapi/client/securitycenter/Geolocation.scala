package typings.maximMazurokGapiClientSecuritycenter.gapi.client.securitycenter

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait Geolocation extends StObject {
  
  /** A CLDR. */
  var regionCode: js.UndefOr[String] = js.undefined
}
object Geolocation {
  
  inline def apply(): Geolocation = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[Geolocation]
  }
  
  @scala.inline
  implicit open class MutableBuilder[Self <: Geolocation] (val x: Self) extends AnyVal {
    
    inline def setRegionCode(value: String): Self = StObject.set(x, "regionCode", value.asInstanceOf[js.Any])
    
    inline def setRegionCodeUndefined: Self = StObject.set(x, "regionCode", js.undefined)
  }
}
