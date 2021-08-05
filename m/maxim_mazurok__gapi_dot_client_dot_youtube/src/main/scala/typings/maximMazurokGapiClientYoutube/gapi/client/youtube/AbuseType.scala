package typings.maximMazurokGapiClientYoutube.gapi.client.youtube

import org.scalablytyped.runtime.StObject
import scala.scalajs.js
import scala.scalajs.js.annotation.{JSGlobalScope, JSGlobal, JSImport, JSName, JSBracketAccess}

trait AbuseType extends StObject {
  
  var id: js.UndefOr[String] = js.undefined
}
object AbuseType {
  
  inline def apply(): AbuseType = {
    val __obj = js.Dynamic.literal()
    __obj.asInstanceOf[AbuseType]
  }
  
  extension [Self <: AbuseType](x: Self) {
    
    inline def setId(value: String): Self = StObject.set(x, "id", value.asInstanceOf[js.Any])
    
    inline def setIdUndefined: Self = StObject.set(x, "id", js.undefined)
  }
}
